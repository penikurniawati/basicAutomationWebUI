import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestTokopedia {
    public static WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @Test(testName = "Automation select product detail tokopedia")
    public static void submitForm(){
        driver.get(Utils.BASE_URL_TOKOPEDIA);
        WebTokopedia webForm = new WebTokopedia(driver);
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        webForm.checkTitle();
        Assert.assertTrue(webForm.assertTitle());
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//        webForm.closePopUp();
        webForm.checkFormSearch();
        webForm.clickSearch();
        webForm.typeSearch();
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        webForm.set_category();
        webForm.checkListPage();
        Assert.assertTrue(webForm.assertListPage());
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        webForm.getTitleProduct();
        webForm.setProduct();
        webForm.seter();
//        webForm.setter(String this);
//        webForm.Getter();
//        webForm.validationProductDetail();
//        Assert.assertTrue(webForm.assertProductDetail());
    }
}
