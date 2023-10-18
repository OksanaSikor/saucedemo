package test;

import io.qameta.allure.Description;
import io.qameta.allure.Issue;
import io.qameta.allure.TmsLink;
import model.User;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import service.CartPageService;
import service.InventoryItemPageService;
import service.InventoryPageService;
import service.LoginPageService;

public class CartPageTest extends BaseTest{

    private LoginPageService loginPageService;
    private User user;

    @BeforeTest
    public void setUp() {
        loginPageService = new LoginPageService();
        user = new User();
    }

    @Test(description="Checking the possibility of continuing purchases")
    @Description("Purchase continuation verification process")
    @Issue("ISSUE-222")
    @TmsLink("TMS-13")
    public void сheckIfYouCanContinueShoppingTest() {
        InventoryPageService inventoryPageService = loginPageService.login(user);
        inventoryPageService.goAddToCart();
        CartPageService cartPageService = new CartPageService();
        cartPageService.navigateOfBackToMainPage();
        String actualTextOfMainPageSection = inventoryPageService.getActualNameOfMainPageSection();
        String expectedTextOfMainPageSection = "Products";
        Assert.assertEquals(actualTextOfMainPageSection, expectedTextOfMainPageSection, "Login failed!  " +
                "The actual text of the page doesn't match expected");
    }
}
