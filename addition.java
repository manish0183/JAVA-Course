// addition and product of 2 variables
import java.util.*;
public class addition {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter any no a");
        int a = input.nextInt();
        System.out.println("The value of a is " +a);

        System.out.println("Enter any no b");
        int b = input.nextInt();
        System.out.println("The value of b is " +b);

        int sum = a + b;
        System.out.println("The sum of a and b " +sum);

        int product = a*b;
        System.out.println("The product od a and b is "+product);
        System.out.println();

        System.out.println("For calculating area, input radius");
        float rad = input.nextInt();
        System.out.println("The value of radius is " +rad);
        float area = 3.14f * rad * rad;
        System.out.println("The area of circle having radius " +rad +" is " +area);
        input.close();
    }
    }

