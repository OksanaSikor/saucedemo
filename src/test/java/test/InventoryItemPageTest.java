package test;

import model.User;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import service.InventoryItemPageService;
import service.InventoryPageService;
import service.LoginPageService;

public class InventoryItemPageTest extends BaseTest{

    private LoginPageService loginPageService;
    private User user;

    @BeforeTest
    public void setUp() {
        loginPageService = new LoginPageService();
        user = new User();
    }

    @Test
    public void checkReturnToHomePage() {
        InventoryPageService inventoryPageService = loginPageService.login(user);
        inventoryPageService.navigateToProductPage();
        InventoryItemPageService inventoryItemPageService = new InventoryItemPageService();
        inventoryItemPageService.navigateOfBackToMainPage();
        String actualTextOfMainPageSection = inventoryPageService.getActualNameOfMainPageSection();
        String expectedTextOfMainPageSection = "Products";
        Assert.assertEquals(actualTextOfMainPageSection, expectedTextOfMainPageSection, "The page did not open");

    }
}
