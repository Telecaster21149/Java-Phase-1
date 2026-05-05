public class PrimeNumber {
    public static void main(String[] args) {
        int i, j;
        boolean is;
        for (j = 2; j < 101; j++) {
            is = true;
            for (i = 2; i <= j / i; i++)
                if ((j % i) == 0) is = false;
            if (is) System.out.println(j + " = prime number");
        }
    }
}

