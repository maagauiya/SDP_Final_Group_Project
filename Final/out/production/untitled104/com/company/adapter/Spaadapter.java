package com.company.adapter;

public  class Spaadapter extends Hamam{
    private Spa spa;

    public Spaadapter(Spa spa) {
        this.spa = spa;
    }
    public void changer(){
        spa.setPasscode(10000 + (int)(Math.random() * ((19999 - 10000) + 1)));
    }
    @Override
    public int getPasscode() {
        changer();
        return  spa.getPasscode();
    }
}
