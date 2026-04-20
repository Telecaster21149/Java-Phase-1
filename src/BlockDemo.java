//Demonstration of using a code block
public class BlockDemo {
    public static void main(String[] args) {
        double i, j, d;
        i = 5;
        j = 10;
        if(i != 0) {
            System.out.println("The value of i is not equal to zero"); //The body of the if statement is an entire block.
            d = j / i;
            System.out.println("The value of j / i = " + d);
        }
    }
}
