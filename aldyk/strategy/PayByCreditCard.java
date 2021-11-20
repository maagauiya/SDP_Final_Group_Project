package strategy;

import java.util.Scanner;


public class PayByCreditCard implements PayStrategy {
    Scanner insert = new Scanner(System.in);

    private String number;
    private String date;
    private String cvv;

    @Override
    public boolean pay(int paymentAmount) {
        System.out.println("Paying " + paymentAmount + " using Credit Card.");
        return true;
    }

    @Override
    public void collectPaymentDetails() {
        System.out.print("Enter the card number: ");
        number = insert.nextLine();
        System.out.print("Enter the card expiration date 'mm/yy': ");
        date = insert.nextLine();
        System.out.print("Enter the CVV code: ");
        cvv = insert.nextLine();
        
    }


    
}
