import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestWebSeleniumDatePicker {
    public static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @Test (testName = "Automation selenium date picker")
    public static void submitDate(){
        driver.get(Utils.BASE_URL_SELENIUM_DATEPICKER);
        WebSeleniumDatePicker webForm = new WebSeleniumDatePicker(driver);
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        webForm.showDatePicker();
        webForm.setTest_day();
        webForm.dday();
        webForm.set_dday();
        webForm.validateDay();
        webForm.validateTodayDay();
        webForm.validateDisableDay();
    }
}
