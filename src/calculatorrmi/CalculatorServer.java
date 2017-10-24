/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorrmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;

/**
 *
 * @author Easwaran
 */
public class CalculatorServer {
    public static void main(String [] args) throws RemoteException{
        Registry r = java.rmi.registry.LocateRegistry.createRegistry(1099);
        r.rebind("calculator", (Remote) new CalculatorRMI());
        System.out.println("Server is Running");
    }
            
}
