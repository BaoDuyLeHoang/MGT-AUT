package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import core.BasePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class ServicePage extends BasePage {

    public ServicePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.CLASS_NAME, using = "sell-service-card")
    List<WebElement> serviceList;



    @FindBy(how = How.CLASS_NAME, using = "sl-add-to-cart-button")
    List<WebElement> dichvutheotheloaiList;

    public void getService(int index) {
        if (index >= 0 && index < serviceList.size()) {
            WebElement service = serviceList.get(index);
            this.isElementVisibility(service);
            service.click();
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds for serviceList");
        }
    }

    public void getDichVuTheoTheLoai(int index)  {
        if (index >= 0 && index < dichvutheotheloaiList.size()) {
            WebElement service = dichvutheotheloaiList.get(index);
            this.isElementVisibility(service);
            service.click();
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds for serviceList");
        }
    }
    public void getServiceByName(String name) {
        getTextFromList(dichvutheotheloaiList, "text", name);
    }


}
