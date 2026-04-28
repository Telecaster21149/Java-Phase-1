//Side effects may be important
public class SideEffects {
    public static void main(String[] args) {
        int i;
        i = 0;
        //Here, i is still incremented, even though the condition in the if statement evaluates to false
        if (false & (++i < 100))
            System.out.println("It is not displayed");
        System.out.println("The if statement is executed: " + i);

        //In this case, i is not incremented because the short-circuited operation skips incrementation
        if (false && (++i < 100))
            System.out.println("It is not displayed");
        System.out.println("The if statement is executed: " + i);
    }
}
