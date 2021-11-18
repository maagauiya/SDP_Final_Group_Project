package com.company.adapter;

public class Spachecker {
    public boolean checker(Spa spa){
        if (spa.getPasscode()>=20000 && spa.getPasscode()<=29999){
            return true;
        }
        else{
            return false;
        }
    }
}
