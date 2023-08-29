

public class operators {
    public static void main(String args[]){

        // arithmatic operators
        int a = 20;
        int b = 10;
        System.out.println("Addition is equal to " + (a + b));
        System.out.println("Subtraction is " + (a - b));
        System.out.println("Multiplication is " + (a * b));
        System.out.println("Division is " + (a / b));
        System.out.println("Modulo is " + (a % b));

        // unary arithmatic operator
        // post assignment :- pehle increment hoga , baad me assign
        int m = 20;
        int n = m++;
        System.out.println(m);
        System.out.println(n);

        int k = 90;
        int l = k--;
        System.out.println(k);
        System.out.println(l);

        // Pre assignment :- pehle assign hoga , baad me increment
        int p = 50;
        int q = ++p;
        System.out.println(p);
        System.out.println(q);

        int x = 100;
        int y = --x;
        System.out.println(x);
        System.out.println(y);

        // Relational operators
        int s = 90;
        int t = 10;
        System.out.println(s==t);
        System.out.println(s!=t);
        System.out.println(s>t);
        System.out.println(s<t);
        System.out.println(s<=t);
        System.out.println(s>=t);

        // logical operators
        boolean v = true;
        boolean w = false;
        System.out.println(v && w);              // logical and will give true only if both are true
        System.out.println(v || w);              // logical or will give true if at least one of them is true
        System.out.println(v != w);              // logical not 

        // Assignment operator
        int A = 10;
        int B = A;
        System.out.println("B = " + B);
        A += A;
        System.out.println(A);
        A -= 5;
        System.out.println(A);
        A *= 5;
        System.out.println(A);
        A /= A;
        System.out.println(A);
        A %= A;
        System.out.println(A);



    }
}
