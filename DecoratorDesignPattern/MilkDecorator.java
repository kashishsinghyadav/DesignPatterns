public class MilkDecorator extends Decorator {

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    
    @Override
    public double getcost() {
        return decoratedCoffee.getcost() + 1.5;
    }
}
