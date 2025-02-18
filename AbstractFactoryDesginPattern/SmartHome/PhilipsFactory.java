public class PhilipsFactory extends SmartAbstractFactory{
        public SmartFan getfan(){

        return new PhilipsFan();
        }
        public SmartLight getlight(){
          return new PhilipsLight();

        }
        




}
