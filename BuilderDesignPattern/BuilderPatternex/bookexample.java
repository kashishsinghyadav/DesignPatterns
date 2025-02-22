
import java.lang.module.ModuleDescriptor.Builder;

public class Book {
    private String bookname;
    private String author;
    private String description;

    private Book(Builder builder){
        this.bookname=builder.bookname;
        this.author=builder.author;
        this.description=builder.description;
    }

    public String getBookname( ){
        return bookname;
    }
        
    public String getAuthor(){
        return author;

    }
    public String getDescription( ){
        return description;

    }
    public static class Builder{
        private String bookname;
        private String author;
        private String description;

        public Builder setBook(String bookname){
            this.bookname=bookname;
             return this;       
              }
        public Builder setAuthor(String author){
                this.author=author;
                 return this;       
             }

        public Builder setDscr(String description){
                this.description=description;
                 return this;       
             }

        public Book build(){
            return new Book(this);
        }


    
        
    } 
}
