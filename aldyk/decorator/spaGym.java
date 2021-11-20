package decorator;

public class spaGym extends gymDecorator{
    subchik gym;

    public spaGym(subchik gym) {
        this.gym = gym;
    }
    
    public String getDesc() {
        return gym.getDesc() + ", spa";
    }
}
