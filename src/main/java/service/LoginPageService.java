package service;

import io.qameta.allure.Step;
import model.User;
import page.LoginPage;

public class LoginPageService {

    private static final String LOGIN_PAGE_URL  = "https://www.saucedemo.com/";

    private LoginPage loginPage = new LoginPage();

    @Step("Getting item name")
    public InventoryPageService login(User user){
        loginPage.openPage(LOGIN_PAGE_URL)
                .fillInUserName(user.getName())
                .fillInPassword(user.getPassword())
                .clickLoginButton();
        return new InventoryPageService();

    }
}
