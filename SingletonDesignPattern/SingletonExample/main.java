public class main{

public static void main(String[]args){

  DatabaseConnection obj = DatabaseConnection.getDatabaseInstance();
  System.out.println(obj.hashcode());
   DatabaseConnection obj1 = DatabaseConnection.getDatabaseInstance();
  System.out.println(obj1.hashcode());
  
