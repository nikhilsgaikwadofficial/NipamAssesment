package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomerPage extends BasePage {

        public CustomerPage(WebDriver driver) {
            super(driver);
        }
        WebElement myCust= driver.findElement(By.xpath("//span[text()='My Customers']"));
        By newCust= By.xpath("//span[text()=' New Customer ']");
        By leadname= By.xpath("//input[@formcontrolname='LeadName']");
        By save= By.xpath("//span[text()=' Save ']");

        public void clickMycust(){
            myCust.click();
        }
        public void clickNewCust(){
            waitForNewCustlVisibility(newCust).click();
        }
        public void clickAndAddLead(String leadName){
            waitForLeadVisibility(leadname).click();
            driver.findElement(leadname).sendKeys(leadName);
        }
        public void clickSaveBtn(){
            waitForSavedVisibility(save).click();
        }
    }

