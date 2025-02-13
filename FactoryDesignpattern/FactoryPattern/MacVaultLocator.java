public class MacVaultLocator extends Vaultscreen(){

public MacVaultLocator(Webdriver driver){
      super(driver);
  }
    
  @override
   protected abstract By settingsLocator(){
        return By.xpath("");
}

}
