import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainClass {
    static WebDriver driver;


    public static void main (String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\stanislav.poltavets\\IdeaProjects\\test-selenium\\drivers\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless", "--disable-gpu", "--window-size=375,812","--ignore-certificate-errors","--disable-extensions","--no-sandbox","--disable-dev-shm-usage");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://m.benaughty.com/");
        Date dateNow = new Date();
        SimpleDateFormat format = new SimpleDateFormat("hh_mm_ss_ms");
        String fileName = format.format(dateNow) + ".png";


        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File("C:\\Users\\stanislav.poltavets\\Pictures\\Screenshots\\" + fileName));
        } catch (IOException e){
            e.printStackTrace();
        }


    }
}