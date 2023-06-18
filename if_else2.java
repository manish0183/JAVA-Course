// even or odd

import java.util.*;
public class if_else2 {
    public static void main( String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = input.nextInt();
        System.out.println("You enterd " + num);
        if( num%2 == 0 ){
            System.out.println(num + " is an even number");
        } else{
            System.out.println(num + " is an odd number");
        }
        input.close();
    }
}
