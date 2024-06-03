package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.assertj.core.api.Assertions.assertThat;
import java.time.Duration;

import static helper.Utility.driver;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WebPage {
    //Home
    By navBar = By.id("nava");
    By phoneBtn = By.xpath("/html/body/div[5]/div/div[1]/div/a[2]");
    By laptopsBtn = By.xpath("/html/body/div[5]/div/div[1]/div/a[3]");
    By monitorBtn = By.xpath("/html/body/div[5]/div/div[1]/div/a[4]");
    By imgLaptop = By.xpath("//img[@src='imgs/sony_vaio_5.jpg']");
    By imgMonitor = By.xpath("//img[@src='imgs/asusm.jpg']");
    By impPhone = By.xpath("//img[@src='imgs/galaxy_s6.jpg']");
    By titleProduct = By.xpath("/html/body/div[5]/div/div[2]/div/div[1]/div/div/h4/a");
    //Contact
    By navContact = By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]/a");
    By inpEmail = By.id("recipient-email");
    By inpName = By.id("recipient-name");
    By inpMassage = By.id("message-text");
    By btnSend = By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]");
    By btnClose = By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[1]");
    //About Us
    By navAboutUs = By.xpath("/html/body/nav/div[1]/ul/li[3]/a");
    By displayVideo = By.xpath("/html/body/div[4]/div/div/div[2]/form/div/div/div[1]");
    //Log In
    By navLogIn = By.id("login2");
    By inpUsername = By.id("loginusername");
    By inpPassword = By.id("loginpassword");
    By btnLogIn = By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]");
    By btnCloseLog = By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[1]");
    By btnLogOut = By.xpath("/html/body/nav/div[1]/ul/li[6]/a");
    By welcomeName = By.id("nameofuser");
    // Sign Up
    By navSignUp = By.id("signin2");
    By inpNameSign = By.id("sign-username");
    By inpPassSign = By.id("sign-password");
    By btnSign = By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]");
    By btnCloseSign = By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[1]");
    // Detail Product
    By imgProduct = By.xpath("//*[@id=\"imgp\"]/div/img");
    By titProduct = By.xpath("//*[@id=\"tbodyid\"]/h2");
    By priceProduct = By.xpath("//*[@id=\"tbodyid\"]/h3");
    By desProduct = By.id("more-information");
    By btnAddtoCart = By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a");
    //Cart
    By navCart = By.id("cartur");
    By btnDelete = By.xpath("//*[@id=\"tbodyid\"]/tr/td[4]/a");
    By tableCart = By.id("tbodyid");
    By btnPlaceOrder = By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button");
    By btnClosePlace = By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[1]");
    By btnPurchase = By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]");
    By namePurchase = By.id("name");
    By countryPurchase = By.id("country");
    By cityPurchase = By.id("city");
    By creditPurchase = By.id("card");
    By monthPurchase = By.id("month");
    By yearPurchase = By.id("year");
    By thankPurchase = By.xpath("/html/body/div[10]/h2");
    By okePurchase = By.xpath("/html/body/div[10]/div[7]/div/button");

    public void openLinkPRODUCTSTORE(){ driver.get("https://www.demoblaze.com/");}

    public void userWillInHomeProductStore(){
        WebElement navbar1 = driver.findElement(navBar);
        assertTrue(navbar1.isDisplayed());
        assertEquals("PRODUCT STORE", navbar1.getText());
    }

    public void clickPhones(){
        driver.findElement(phoneBtn).click();
    }

    public void willShowAllTypePhone(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElement(impPhone).isDisplayed();
    }

    public void clickLaptops(){
        driver.findElement(laptopsBtn).click();
    }

    public void willShowAllTypeLaptop(){ driver.findElement(imgLaptop).isDisplayed(); }

    public void clickMonitors(){ driver.findElement(monitorBtn).click(); }

    public void willShowAllTypeMonitor(){ driver.findElement(imgMonitor).isDisplayed(); }

    public void clickNavContact () { driver.findElement(navContact).click(); }

    public void userFillContactEmail (String userEmail) { driver.findElement(inpEmail).sendKeys(userEmail); }

    public void userFillContactName (String userName) { driver.findElement(inpName).sendKeys(userName); }

    public void userFillMessage (String userMassage) { driver.findElement(inpMassage).sendKeys(userMassage); }

    public void clickButtonSendMessage () { driver.findElement(btnSend).click(); }

    public void clickOkeInAlert () { driver.switchTo().alert().getText(); driver.switchTo().alert().accept();}

    public void clickButtonClose () { driver.findElement(btnClose); }

    public void clickNavAboutUS () { driver.findElement(navAboutUs).click(); }

    public void willShowVideoPlayer () { driver.findElement(displayVideo).isDisplayed(); }

    public void clickNavLogIn () { driver.findElement(navLogIn).click(); }

    public void clickButtonCloseInLogIn () { driver.findElement(btnCloseLog).click(); }

    public void fillUsername (String username) { driver.findElement(inpUsername).sendKeys(username); }

    public void fillPassword (String password) { driver.findElement(inpPassword).sendKeys(password); }

    public void clickButtonLogIn () { driver.findElement(btnLogIn).click(); }

    public void logInWillBeSuccessful() { driver.get("https://www.demoblaze.com/index.html"); }

    public void willShowAtTopRightOfThePage (String massage) { driver.findElement(welcomeName).isDisplayed(); }

    public void clickButtonLogOut () { driver.findElement(btnLogOut); }

    public static void willShowAlert (String alertMasaage) throws InterruptedException {
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        String massageAlert = alert.getText();
        System.out.println(massageAlert);
        assertThat(massageAlert).isEqualTo(alertMasaage);
        alert.accept();
    }

    public void clickNavSignUp () { driver.findElement(navSignUp).click(); }

    public void fillUsernameSignUp (String username) { driver.findElement(inpNameSign).sendKeys(username); }

    public void fillPasswordSignUp (String password) { driver.findElement(inpPassSign).sendKeys(password); }

    public void clickButtonSignUp () { driver.findElement(btnSign).click(); }

    public void clickButtonCloseSignUp () { driver.findElement(btnCloseSign).click(); }

    public void clickTitleProduct () { driver.findElement(titleProduct).click(); }

    public void willShowDetailProduct () { driver.get("https://www.demoblaze.com/prod.html?idp_=1"); }

    public void imageProduct (){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        WebElement image = driver.findElement(imgProduct);
        assertTrue(image.isDisplayed());
    }

    public void titleProduct(){
        WebElement title = driver.findElement(titProduct);
        assertTrue(title.isDisplayed());
        assertEquals("Samsung galaxy s6", title.getText());
    }

    public void priceProduct(){
        WebElement price = driver.findElement(priceProduct);
        assertTrue(price.isDisplayed());
        assertEquals("$360 *includes tax", price.getText());
    }

    public void descriptionProduct(){
        WebElement description = driver.findElement(desProduct);
        assertTrue(description.isDisplayed());
        assertEquals("Product description\n" +
                "The Samsung Galaxy S6 is powered by 1.5GHz octa-core Samsung Exynos 7420 processor and it comes with 3GB of RAM. The phone packs 32GB of internal storage cannot be expanded.", description.getText());
    }

    public void clickButtonAddToCart(){
        driver.findElement(btnAddtoCart).click();
    }

    public void clickNavCart() { driver.findElement(navCart).click(); }

    public void willShowPurchasedProducts() {
        WebElement product2 = driver.findElement(impPhone);
        assertTrue(product2.isDisplayed());
    }

    public void clickButtonDelete () { driver.findElement(btnDelete).click(); }

    public void cartWillEmpty () { driver.findElement(tableCart).isDisplayed(); }

    public void clickButtonPlaceOrder() { driver.findElement(btnPlaceOrder).click(); }

    public void clickButtonClosePlaceOrder() { driver.findElement(btnClosePlace).click();}

    public void willBackToCart() { driver.get("https://www.demoblaze.com/cart.html"); }

    public void fillName(String namePurc) { driver.findElement(namePurchase).sendKeys(namePurc);}

    public void fillCounty(String contryPurc) { driver.findElement(countryPurchase).sendKeys(contryPurc);}

    public void fillCity(String cityPurc) { driver.findElement(cityPurchase).sendKeys(cityPurc); }

    public void fillCreditCard (String creditPurc) { driver.findElement(creditPurchase).sendKeys(creditPurc); }

    public void fillMonth (String monthPurc) { driver.findElement(monthPurchase).sendKeys(monthPurc); }

    public void fillYear (String yearPurc) {driver.findElement(yearPurchase).sendKeys(yearPurc);}

    public void clickButtonPurchase() { driver.findElement(btnPurchase).click(); }

    public void willShowThankYouForYourPurchase () { driver.findElement(thankPurchase).click(); }

    public void canClickOke () { driver.findElement(okePurchase).click(); }

}

