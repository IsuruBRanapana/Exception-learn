/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplecatch;

/**
 *
 * @author Isuru B. Ranapana
 */
public class Multiplecatch {

    public static void main(String[] args) {
        int i,j,k;
        int arr[]=new int[4];
        i=8;
        j=2;
        try{
            k=i/j;//if j=0 then it call catch without running stetments
            for(int c=0;c<=4;c++){
                arr[c]=c+1;
                //in the array there are only 4 elements are assigend but loop there are 5
            }
        }catch(ArithmeticException e){
            System.out.println("j can't be 0");    
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Maximum elements in array is 4");
        }

    }
    
}
