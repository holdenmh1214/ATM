/**
 * Created by holdenhughes on 10/9/15.
 */

import java.util.*;

public class ATM {
    public static void run() throws Exception {
        HashMap<String, Double> accounts = new HashMap();
        while (true){
            System.out.println("Type Name");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();


            if (name.length() == 0) {
                throw new Exception("Please try again");
            } else if (!accounts.containsKey(name)) {
                System.out.println("Account name not found");
                System.out.println("Would you like to create new account? [y]/[n]");
                String choice = scanner.nextLine();
                if (choice.equals("y")) {
                    accounts.put(name, 100.0);
                }else if (choice.equals("n")) {
                    System.out.println("OK, have a nice day.");
                    System.exit(0);
                }else
                    throw new Exception("Invalid option.");

            }

            double balance = accounts.get(name);

            System.out.println("1. Check my balance");
            System.out.println("2. Withdraw Funds");
            System.out.println("3. Cancel");
            System.out.println("4. Delete account");

            String option = scanner.nextLine();
            int optionNum = Integer.valueOf(option);

            if (optionNum == 1) {
                System.out.println("Your balance is $" + balance);
            } else if (optionNum == 2) {
                System.out.println("Withdrawal amount?");
                String amount = scanner.nextLine();
                double amountNum = Double.valueOf(amount);

                if (amountNum > balance) {
                    throw new Exception("Insufficient funds");

                } else {
                    balance = balance - amountNum;
                    accounts.put(name, balance);
                    System.out.println("Please take cash.");
                    System.out.println("Have a good day.");
                }
            } else if(optionNum == 3) {
                System.out.println("Thank you have a good day.");
            } else if(optionNum == 4) {
                accounts.remove(name);
            }
        }
    }


}
