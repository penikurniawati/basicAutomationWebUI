import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class WebSeleniumEasy extends PageObject{

//    Mendefinisikan isian untuk input form
    public String EXPECTED_TITLE = "Selenium Easy Demo - Simple Form to Automate using Selenium";
    public String ACTUAL_TITLE = driver.getTitle();
    public String USER_MSG = "Hello World";
    public String EXPECTED_USER_MSG = USER_MSG;
    public Integer TEXT_NUMBER1 = 13;
    public Integer TEXT_NUMBER2 = 12;
    public Integer EXPECTED_SUM = TEXT_NUMBER1+TEXT_NUMBER2;

//    Menentukan element pada form submit text
    @FindBy(id = "at-cv-lightbox-close")
    private WebElement close_popup;

    @FindBy(id="user-message")
    public WebElement user_message;

    @FindBy(xpath = "//*[@id=\"get-input\"]/button")
    private WebElement button_submit;

    @FindBy(id = "display")
    public WebElement check_expectedusermsg;

//    Menentukan element pada form penjumlahan
    @FindBy(id = "sum1")
    public WebElement input_text1;

    @FindBy(id = "sum2")
    public WebElement input_text2;

    @FindBy(xpath = "//*[@id=\"gettotal\"]/button")
    public WebElement button_total;

    @FindBy(id = "displayvalue")
    public WebElement get_total;

    public WebSeleniumEasy(WebDriver driver){
        super(driver);
    }


    // Untuk validasi title web yang didapat
    public void checkExpectedTitle(){
        if (EXPECTED_TITLE.equals(ACTUAL_TITLE)){
            System.out.println("Verification Successful - the correct title is displayed on the web page");
        }
        else System.out.println("Verification Failed - title incorrect");
    }

    //    Untuk assert title web yang didapat
    public boolean assertTitle(){
        return EXPECTED_TITLE.equals(ACTUAL_TITLE);
    }

    public void closePopuP(){
        this.close_popup.click();
    }

    public void enterUserMessage(){
        this.user_message.sendKeys(USER_MSG);
    }

    public boolean assertButtonSubmit(){
        return button_submit.isDisplayed() && button_submit.isEnabled();
    }

    public void clickButtonSubmit(){
        this.button_submit.click();
    }

//    untuk melakukan valisasi message yang dimasukkan oleh user
    public void Validationusermsg(){
        if (USER_MSG.equals(EXPECTED_USER_MSG)){
            System.out.println("Actual result message :" );
            System.out.println(USER_MSG);
            System.out.println("Expected result message :" );
            System.out.println(EXPECTED_USER_MSG);
            System.out.println("Validation message successful");
            System.out.println("-------------------------" );
        }else System.out.println("Validation message failed");
    }

//    assert user message
    public boolean EkpectedUserMsg(){
        return check_expectedusermsg.getText().equals(EXPECTED_USER_MSG);
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

//    validasi jumlah
    public void ValidationGetTotal(){
        if (get_total.getText().equals(String.valueOf(EXPECTED_SUM))){
            System.out.println("Expected result :" );
            System.out.println(EXPECTED_SUM);
            System.out.println("Actual result :" );
            System.out.println(get_total.getText());
            System.out.println("Validation total success");
            System.out.println("-----------------");
        }else
            System.out.println("Validation failed, Expected result :" + EXPECTED_SUM + " Actual result :" + get_total.getText());
    }

//    Asert penjumlahan
    public boolean checkSum(){
        return get_total.getText().matches(String.valueOf(EXPECTED_SUM));
    }

}

