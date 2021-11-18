package com.company;
import com.company.adapter.*;
import com.company.observer.*;
import com.company.template.*;
public class Main {

    public static void main(String[] args) {
        //Observer
       /*Subscriber student1=new Subscriber("Bekarys",201361);
       Subscriber student2=new Subscriber("Aldyk",201362);
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
        gym.creatediss("Discussion of switching to offline format");*/


        //Template
        /*Premium premium =new Premium();
        premium.included();
        Unlimited unlimited=new Unlimited();
        unlimited.included();
        Basic basic=new Basic();
        basic.included();*/


        //Adapter
        Spa spa=new Spa();
        Hamam hamam=new Hamam();
        Hamamchecker hamamchecker=new Hamamchecker();
        Spachecker spachecker=new Spachecker();
        System.out.println(hamamchecker.checker(hamam));
        System.out.println(spachecker.checker(spa));
        Spaadapter spaadapter=new Spaadapter(spa);
        Hamamadapter hamamadapter=new Hamamadapter(hamam);
        System.out.println(hamamchecker.checker(spaadapter));
        System.out.println(spachecker.checker(hamamadapter));


    }
}
