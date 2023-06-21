// Ternary Operator


import java.util.*;
public class if_else5 {
    public static  void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any no : ");
        int num = input.nextInt();
        System.out.println("You entered : " + num);

        String type = ( num%2 == 0)? "Even" : "Odd";
        System.out.println(num + " is an " + type + " number"); 
        input.close();

    }
}
