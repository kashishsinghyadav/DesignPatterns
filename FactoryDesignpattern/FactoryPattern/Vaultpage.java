public class Vaultpage(){
Webdriver driver;
Vaultscreen clickonsettingpage;

  public Vaultpage(){
    driver=hooks.get();
    clickonsettingpage =  VaultPagefactory.createVaultPagescreen(driver);
    
  }
  public void userOnSettingPage(){
    clickonsettingpage.clickOnSettingPage();
  }

}
