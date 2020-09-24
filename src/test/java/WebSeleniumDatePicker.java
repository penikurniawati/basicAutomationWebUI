import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Date;

public class WebSeleniumDatePicker extends PageObject{

    Date date = new Date();

    @FindBy(xpath = "//*[@id=\"sandbox-container1\"]/div/span")
    public WebElement button_date;

    @FindBy(css = "td.today.day")
    public WebElement today_day;

    @FindBy(css = "td.day")
    public WebElement day;

    @FindBy(css = "td.old.day")
    public WebElement old_day;

    @FindBy(css = "td.disabled.disabled-date.day")
    public WebElement disable_date_day;

    @FindBy(css = "td.disabled.day")
    public WebElement disabled_day;

    @FindBy(xpath = "//td[@class]")
    public WebElement test_day;

//    public String Dis = today_day.getText()+1;
//    public Integer dis = date_day + 1;

    public WebSeleniumDatePicker(WebDriver driver){
        super(driver);
    }

    public void showDatePicker(){
        this.button_date.click();
    }

    public void validateTodayDay(){
        if (today_day.isEnabled()){
            System.out.println("Today enable is true");
        }else
            System.out.println("Today enable is false");
    }

    public void validateDay(){
        if (day.isEnabled()){
            System.out.println("Day enable is true");
        }else
            System.out.println(("Day enable is false"));
    }

    public void setTest_day(){
        this.test_day.isDisplayed();
    }

    public void dday(){
        if (test_day.isSelected()){
            System.out.println(test_day.getText());
        }else
            System.out.println("salah");
    }

    public void set_dday(){
        if (test_day.getText().equals(date.toString())){
            System.out.println("yes");
        }else {
            System.out.println(test_day.getText());
        }
    }

    public void validateDisableDay(){
        if (disable_date_day.isDisplayed() && disable_date_day.isEnabled()){
            System.out.println(disable_date_day.getText());
        }else
            System.out.println(disable_date_day.getText());
    }

}
