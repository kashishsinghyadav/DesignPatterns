public class Proxyclass implements  Internet{
    public  RealInternet realnet;

    public Proxyclass(){
        realnet = new RealInternet();
    }

    @Override
    public void connectTo(String serverHost)  {
        if(serverHost.contains("facebook.com")){
            realnet.connectTo(serverHost);          
        }
        else{
      System.out.println("Access denied");


        }
    }

    
}
