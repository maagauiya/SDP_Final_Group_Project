package state;

public class StopState implements State {

    @Override
    public void doAction(Subscription subscr) {
        System.out.println("Subscription ended!");
        subscr.setState(this);
    }
    
}
