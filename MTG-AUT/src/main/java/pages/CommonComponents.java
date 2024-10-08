package pages;

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

	@FindBy(how = How.ID, using = "menu-icon")
	private WebElement menu;

	@FindBy(how = How.ID, using = "menu-item-50")
	private WebElement myAccountMenu;

	@FindBy(how = How.ID, using = "menu-item-40")
	private WebElement shopMenu;



}
