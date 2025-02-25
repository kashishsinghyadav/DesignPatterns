public class main{

public static void main(String[]args){

  DatabaseConnection obj = DatabaseConnection.getDatabaseinstance();
  System.out.println(obj.hashcode());
   DatabaseConnection obj1 = DatabaseConnection.getDatabaseinstance();
  System.out.println(obj1.hashcode());
  
