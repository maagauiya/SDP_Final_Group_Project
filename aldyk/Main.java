

import java.util.Scanner;
import decorator.*;
import state.*;
import strategy.*;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // subchik gym = new Gym();

        // System.out.println(gym.getDesc() + ". Costs: " + gym.cost());

        // gym = new hamamGym(gym);

        // System.out.println(gym.getDesc() + ". Costs: " + gym.cost());

        // gym = new poolGym(gym);
        // gym = new spaGym(gym);

        // System.out.println(gym.getDesc() + ". Costs: " + gym.cost());


        //Menu
        System.out.println("Menu: ");
        System.out.println("1 - Buy subscription.");
        System.out.println("2 - Check subscription.");
        System.out.println("3 - Update subscription.");
        System.out.println("4 - Today's activities.");
        System.out.println("5 - News.");
        System.out.println("6 - Exit.");
        
        int insert = scan.nextInt();

         int a = 1000;
        
        if (insert == 1) {

            //Template pattern


            //Registration


            //Strategy pattern to pay

            System.out.println("Please choose, how will you pay.");
            System.out.println("1 - Qiwi.");
            System.out.println("2 - Credit card.");

            insert = scan.nextInt();

            if(insert == 1) {
                PayByQiwi user = new PayByQiwi();
                user.collectPaymentDetails();
                user.pay(a);
            } else if (insert == 2) {
                PayByCreditCard user = new PayByCreditCard();
                user.collectPaymentDetails();
                user.pay(2 * a);
            }

            Subscription sub = new Subscription();

            StartState start = new StartState();
            start.doAction(sub);
            
        } else if (insert == 2) {

            System.out.println("Selecting from database, conditions of subscriptions");

        } else if (insert == 3) {

            System.out.println("Продливает сабскрипшн");

            System.out.println("Please choose, how will you pay.");
            System.out.println("1 - Qiwi.");
            System.out.println("2 - Credit card.");

            insert = scan.nextInt();

            if(insert == 1) {
                PayByQiwi user = new PayByQiwi();
                user.collectPaymentDetails();
                user.pay(a);
            } else if (insert == 2) {
                PayByCreditCard user = new PayByCreditCard();
                user.collectPaymentDetails();
                user.pay(2 * a);
            }

        } else if (insert == 4) {

            System.out.println("What do you wanna do today with gym?");

            subchik gym = new Gym();

            int check = 0;

            while (check != 4) {

                System.out.println("1 - Spa");
                System.out.println("2 - Hamam");
                System.out.println("3 - Pool");
                System.out.println("4 - Nothing");

                int add = scan.nextInt();
                check = add;

                if (add == 1) {
                    gym = new spaGym(gym);
                } else if (add == 2) {
                    gym = new hamamGym(gym);
                } else if (add == 3) {
                    gym = new poolGym(gym);
                }
            }

            System.out.println(gym.getDesc());

            



        } else if (insert == 5) {

            System.out.println("5 - News.");

        } else {

            System.exit(0);

        }



    }
}
