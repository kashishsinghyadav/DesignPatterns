public class Turnoffdevice implements  Command{
    private Device device;

    public Turnoffdevice(Device device) {
        this.device = device;
    }



    @Override
    public void execute() {
        device.offdevice();
    
        
        
    }
    
    
}
