public class PromDemo {
    public static void main(String[] args) {
        byte b; int i;
        b = 10;
        i = b * b; //There is no need for a cast because the result is already promoted to int

        b = (byte) (b * b); //Here, assigning an int value to a byte variable requires a type cast!
        System.out.println("b and i: " + b + " " + i);
    }
}
