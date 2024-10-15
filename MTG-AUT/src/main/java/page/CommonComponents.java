package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

//class này dùng để chứa các thành phần dùng chung cho một số page
//page nào có các thành phần trong class này có thể kế thừ từ class này
//Các component này có thể để chung với BasePage, cũng có thể tách ra để dễ quản lý
public class CommonComponents extends BasePage {

	public CommonComponents(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(how = How.ID, using = "menu-homepage")
	private WebElement homePage;

	@FindBy(how = How.ID, using = "menu-introduce")
	private WebElement introduce;

	@FindBy(how = How.ID, using = "menu-services")
	private WebElement service;

	@FindBy(how = How.ID, using = "menu-contact")
	private WebElement contact;

	@FindBy(how = How.ID, using = "user-icon")
	private WebElement userIcon;

	@FindBy(how = How.ID, using = "profile")
	private WebElement profile;

	@FindBy(how = How.ID, using = "login")
	private WebElement login;

	@FindBy(how = How.ID, using = "relative-grave")
	private WebElement relativeGrave;

}
