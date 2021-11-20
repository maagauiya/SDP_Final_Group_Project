package decorator;

public class poolGym extends gymDecorator{
    subchik gym;

    public poolGym(subchik gym) {
        this.gym = gym;
    }
    
    public String getDesc() {
        return gym.getDesc() + ", pool";
    }
}
