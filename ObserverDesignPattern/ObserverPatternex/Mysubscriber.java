public  class Mysubscriber {
    private  String userName;


    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserName() {
        return userName;
    }
    public void greetUser(){
        System.out.println("Hiiiiiiiiiiiiiii ");
    }
    public void notified(){
        System.out.println(this.userName +"New Video is uploaded!");

    }


    
}
