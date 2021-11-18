package com.company.adapter;

public  class Hamamadapter extends Spa {
    private Hamam hamam;

    public Hamamadapter(Hamam hamam) {
        this.hamam = hamam;
    }
    public void changer(){
        hamam.setPasscode(20000 + (int)(Math.random() * ((29999 - 20000) + 1)));
    }

    @Override
    public int getPasscode() {
        changer();
        return hamam.getPasscode();
    }
}
