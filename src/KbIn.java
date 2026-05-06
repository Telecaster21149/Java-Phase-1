public class KbIn {
    public static void main(String[] args)
        throws java.io.IOException {
        char ch;
        System.out.println("Press the key and then enter: ");
        ch = (char) System.in.read();
        System.out.println("The following key was pressed: " + ch);
    }
}
