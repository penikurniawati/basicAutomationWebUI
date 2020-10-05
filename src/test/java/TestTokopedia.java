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
        webForm.setProduct();
    }

    @Test(testName = "Detail test")
    public static void detailProduct(){
        driver.get(Utils.BASE_URL_PRODUCT_DETAIL_TOKPED);
        WebTokopedia webForm = new WebTokopedia(driver);
        webForm.checkDetailProductTitle();
        Assert.assertTrue(webForm.assertTitleProductDetail());
        webForm.setQty();
        webForm.validationPrice();
        Assert.assertTrue(webForm.assertTotalPrice());
    }

    @Test(testName = "Cek setter getter")
    public static void homepageToProductDetail(){
        driver.get(Utils.BASE_URL_TOKOPEDIA);
        WebTokped2 webForm = new WebTokped2(driver);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        webForm.setProduct1();
        System.out.println("lolos 1");
//        webForm.getTitle();
//        webForm.setTitle("dob");
//        webForm.titleHome;
        webForm.setTitle(webForm.titleProductHome.getText());
        System.out.println("lolos 2");
        webForm.setProduct2();
        webForm.titleDetail();
//        webForm.setTitle();
    }

}
