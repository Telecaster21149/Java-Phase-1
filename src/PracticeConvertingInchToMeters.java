public class PracticeConvertingInchToMeters {
    public static void main(String[] args){
        int Inch, Third, Four; //counter → int
        double Meters; //calculation result → double


        for (Inch = 2; Inch <= 144; Inch++) {

            Meters = Inch * 0.0254;
            Third = Inch % 12; //the variable is included only if the number is 0 when divided by 12
            Four = Inch % 2; //only even inches are printed

            if (Four == 0) System.out.println
                    (Inch + " Inch = "
                    + Meters + " meters");

        if (Third == 0) { //space after every 12th inch
            System.out.println();
        }
        }
    }
}
