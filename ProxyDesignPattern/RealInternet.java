public class RealInternet implements Internet{
   

    @Override
    public void connectTo(String serverHost) {
        try {
            System.out.println("Connecting to"+ serverHost);
            
        } catch (Exception e) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

    }

    
}
