public class Help {
    public static void main(String[] args)
    throws java.io.IOException {
        System.out.println("Help on:");
        System.out.println("  1. if");
        System.out.println("  2. switch");
        System.out.println("Select an option: ");
        System.out.println("\n");

        int choice;
        choice = (char) System.in.read();

        switch (choice) {
            case '1':
                System.out.println("Statement if:\n");
                System.out.println("if(condition) operator;");
                System.out.println("else operator");
                break;
            case '2':
                System.out.println("Traditional statement switch:\n");
                System.out.println("switch(expression) {");
                System.out.println("  case constant:");
                System.out.println("    sequence of operators");
                System.out.println("    break");
                System.out.println("}");
                break;
            default: System.out.println("The selected option was not found.");
        }
    }
}
