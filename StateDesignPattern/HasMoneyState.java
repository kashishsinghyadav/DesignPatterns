class HasMoneyState implements VendingMachineState {
    @Override
    public void insertMoney(VendingMachine machine) {
        System.out.println("Money already inserted. Select a product.");
    }

    @Override
    public void selectProduct(VendingMachine machine) {
        System.out.println("Product selected. Dispensing...");
        machine.setState(new DispensingState());
    }

    @Override
    public void dispenseProduct(VendingMachine machine) {
        System.out.println("Select a product first.");
    }
}
