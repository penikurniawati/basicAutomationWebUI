import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebSeleniumEasy extends PageObject{

    public String USER_MSG = "Hello World";
    public String Expected_user_msg = USER_MSG;
    public Integer TEXT_NUMBER1 = 13;
    public Integer TEXT_NUMBER2 = 12;
    public Integer JUMLAH = TEXT_NUMBER1+TEXT_NUMBER2;

    @FindBy(id = "at-cv-lightbox-close")
    private WebElement close_popup;

    @FindBy(id="user-message")
    public WebElement user_message;

//    @FindBy(xpath = "//button[contains(text),'Show Message')]")
    @FindBy(xpath = "//*[@id=\"get-input\"]/button")
    private WebElement button_submit;

    @FindBy(id = "display")
    public WebElement checkExpectedUserMsg;

    @FindBy(id = "sum1")
    public WebElement input_text1;

    @FindBy(id = "sum2")
    public WebElement input_text2;

    @FindBy(xpath = "//*[@id=\"gettotal\"]/button")
    public WebElement button_total;

    @FindBy(id = "displayvalue")
    public WebElement totalpenjumlahan;


    public WebSeleniumEasy(WebDriver driver){
        super(driver);
    }

    public void closePopuP(){
        this.close_popup.click();
    }

    public void enterUserMessage(){
        this.user_message.sendKeys(USER_MSG);
    }

    public void clickButtonSubmit(){
        this.button_submit.click();
    }

    public boolean EkpectedUserMsg(){
        return checkExpectedUserMsg.getText().equals(Expected_user_msg);
    }

    public void enterinput1(){
        this.input_text1.sendKeys(String.valueOf(TEXT_NUMBER1));
    }

    public void enterinput2(){
        this.input_text2.sendKeys(String.valueOf(TEXT_NUMBER2));
    }

    public void enterButtonGetTotal(){
        this.button_total.click();
    }

//    public void hasilPenjumlahan(){
//        this.totalpenjumlahan.
//    }

    public boolean cekHasilPenjumlahan(){
        return totalpenjumlahan.getText().matches(String.valueOf(JUMLAH));
    }
}

