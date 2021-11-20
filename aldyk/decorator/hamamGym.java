package decorator;

public class hamamGym extends gymDecorator{
    subchik gym;

    public hamamGym(subchik gym) {
        this.gym = gym;
    }
    
    public String getDesc() {
        return gym.getDesc() + ", hamam";
    }
}
