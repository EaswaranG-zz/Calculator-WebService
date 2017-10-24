
package calculatorrmi;

import java.rmi.Naming;
import java.util.Scanner;

/**
 *
 * @author STUDENT
 */
public class CalculatorClient {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        try{
            CalculatorInterface c = (CalculatorInterface)Naming.lookup("rmi://localhost:1099/calculator");
            System.out.println("Client is Connected to the server");
            System.out.println("Select an option\n"
                    + "1.Addition\n"
                    + "2.Subtraction\n"
                    + "3.Multiplication\n"
                    + "4.Division\n");
            int choice = scan.nextInt();
            int x,y;
            System.out.println("Enter x and y");
            x = scan.nextInt();
            y = scan.nextInt();
            
            switch(choice){
                case 1:
                        System.out.println(c.add(x, y));
                        break;
                case 2:
                        System.out.println(c.sub(x, y));
                        break;
                case 3:
                        System.out.println(c.mul(x, y));
                        break;
                case 4:
                        System.out.println(c.div(x, y));
                        break;
                default:
                        System.out.println("Invalid Selection");
                        System.exit(0);
                    
            }
            
            
        }catch(Exception e){
            System.out.println("Exception Caught");
        }
        
        scan.close();
    }
}
