public class Decoratormain{
public static void main(String[] args) {
    Coffee myCoffee = new BasicCoffee();
    System.out.println(myCoffee.getcost());

    myCoffee = new MilkDecorator(myCoffee);
    System.out.println( myCoffee.getcost());

    myCoffee = new SugarDecorator(myCoffee);
    System.out.println(myCoffee.getcost());
}
}
