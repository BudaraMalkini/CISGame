/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import Services.Answer;
import Services.QandAns;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author budar
 */
public class RMIImplimentation extends UnicastRemoteObject implements RMI_Facade {
    private static final long serialVersionUID = -3763231206310448L;
    private String response;
    
    RMIImplimentation() throws RemoteException {
        super();
    }

    /**
     *insert new user to database
     * @param username
     * @param email
     * @param password
     * @param confirm_password
     * @return
     * @throws RemoteException
     */
    @Override
    public String Register(String username, String email, String password, String confirm_password) throws RemoteException {
        String response_signup = "";
        /**
         * *
         * Check the password is match to the DB record
         */
        if (password.equals(confirm_password)) {
            try {
                /**
                 * *
                 * Insert user details to the User table
                 */
                 //ResultSet rs = DB_Connection.search("SELECT * FROM `questions` WHERE userName='" + email + "'");
                 // if (rs.next()) {
                      
                  //}else{
                 //}
                
                DB_Connection.iud("INSERT INTO user (userName,email,password) values ('" + username + "','" + email + "','" + password + "')");
                System.out.println(username);
                
                
                

            } catch (Exception ex) {
                ex.printStackTrace();
            }
            response_signup = "SignUp Successfull.";
        } else {
            response_signup = "Please Fill all the details.";
        }
        return response_signup;
    }

    /**
     *check user's user name and password
     * @param userName
     * @param password
     * @return
     * @throws RemoteException
     */
    @Override
     public String login(String userName, String password) throws RemoteException {
        String response = "";
        try {
            /**
             * *
             * Search the Email from the database
             */
            ResultSet rs = DB_Connection.search("SELECT * FROM user WHERE email='" + userName + "'");

            if (!rs.next()) {
                response = "Please chack the username and Password";
            } else {
                if (rs.getString("password").equals(password)) {
                    response = "Login Succesfull.";
                } else {
                    response = "Incorrect password";
                }
            }
            return response;
        } catch (Exception ex) {
            ex.printStackTrace();
            return response;
        }
    }

    /**
     * Check admin user name and password
     * @param userName
     * @param password
     * @return
     * @throws RemoteException
     */
    @Override
    public String Admin(String userName, String password) throws RemoteException {
        String response = "";
        try {
            /**
             * *
             * getting admin information from databaseuserName
             */
            ResultSet rs = DB_Connection.search("SELECT * FROM admin WHERE UserName='" + userName + "'");

            if (!rs.next()) {
                response = "Please chack the username and Password";
            } else {
                if (rs.getString("Password").equals(password)) {
                    response = "Login Succesfull.";
                } else {
                    response = "Incorrect password";
                }
            }
            return response;
        } catch (Exception ex) {
            ex.printStackTrace();
            return response;
        }
    
}

