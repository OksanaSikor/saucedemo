package service;

import io.qameta.allure.Step;
import page.InventoryPage;

public class InventoryPageService {
    private static final String INVENTORY_PAGE_URL = "https://www.saucedemo.com/inventory.html";

    private InventoryPage inventoryPage = new InventoryPage();

    @Step("Getting the actual title of the home page section")
    public String getActualNameOfMainPageSection(){
        return inventoryPage.getTextOfMainPageSection();
    }

    @Step("Go to product page")
    public InventoryItemPageService navigateToProductPage(){
        inventoryPage.clickNameOfProduct();
        return new InventoryItemPageService();
    }

    @Step("Go to cart")
    public CartPageService goAddToCart() {
        inventoryPage.openPage(INVENTORY_PAGE_URL)
                .clickAddButton()
                .clickGotoCartContainerButton();
        return new CartPageService();
    }
}
