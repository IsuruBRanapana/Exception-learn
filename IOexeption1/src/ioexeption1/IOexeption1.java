
package ioexeption1;
import java.io.*;
import java.util.*;
/**
 *
 * @author Isuru B. Ranapana
 */
public class IOexeption1 {
    public static void main(String[] args) {
        int i,j,k;
        Scanner input = new Scanner(System.in);
        i=8;
        k=0;
        try{
            j=input.nextInt();
            k=i/j;
           
        }catch(IOException e){//enter ioexception
            System.out.println(e);
            System.out.println("you can't enter 0");
        }

    }
    
}
