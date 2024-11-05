package page;

import core.DataProviderUtils;
import core.ExcelUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import core.BasePage;
import org.testng.annotations.Test;


public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

     @FindBy(how = How.CSS, using = "input[type='text']")
    private WebElement text;

    @FindBy(how = How.CSS, using = "input[type='password']")
    private WebElement password;

    @FindBy(how = How.CLASS_NAME, using = "login-btn")
    private WebElement loginButton;

    @FindBy(how = How.LINK_TEXT, using = "Quên mật khẩu?")
    private WebElement forgotPasswordLink;

    @FindBy(how = How.LINK_TEXT, using = "Đăng ký")
    private WebElement registerLink;

    @FindBy(how = How.CSS, using = "div.MuiAlert-message.css-1pxa9xg-MuiAlert-message")
    private WebElement notification;

    @FindBy(how = How.XPATH, using = "//input[@type='tel']")
    private WebElement tel;

    @FindBy(how = How.XPATH, using = "//div[@class='input-group'][label[text()='Xác nhận mật khẩu']]/input")
    private WebElement confirmPassword;

    public void sendText(String _text){
        enterText(text, _text);
    }

    public void sendConfirmPassword(String _confirmPassword){
        enterText(confirmPassword, _confirmPassword);
    }

    public void sendTel(String _tel){
        enterText(tel, _tel);
    }

    public void sendPassword(String _password) {
        enterText(password, _password);
    }

    public void clickLoginButton() {
        clickElement(loginButton);
    }

    public Boolean isNotificationDisplay(){
        if(isElementVisibility(notification, 500)==true){
            return true;
        }
        return false;
    }

    public void clickForgotPassword() {
        clickElement(forgotPasswordLink);
    }

    public void clickRegister() {
        clickElement(registerLink);
    }

    public void loginWithData(String file) {
        String[][] data = ExcelUtils.getTableArray(file, false);
        if (data != null && data.length > 1) {
            for (int i = 0; i < data.length; i++) {
                String txt = data[i][0];
                String pwd = data[i][1];
                if(txt.length()>0 && pwd.length()>0){
                    this.sendText(txt);
                    this.sendPassword(pwd);
                    this.clickLoginButton();
                }
            }
        } else {
            System.out.println("No data returned from the Excel file or insufficient data.");
        }
    }
}