    /**
     * Insert new admin to the databse
     * @param username
     * @param password
     * @return
     * @throws RemoteException
     */
    @Override
    public String NewAdmin(String username, String password) throws RemoteException {
        String response = "";
        try {
                /**
                 * *
                 * Mekata answers enne answer kiyna arry list eken
                 * answer kiyna class eke object tike ekata ekathu krpu array ekk enne
                 * Insert user details to the User table
                 */
                DB_Connection.iud("INSERT INTO admin (userName,password) values ('" + username + "','" + password + "')");
                System.out.println(username);

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        response = "New Admin Has Created.";
        return response;
    }

    /**
     * Save user's answer to the databse 
     * @param ansArray
     * @param email
     * @throws RemoteException
     */
    @Override
    public void saveAnswers(Answer[] ansArray, String email) throws RemoteException {
         System.out.println("Email: " + email);
        String totMarks = String.valueOf(calculateMarks(ansArray));// to calculate the all the users total marks
        //string.value- convert all the interger answers to varchar
        String q1, q2, q3, q4, q5, q6, q7, q8, q9, q10 = null;

        q1 = ansArray[0].getProAnswer();
        q2 = ansArray[1].getProAnswer();
        q3 = ansArray[2].getProAnswer();
        q4 = ansArray[3].getProAnswer();
        q5 = ansArray[4].getProAnswer();
        q6 = ansArray[5].getProAnswer();
        q7 = ansArray[6].getProAnswer();
        q8 = ansArray[7].getProAnswer();
        q9 = ansArray[8].getProAnswer();
        q10 = ansArray[9].getProAnswer();

        try {

            ResultSet rs = DB_Connection.search("SELECT * FROM `questions` WHERE userName='" + email + "'");

            if (rs.next()) {
                DB_Connection.updateAnswerDB("UPDATE `questions` SET `q1`='" + q1 + "',`q2`='" + q2 + "',`q3`='" + q3 + "',`q4`='" + q4 + "',`q5`='" + q5 + "',`q6`='" + q6 + "',`q7`='" + q7 + "',`q8`='" + q8 + "',`q9`='" + q9 + "',`q10`='" + q10 + "' WHERE userName='" + email + "'");
                DB_Connection.updateAnswerDB("UPDATE `totalmarks` SET `marks`='" + totMarks + "' WHERE userName='" + email + "';");
            } else {
                DB_Connection.saveAnswersDB("INSERT INTO `questions` (`userName`, `q1`, `q2`, `q3`, `q4`, `q5`, `q6`, `q7`, `q8`, `q9`, `q10`) VALUES ('" + email + "', '" + q1 + "', '" + q2 + "', '" + q3 + "', '" + q4 + "', '" + q5 + "', '" + q6 + "', '" + q7 + "', '" + q8 + "', '" + q9 + "', '" + q10 + "');");
                DB_Connection.saveAnswersDB("INSERT INTO `totalmarks` (`Tid`, `userName`, `marks`) VALUES (NULL, '" + email + "', '" + totMarks + "');");
            }

        } //if the error have capture the error
        catch (Exception ex) {
            Logger.getLogger(RMIImplimentation.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Vaules are successfully saved to the database!");
    }

    /***
     * user total mark calculate method
     * if the user answer will to each question get 10 marks 
     * @param ansArray
     * @return marks
     */
    private int calculateMarks(Answer[] ansArray) {
        int finalMarks = 0;
        for (int x = 0; x < 10; x++) {
            if (ansArray[x].getProAnswer().equals("True")) {
                finalMarks += 10;
            }
        }
        return finalMarks;
    }

    /**
     * Get users totals marks from the database
     * @param username
     * @return
     * @throws RemoteException
     */
    @Override
    public String getUmarks(String username) throws RemoteException {
       if (username == null || username == "") {
            return "user not found";
        } else {
            try {
                //String lk = null;
                String lk = null;
                ResultSet rs = DB_Connection.search("SELECT * FROM totalmarks WHERE userName='" + username + "'");
                while (rs.next()) {
                   lk= rs.getString(3);//get 3rd column data and convert it to string
                    
                }
                return lk;
                
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return null;
    }

    /**
     * Check correct answers from database
     * @param email
     * @return
     * @throws RemoteException
     */
    @Override
    public ArrayList<QandAns> getDetailsUser(String email) throws RemoteException {
        if (email == null || email == "") {
            return null;
        } else {
            try {
                //String lk = null;
                ArrayList <QandAns> qArray = new ArrayList<>();
                ResultSet rs = DB_Connection.search("SELECT * FROM `correctanswer`;");
                while (rs.next()) {
                    QandAns q1 = new QandAns(rs.getString(1), rs.getString(2), rs.getString(3));
                    qArray.add(q1);
                    //lk= rs.getstring(1)
                }
                return qArray;
                //return lk;
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return null;
    }

    /**
     * Get user total marks for the quickchart API
     * @return
     * @throws RemoteException
     */
    @Override
    public String getUtotalMarks() throws RemoteException {
        quickchart chart = new quickchart();
      /***
       * get details from server to quick chart 
       */
      
      try{
          ResultSet rs = DB_Connection.search("select "
                    + "count(CASE WHEN marks BETWEEN 10 AND 20 THEN 1 END) as count10_20,"
                    + "count(CASE WHEN marks BETWEEN 20 AND 40 THEN 1 END) as count20_40,"
                    + "count(CASE WHEN marks BETWEEN 40 AND 60 THEN 1 END) as count40_60,"
                    + "count(CASE WHEN marks BETWEEN 60 AND 80 THEN 1 END) as count60_80,"
                    + "count(CASE WHEN marks BETWEEN 80 AND 100 THEN 1 END) as count80_100"
                    + " from totalmarks");
      if (rs.next()){
          
          /***
           * Documentation (2022). Available at: https://quickchart.io/documentation/ (Accessed: 2 May 2022).
           * <https://quickchart.io/documentation/>.
           */
		chart.setWidth(600);
		chart.setHeight(600);
		chart.setConfig("{"
				+ "    type: 'bar',"
				+ "    data: {"
				+ "        labels: ['10-20 Marks', '20-40 Marks','40-60 Marks','60-80 Marks','80-100 Marks'],"
				+ "        datasets: [{"
				+ "            label: 'Participated Total Marks',"
                                + "              borderWidth: 1,"
                                + "            backgroundColor: getGradientFillHelper('vertical', [\"#36a2eb\", \"#a336eb\", \"#eb3639\"]),"
				+ "            data: ["+ rs.getInt("count10_20")+","+ rs.getInt("count20_40")+","+ rs.getInt("count40_60")+","+ rs.getInt("count60_80")+","+ rs.getInt("count80_100")+",]"
				+ "        }]"
				+ "    }"
				+ "}"
		);
      }

		
	}catch(Exception ex){
            ex.printStackTrace();
        }
        
            return chart.getShortUrl();
    }


    

}