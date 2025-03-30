public class commandmain{
    public static void main(String[] args) {
        // first need to create object of reciver
       
        Fan fan = new Fan();
        Light light = new Light();
        TurnonDevice ton = new TurnonDevice(fan);
        TurnonDevice ton1 = new TurnonDevice(light);        
        RemoteInvoker remote = new RemoteInvoker(ton);
        RemoteInvoker remote1 = new RemoteInvoker(ton1);
        remote.startCommand();
        remote1.startCommand();
        
                                    
    }
}
