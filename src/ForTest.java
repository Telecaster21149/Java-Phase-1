public class ForTest {
    public static void main(String[] args)
            throws java.io.IOException {
        int i;
        System.out.println("To stop the cycle, press S");
        for (i = 0; (char) System.in.read() != 'S'; i++)
            System.out.println("Passage # " + i);

    }
}
