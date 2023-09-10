package service;

import page.InventoryPage;

public class InventoryPageService {
    private static final String INVENTORY_PAGE_URL = "https://www.saucedemo.com/inventory.html";

    private InventoryPage inventoryPage = new InventoryPage();

    public String getActualNameOfMainPageSection(){
        return inventoryPage.getTextOfMainPageSection();
    }

    public InventoryItemPageService navigateToProductPage(){
        inventoryPage.clickNameOfProduct();
        return new InventoryItemPageService();
    }

    public CartPageService goAddToCart() {
        inventoryPage.openPage(INVENTORY_PAGE_URL)
                .clickAddButton()
                .clickGotoCartContainerButton();
        return new CartPageService();
    }
}
