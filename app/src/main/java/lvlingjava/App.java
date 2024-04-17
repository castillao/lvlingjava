package lvlingjava;

import java.util.Scanner;

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
        System.out.println("input 1 to add money to the account");
        System.out.println("input 2 to extract money from the account");
        System.out.println("input 9 to finish the program");
        String r = s.nextLine();
        // TODO valiadte the options, only 1,2,and 9 should be available
        return r;
    }

    public static void main(String[] args) {

        // welcome
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the bank CRUD interface for the java leveling training.");
        System.out.println("With this utility you will be able to create your user and manage your Bank accounts.");

        // user creation
        System.out.println("First your account will be created, please input your name (firstname lastname)");
        String name = scanner.nextLine();
        // TODO regex stuff to validate name?
        String[] sname = name.split(" ");
        Person user = new Person(sname[0], sname[1]);

        // account creation
        Account account = new Account(user.getId());
        System.out.println("Welcome "+sname[0]+"! your account has been created, current money amount is: "+account.getMoney());

        // menu loop
        String selop = "";
        while (!selop.equals("9")) {
            selop = getMenuOption();
            int cmoney = account.getMoney();
            int smoney = 0;
            switch (selop) {
                case "1":
                    System.out.println("---depositing money in the account, please input the amount of money, dont use whitespaces or signs ---");
                    // regex val
                    smoney = scanner.nextInt();
                    account.setMoney(cmoney+smoney);
                    System.out.println("---money deposited correctly, new amount is: "+account.getMoney()+" ---");
                    break;
                case "2":
                    System.out.println("---removing money from the account, please input the amount, dont use whitespaces or signs ---");
                    // regex val
                    smoney = scanner.nextInt();
                    if (smoney <= cmoney) {
                        account.setMoney(cmoney-smoney);
                        System.out.println("---money retired correctly, new amount is: "+account.getMoney()+" ---");
                    } else {
                        System.err.println("===Error: you cant remove more money than you have available ===");
                        System.out.println("===Money amount unchanged, current amount: "+account.getMoney()+" ===");
                    }
                    break;
                case "9":
                    System.out.println("Option 9 selected, see you next time!");
                    scanner.close();
                    break;
                default:
                    System.out.println("Warning: selected option is invalid, please try again");
            }
        }
    }
}
