package service;

import io.qameta.allure.Step;
import page.InventoryItemPage;
import page.InventoryPage;

public class InventoryItemPageService {

    private InventoryItemPage inventoryPageItem = new InventoryItemPage();

    @Step("Getting the actual page section title")
    public String getActualNameOfPageSection(){
        return inventoryPageItem.getTextOfPageSection();
    }

    @Step("Navigate of back to main page")
    public InventoryPageService navigateOfBackToMainPage(){
        inventoryPageItem.clickButtonOfBack();
        return new InventoryPageService();
    }
}
