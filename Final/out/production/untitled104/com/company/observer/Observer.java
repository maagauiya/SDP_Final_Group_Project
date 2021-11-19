package com.company.observer;
 interface Observer {
    void subscribe(Subscriber s);
    void unsubscribe(Subscriber s);
    void notifysub(String title);
    void creatediss(String title);
}
