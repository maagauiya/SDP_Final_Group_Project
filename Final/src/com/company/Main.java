package com.company;
import com.company.observer.*;
public class Main {

    public static void main(String[] args) {
       Subscriber student1=new Subscriber("Bekarys",201361);
       Subscriber student2=new Subscriber("Aldick",201362);
        Subscriber student3=new Subscriber("Nurken",201362);

        BIR_FIT_FORUMS pool_club= new BIR_FIT_FORUMS();
        pool_club.subscribe(student1);
        pool_club.subscribe(student2);


        BIR_FIT_FORUMS box_club=new BIR_FIT_FORUMS();
        box_club.subscribe(student3);


        BIR_FIT_FORUMS gym=new BIR_FIT_FORUMS();
        gym.subscribe(student1);
        gym.subscribe(student2);
        gym.subscribe(student3);

        pool_club.creatediss("Discussion of topics on midterms");
        box_club.creatediss("Discussion of the new albums by Drake (\"CLB\") and Kanye (\"Donda\")");
        gym.creatediss("Discussion of switching to offline format");

    }
}
