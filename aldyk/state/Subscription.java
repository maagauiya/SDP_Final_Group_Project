package state;

public class Subscription {
    private State state;
 
    public Subscription(){
       state = null;
    }
 
    public void setState(State state){
       this.state = state;		
    }
 
    public State getState(){
       return state;
    }
 }