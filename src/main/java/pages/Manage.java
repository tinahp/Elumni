package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class Manage {

    public WebDriver driver;

    public Manage(WebDriver driver) {
        this.driver = driver;
    }


    //Let locate the WeBElement
    private By exportInventory = By.xpath("//span[normalize-space()='Export Inventory']");
    private By drpDown = By.xpath("(//*[name()='path'])[12]");
    private By selectFileType = By.cssSelector("label[for='pdf'] label[for='pdf']");
    private By clickExport = By.cssSelector("button[type='submit']");
    private By bulkStock = By.cssSelector("button:nth-child(2) span:nth-child(1)");
    private By bulkdrpDpwn = By.xpath("(//*[name()='path'])[8]");
    private By invoiceReceipt = By.xpath("//input[@id='invoiceNumber']");
    private By orderNumber = By.xpath("//input[@id='invoiceNumber']");
    private By clickInvoiceDate = By.xpath("#invoiceDate");
    private By barCodeHolder = By.cssSelector("input[placeholder='Search by Barcode Scaning or Product Name, ID & SKU)']");
    private By spanSearch = By.xpath("//span[normalize-space()='Search']");
    //    User should be able to proceed to the price summary screen
    private By priceDiscount = By.xpath("//input[@id='discount']");
    private By priceVat = By.cssSelector("#vat");
    private By verifyAmount = By.cssSelector("div[class='BulkRestock_summarySection__W0U-l BulkRestock_individualBody__hT4bb'] div:nth-child(4) p:nth-child(2)");
    private By repaymentDueDate = By.cssSelector("#invoiceDueDate");
    private By note = By.cssSelector("#invoiceDueDate");
    //   User should be able to submit button
    private By clickSubmit = By.xpath("//span[normalize-space()='Submit']");
    //    User should be able to click on the Back Button
    private By clickBackButton = By.xpath("//span[contains(text(),'Back')]");
    //    Return button
    private By searchOrderId = By.xpath("//span[contains(text(),'Back')]");
    private By remark = By.cssSelector("textarea[placeholder='Customer returned this because good was damaged internally']");
    //    Transfer Button
    private By searchSelectProduct = By.xpath("(//input[@id=':r5:-input'])[1]");
    private By transferFrom = By.xpath("(//div)[97]");
    private By transferTo = By.xpath("(//div)[107]");
    private By quantityTransfer = By.xpath("//input[@value='0']");
    private By transferButton = By.cssSelector(".btn.btn--primary.mt-auto.ml-auto.w-100");
    //    Add new Product
    private By addnewProduct = By.cssSelector("//span[normalize-space()='+ Add new product']");
    private By singleProduct = By.xpath("//p[normalize-space()='Single product']");
    private By inputProductName = By.xpath("//input[@id='productName']");
    private By category = By.cssSelector("div[class=' css-19bb58m']");
    private By productUnit = By.xpath("(//*[name()='svg'][@class='css-8mmkcg'])[1]");
    private By productVariant = By.xpath("(//*[name()='svg'][@class='css-8mmkcg'])[1]");
    private By productSKU = By.cssSelector("#productSku");
    private By scanBarcode = By.cssSelector("//input[@id='barcode']");
    private By createProduct = By.xpath("//input[@id='barcode']");
    //    Services
    private By serviceName = By.xpath("label[for='Services'] div[class='wallet__option__indicator']");
    private By singleCategory = By.xpath("(//div[contains(@class,'css-19bb58m')])[1]");
    private By makeServiceAvailable = By.xpath(".MultipleSelectField_custom-dropdown__select__Bo6UY__input-container.css-19bb58m");
    private By serviceCategory = By.cssSelector("div[class=' css-19bb58m']");
    private By createService = By.xpath("//span[normalize-space()='Create Service']");
    private By serviceBack = By.xpath("(//span[contains(text(),'Back')]");



//    Action the Element [[positive Scenario]
    public void clickInventory1(){driver.findElement(exportInventory).click();}
    public void clickDropDown3() throws InterruptedException {
        List<WebElement> dropDown = driver.findElements(By.xpath("(//*[name()='path'])[12]"));
        for (WebElement inventoryDrpDown : dropDown) {
            inventoryDrpDown.click();
            inventoryDrpDown.getText();
        }
    }

    public void clickFileType() {driver.findElement(selectFileType).click();}
    public void clickExport1() {driver.findElement(clickExport).click();}
    public void clickbulkStock(){driver.findElement(bulkStock).click();}
    public void clickbulkdrpDpwn()  throws InterruptedException {
        WebElement RestockbulkdrpDpwn = driver.findElement(By.xpath("(//*[name()='path'])[8]"));
        RestockbulkdrpDpwn.click();
        RestockbulkdrpDpwn.sendKeys("Arbor");
        RestockbulkdrpDpwn.sendKeys(Keys.ARROW_DOWN);
        RestockbulkdrpDpwn.sendKeys(Keys.ENTER);
    }

  public void clickinvoiceReceipt(){ driver.findElement(invoiceReceipt).sendKeys("Invoice");}
  public void clickorderNumber() {driver.findElement(orderNumber).sendKeys("refe1234567");}
  public void clickInvoiceDate () { driver.findElement(clickInvoiceDate).click();}
  public void clickbarCodeHolder () {driver.findElement(barCodeHolder).sendKeys("12345766");}
  public void spanSearch() {driver.findElement(spanSearch).sendKeys("SOP");}
  public void clickpriceDiscount(){driver.findElement(priceDiscount).sendKeys("200");}
  public void clickpriceVat(){driver.findElement(priceVat).sendKeys("3.1%");}
  public void clickVerify() {driver.findElement(verifyAmount).sendKeys("3,000");}
  public void clickrepaymentDueDate() {driver.findElement(repaymentDueDate).click();}
  public void addNote () {driver.findElement(note).sendKeys("orders");}
  public void clickSubmit (){driver.findElement(clickSubmit).click();}
  public void clickBackButtn() {driver.findElement(clickBackButton).click();}
  public void cliicksearchOrderId () {driver.findElement(searchOrderId).sendKeys("refe123456");}
  public void addremark() {driver.findElement(remark).sendKeys("Customer returned this because good was damaged internally");}
  public void searchSelectProduct () {driver.findElement(searchSelectProduct).sendKeys("Sop");}
  public void addTransfer(){driver.findElement(transferFrom).click();}
  public void addTransfer1(){driver.findElement(transferTo).click();}
  public void addquantityTransfer (){driver.findElement(quantityTransfer).sendKeys("5");}
  public void clicktransferButton (){driver.findElement(transferButton).click();}
//    User should be able to add new product
  public void inputaddnewProduct () {driver.findElement(addnewProduct).sendKeys("Visa");}
  public void clicksingleProduct (){driver.findElement(singleProduct).click();}
  public void addinputProductName () {driver.findElement(inputProductName).sendKeys("Sop");}
  public void clickcategory(){driver.findElement(category).click();}
  public void clickproductUnit ()  {driver.findElement(productUnit).click();}
  public void clickproductVariant() {driver.findElement(productVariant).click();}
  public void clickproductSKU () {driver.findElement(productSKU).click();}
  public void clickscanBarcode () {driver.findElement(scanBarcode).click();}
  public void createProductlick () {driver.findElement(createProduct).click();}
  public void clickserviceName () {driver.findElement(serviceName).click();}
  public void clicksingleCategory()  {driver.findElement(singleCategory).click();}
  public void clickmakeServiceAvailable (){driver.findElement(makeServiceAvailable).click();}
  public void clickserviceCategory(){driver.findElement(serviceCategory).click();}
  public void clickcreateService()  {driver.findElement(createService).click();}
  public void clickserviceBack(){driver.findElement(serviceBack).click();}


}