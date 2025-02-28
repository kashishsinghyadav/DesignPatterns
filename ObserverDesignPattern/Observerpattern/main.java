public class main {
    public static void main(String[] args) {
        Concealer product = new Concealer();
        User user1 = new User();
        user1.setName("kashish");
        User user2 = new User();
        user2.setName("Tarun Sir");
        product.addUser(user1);
        product.addUser(user2);

        product.notifyUsers();
       




    }
    
}
