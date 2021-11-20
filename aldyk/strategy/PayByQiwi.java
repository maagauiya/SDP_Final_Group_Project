package strategy;

import java.util.Scanner;


public class PayByQiwi implements PayStrategy {
    Scanner insert = new Scanner(System.in);


    private String number;
    private String password;


    @Override
    public boolean pay(int paymentAmount) {
        System.out.println("Paying " + paymentAmount + " using Qiwi.");
        return true;
    }

    @Override
    public void collectPaymentDetails() {
        System.out.println("Enter the user's number: ");
        number = insert.nextLine();
        System.out.println("Enter the password: ");
        password = insert.nextLine();
        if (verify()) {
            System.out.println("Data verification has been successful.");
        } else {
            System.out.println("Wrong email or password!");
        }
    }

    private boolean verify() {
        System.out.println("Check: ");
        boolean check = insert.nextBoolean();
        return check;
    }
}
