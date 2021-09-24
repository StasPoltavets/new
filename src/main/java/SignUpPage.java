import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {
    private final WebDriver driver;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    private By startButton = By.xpath("/html/body/div/div/main/div/div[2]/button");
    private By emailField = By.xpath("//*[@id=\"email-field\"]"); //("rober.to1631618531742@maildrop.ropot.net");
    private By ageField = By.xpath("//*[@id=\"age-field\"]");
    private By passwordField = By.xpath("//*[@id=\"age-field\"]/option[2]");
    private By submitButton = By.xpath("//*[@id='submit-btn']");

    public SignUpPage clickStartButton() {
        driver.findElement(startButton).click();
        return this;
    }

    public SearchPage clickSsubmitButton() {
        driver.findElement(startButton).click();
        return new SearchPage(driver);
    }
    public SignUpPage typeEmail(String email){
        driver.findElement(emailField).sendKeys(email);
        return this;
    }

    public SignUpPage typePassword(String password){
        driver.findElement(passwordField).sendKeys(password);
        return this;
    }
    public SignUpPage typeAge(String age){
        driver.findElement(ageField).click();
        return this;
    }
    public SignUpPage register(String email, String password, String age){
        this.typeEmail(email);
        this.typePassword(password);
        this.typeAge(age);
        this.clickSsubmitButton();
        return new SignUpPage(driver);
    }

}