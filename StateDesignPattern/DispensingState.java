class DispensingState implements VendingMachineState {
    @Override
    public void insertMoney(VendingMachine machine) {
        System.out.println("Wait! Product is being dispensed.");
    }

    @Override
    public void selectProduct(VendingMachine machine) {
        System.out.println("Wait! Product is already being dispensed.");
    }

    @Override
    public void dispenseProduct(VendingMachine machine) {
        System.out.println("Here is your product. Returning to Idle state.");
        machine.setState(new IdleState());
    }
}
