public class NestedSwitchDemo {
    public static void main(String[] args) {

        char category = 'M';
        char option = 'B';

        switch (category) {
            case 'G':
                System.out.println("Games category");

                switch (option) {
                    case 'A':
                        System.out.println("Minecraft");
                        break;
                    case 'B':
                        System.out.println("Half-Life");
                        break;

                    default: System.out.println("Unknown Game");
                }
                break;

            case 'M':
                System.out.println("Movies Category");
                switch (option) {
                    case 'A':
                        System.out.println("Taxi Driver");
                        break;
                    case 'B':
                        System.out.println("Fight Club");
                        break;

                    default:
                        System.out.println("Unknown movie");
                }
                break;
            default: System.out.println("Unknown category");
        }
    }
}
