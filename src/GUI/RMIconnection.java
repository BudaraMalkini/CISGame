/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import Server.RMI_Facade;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RMIconnection {
    private Registry reg;
    private RMI_Facade server;

    /**
     *RMI connection made connection wither server side and client side
     */
    public RMIconnection() {
        try {
            server = (RMI_Facade) Naming.lookup("rmi://localhost/service");
        } catch (NotBoundException ex) {
            Logger.getLogger(RMIconnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(RMIconnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(RMIconnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *get rmi connection
     * @return server 
     */
    public RMI_Facade getServer() {
        System.out.println("Successfully Connected to the Server.....");
        return server;
    }
}
