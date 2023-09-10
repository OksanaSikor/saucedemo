package service;

import page.InventoryItemPage;
import page.InventoryPage;

public class InventoryItemPageService {

    private InventoryItemPage inventoryPageItem = new InventoryItemPage();

    public String getActualNameOfPageSection(){
        return inventoryPageItem.getTextOfPageSection();
    }

    public InventoryPageService navigateOfBackToMainPage(){
        inventoryPageItem.clickButtonOfBack();
        return new InventoryPageService();
    }
}
