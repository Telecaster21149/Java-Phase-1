public class VarInitDemo {
    public static void main(String[] args) {
        int x;
        for (x = 0; x < 3; x++) {
            int y = -1; //initialized at each entry into the block
            System.out.println("The value of y is: " + y);
            y = 100;
            System.out.println("Now the value of y is: " + y);
        }
    }
}
