
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Test99guru {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        // ChromeDriver location set up in Utils class
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

//    tempat untuk melakukan eskekusi test
    @Test(testName = "Add new customer")
    public static void submitForm(){
        driver.get(Utils.BASE_URL);
        Web99guru webForm = new Web99guru(driver);
        webForm.enterUserID();
        webForm.enterPassword();
        webForm.clickButtonLogin();
        webForm.clickButtonAddCustomer();
        webForm.enterCustomerName();
        webForm.enterCustomerGender();
        webForm.enterCustomerDOB();
        webForm.enterCustomerAddress();
        webForm.enterCustomerCity();
        webForm.enterCustomerState();
        webForm.enterCustomerPIN();
        webForm.enterCustomerPhone();
        webForm.enterCustomerEmail();
        webForm.enterCustomerPassword();
        webForm.clickButtonSubmit();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

//    @AfterSuite
//    public static void cleanUp(){
//        driver.manage().deleteAllCookies();
//        driver.close();
//    }
}
