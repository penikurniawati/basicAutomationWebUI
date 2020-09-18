import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestSeleniumEasy {
    public static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @Test(testName = "Automation input form")
    public static void submitForm(){
        driver.get(Utils.BASE_URL_SELENIUM);
        WebSeleniumEasy webForm = new WebSeleniumEasy(driver);
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        webForm.closePopuP();
        webForm.checkExpectedTitle();
        Assert.assertTrue(webForm.assertTitle());
        webForm.enterUserMessage();
        Assert.assertTrue(webForm.assertButtonSubmit());
        webForm.clickButtonSubmit();
        webForm.Validationusermsg();
        Assert.assertTrue(webForm.EkpectedUserMsg());
        webForm.enterinput1();
        webForm.enterinput2();
        webForm.enterButtonGetTotal();
        webForm.ValidationGetTotal();
        Assert.assertTrue(webForm.checkSum());
        System.out.println("---- SUCCESS ----");
    }
}
