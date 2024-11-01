package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RelativeGrave extends BasePage {
    public RelativeGrave(WebDriver driver) {
        super(driver);
    }
    @FindBy(how = How.CSS, using = ".action-button.primary")
    private WebElement chiTiet;

    public void clickChiTiet(){
        clickElement(chiTiet);
    }

}
