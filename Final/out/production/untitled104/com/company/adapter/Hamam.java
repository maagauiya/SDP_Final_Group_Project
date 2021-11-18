package com.company.adapter;

public class Hamam {
    int passcode=10000 + (int)(Math.random() * ((19999 - 10000) + 1));

    public int getPasscode() {
        return passcode;
    }

    public void setPasscode(int passcode) {
        this.passcode = passcode;
    }
}
