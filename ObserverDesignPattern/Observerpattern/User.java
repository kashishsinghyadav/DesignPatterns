public class User {
    private String name;



    public  void receiveNotification(){
        System.out.println(this.name + "User notified");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}
