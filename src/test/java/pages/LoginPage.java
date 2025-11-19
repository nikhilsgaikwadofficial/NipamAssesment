package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

        public LoginPage(WebDriver driver) {
            super(driver);
        }

        WebElement username= driver.findElement(By.xpath("//input[@formcontrolname='username']"));
        WebElement pwd= driver.findElement(By.xpath("//input[@formcontrolname='password']"));
        WebElement signIn= driver.findElement(By.xpath("//button[text()='Sign In']"));

        public void userName(String name){
            username.click();
            username.sendKeys(name);
        }

        public void password(String pass){
            pwd.click();
            pwd.sendKeys(pass);
        }
        public void signIn(){
            signIn.click();

        }

        public String getTitle(){
            return driver.getTitle();
        }
    }

