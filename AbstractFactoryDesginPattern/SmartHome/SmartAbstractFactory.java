public abstract class SmartAbstractFactory{
  public static SmartAbstractFactory createsmartHome(String companyname){

    if(companyname=="Philips")
      return new PhilipsFactory();
    else if(companyname=="Xiaomi")
      return new XiaomiFactory();
    else
      return null;

  }
  public SmartFan getfan();
  public SmartLight getlight();


}
