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

public interface RMI_Facade extends Remote {
    public String login(String email, String password) throws RemoteException;
    public String Register(String username, String email, String password, String confirm_password) throws RemoteException;
    public String Admin(String username, String password) throws RemoteException;
    public String NewAdmin(String username, String password) throws RemoteException;
    public void saveAnswers (Answer [] ansArray, String email) throws RemoteException;
    public   String getUmarks(String username) throws RemoteException;
    public ArrayList<QandAns> getDetailsUser(String email) throws RemoteException;
    public   String getUtotalMarks() throws RemoteException;
   
}
