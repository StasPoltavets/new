import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;


public class LoginPageTest {

        private WebDriver driver;
        private LoginPage loginPage;
        @Before
        public void setUp (){

            System.setProperty("webdriver.chrome.driver", "C:\\Users\\stanislav.poltavets\\IdeaProjects\\test-selenium\\drivers\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get("https://m.benaughty.com/");
            LoginPage loginPage = new LoginPage(driver);

        }




        }

      /*  @Test
    public void loginWithEmptyCredsTest(){

            LoginPage newLoginPage = loginPage.loginWithInvalidCreds("","");
            String error =newLoginPage.getErrorText();
            Assert.assertEquals("The email address or password you have entered is ", error);
        }

       */


