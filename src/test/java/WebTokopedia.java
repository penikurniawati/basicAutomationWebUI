import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebTokopedia extends PageObject{

    public String EXPECTED_TITLE = "Situs Jual Beli Online Terlengkap, Mudah & Aman | Tokopedia";
    public String ACTUAL_TITLE = driver.getTitle();
    public String INPUT_SEARCH = "Botol";
    public String EXPECTED_LIST_PAGE = "Filter";
    public String EXPECTED_TITLE_PRODUCT_DETAIL = "Jual my bottle bening kotak /botol minum /botol unik - Jakarta Barat - cubbystore | Tokopedia";
    public String ACTUAL_TITLE_PRODUCT_DETAIL = driver.getTitle();

    @FindBy(className = "ng-binding")
    WebElement close_pop_up;

    @FindBy(css = "input.css-4eg0ft.e16vycsw0")
    WebElement form_search;

    @FindBy(xpath = "//div[@class='css-nligc1 e8hn8i5']/a[2]")
    WebElement choose_category;

    @FindBy(css = "h5.css-gwtn89-unf-heading.e1qvo2ff5")
    WebElement validation_listPage;

//    element ini awalnya untuk validasi title product di halaman list product, untuk diambil datanya di validasi product detail
    @FindBy(xpath = "//div[@class='css-jza1fo']/div[2]/div[@class='css-18c4yhp']")
    WebElement titleProduct;

    @FindBy(xpath = "//div[@class='css-jza1fo']/div[2]/div")
    WebElement choose_product;

//    element ini awalnya untuk validasi title product di halaman detail product, untuk mengecek apakah benar validasinya sesuai atau belum
    @FindBy(className = "css-x7lc0h")
    WebElement validation_product_detail;

//    element-element di bawah ini untuk fungsi validasi product detail terkait judul, harga, dll
    @FindBy(className = "css-c820vl")
    WebElement product_price;

    @FindBy(className = "css-yfyd4u-unf-quantity-editor__input")
    WebElement product_qty;

    @FindBy(css = "i.css-1qtt4sn-unf-quantity-editor__icon.e1ke628k0")
    WebElement add_product_qty;

    @FindBy(className = "css-1h9nkq5-unf-quantity-editor__icon e1ke628k0")
    WebElement min_product_qty;

    @FindBy(css = "p.css-zhsj9w-unf-heading.e1qvo2ff8")
    WebElement product_total_price;

//    element ini awalnya untuk fungsi setter getter namun belum bisa
    @FindBy(xpath = "//div[@class='css-1sh1j0l']/div[2]/a[@class='css-89jnbj']")
    WebElement clickProduct;

    @FindBy(xpath = "//div[@class='css-1sh1j0l']/div[2]//span[@class='css-1bjwylw']")
    WebElement titleProductHome;

    @FindBy(className = "css-x7lc0h")
    WebElement titleProductDetail;

    public WebTokopedia(WebDriver driver){
        super(driver);
    }

    public void checkTitle(){
        if (ACTUAL_TITLE.equals(EXPECTED_TITLE)) {
            System.out.println("Validation title Success: " + ACTUAL_TITLE);
        }else
            System.out.println("Validation title failed");
    }

    public boolean assertTitle(){
        return ACTUAL_TITLE.equals(EXPECTED_TITLE);
    }

    public void closePopUp(){
        this.close_pop_up.click();
    }

    public void checkFormSearch(){
        if (form_search.isDisplayed() & form_search.isEnabled()) {
            System.out.println("Validation form search success");
        }else
            System.out.println("Validation form search failed");
    }

    public void clickSearch(){
        this.form_search.click();
    }

    public void typeSearch(){
        this.form_search.sendKeys(INPUT_SEARCH);
    }

    public void set_category(){
        this.choose_category.click();
    }

    public void checkListPage(){
        if (validation_listPage.getText().equals(EXPECTED_LIST_PAGE)) {
            System.out.println("Validation list product page success");
        }else
            System.out.println("Validation list product page failed");
    }

//      [1] ini awalnya untuk fungsi validasi antara judul di halaman list dengan judul di halaman product detail, namun belum berhasil
//    public boolean assertListPage(){
//        return validation_listPage.getText().equals(EXPECTED_LIST_PAGE);
//    }
//
//    public void getTitleProduct(){
//        System.out.println("Title product: " +titleProduct.getText());
//    }

    public void setProduct(){
        this.choose_product.click();
    }
//      [2] ini awalnya untuk fungsi validasi antara judul di halaman list dengan judul di halaman product detail, namun belum berhasil
//    public void validationProductDetail(){
//        if (validation_product_detail.getText().equals(titleProduct.getText())) {
//            System.out.println("Validation product detail page success: " + validation_product_detail.getText());
//        }else
//            System.out.println("Validation product detail page failed");
//    }
//
//    public boolean assertProductDetail(){
//        return validation_product_detail.getText().equals(titleProduct.getText());
//    }
//
//    private String title_p = titleProduct.getText();
//    public String title_p2 = validation_product_detail.getText();
//
//    public void setter(String title_p2){
//        this.title_p = title_p2;
//    }
//
//    public String Getter(){
//        return this.title_p;
//        System.out.println(title_p);
//    }
//
//    public void seter(){
//        this.Getter().equals(validation_product_detail.getText());
//    }
//    public void setter(String )

//    public String geTitleProduct(){
//        return titleProduct.getText();
//    }
//
//    public void setTitleProduct(String get){
//        this.getTitleProduct().validation_product_detail.getText();
//    }

//    public void setVal(String valid){
//        this.validation_product_detail.getText() = valid;
//    }

//     ini fungsi untuk validasi product detail
    public void checkDetailProductTitle(){
        if (ACTUAL_TITLE_PRODUCT_DETAIL.equals(EXPECTED_TITLE_PRODUCT_DETAIL)) {
            System.out.println("Validation title pass: " + ACTUAL_TITLE_PRODUCT_DETAIL);
        }else
            System.out.println("Validation title failed: " + ACTUAL_TITLE_PRODUCT_DETAIL);
    }

    public boolean assertTitleProductDetail(){
        return ACTUAL_TITLE_PRODUCT_DETAIL.equals(EXPECTED_TITLE_PRODUCT_DETAIL);
    }

    public void setQty(){
        for (int i = 0; i < 2; i++)
            this.add_product_qty.click();
    }

    public void validationPrice(){
        String priceProduct = product_price.getText();
        String priceProductNew = priceProduct.replace(".","");
        String priceProductNew2 = priceProductNew.replace("Rp","");
        int finalPrice = Integer.parseInt(priceProductNew2);

        String priceQty = product_qty.getAttribute("value");
        int finalQty = Integer.parseInt(priceQty);

        String totalPriceProduct = product_total_price.getText();
        String totalPriceProduct2 = totalPriceProduct.replace("Rp","");
        String totalPriceProduct3 = totalPriceProduct2.replace(".","");
        int finalTotalPrice = Integer.parseInt(totalPriceProduct3);

        int expectedPrice;
        expectedPrice = finalPrice * finalQty;

        System.out.println("Expected price : ");
        System.out.println(finalPrice + " * " + finalQty);
        System.out.println(expectedPrice);

        if (finalTotalPrice == expectedPrice){
            System.out.println("Validation price success: ");
        }else
            System.out.println("Validation price failed: " + finalPrice);
    }

    public boolean assertTotalPrice(){
        String priceProduct = product_price.getText();
        String priceProductNew = priceProduct.replace(".","");
        String priceProductNew2 = priceProductNew.replace("Rp","");
        int finalPrice = Integer.parseInt(priceProductNew2);

        String priceQty = product_qty.getAttribute("value");
        int finalQty = Integer.parseInt(priceQty);

        String totalPriceProduct = product_total_price.getText();
        String totalPriceProduct2 = totalPriceProduct.replace("Rp","");
        String totalPriceProduct3 = totalPriceProduct2.replace(".","");
        int finalTotalPrice = Integer.parseInt(totalPriceProduct3);

        int expectedPrice;
        expectedPrice = finalPrice * finalQty;

        return finalTotalPrice == expectedPrice;
    }

//      [3] ini awalnya untuk fungsi validasi antara judul di halaman list dengan judul di halaman product detail, namun belum berhasil
//    public void setProduct1(){
//        System.out.println(titleProductHome.getText());
//    }
//
//    public void setProduct2(){
//        this.clickProduct.click();
//    }
//
//    public void titleDetail(){
//        System.out.println(titleProductDetail.getText());
//
//    }
//
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
