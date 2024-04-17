package lvlingjava;

import java.util.Scanner;
import java.util.HashMap;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void pressEnterKeyToContinue() {
        System.out.println("Press Enter key to continue...");
        Scanner s = new Scanner(System.in);
        s.nextLine();
    }

    public static String getMenuOption() {
        Scanner s = new Scanner(System.in);
        System.out.println("==MENU==");
        System.out.println("input 1 to access \"person\" operations");
        System.out.println("input 2 to access \"account\" operations");
        System.out.println("input 9 to finish the program");
        String r = s.nextLine();
        return r;
    }

    public static void main(String[] args) {
        // System.out.println(new App().getGreeting());
        HashMap<Integer, Account> bankAccounts = new HashMap<>();
        HashMap<Integer, Person> persons = new HashMap<>();

        // welcome
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the bank CRUD interface for the java leveling training.");
        System.out.println("with this utility you will be able to create & manage users and their Bank accounts.");
        // pressEnterKeyToContinue();

        // menu
        String selop = "";
        while (!selop.equals("9")) {
            selop = getMenuOption();
            switch (selop) {
                case "1":
                System.out.println("---option 1 selected, Person Operations---");
                    // Perform "Person" cases.
                    break;
                case "2":
                    // Perform "Account" case.
                    break;
                case "9":
                    System.out.println("Option 9 selected, see you next time!");
                    break;
                default:
                    System.out.println("Warning: selected option is invalid, please try again");
            }
        }

        scanner.close();

    }
}
