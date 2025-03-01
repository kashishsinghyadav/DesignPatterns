public class main {
    public static void main(String[] args) {
        Kashishchannel channel = new Kashishchannel();
        Mysubscriber subs1 = new Mysubscriber();
        subs1.setUserName("kashish");
        Mysubscriber subs2 = new Mysubscriber();
        subs2.setUserName("kridhaa");
        channel.addSubscriber(subs2);
        channel.addSubscriber(subs1);
        channel.Notification();
        

    }
    
}
