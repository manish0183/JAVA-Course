// else if statement : - Income tax calculator

import java.util.*;
public class if_else3 {
    public static void main(String args[]){
        int tax ;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your income : ");
        int income = input.nextInt();
        if(income < 500000){
            tax = 0;
            System.out.println("No tax");
        } else if( income >= 500000 && income < 1000000){
            tax = (int) (income * 0.2);
            System.out.println("You need to pay Rs " + tax + " as a tax");
        }else {
            tax = (int) (income * 0.3);
            System.out.println("You need to pay Rs " + tax + " as a tax");
        }
        input.close();
    }
}
            


