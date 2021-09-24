import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SignUpPageTest {
    private WebDriver driver;
    private SignUpPage signUpPage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\stanislav.poltavets\\IdeaProjects\\test-selenium\\drivers\\chromedriver.exe");
        Dimension dimension = new Dimension(375, 812);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().setSize(dimension);
        driver.get("https://m.benaughty.com/");
        LoginPage loginPage = new LoginPage(driver);
    }
    public SignUpPage clickStartButton() {
        driver.findElement();

    }



}




