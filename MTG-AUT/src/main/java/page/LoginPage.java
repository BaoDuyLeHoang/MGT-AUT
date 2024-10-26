package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import core.BasePage;


public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

     @FindBy(how = How.ID, using = "text")
    private WebElement text;

    @FindBy(how = How.ID, using = "password")
    private WebElement password;

    @FindBy(how = How.CLASS_NAME, using = "login-btn")
    private WebElement loginButton;

    @FindBy(how = How.LINK_TEXT, using = "Quên mật khẩu?")
    private WebElement forgotPasswordLink;

    @FindBy(how = How.LINK_TEXT, using = "Đăng ký")
    private WebElement registerLink;

    public void sendText(String _text){
        enterText(text, _text);
    }

    public void sendPassword(String _password) {
        enterText(password, _password);
    }

    public void clickLoginButton() {
        clickElement(loginButton);
    }

    public void clickForgotPassword() {
        clickElement(forgotPasswordLink);
    }

    public void clickRegister() {
        clickElement(registerLink);
    }

}
