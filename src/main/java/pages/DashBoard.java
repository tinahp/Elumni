package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DashBoard {

    public WebDriver driver;

    public DashBoard(WebDriver driver) {
        this.driver = driver;
    }

    //Let locate the WeBElement
    private By username =By.cssSelector("#email");
    private By password =By.cssSelector("#password");
    private By login =By.cssSelector("button[type='submit']");
    private By dashboard = By.cssSelector("a[aria-current='page'] span");
    private By generalOverview = By.cssSelector("(//a[@aria-current='page'])[2]");
    private By transferFunds = By.cssSelector("body > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > button:nth-child(2)");
    private By selectAccount = By.cssSelector(".custom-dropdown__select__input-container.css-19bb58m");
    private By dropDown = By.xpath("(//*[name()='path'])[11]");
    private By accountNumber = By.cssSelector("#accountNumber");
//  private By defaultNaira = By.cssSelector("//label[normalize-space()='NGN']");
    private By enterField = By.xpath("//input[@id='amount']");
    private By addTag = By.cssSelector(".MultipleSelectField_custom-dropdown__select__Bo6UY.css-b62m3t-container");
    private By reasonForTransfer = By.cssSelector("#transferDescription");
    private By submit = By.cssSelector("button[type='submit']");

    //    Action the Webpages
    public void clickusername() {driver.findElement(username).sendKeys("ptinah@ymail.com");}
    public void clickPassword() {driver.findElement(password).sendKeys("Blonde@77");}
    public void clickLogin(){driver.findElement(login).click();}
    public void clickDashboard1() {driver.findElement(dashboard).click();}
    public void clickGeneralOverview() {driver.findElement(generalOverview).click();}
    public void clickTransferFunds() {driver.findElement(transferFunds).click();}
    public void clickSelectAccount() {driver.findElement(selectAccount).click();}
    public void clickDropDown() throws InterruptedException {
        List<WebElement> bankList = driver.findElements(By.cssSelector("(//*[name()='svg'][@class='css-8mmkcg'])[1]"));
        for (WebElement bank : bankList) {
            // Do something with each item
            bank.click(); // Click the item
            bank.getText(); // Get the text of the item
        }
    }
  public void clickNumber(){driver.findElement(accountNumber).sendKeys("1021063886");}
  public void addEnterField(){driver.findElement(enterField).sendKeys("500");}
  public void addClickTag() throws InterruptedException {
      List<WebElement> tagAdd = driver.findElements(By.cssSelector(".MultipleSelectField_custom-dropdown__select__Bo6UY.css-b62m3t-container"));
      for (WebElement tag : tagAdd) {
          // Do something with each item
          tag.click(); // Click the item
          tag.getText(); // Get the text of the item
          tag.isSelected(); // Display what is selected
      }
  }
  public void clickTransferReason(){driver.findElement(reasonForTransfer).sendKeys("towards the donation");}
  public void clickSubmitButton(){driver.findElement(submit).click();}


}



