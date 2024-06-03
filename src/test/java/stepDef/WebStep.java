package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.WebPage;

public class WebStep {
    WebPage webPage;
    public WebStep(){
        this.webPage = new WebPage();
    }

    @Given("Open link PRODUCT STORE")
    public void openLinkPRODUCTSTORE() {
        webPage.openLinkPRODUCTSTORE();
    }

    @Then("User will in home Product Store")
    public void userWillInHomeProductStore() { webPage.userWillInHomeProductStore();

    }

    @And("Click Phones")
    public void clickPhones() { webPage.clickPhones();
    }

    @Then("Will show all type phone")
    public void willShowAllTypePhone() { webPage.willShowAllTypePhone();
    }

    @And("Click Laptops")
    public void clickLaptops() { webPage.clickLaptops();
    }

    @Then("Will show all type laptop")
    public void willShowAllTypeLaptop() { webPage.willShowAllTypeLaptop();
    }

    @And("Click Monitors")
    public void clickMonitors() { webPage.clickMonitors();
    }

    @Then("Will show all type monitor")
    public void willShowAllTypeMonitor() { webPage.willShowAllTypeMonitor();
    }

    @And("Click nav contact")
    public void clickNavContact() { webPage.clickNavContact();
    }

    @And("User fill Contact Email {string}")
    public void userFillContactEmail(String userEmail) { webPage.userFillContactEmail(userEmail);
    }

    @And("User fill Contact Name {string}")
    public void userFillContactName(String userName) { webPage.userFillContactName(userName);
    }

    @And("User fill Message {string}")
    public void userFillMessage(String userMassage) { webPage.userFillMessage(userMassage);
    }

    @And("Click button Send message")
    public void clickButtonSendMessage() { webPage.clickButtonSendMessage();
    }

    @And("Click oke in alert")
    public void clickOkeInAlert() { webPage.clickOkeInAlert();
    }

    @Then("Will back home")
    public void willBackHome() { webPage.userWillInHomeProductStore();
    }

    @And("Click nav Log in")
    public void clickNavLogIn() { webPage.clickNavLogIn();
    }

    @And("Click button Close in Log in")
    public void clickButtonCloseInLogIn() { webPage.clickButtonCloseInLogIn();
    }

    @And("Click nav About US")
    public void clickNavAboutUS() { webPage.clickNavAboutUS();
    }

    @Then("Will show video player")
    public void willShowVideoPlayer() { webPage.willShowVideoPlayer();
    }

    @And("Fill Username {string}")
    public void fillUsername(String userName) { webPage.fillUsername(userName);
    }

    @And("Fill password {string}")
    public void fillPassword(String password) { webPage.fillPassword(password);
    }

    @And("Click button Log in")
    public void clickButtonLogIn() { webPage.clickButtonLogIn();
    }

    @Then("Log in will be successful")
    public void logInWillBeSuccessful() { webPage.logInWillBeSuccessful();
    }

    @Then("Will show {string} at top right of the page")
    public void willShowAtTopRightOfThePage(String user_name) { webPage.willShowAtTopRightOfThePage(user_name);
    }

    @Then("Will show alert {string}")
    public void willShowAlert(String alertMassage) throws InterruptedException {
        WebPage.willShowAlert(alertMassage);
    }

    @And("Click button Log out")
    public void clickButtonLogOut() { webPage.clickButtonLogOut();
    }

    @And("Click nav Sign up")
    public void clickNavSignUp() { webPage.clickNavSignUp();
    }

    @And("Fill Username Sign up {string}")
    public void fillUsernameSignUp(String username) { webPage.fillUsernameSignUp(username);
    }

    @And("Fill password Sign up {string}")
    public void fillPasswordSignUp(String password) { webPage.fillPasswordSignUp(password);
    }

    @And("Click button sign up")
    public void clickButtonSignUp() { webPage.clickButtonSignUp();
    }

    @And("Click button close sign up")
    public void clickButtonCloseSignUp() { webPage.clickButtonCloseSignUp();
    }

    @And("Click title product")
    public void clickTitleProduct() { webPage.clickTitleProduct();
    }

    @Then("Will show detail product")
    public void willShowDetailProduct() { webPage.willShowDetailProduct();
    }

    @Then("Image product")
    public void imageProduct() { webPage.imageProduct();
    }

    @Then("Title product")
    public void titleProduct() { webPage.titleProduct();
    }

    @Then("Price product")
    public void priceProduct() { webPage.priceProduct();
    }

    @Then("Description product")
    public void descriptionProduct() { webPage.descriptionProduct();
    }

    @Then("Click Button Add to Cart")
    public void clickButtonAddToCart() { webPage.clickButtonAddToCart();
    }

    @And("Click Nav Cart")
    public void clickNavCart() { webPage.clickNavCart();
    }

    @Then("Will show purchased products")
    public void willShowPurchasedProducts() { webPage.willShowPurchasedProducts();
    }

    @And("Click button Delete")
    public void clickButtonDelete() { webPage.clickButtonDelete();
    }

    @Then("Cart will empty")
    public void cartWillEmpty() { webPage.cartWillEmpty();
    }

    @And("Click button Place Order")
    public void clickButtonPlaceOrder() { webPage.clickButtonPlaceOrder();
    }

    @And("Click button Close Place Order")
    public void clickButtonClosePlaceOrder() { webPage.clickButtonClosePlaceOrder();
    }

    @Then("Will back to Cart")
    public void willBackToCart() { webPage.willBackToCart();
    }

    @And("Click button Purchase")
    public void clickButtonPurchase() { webPage.clickButtonClose();
    }

    @And("Fill Name {string}")
    public void fillName(String namePurchase) { webPage.fillName(namePurchase);
    }

    @And("Fill Credit card {string}")
    public void fillCreditCard(String ccPurchase) { webPage.fillCreditCard(ccPurchase);
    }

    @And("Fill County {string}")
    public void fillCounty(String country) { webPage.fillCounty(country);
    }

    @And("Fill City {string}")
    public void fillCity(String city) { webPage.fillCity(city);
    }

    @And("Fill Month {string}")
    public void fillMonth(String month) { webPage.fillMonth(month);
    }

    @And("Fill year {string}")
    public void fillYear(String year) { webPage.fillYear(year);
    }

    @Then("Will show Thank you for your purchase!")
    public void willShowThankYouForYourPurchase() { webPage.willShowThankYouForYourPurchase();
    }

    @Then("Can click oke")
    public void canClickOke() { webPage.canClickOke();
    }

}
