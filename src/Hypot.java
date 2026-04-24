//Using the Pythagorean Theorem to find the length of the hypotenuse given the lengths of the two legs

public class Hypot {
    public static void main(String[] args) {
        double x, y, z;
        x = 6;
        y = 8;
        z = Math.sqrt(x*x + y*y); //sqrt() method. Prefixed with the name of the class of which it is a member.
        System.out.println("Length of hypotenuse: " + z);
    }
}
