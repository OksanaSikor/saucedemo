package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryPage extends Page{

    @FindBy(xpath = "//span[@class='title']")
    private WebElement nameOfMainPageSection;

    @FindBy(xpath = "//div[@class='inventory_item_name']")
    private WebElement nameOfProduct;

    @FindBy(xpath = "//*[@id='add-to-cart-sauce-labs-backpack']")
    private WebElement addToCartButton;

    @FindBy(xpath = "//*[@id='shopping_cart_container']")
    private WebElement goToCartContainer;

    public InventoryPage openPage(String url) {
        driver.get(url);
        return this;
    }

    public String getTextOfMainPageSection() {
       return nameOfMainPageSection.getText();
    }

    public void clickNameOfProduct() {
        nameOfProduct.click();
    }

    public InventoryPage clickAddButton() {
        addToCartButton.click();
        return this; }

    public void clickGotoCartContainerButton() {
        goToCartContainer.click();
    }
}
