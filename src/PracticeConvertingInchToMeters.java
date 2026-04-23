public class PracticeConvertingInchToMeters {
    public static void main(String[] args){
        double Inch, Meters, Third;
        int counter;
        counter = 0;
        for (Inch = 1; Inch <= 144; Inch++) {
            Meters = Inch * 0.0254;
            Third = Inch % 12;
            System.out.println(Inch + " Inch = " + Meters + " meters");

        counter++;
        if (Third == 0) {
            System.out.println();
        }
        }
    }
}
