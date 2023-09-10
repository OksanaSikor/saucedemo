package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends Page{

    @FindBy(xpath = "//span[@class='title']")
    private WebElement itemName;

    @FindBy(xpath = "//*[@id='continue-shopping']")
    private WebElement continueShoppingButton;

    public String getTextOfItemName() {
        return itemName.getText();
    }

    public void clickContinueShoppingButton() {
        continueShoppingButton.click();
    }
}
