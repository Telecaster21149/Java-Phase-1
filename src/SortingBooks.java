public class SortingBooks {
    public static void main(String[] args)
        throws java.io.IOException {
        char A = 'A', B = 'B', C = 'C', D = 'D', E = 'E';
        System.out.println("Press: A, B, C, D or E" + "\n" +
                "To see the book titles");

        A = (char) System.in.read();


        switch (A) {
            case 'A':
                System.out.println("1. Animal Farm" + "\n" +
                        "2. A Clockwork Orange");
                break;
            case 'B':
                System.out.println("1. Brave New World" + "\n" +
                        "2. Blood Meridian");
                break;
            case 'C':
                System.out.println("1. Crime and Punishment" + "\n" +
                        "2. Catch-22");
                break;
            case 'D':
                System.out.println("1. Don Quixote" + "\n" +
                        "2. Dracula");
                break;
            case 'E':
                System.out.println("1. East of Eden" + "\n" +
                        "2. Emma");
                break;
        }
    }
}
