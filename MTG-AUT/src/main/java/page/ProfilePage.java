package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProfilePage extends BasePage {

    public ProfilePage(WebDriver driver) {
        super(driver);
    }


    @FindBy(how = How.CSS, using = "action-button.edit")
    private WebElement editBtn;

    @FindBy(how = How.CSS, using = "action-button.save")
    private WebElement saveBtn;

    @FindBy(how = How.XPATH, using = "action-button.cancel")
    private WebElement cancelBtn;

    @FindBy(how = How.NAME, using = "emailAddress")
    private WebElement emailAddress;

    @FindBy(how = How.NAME, using = "address")
    private WebElement address;

    @FindBy(how = How.NAME, using = "phone")
    private WebElement phone;

    @FindBy(how = How.NAME, using = "dateOfBirth")
    private WebElement dateOfBirth;

    public void clickEditButton(){
        clickElement(editBtn);
    }
    public void clickSaveButton(){
        clickElement(saveBtn);
    }
    public void clickCancelButton(){
        clickElement(cancelBtn);
    }

    public void inputEmailAddress(String _emailAddress){
        enterText(emailAddress, _emailAddress);
    }

    public void inputAddress(String _address){
        enterText(address, _address);
    }

    public void inputDateOfBirth(String date){
        dateOfBirth.clear();
        dateOfBirth.sendKeys(date);
    }

    public void inputPhone(String _phone){
        enterText(phone, _phone);
    }

}
