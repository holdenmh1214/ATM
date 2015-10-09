/**
 * Created by holdenhughes on 10/9/15.
 */

import java.util.*;

public class ATM {
    public static void run() throws Exception {
        System.out.println("Type Name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int balance = 100;

        if (name.length() == 0) {
            throw new Exception("Please try again");
        }

        System.out.println("1. Check my balance");
        System.out.println("2. Withdraw Funds");
        System.out.println("3. Cancel");

        String option = scanner.nextLine();
        int optionNum = Integer.valueOf(option);

        if (optionNum == 1) {
            System.out.println("Your balance is $" + balance);
        } else if (optionNum == 2) {
            System.out.println("Withdrawal amount?");
            String amount = scanner.nextLine();
            int amountNum = Integer.valueOf(amount);

            if (amountNum > balance) {
                throw new Exception("Woah there Bill Gates! Please try again.");
            } else {
                System.out.println("Please take cash.");
                System.out.println("Have a good day.");
            }
        }

        if (optionNum == 3) {
            System.out.println("Thank you have a good day.");
        }
    }
}
