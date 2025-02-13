public class WindowVaultLocator extends Vaultscreen(){

public WindowVaultLocator(Webdriver driver){
      super(driver);
  }
    
  @override
   protected abstract By settingsLocator(){
        return By.xpath("");
}
}
