
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Web99guru extends PageObject{
//    untuk menentukan value
    private String USER_ID = "mngr281185";
    private String PASSWORD = "pUhunes";
    private String CUSTOMER_NAME = "Tesla";
    private String CUSTOMER_DOB = "06/12/1996";
    private String CUSTOMER_ADDRESS = "Sleman Yogyakarta Indonesia";
    private String CUSTOMER_CITY = "Yogyakarta";
    private String CUSTOMER_STATE = "Indonesia";
    private String CUSTOMER_PIN = "123456";
    private String CUSTOMER_MOBILENUMBER = "0812312312";
    private String CUSTOMER_EMAIL = "tesla@mail.com";
    private String CUSTOMER_PASSWORD = "123456";

//    untuk menampung element" pada web
    @FindBy(name = "uid")
    private WebElement user_id;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(name = "btnLogin")
    private WebElement button_login;

    @FindBy(xpath = "/html/body/div[3]/div/ul/li[2]/a")
    private WebElement button_add_customer;

    @FindBy(name = "name")
    private WebElement customer_name;

    @FindBy(xpath = "//input[@value='f']") //artinya adalah mengambil semua jenis input di halaman tersebut yang valuenya 'f'
    private WebElement customer_gender;

    @FindBy(id = "dob")
    private WebElement customer_dob;

    @FindBy(name = "addr")
    private WebElement customer_address;

    @FindBy(name = "city")
    private WebElement customer_city;

    @FindBy(name = "state")
    private WebElement customer_state;

    @FindBy(name = "pinno")
    private WebElement customer_pin;

    @FindBy(name = "telephoneno")
    private WebElement customer_phone;

    @FindBy(name = "emailid")
    private WebElement customer_email;

    @FindBy(name = "password")
    private WebElement customer_password;

    @FindBy(xpath = "//input[@value='Submit']")
    private WebElement button_submit;

    public Web99guru(WebDriver driver) {
        super(driver);
    }

    public void enterUserID(){
        this.user_id.sendKeys(USER_ID);
    }

    public void enterPassword(){
        this.password.sendKeys(PASSWORD);
    }

    public void clickButtonLogin(){
        this.button_login.click();
    }

    public void clickButtonAddCustomer(){
        this.button_add_customer.click();
    }

    public void enterCustomerName(){
        this.customer_name.sendKeys(CUSTOMER_NAME);
    }

    public void enterCustomerGender(){
        this.customer_gender.click();
    }

    public void enterCustomerDOB(){
        this.customer_dob.sendKeys(CUSTOMER_DOB);
    }

    public void enterCustomerAddress(){
        this.customer_address.sendKeys(CUSTOMER_ADDRESS);
    }

    public void enterCustomerCity(){
        this.customer_city.sendKeys(CUSTOMER_CITY);
    }

    public void enterCustomerState(){
        this.customer_state.sendKeys(CUSTOMER_STATE);
    }

    public void enterCustomerPIN(){
        this.customer_pin.sendKeys(CUSTOMER_PIN);
    }

    public void enterCustomerPhone(){
        this.customer_phone.sendKeys(CUSTOMER_MOBILENUMBER);
    }

    public void enterCustomerEmail(){
        this.customer_email.sendKeys(CUSTOMER_EMAIL);
    }

    public void enterCustomerPassword(){
        this.customer_password.sendKeys(CUSTOMER_PASSWORD);
    }

    public void clickButtonSubmit(){
        this.button_submit.click();
    }
}
