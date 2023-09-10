package test;

import model.User;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import service.CartPageService;
import service.InventoryItemPageService;
import service.InventoryPageService;
import service.LoginPageService;

public class InventoryPageTest extends BaseTest{

    private LoginPageService loginPageService;
    private User user;

    @BeforeTest
    public void setUp() {
        loginPageService = new LoginPageService();
        user = new User();
    }

    @Test
    public void checkTheOpeningOfTheProductCardTest() {
        InventoryPageService inventoryPageService = loginPageService.login(user);
        inventoryPageService.navigateToProductPage();
        InventoryItemPageService inventoryItemPageService = new InventoryItemPageService();
        String actualTextOfMainPageSection =
                inventoryItemPageService.getActualNameOfPageSection();
        String expectedTextOfMainPageSection = "Sauce Labs Backpack";
        Assert.assertEquals(actualTextOfMainPageSection, expectedTextOfMainPageSection, "The page did not open");

    }

    @Test
    public void checkTheChangeToTheAddToCartButtonTest() {
        InventoryPageService inventoryPageService = loginPageService.login(user);
        inventoryPageService.goAddToCart();
        CartPageService cartPageService = new CartPageService();
        String actualTextOfMainPageSection =cartPageService.getItemName();
        String expectedTextOfMainPageSection = "Your Cart";
        Assert.assertEquals(actualTextOfMainPageSection, expectedTextOfMainPageSection, "The page did not open");
    }
}
