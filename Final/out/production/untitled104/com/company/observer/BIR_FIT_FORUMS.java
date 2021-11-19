package com.company.observer;
import java.util.*;

public class BIR_FIT_FORUMS implements Observer {
    private String title;
    List<Subscriber> sub= new ArrayList<>();
    @Override
    public void subscribe(Subscriber s){
      sub.add(s);
    }
    @Override
    public void unsubscribe(Subscriber s){
        sub.remove(s);
    }
    @Override
    public void notifysub(String title){
        for(Subscriber sub:sub) {
            sub.update(title);
        }
        System.out.println("==========================");
    }
    @Override
    public void creatediss(String title){
          this.title=title;
          notifysub(title);
    }

}
