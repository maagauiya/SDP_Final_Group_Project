package com.company.template;

public class Premium extends Template{
    @Override
    public void included() {
        System.out.println(" 1: 12 visits to the gym \n 2: 6 visits to the pool \n " +
                "3: 6 visists to the hamam \n 4: vistis from 08:00-02:00 \n");
    }
}
