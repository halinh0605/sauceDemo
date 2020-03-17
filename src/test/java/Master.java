import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Master {
    static WebDriver webDriver;

    @BeforeClass
    public static void setUpClass() {
        System.out.println("Master setup");
        System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
        webDriver = new ChromeDriver(chromeOptions);
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    protected void inputTextToElement(String xpath, String value) {
        WebElement optionXpath = webDriver.findElement(By.xpath(xpath));
        optionXpath.sendKeys(value);
    }
}

