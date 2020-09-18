import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebSeleniumDatePicker extends PageObject{

    @FindBy(xpath = "//*[@id=\"sandbox-container1\"]/div/span")
    public WebElement button_date;

    @FindBy(className = "day[1]")
    public WebElement check_day;

    public WebSeleniumDatePicker(WebDriver driver){
        super(driver);
    }
    public void showDatePicker(){
        this.button_date.click();
    }

    public void clickDay(){
        this.check_day.click();
    }
}
