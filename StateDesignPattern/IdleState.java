public class IdleState implements VendingMachineState  {
   
     public void insertMoney(VendingMachine machine) {
        System.out.println("Money inserted. You can select a product.");
        machine.setState(new HasMoneyState());
    }

    @Override
    public void selectProduct(VendingMachine machine) {
        System.out.println("Please insert money first.");
    }

    @Override
    public void dispenseProduct(VendingMachine machine) {
        System.out.println("No money inserted. Cannot dispense.");
    }
}
