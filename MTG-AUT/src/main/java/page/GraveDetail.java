package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GraveDetail extends BasePage {
    public GraveDetail(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.CLASS_NAME, using = "book-service-button")
    private WebElement bookServiceBtn;

    public void clickBookService(){
        clickElement(bookServiceBtn);
    }
}
