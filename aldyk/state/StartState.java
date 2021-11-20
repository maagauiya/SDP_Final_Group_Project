package state;

public class StartState implements State {

    @Override
    public void doAction(Subscription subscr) {
        System.out.println("Subscription started!");
        subscr.setState(this);
    }
    
   
}
