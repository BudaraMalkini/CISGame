/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;


import Services.Answer;
import Services.QandAns;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import javax.swing.JLabel;

/**
 * Creating a methods headers 
 * @author budar
 */
public interface RMI_Facade extends Remote {

    /**
     * login method header 
     * @param email
     * @param password
     * @return
     * @throws RemoteException
     */
    public String login(String email, String password) throws RemoteException;

    /**
     * Register method header
     * @param username
     * @param email
     * @param password
     * @param confirm_password
     * @return
     * @throws RemoteException
     */
    public String Register(String username, String email, String password, String confirm_password) throws RemoteException;

    /**
     * Admin method header
     * @param username
     * @param password
     * @return
     * @throws RemoteException
     */
    public String Admin(String username, String password) throws RemoteException;

    /**
     * New admin method header 
     * @param username
     * @param password
     * @return
     * @throws RemoteException
     */
    public String NewAdmin(String username, String password) throws RemoteException;

    /**
     * save answer to database method header
     * @param ansArray
     * @param email
     * @throws RemoteException
     */
    public void saveAnswers (Answer [] ansArray, String email) throws RemoteException;

    /**
     * get user's marks method header
     * @param username
     * @return
     * @throws RemoteException
     */
    public   String getUmarks(String username) throws RemoteException;

    /**
     * get users details method header 
     * @param email
     * @return
     * @throws RemoteException
     */
    public ArrayList<QandAns> getDetailsUser(String email) throws RemoteException;

    /**
     * get all users total marks method header 
     * @return
     * @throws RemoteException
     */
    public   String getUtotalMarks() throws RemoteException;
   
}
