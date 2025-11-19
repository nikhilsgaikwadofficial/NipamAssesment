package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static java.lang.Thread.sleep;

public class PunchPage extends BasePage{

        public PunchPage(WebDriver driver) {
            super(driver);
        }

        By txt= By.xpath("//h3[text()='Punch In Report']");
        WebElement punch=driver.findElement(By.xpath("//span[text()='Punch In']"));
        By cancel_btn= By.xpath("//span[text()=' Cancel']");

        public void clickPunch() throws InterruptedException {
            sleep(5000);
            punch.click();
        }
        public String getText(){
            return waitForVisibility(txt).getText();
        }
        public void clickCancel(){
            waitForCancelVisibility(cancel_btn).click();
        }
    }

