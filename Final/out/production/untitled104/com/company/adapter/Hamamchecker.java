package com.company.adapter;

public class Hamamchecker {
    public boolean checker(Hamam hamam){
        if (hamam.getPasscode()>=10000 && hamam.getPasscode()<=19999){
            return true;
        }
        else{
            return false;
        }
    }
}
