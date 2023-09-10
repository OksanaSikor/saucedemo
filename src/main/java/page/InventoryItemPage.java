package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryItemPage extends Page{

    @FindBy(xpath = "//button[@name='back-to-products']")
    private WebElement buttonOfBackToProducts;

    @FindBy(xpath = "//div[@class='inventory_details_name large_size']")
    private WebElement nameToProducts;

    public String getTextOfPageSection() {
        return nameToProducts.getText();
    }

    public void clickButtonOfBack() {
        buttonOfBackToProducts.click();
    }
}
