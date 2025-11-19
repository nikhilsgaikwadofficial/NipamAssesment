package pages.testCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTest {



        public WebDriver driver;
        @BeforeClass
        public void setUp(){
            driver=new ChromeDriver();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://testffc.nimapinfotech.com/");
            driver.manage().window().maximize();
        }
        @AfterClass
        public void tearDown() throws InterruptedException {
            Thread.sleep(5000);
            driver.quit();
        }
    }


