class SugarDecorator extends Decorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

   
    @Override
    public double getcost() {
        return decoratedCoffee.getcost() + 0.5;
    }
}
