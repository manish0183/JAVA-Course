import java.util.*;
public class if_else4 {
    public static void main ( String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st no : ");
        int a = input.nextInt();
        System.out.println("Enter 2st no : ");
        int b = input.nextInt();
        System.out.println("Enter 3st no : ");
        int c = input.nextInt();
        if( a > b){
            if( a > c){
                System.out.println(a + " is the largest no");
            }else{
                System.out.println(c + " is the largest no");
            }
        }else{
            if( b > c){
                System.out.println(b + " is the largest no");
            }
            else{
                System.out.println(c + " is the largest no");
            }
        }
        input.close();
    }
}
