public class proxymain {
    public static void main(String[] args){
        Proxyclass proxy = new Proxyclass();
        String serverHost="facebook.com";
        proxy.connectTo(serverHost);  
        String serverHost1="twitter.com";
        proxy.connectTo(serverHost1);  



        }


    }

