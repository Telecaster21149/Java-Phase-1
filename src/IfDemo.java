// Demonstration of the use of the if statement
public class IfDemo {
    public static void main(String[] args) {
        int a, b, c;
        a = 2;
        b = 3;
        if (a < b) System.out.println("The value of a is less than the value of b");
        if (a == b) System.out.println("You won't see this");
        System.out.println();
        c = a - b;
        System.out.println("The variable c contains -1");
        if (c >= 0) System.out.println("The value c is non-negative");
        if (c < 0) System.out.println("The value c is negative");
        System.out.println();
        c = b - a;
        System.out.println("The variable c contains 1");
        if (c >= 0) System.out.println("The value c is non-negative");
        if (c < 0) System.out.println("The value c is negative");
    }
}
