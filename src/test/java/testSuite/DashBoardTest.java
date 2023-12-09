package testSuite;

import baseClass.BaseClassTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.DashBoard;
import pages.Payment;

import java.util.concurrent.TimeUnit;

public class DashBoardTest extends BaseClassTest {


    @BeforeTest
    public void innit() {
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    }

    @AfterTest
    public void quit() {
    }

//        Testcases

    @Test(priority = 1)
    public void dashBoard1() throws InterruptedException {
        DashBoard dashBoard = new DashBoard(driver);
//       User is able to click on the username input field
         dashBoard.clickusername();
//       User is able to click on the password input field
         dashBoard.clickPassword();
//       User is able to click on the Login button
         dashBoard.clickLogin();
//       Apply wait  before it gets to the dashboard
        Thread.sleep(200);
         dashBoard.clickDashboard1();
//      User is able to click on the general overview button
         dashBoard.clickGeneralOverview();
//      User is able to click on the transfer funds button
        dashBoard.clickTransferFunds();
        if (driver.getCurrentUrl().contains("https://app.lumibusiness.io/app/dashboard/customer-analytics?all_business=true"))
            //Pass
            System.out.println("The page URl in the link field contains/customer-analytics?all_business=true");
        else
            System.out.println("The page URl in the link field does not contains/customer-analytics?all_business=true");
        //Fail
//      User is able to click on the select Account buttonn
        dashBoard.clickSelectAccount();
//       User is able to  click on the dropDown arrow
        dashBoard.clickDropDown();
//      User is able to click on the number arrow
        dashBoard.clickNumber();
//      User is able to input into the addEnterField
        dashBoard.addEnterField();
        Thread.sleep(500);
//      User is able to click on the Tag option
        dashBoard.addClickTag();
//      User is able to click on the Tag option
        dashBoard.clickTransferReason();
//      User is able to click on the submitButton
        Thread.sleep(500);
        dashBoard.clickSubmitButton();
//
    }

        @Test(priority = 2)
        public void payment1 () throws InterruptedException {
            Payment payment = new Payment(driver);
//       User is able to click on the payment button
            payment.clickpayment1();
//       User is able to click on the payment button
            payment.clickTransfer();
//       User is able to click on the search field button
            payment.clickSearchField();
//       User is able to click on the button to search
            Thread.sleep(200);
            payment.clickButton();
//        User is able to click on the preferred date
            payment.clickdate();
//        User is able to click on the Back button
            payment.clickBack();
//        User is able to click on the dropDown month
            Thread.sleep(200);
            payment.clickdrpmonth();
//       User is able to click on the transfer button
            payment.clickTransfer() ;
//       User is able to click on the actual Date
            payment.clickactualdate();
//       User is able to click on the transaction button
            Thread.sleep(200);
            payment.clicktransction();
//      User is able to  click on the customerName
            payment.clickcustomerName();
//      User is able to  click on the receipt
            payment.clickreceipt();
            Thread.sleep(200);
//       User is able to click on the email
            payment.clickemail();
            Thread.sleep(200);
//      User is able to click on send button
            payment.clicksend();
//      User is able to click on the backWard but ton
            payment.clickbackward();
//       User is able to click on the subAccount
            payment.clicksubaccount();
            Thread.sleep(200);
//       User is able to click on the account button
            payment.clickAccount();
//      User should be able to click on the provider button
            payment.clickpprovider();
//       User is able to click on the subTag
            payment.clicksubtag();
            Thread.sleep(200);
//       User should be able to click the description button
            payment.clickdescription();
//       User is able to click on the submitAccount button
            payment.clicksubmitAccoountt() ;
//        Apply wait element before proceeding
            payment.clickpos();
            Thread.sleep(200);
//        User is able to click on the request Terminal button
            payment.clickrequestTerminal();
//        User is able to click Terminal button
            payment.clickTerminalType();
//       User is able to click on the payOption
            payment.clickpayOption();
            Thread.sleep(200);
//       User is able to click on the number of terminal
            payment.clicknumberOfTerminal();
            Thread.sleep(200);
//       User is able to click on the number of terminal
            payment.clickselectcard();
            Thread.sleep(200);
//       User is able to click on the number of terminal
            payment.clickaccounttransfer();
//       User is able to click on the delivery option
            payment.clickdelivery() ;
//       Apply wait element before proceeding
            payment.clickcontactphoneno();
//       User is able to click on the delivery option
            Thread.sleep(200);
//       User is able to click on the requestButton
            payment.clickrquestButton();
//       User is able to click on the tag option
            payment.clicktag();
//       Users is able to click on the typeSearch button
            payment.typeSearch();
            Thread.sleep(200);
//       User is able to click on the SearchAddNew Tag button
            payment.searchAddNewTag();
            Thread.sleep(200);
//       User is able to click on TypeTagName
            payment.typeTagName() ;

//
        }
    }
