public class Example2FromMemory {public static void main(String[] args) {
    int myApples, yourApples, usApples, applesForEach;
    myApples = 380;
    yourApples = 120;
    System.out.print("I have " + myApples + " apples ");
    System.out.print("and you have " + yourApples);
    usApples = myApples + yourApples;
    System.out.print(", so our total is " + usApples);
    applesForEach = usApples / 2;
    System.out.println(", with " + applesForEach + " apples each");
}
}
