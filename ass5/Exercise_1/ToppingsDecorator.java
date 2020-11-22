public abstract class ToppingsDecorator extends Cake{
    public Cake cake;

    public ToppingsDecorator(Cake cake){
        this.cake = cake;
    }

    public abstract double cost();
}
