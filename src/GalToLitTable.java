//This program displays a table of gallons to liters conversions
public class GalToLitTable {
    public static void main(String[] args) {
        double gallons, liters;
        int counter;
        counter = 0; //Set the row counter to zero initially.
        for (gallons = 0; gallons <= 100; gallons++) {
            liters = gallons * 3.7854;
            System.out.println(gallons + " gallons corresponds " +
                    liters + " liters.");

            counter++; //Increment the row counter on each iteration
            if (counter == 10) {
                System.out.println();
                counter = 0;
            }

        }

    }
}

