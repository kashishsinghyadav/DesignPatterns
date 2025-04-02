class VendingMachine {
    private VendingMachineState state;

    public VendingMachine() {
        this.state = new IdleState(); // Initial state
    }

    public void setState(VendingMachineState state) {
        this.state = state;
    }

    public void insertMoney() {
        state.insertMoney(this);
    }

    public void selectProduct() {
        state.selectProduct(this);
    }

    public void dispenseProduct() {
        state.dispenseProduct(this);
    }
}
