public class TurnonDevice implements  Command{
    private Device device;

    public TurnonDevice(Device device) {
        this.device = device;
    }



    @Override
    public void execute() {
        device.ondevice();
    
        
        
    }
    
}
