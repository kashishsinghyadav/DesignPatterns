public class prototype  implements Cloneable {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void getDataFromDB(){
        System.out.println(this.username + "and this is " + this.password);
    }

    @Override
    protected  Object clone() throws CloneNotSupportedException{
        return super.clone();
    } 
}
