public class VaultPagefactory{

public static Vaultscreen createVaultPagescreen(Webdriver driver){
          if(os.contain('Mac')){
              return new MacVaultLocator(driver);
            
          }
            elseif(os.contain('Window')){
              return new WindowVaultLocator(driver);
            }
          else{
            return null;
          }

}



}
