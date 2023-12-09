package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Inventory  {

    public WebDriver driver;

    public Inventory (WebDriver driver) {this.driver=driver;}

    //Let locate the WeBElement
    private By sell =By.xpath("//span[normalize-space()='Sell']");
    private By viewStore =By.cssSelector("#password");
    private By manage =By.xpath("(//span[contains(text(),'Manage')])[1]");
    private By analysis = By.xpath("//a[normalize-space()='Analytics']");
    private By product = By.xpath("//a[normalize-space()='Products']");
    private By category = By.xpath("//a[normalize-space()='Category']");
    private By stores = By.cssSelector("//a[normalize-space()='Stores']");
    private By suppliers = By.xpath("//a[normalize-space()='Suppliers']");
    private By salesTransaction = By.xpath("//a[normalize-space()='Sales Transactions']");

    private By stockHistory = By.xpath("//a[normalize-space()='Stock History']");
    private By creditlogs = By.xpath("//a[normalize-space()='Credit logs']");
    private By reconcilation = By.xpath("//a[normalize-space()='Credit logs']");
    private By tables = By.xpath("//a[normalize-space()='Tables']");
    private By dropDown =By.xpath("//*[name()='path' and contains(@d,'M4.516 7.5')]");
    private By dateRange= By.xpath("//div[@class='lm-date-range__input']");
    private By month =By.xpath("//span[@class='rdrMonthPicker']");
    private By dateFrom = By.xpath("//span[@class='rdrStartEdge rdrEndEdge']");
    private By dateTo = By.xpath("//span[@class='rdrStartEdge rdrEndEdge']");


    //    Action the Webpages
    public void clickusell() {driver.findElement(sell).click();}
    public void clickViewStores() {driver.findElement(viewStore).click();}
    public void clickmanage(){driver.findElement(manage).click();}
    public void clickanalysis() {driver.findElement(analysis).click();}
    public void clickproduct() {driver.findElement(product).click();}
    public void clickCategory() {driver.findElement(category).click();}
    public void clickStores() {driver.findElement(stores).click();}
    public void clickSupplier() {driver.findElement(suppliers).click();}
    public void clickSalesTransaction() {driver.findElement(salesTransaction).click();}
    public void clickStockHistory(){driver.findElement(stockHistory).click();}
    public void clickCreditLogs() {driver.findElement(creditlogs).click();}
    public void clickReconcilation() {driver.findElement(reconcilation).click();}
    public void clickTables() {driver.findElement(tables).click();}
   // public void clickDropdown() {driver.findElement(dropDown).click();}

    public void clickDropDown1() throws InterruptedException {
        List<WebElement> manageList = driver.findElements(By.xpath("//*[name()='path' and contains(@d,'M4.516 7.5')]"));
        for (WebElement manageButton : manageList) {
            // Do something with each item
            manageButton.click(); // Click the item
            manageButton .getText(); // Get the text of the item
        }
    }

    public void clickDropDown2() throws InterruptedException {
        WebElement manageList = driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M4.516 7.5')]"));
        manageList.click();
        manageList.sendKeys("Arbor EduTech Consult");
        manageList.sendKeys(Keys.ARROW_DOWN);
        manageList.sendKeys(Keys.ENTER);
    }

    public void clickDate(){driver.findElement(dateRange).click();}
    public void clickMonth()throws InterruptedException {
        WebElement monthList = driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M4.516 7.5')]"));
        monthList.click();
        monthList.sendKeys("Arbor EduTech Consult");
        monthList.sendKeys(Keys.ARROW_DOWN);
        monthList.sendKeys(Keys.ENTER);
         
    }
    public void addClickTag() throws InterruptedException {
        List<WebElement> tagAdd = driver.findElements(By.cssSelector(".MultipleSelectField_custom-dropdown__select__Bo6UY.css-b62m3t-container"));
        for (WebElement tag : tagAdd) {
            // Do something with each item
            tag.click(); // Click the item
            tag.getText(); // Get the text of the item
            tag.isSelected(); // Display what is selected
        }
    }







}
