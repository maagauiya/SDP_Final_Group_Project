package com.company.observer;
public class Subscriber implements Subject  {
    private String full_name;
    private int gymcode;
    private BIR_FIT_FORUMS forums=new BIR_FIT_FORUMS();

    public Subscriber(String name, int barcode) {
        this.full_name = name;
        this.gymcode = barcode;
    }
    @Override
    public void update(String title){
        System.out.println("Wazzup, "+ full_name +"("+gymcode+") A new discussion topic has been created"+"\n"+"title: "+ title);
    }
    @Override
    public void subscribeforum(BIR_FIT_FORUMS bir_fit_forums){
        forums=bir_fit_forums;
    }
}
