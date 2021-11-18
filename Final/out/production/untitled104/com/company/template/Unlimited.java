package com.company.template;

public class Unlimited extends Template{
    @Override
    public void included() {
        System.out.println(" 1: Unlimited visits to the gym \n 2: 12 visits to the pool \n " +
                "3: 12 visists to the hamam \n 4: Vistis from 08:00-02:00 \n");
    }
}
