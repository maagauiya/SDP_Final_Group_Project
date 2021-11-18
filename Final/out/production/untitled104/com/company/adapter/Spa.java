package com.company.adapter;

public class Spa {
    int passcode=20000 + (int)(Math.random() * ((29999 - 20000) + 1));

    public int getPasscode() {
        return passcode;
    }

    public void setPasscode(int passcode) {
        this.passcode = passcode;
    }
}
