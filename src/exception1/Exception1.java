/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception1;

/**
 *
 * @author Isuru B. Ranapana
 */
public class Exception1 {

    public static void main(String[] args) {
        int i,j,k;
        i=8;
        j=0;
        //k=i/j;
        /*System.out.println(k);*/
        //this cann't run.
        try{
            k=i/j;
        }catch(Exception e){
            System.out.println(e);
            System.out.println("It cann't divide by 0");
            //this is arithmatic exception in unchecked exception in throwable class
        }finally{
            System.out.println("BYE");
        }
        System.out.println("This is exception");
   
    }
    
}
