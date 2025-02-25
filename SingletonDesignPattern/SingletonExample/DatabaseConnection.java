public class DatabaseConnection{
          private DatabaseConnection(){
            
          }

  public static DatabaseConnection getDatabaseInstance(){
        DatabaseConnection databaseconnection = new DatabaseConnection();
        return databaseconnection;


  }


  
}
