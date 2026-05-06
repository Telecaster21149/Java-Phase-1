public class Guess {
    public static void main(String[] args)
    throws java.io.IOException {
        char ch, answer = 'K';
        System.out.println("The letter between A and Z is intended");
        System.out.print("Try to guess it: ");

        ch = (char) System.in.read();
        if (ch == answer) System.out.println("Right");
    }
}
