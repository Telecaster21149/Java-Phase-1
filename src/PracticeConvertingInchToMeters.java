public class PracticeConvertingInchToMeters {
    public static void main(String[] args){

        int Inch, Third, Four; //Inch — loop variable
        double Meters; //result of conversion

        for (Inch = 2; Inch <= 144; Inch++) {

            Meters = Inch * 0.0254;

            Third = Inch % 12; //remainder of division by 12 (used to detect multiples of 12)
            Four = Inch % 2; //remainder of division by 2 (used to detect even numbers)

            if (Four == 0) { System.out.println //print only even inches
                    (Inch + " Inch = "
                    + Meters + " meters");}

            if (Third == 0) { //line break after every 12 inches
                System.out.println();
        }
        }
    }
}
