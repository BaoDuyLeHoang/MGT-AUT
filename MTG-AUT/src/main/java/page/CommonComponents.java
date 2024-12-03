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
	//ADMIN
	@FindBy(how = How.CSS, using = "sidebar-menu-item.active")
	private WebElement dashboardQuanLyTaiKhoan;
	@FindBy(how = How.XPATH, using = "//a[@href='/admin']")
	private WebElement thongKe;
	@FindBy(how = How.XPATH, using = "//a[@href='/danhsachaccount']")
	private WebElement quanLyNhanSu;
	@FindBy(how = How.XPATH, using = "//a[@href='/service-management']")
	private WebElement quanLyDichVu;
	@FindBy(how = How.XPATH, using = "//a[@href='/material-management']")
	private WebElement quanLyVatLieu;


	//MANAGER
	@FindBy(how = How.XPATH, using = "//a[@href='/profilestaff']")
	private WebElement dashboardHoSoNhanVien_Manager;

	@FindBy(how = How.XPATH, using = "//a[@href='/']")
	private WebElement dashboardThongKe;

	@FindBy(how = How.XPATH, using = "//a[@href='/danhsachdonhang']")
	private WebElement dashboardDonHang;

	@FindBy(how = How.XPATH, using = "//a[@href='/danhsachnhanvien']")
	private WebElement dashboardNhanVien;

	@FindBy(how = How.XPATH, using = "//a[@href='/danhsachmo']")
	private WebElement dashboardDanhSachMo;

	@FindBy(how = How.XPATH, using = "//a[@href='/danhsachphanhoikhachhang']")
	private WebElement dashboardPhanHoiKhachHang;

	@FindBy(how = How.XPATH, using = "//a[@href='/chitietdonhang']")
	private WebElement dashboardGiaoViec;

	@FindBy(how = How.XPATH, using = "//a[@href='/danhsachthanhtoan']")
	private WebElement dashboardThanhToan;

	@FindBy(how = How.XPATH, using = "//a[@href='/blog-manager']")
	private WebElement dashboardBlog;

	//STAFF
	@FindBy(how = How.XPATH, using = "//a[@href='/profilestaff-staff']")
	private WebElement dashboardHoSoNhanVien_Staff;

	@FindBy(how = How.XPATH, using = "//a[@href='/danhsachdonhang-staff']")
	private WebElement dashboardCongViec;

	@FindBy(how = How.CLASS_NAME, using = "logout-button")
	private WebElement logoutBtn;

	//CUSTOMER
	@FindBy(how = How.XPATH, using = "//a[text()='Trang chủ']")
	private WebElement trangChu;

	@FindBy(how = How.XPATH, using = "//a[text()='Giới thiệu']")
	private WebElement gioiThieu;

	@FindBy(how = How.XPATH, using = "//a[text()='Mộ người thân']")
	private WebElement moNguoiThan;

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


	//Admin
	public void clickDashBoardQuanLyTaiKhoan(){
		clickElement(dashboardQuanLyTaiKhoan);
	}
	public void clickThongKeAdmin(){
		clickElement(thongKe);
	}
	public void clickQuanLyDichVuAdmin(){
		clickElement(quanLyDichVu);
	}
	public void clickQuanLyNhanSuAdmin(){
		clickElement(quanLyNhanSu);
	}
	public void clickQuanLyVatLieuAdmin(){
		clickElement(quanLyVatLieu);
	}

	//Trang quản lý
	public void clickDashBoardHoSoNhanVien(){
		clickElement(dashboardHoSoNhanVien_Manager);
	}
	public void clickDashBoardThongKe(){
		clickElement(dashboardThongKe);
	}
	public void clickDashBoardDonHang(){
		clickElement(dashboardDonHang);
	}
	public void clickDashBoardNhanVien(){
		clickElement(dashboardNhanVien);
	}
	public void clickDashBoardDanhSachMo(){
		clickElement(dashboardDanhSachMo);
	}
	public void clickDashBoardPhanHoiKhachHang(){
		clickElement(dashboardPhanHoiKhachHang);
	}
	public void clickDashBoardGiaoViec(){
		clickElement(dashboardGiaoViec);
	}
	public void clickDashBoardThanhToan(){
		clickElement(dashboardThanhToan);
	}
	public void clickDashBoardBlog(){
		clickElement(dashboardBlog);
	}

	//STAFF
	public void clickHoSoNhanVienStaff(){
		clickElement(dashboardHoSoNhanVien_Staff);
	}
	public void clickCongViec(){
		clickElement(dashboardCongViec);
	}
	public void clickLogoutButton(){
		clickElement(logoutBtn);
	}

	// CUSTOMER
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
	public void clickMoNguoiThan(){
		clickElement(moNguoiThan);
	}

}
