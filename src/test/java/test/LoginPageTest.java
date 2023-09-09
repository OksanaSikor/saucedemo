package test;

import driver.DriverSingleton;
import model.User;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import service.InventoryPageService;
import service.LoginPageService;

public class LoginPageTest extends BaseTest{

    private LoginPageService loginPageService;
    private User user;

    @BeforeTest
    public void setUp() {
        loginPageService = new LoginPageService();
        user = new User();
    }

    @Test
    public void checkSuccessfulLoginTest() {
        InventoryPageService inventoryPageService = loginPageService.login(user);
        String actualTextOfMainPageSection = inventoryPageService.getActualNameOfMainPageSection();
        String expectedTextOfMainPageSection = "Products";
        Assert.assertEquals(actualTextOfMainPageSection, expectedTextOfMainPageSection, "Login failed!  " +
                "The actual text of the page doesn't match expected");
    }
}
