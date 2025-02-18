public class PhilipsFactory extends SmartAbstractFactory{
        public abstract getfan(){

        return new PhilipsFan();
        }
        public abstract getlight(){
          return new PhilipsLight();

        }
        




}
