public abstrct class Vaultscreen extends GenricMethods{

public Vaultscreen(Webdriver driver){
      super(driver);

}
protected abstract By settingsLocator();

  public void clickOnSettingPage(){
    click(driver,settingLocator());
  }

}
