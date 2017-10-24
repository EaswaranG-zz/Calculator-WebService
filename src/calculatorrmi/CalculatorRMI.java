
package calculatorrmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author STUDENT
 */
public class CalculatorRMI extends UnicastRemoteObject implements CalculatorInterface{
    public CalculatorRMI() throws RemoteException
    {
        int a,b;
    }
   

    @Override
    public int add(int x, int y) throws RemoteException {
       return x+y;
    }

    @Override
    public int sub(int x, int y) throws RemoteException {
     return x-y;
    }

    @Override
    public int mul(int x, int y) throws RemoteException {
        return x*y;
    }

    @Override
    public int div(int x, int y) throws RemoteException {
      return x/y;
    }
    
}
