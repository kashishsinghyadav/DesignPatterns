public class main {
    public static void main(String [] args) {
   
        Book book = new Book.Builder().setBook("Harry Potter").setAuthor("J.K. Rowling").setDscr("the book is Harry Potter written by J.K. Rowling").build();
        System.out.println("Book Name: " + book.getBookname());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Description: " + book.getDescription());



    }
}
