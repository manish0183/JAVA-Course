// basic if else statement :- adult or not

import java.util.*;
public class if_else1 {
    public static void main( String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = input.nextInt();
        System.out.println("The Age is " + age);
        if( age > 18){
            System.out.println("You are Adult");
        }
        else{
            System.out.println("You are not Adult");
        }
        input.close();
    }
}
