package service;

import io.qameta.allure.Step;
import page.CartPage;

public class CartPageService {

    private CartPage cartPage = new CartPage();

    @Step("Getting item name")
    public String getItemName() {
        return cartPage.getTextOfItemName();
    }

    @Step("Navigate of back to main page")
    public InventoryPageService navigateOfBackToMainPage(){
        cartPage.clickContinueShoppingButton();
        return new InventoryPageService();
    }
}
