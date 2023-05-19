

public class Main {
    public static void main(String[] args) {

        // Variables //
        int number = 6;
        int input1 = 4;
        int input2 = 20;
        String name = "Henk";

        // Method callings //
        hello();
        positiveOrNegative(number);
        positiveOrZeroOrNegative(number);
        bartender(name);
        sum(input1, input2);
    }

    // Method declarations //
    public static void hello() {
        System.out.println("Hello world");
    }

    private static void positiveOrNegative(int number) {
        if (number >= 0) {
            System.out.println("This number is positive!");
        } else {
            System.out.println("This number is negative!");
        }
    }

    private static void positiveOrZeroOrNegative(int number) {
        if (number > 0) {
            System.out.println("This number is positive!");
        }
        else if (number == 0) {
            System.out.println("This number is Zero!");
        }
        else {
            System.out.println("This number is negative!");
        }
    }

    private static void bartender(String name) {
        switch (name) {
            case "Piet":
                System.out.println("Piet houdt van bier.");
                break;
            case "Willem":
                System.out.println("Willem houdt van tequila.");
                break;
            case "Henk":
                System.out.println("Henk houdt van whiskey.");
                break;
            default:
                System.out.println("Geen idee waar deze gebruiker van houdt...");
        }
    }

    public static void sum(int input1, int input2) {
        System.out.println("De uitkomst is " + (input1 + input2));
    }
}