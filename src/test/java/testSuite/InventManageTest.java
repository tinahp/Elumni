package testSuite;

import baseClass.BaseClassTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.DashBoard;
import pages.Manage;

import java.util.concurrent.TimeUnit;

public class InventManageTest extends BaseClassTest {

    @BeforeTest
    public void innit() {
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);}

        @AfterTest
        public void quit() {
        }

//       Testcases
     @Test(priority = 1)
     public void Inventory1() throws InterruptedException {
         Manage inventManage = new Manage(driver);
         inventManage.clickInventory1();
         inventManage.clickDropDown3();
         inventManage.clickFileType();
         Thread.sleep(200);
         inventManage.clickExport1();
         inventManage.clickbulkStock();
         inventManage.clickbulkdrpDpwn();
         Thread.sleep(200);
         inventManage.clickinvoiceReceipt();
         inventManage.clickorderNumber();
         inventManage.clickInvoiceDate();
         Thread.sleep(200);
         inventManage.clickbarCodeHolder();
         inventManage.spanSearch();
         inventManage.clickpriceDiscount();
         Thread.sleep(200);
         inventManage.clickpriceVat();
         Thread.sleep(200);
         inventManage.clickVerify();
//      User is able to click on the backWard but ton
         inventManage.clickrepaymentDueDate();
//       User is able to click on the subAccount
         inventManage.addNote();
         Thread.sleep(200);
         inventManage.clickSubmit();
         inventManage.clickSubmit();
         inventManage.clickBackButtn();
         inventManage.cliicksearchOrderId();
         inventManage.addremark();
         inventManage.searchSelectProduct();
         inventManage.addTransfer();
         inventManage.addTransfer1();
         inventManage.addquantityTransfer();
         inventManage.clicktransferButton();
         inventManage.inputaddnewProduct();
         inventManage.clicksingleProduct();
         inventManage.addinputProductName();
         inventManage.clickcategory();
         inventManage.clickproductUnit();
         inventManage.clickproductVariant();
         inventManage.clickproductSKU();
         inventManage.clickscanBarcode();
         inventManage.createProductlick();
         inventManage.clickserviceName();
         inventManage.clicksingleCategory();
         inventManage.clickmakeServiceAvailable();
         inventManage.clickserviceCategory();
         inventManage.clickcreateService();
         inventManage.clickserviceBack();
     }


     }

