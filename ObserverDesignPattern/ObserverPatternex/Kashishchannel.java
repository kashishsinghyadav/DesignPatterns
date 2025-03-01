import java.util.ArrayList;
import java.util.List;
public class Kashishchannel implements  Youtube {
    public List<Mysubscriber> Userlist = new ArrayList<>();

    @Override
    public void addSubscriber(Mysubscriber subscriber){
        Userlist.add(subscriber);

    }
    @Override
    public void removeSubscriber(Mysubscriber subscriber){
        Userlist.remove(subscriber);

    }
    @Override
    public void Notification(){
        for(Mysubscriber subscriber:Userlist  ){
            subscriber.notified();
        }


    }
    
}
