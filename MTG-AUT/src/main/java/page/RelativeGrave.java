package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class RelativeGrave extends BasePage {
    public RelativeGrave(WebDriver driver) {
        super(driver);
    }
    @FindBy(how = How.CSS, using = ".action-button.primary")
    private WebElement chiTiet;

    @FindBy(how = How.XPATH, using = "//a[@href='/request-customer/']")
    private WebElement taoYeuCauMoi;

    @FindBy(how = How.ID, using = "martyrId")
    private WebElement martyr;

    @FindBy(how = How.ID, using = "typeId")
    private WebElement type;

    @FindBy(how = How.ID, using = "completeDate")
    private WebElement dateInput;

    @FindBy(how = How.ID, using = "note")
    private WebElement note;
    @FindBy(how = How.CLASS_NAME, using = "request-submit-btn")
    private WebElement guiYeuCau;
    @FindBy(how = How.CLASS_NAME, using = "confirm-modal-submit")
    private WebElement xacNhanYeuCau;

    public void clickChiTiet(){
        clickElement(chiTiet);
    }
    public void clickTaoYeuCauMoi(){
        clickElement(taoYeuCauMoi);
    }
    public void clickMoNguoiThan(String martyrName){
        Select select = new Select(martyr);
        List<WebElement> options = select.getOptions();

        for (WebElement option : options) {
            String name = option.getText();
            if(name.contains(martyrName)){
                clickElement(option);
            }
        }
    }
    public void clickLoaiYeuCau(String typeRequest){
        Select select = new Select(type);
        List<WebElement> options = select.getOptions();

        for (WebElement option : options) {
            if(option.getText().contains(typeRequest)){
                clickElement(option);
            }
        }
    }
    public void clickNgayHoanThanh(String date){
        dateInput.clear();
        dateInput.sendKeys(date);

    }
    public void clickGuiYeuCau() throws InterruptedException {
        Thread.sleep(1000);
        clickElement(guiYeuCau);
        Thread.sleep(1000);
        clickElement(xacNhanYeuCau);
    }
    public void inputNote(String ghiChu){
        enterText(note, ghiChu);
    }

}
