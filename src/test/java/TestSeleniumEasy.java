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
        webForm.enterUserMessage();
        webForm.clickButtonSubmit();
        System.out.println("Hasil yang didapat:");
        System.out.println(webForm.Expected_user_msg);
        Assert.assertTrue(webForm.EkpectedUserMsg());
        System.out.println("----------------");
        System.out.println("Hasil yang diharapkan");
        System.out.println(webForm.USER_MSG);
        System.out.println("Assert berhasil");
        webForm.enterinput1();
        webForm.enterinput2();
        webForm.enterButtonGetTotal();
        System.out.println("Hasil yang didapat:");
        System.out.println(webForm.totalpenjumlahan);
        System.out.println("---------");
        System.out.println("Hasil yang diharapkan:");
        System.out.println(webForm.JUMLAH);
        Assert.assertTrue(webForm.cekHasilPenjumlahan());
        System.out.println("Assert Berhasil");
    }
}
