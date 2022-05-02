/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author budar
 */
public class Server {
    
    /**
     * starting the server 
     * @param args
     */
    public static void main(String[] args) {
         System.out.println("Server is starting.....");
        try {
            RMI_Facade obj = new RMIImplimentation();
            Registry reg = LocateRegistry.createRegistry(1099);
            reg.rebind("service", obj);
            System.out.println("Server is Running...");
        } catch (RemoteException ex) {
            System.out.println(ex.getMessage());
            ex.getStackTrace();
        }
    }
    
}
