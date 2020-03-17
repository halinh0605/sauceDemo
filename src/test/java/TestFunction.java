import org.junit.Test;
import org.openqa.selenium.By;

public class TestFunction extends Master {

    public static final String XPATH_USER_NAME = "//*[@id='user-name']";
    public static final String XPATH_PASSWORD = "//*[@id='password']";
    public static final String XPATH_SUBMIT = "//input[@type='submit']";

    @Test
        public void Login(){
            webDriver.get("https://www.saucedemo.com/");
            inputTextToElement(XPATH_USER_NAME, "standard_user");
            inputTextToElement(XPATH_PASSWORD, "secret_sauce");
            webDriver.findElement(By.xpath(XPATH_SUBMIT)).click();
    }
}