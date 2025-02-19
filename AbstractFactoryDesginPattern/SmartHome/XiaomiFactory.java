public class XiaomiFactory extends SmartAbstractFactory{
        public SmartFan getfan(){

        return new XiaomiFan();
        }
        public SmartLight getlight(){
          return new XiaomiLight();

        }
        




}
