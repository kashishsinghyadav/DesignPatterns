import java.util.ArrayList;
import java.util.List;

class Concealer implements Zepto {
    public List<User> userList = new ArrayList<>();
  
    @Override
    public void addUser(User user) {
        userList.add(user);
        
        System.out.println(user.getName() + " subscribed for restock notifications.");
    }

    @Override
    public void notifyUsers() {
        for (User user : userList) {
            user.receiveNotification();
        }
        userList.clear(); 
    }
}
