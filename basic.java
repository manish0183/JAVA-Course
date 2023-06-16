public class basic{
    public static void main(String args[]){
        System.out.println("Hello World");
        System.out.println("I am Manish Patil");        
        System.out.println("I am learning Java Programming\n");   
        
        // pattern
        System.out.println("* * * *");
        System.out.println("* * *");
        System.out.println("* *");
        System.out.println("*");
        System.out.println();

        // single line comment
        /*
        multiline comment
         */

        // variables and it's assignment
        int a = 80;
        int b = 90;
        String name = "Jess";
        System.out.println(a);
        System.out.println(b);
        System.out.println("The value of name variable is " + name);
        System.out.println();

        // data types :- Java is a typed language 
        // Primitive data types
        byte n = 2;
        System.out.println("The value of byte n = " +b);
        short s = 250;
        System.out.println("The value of short s = " +s);
        char ch = 'p';
        System.out.println("The value of ch = "+ch);
        int m = 80;
        System.out.println("The value of int m = " +m);
        long v = 5000000;
        System.out.println("The value of long v = " +v);
        float f = 50.25f;     // by default, java takes any value as double, for float put f at the end
        System.out.println("The value of float f = " +f);
        double price = 10.50365;
        System.out.println("The value of double price  = " +price);
        boolean var = true;
        System.out.println("The value of var = " +var);
    }
}