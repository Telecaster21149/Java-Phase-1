//Demonstration of the use of boolean values
public class BoolDemo {
    public static void main(String[] args) {
        boolean b, a;

        b = true;
        System.out.println("boolean = " + b);
        System.out.println("123 > 122 = " + (123 > 122));

        b = false;
        System.out.println("boolean = " + b);

        //A boolean value can control the if statement
        if (b) System.out.println("True");
        b = false;
        if (b) System.out.println("False");

        //The result of a relational operation is a boolean value
        System.out.println("10 > 9 = " + (10 > 9));
        System.out.println();

        a = true;
        if (a)
            System.out.println("A = " + a);
        a = false;
        if (a)
            System.out.println("We don't see " + a);
    }
}
