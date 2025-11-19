package testCase1;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CustomerPage;
import pages.LoginPage;
import pages.PunchPage;

public class LoginTest extends BaseTest {

        @Test(priority = 1)
        public void verify_LoginTest(){
            LoginPage login= new LoginPage(driver);
            login.userName("9519519519");
            login.password("12345678");
            login.signIn();

            String title=login.getTitle();
            Assert.assertEquals(title,"Test Field Force");
        }

        @Test(priority = 2)
        public void verifyPunch() throws InterruptedException {
            PunchPage punchPage=new PunchPage(driver);
            punchPage.clickPunch();
            String text=punchPage.getText();
            punchPage.clickCancel();

            Assert.assertEquals(text,"Punch In Report");
        }
        @Test(priority = 3)
        public void verifyAddCust(){
            CustomerPage cust=new CustomerPage(driver);
            cust.clickMycust();
            cust.clickNewCust();
            cust.clickAndAddLead("AA123");
            cust.clickSaveBtn();
        }
    }


