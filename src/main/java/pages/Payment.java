package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Payment {

    public WebDriver driver;

 public Payment(WebDriver driver) {this.driver=driver;}

    //locate the Webelement

    private By paymnt = By.xpath("//span[normalize-space()='Payments']");
    private By transfer =By.xpath("//span[normalize-space()='Transfers']");
    private By searchfield =By.cssSelector("input[placeholder='Search transfers by ( beneficiary name, account number or bank name)']");
    private By button =By.cssSelector("button[class='btn btn--primary search-btn'] span[class='d-flex align-items-center']");
    private By dateclick =By.cssSelector(".lm-date-range__input");
    private By backButton =By.cssSelector("button[class='rdrNextPrevButton rdrPprevButton'] i");
    private By drpmonth =By.cssSelector("span[class='rdrMonthPicker'] select");
    private By date =By.xpath("//span[contains(text(),'31')]");
    //put a wait here to get element
    private By transaction = By.xpath("//span[normalize-space()='Transactions']");
    private By customerName =By.xpath("(//a[@class='purple--text'][normalize-space()='Oyindamola Shajobi'])[1]");
    private By receipt =By.xpath("//span[normalize-space()='Send Receipt']");
    //put a break here to switch t receipt
    private By emailfield =By.xpath("(//input[@id='email'])[2]");
    private By sendReceiptBtn = By.xpath("//button[@class='btn btn--primary cover ']");
    private By back= By.xpath("//span[contains(text(),'Back')]");
    //put a wait on here
    private By subaccount =By.xpath("//span[normalize-space()='Subaccounts']");
    private By addAccount =By.xpath("//span[normalize-space()='+ Add Sub-account']");
    private By selectpreferredProvider =By.xpath("(//div[@class='custom-dropdown__select__input-container css-19bb58m'])[1]");
    private By subaccountTag =By.cssSelector("#subAccountName");
    private By accountDescription =By.xpath("//input[@id='subAccountDescription']");
    private By submitAccount =By.cssSelector("button[type='submit']");

    //put some wait to get to the POS button
   private By pos =By.xpath("//a[@class='link-item sub-tab active']");
   private By requestTerminal =By.xpath("//a[normalize-space()='Terminal Requests']");
   private By terminalType  =By.xpath("(//*[name()='svg'][@class='css-8mmkcg'])[1] ");
   private By paymentOption =By.xpath("(//*[name()='path'])[11]");
   private By numberOfTerminal =By.cssSelector("#number_of_terminals");
   private By selectCardPayment = By.xpath("(//*[name()='svg'][@class='css-8mmkcg'])[3]");
   private By accountTransfer =By.xpath("(//*[name()='svg'][@class='css-8mmkcg'])[4]");
   private By deliveryAdress  =By.xpath("//input[@id='delivery_address']");
   private By conTactPhoneNumber =By.xpath("//input[@id='delivery_address']");
   private By requestButton =By.xpath("//span[normalize-space()='Request Terminal']");

   private By tagButton =By.xpath("//span[normalize-space()='Tags']");
   private By searchTag =By.xpath("//input[@placeholder='Search for a tag']");
   private By searchButton =By.xpath("//span[normalize-space()='Search']");
   private By addnewTag =By.xpath("//span[normalize-space()='Add new tag']");
   private By entertagName =By.cssSelector("#tag_name");
   private By saveReturn =By.xpath("//span[normalize-space()='Save and return']");




   //Action the positiveElement
   public void clickpayment1 () {driver.findElement(paymnt).click();}
   public void clickTransfer () {driver.findElement(transfer).click();}
   public void clickSearchField() {driver.findElement(searchfield).sendKeys("olumuyiwa");}
   public void clickButton() {driver.findElement(button).click();}
   public void clickdate() {driver.findElement(dateclick).click();}
   public void clickBack() {driver.findElement(backButton).click();}
   public void clickdrpmonth () {driver.findElement(drpmonth).click();}
   public void clickactualdate() {driver.findElement(date).click();}
   public void clicktransction() {driver.findElement(transaction).click();}
   public void clickcustomerName() {driver.findElement(customerName).click();}
   public void clickreceipt() {driver.findElement(receipt).click();}
   public void clickemail() {driver.findElement(emailfield).sendKeys("tinahp52@gmail.com");}
   public void clicksend() {driver.findElement(sendReceiptBtn).click();}
   public void clickbackward() {driver.findElement(back).click();}
   public void clicksubaccount() {driver.findElement(subaccount).click();}
   public void clickAccount() {driver.findElement(addAccount).click();}
   public void clickpprovider() {driver.findElement(selectpreferredProvider).click();}
    //select provider
   public void clicksubtag() {driver.findElement(subaccountTag).sendKeys("operations");}
   public void clickdescription() {driver.findElement(accountDescription).sendKeys("lugage account");}
   public void clicksubmitAccoountt() {driver.findElement(submitAccount).click();}

    // Apply wait element bfore proceedin
    public void clickpos() {driver.findElement(pos).click();}
    public void clickrequestTerminal() {driver.findElement(requestTerminal).click();}
    public void clickTerminalType() {driver.findElement(terminalType).click();}
    public void clickpayOption() {driver.findElement(paymentOption).click();}
    public void clicknumberOfTerminal() {driver.findElement(numberOfTerminal).click();}
    public void clickselectcard() {driver.findElement(selectCardPayment).click();}
    public void clickaccounttransfer() {driver.findElement(accountTransfer).click();}
    public void clickdelivery() {driver.findElement(deliveryAdress).sendKeys("No 9 Aliu street");}
    public void clickcontactphoneno() {driver.findElement(conTactPhoneNumber).sendKeys("7088978670");}
    public void clickrquestButton() {driver.findElement(requestButton).click();}
    //put a wait
    public void clicktag() {driver.findElement(tagButton).click();}
    public void typeSearch(){driver.findElement(searchButton).sendKeys("POS 1");}
    public void searchAddNewTag(){driver.findElement(addnewTag).sendKeys("Tag 2");}
    public void typeTagName(){driver.findElement(entertagName).sendKeys("NewestTags ");}











}
