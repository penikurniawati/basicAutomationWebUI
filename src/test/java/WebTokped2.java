import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Objects;

public class WebTokped2 extends PageObject {

    @FindBy(xpath = "//div[@class='css-1sh1j0l']/div[2]/a[@class='css-89jnbj']")
    WebElement clickProduct;

    @FindBy(xpath = "//div[@class='css-1sh1j0l']/div[2]//span[@class='css-1bjwylw']")
    WebElement titleProductHome;

    @FindBy(className = "css-x7lc0h")
    WebElement titleProductDetail;

    public WebTokped2(WebDriver driver){
        super(driver);
    }

    public void setProduct1(){
        System.out.println(titleProductHome.getText());
    }

    public void setProduct2(){
        this.clickProduct.click();
    }

    public void titleDetail(){
        System.out.println(titleProductDetail.getText());
    }

    private String titleHome;

    public String getTitle(){
            if (titleProductHome.getText() != null){
                titleHome = titleProductHome.getText() ;
            }
        return this.titleHome;
    }

    public void setTitle(String titleHome){
        this.titleHome = titleHome;

//    public void setTitle(String newTitleHome){
//        this.titleHome = newTitleHome;
//        return this.titleHome;
//        System.out.println(title);
//        return this.title;
    }

//    public boolean assertSet(){
//        return setTitle(String titleHome).;
//    }

//    public void setTitle(String newTitle){
//         this.titleProductHome.getText() = newTitle;
//    }

//    public String title = titleProductHome.getText();
//
//    public String getTitles(String title){
//        return this.title;
//    }
//
//    public void setTitles(String title){
//        this.title = title;
//
//        System.out.println(title);
//    }
}
