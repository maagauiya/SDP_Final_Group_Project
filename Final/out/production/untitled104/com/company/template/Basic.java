package com.company.template;

public class Basic extends Template{
    @Override
    public void included() {
        System.out.println(" 1: 12 visits to the gym \n 2: 3 visits to the pool \n " +
                "3: 3 visists to the hamam \n 4: vistis from 08:00-21:00 \n");
    }
}
