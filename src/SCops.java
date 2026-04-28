//Demonstration of short-circuit operation
public class SCops {
    public static void main(String[] args) {
        int n, d, q;
        n = 10;
        d = 2;

        if (d != 0 && (n % d) == 0) //The short-circuited operation prevents division by zero
            System.out.println(d + " - multiplier " + n);

        d = 0;
        if (d != 0 && (n % d) == 0)
            System.out.println(d + " - multiplier " + n);

        if (d != 0 & (n % d) == 0) //Now both expressions are evaluated, making division by zero possible
            System.out.println(d + " - multiplier ");
    }
}
