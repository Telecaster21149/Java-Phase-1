public class PracticeConvertingInchToMeters {
    public static void main(String[] args){
        double Inch, Meters;
        int counter;
        counter = 0;
        for (Inch = 0; Inch <= 144; Inch++) {
            Meters = Inch * 0.0254;
            System.out.println(Inch + " Inch = " + Meters + " meters");

        counter++;
        if (Inch == 12) {
            System.out.println();
        }
        }
    }
}
