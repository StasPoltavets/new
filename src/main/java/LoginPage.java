import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.security.PublicKey;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private By logInLink = By.xpath("//button[@class='switch-form-btn is-active']");
    private By emailField = By.xpath("//input[@id='login-email-field']");
    private By passwordField = By.xpath("//input[@id='login-password-field']");
    private By logInButton = By.xpath("//div[@id='login-submit-btn']");
    private By error = By.xpath("//div[contains(text(),'The email address or password you have entered is ')]");
    //private By startButton = By.xpath("/html/body/div/div/main/div/div[2]/button");





    public LoginPage clickLogInLink() {

        //driver.findElement(logInLink);
        //System.out.println(logInLink.isEnabled());
        driver.findElement(logInLink).click();
        return this;
    }



    public LoginPage typeEmail (String email) {
        driver.findElement(emailField).sendKeys(email);
        return this;
    }
    public LoginPage typePassword (String password) {
        driver.findElement(passwordField).sendKeys(password);
        return this;
    }

    public LoginPage loginWithInvalidCreds(String email, String password) {
        this.typeEmail(email);
        this.typePassword(password);
        driver.findElement(logInButton).click();
        return new LoginPage(driver);


    }

    public String getErrorText() {
        return driver.findElement(error).getText();
    }
}