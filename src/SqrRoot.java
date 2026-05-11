public class SqrRoot {
    public static void main(String[] args) {
        double num, scroot, rerr;

        for (num = 0; num < 100; num++) {
            scroot = Math.sqrt(num);
            System.out.println("The square root of " + num + " = " + scroot);

            rerr = num - (scroot * scroot);
            System.out.println("The rounding error is " + rerr);
            System.out.println();
        }
    }
}
