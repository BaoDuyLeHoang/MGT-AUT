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

	@FindBy(how = How.XPATH, using = "//a[text()='Trang chủ']")
	private WebElement trangChu;

	@FindBy(how = How.XPATH, using = "//a[text()='Giới thiệu']")
	private WebElement gioiThieu;

	@FindBy(how = How.XPATH, using = "//a[text()='Dịch vụ']")
	private WebElement dichVu;

	@FindBy(how = How.XPATH, using = "//a[text()='Tìm kiếm mộ']")
	private WebElement timKiemMo;

	@FindBy(how = How.ID, using = "//a[text()='Liên hệ']")
	private WebElement lienHe;

	@FindBy(how = How.CLASS_NAME, using = "user-icon")
	private WebElement userIcon;

	@FindBy(how = How.ID, using = "profile")
	private WebElement profile;

	@FindBy(how = How.ID, using = "login")
	private WebElement login;

	@FindBy(how = How.ID, using = "relative-grave")
	private WebElement relativeGrave;

	@FindBy(how = How.XPATH, using = "//a[text()='Giỏ hàng']")
	private WebElement gioHang;

	public void clickTrangChu(){
		clickElement(trangChu);
	}
	public void clickGioiThieu(){
		clickElement(gioiThieu);
	}
	public void clickDichVu(){
		clickElement(dichVu);
	}
	public void clickTimKiemMo(){
		clickElement(timKiemMo);
	}
	public void clickLienHe(){
		clickElement(lienHe);
	}
	public void clickUserIcon(){
		clickElement(userIcon);
	}
	public void clickGioHang(){
		clickElement(gioHang);
	}

}
