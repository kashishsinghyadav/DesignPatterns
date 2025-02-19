public class client{

public static void main(String[] args) {
  SmartAbstractFactory object = SmartAbstractFactory.createsmartHome("Philips");
  System.out.println(object.getfan());
  System.out.println(object. getlight());
  
 
  

  }
