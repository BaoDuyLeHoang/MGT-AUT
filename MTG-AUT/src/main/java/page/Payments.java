package page;

import core.BasePage;
import core.ExcelUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Payments extends BasePage {
    public Payments(WebDriver driver) {
        super(driver);
    }

    //https://sandbox.vnpayment.vn/tryitnow/Home/CreateOrder
    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    private WebElement tạoDonHang;

    public void clickTaoDonHang() {
        clickElement(tạoDonHang);
    }

    @FindBy(how = How.XPATH, using = "//div[@class='list-method-button' and @data-bs-target='#accordionList2']")
    private WebElement theNoiDia;

    @FindBy(how = How.ID, using = "NCB")
    private WebElement NCB;

    @FindBy(how = How.ID, using = "card_number_mask")
    private WebElement soThe;

    @FindBy(how = How.ID, using = "cardHolder")
    private WebElement tenChuThe;

    @FindBy(how = How.ID, using = "cardDate")
    private WebElement ngayPhatHanh;

    @FindBy(how = How.ID, using = "otpvalue")
    private WebElement OTP;

    @FindBy(how = How.ID, using = "btnContinue")
    private WebElement tiepTuc;


    @FindBy(how = How.ID, using = "btnAgree")
    private WebElement dongY;


    @FindBy(how = How.ID, using = "btnConfirm")
    private WebElement xacNhan;


    public void clickTheNoiDia() {
        clickElement(theNoiDia);
    }

    public void clickNCB() {
        clickElement(NCB);
    }

    public void clickDongY() {
        clickElement(dongY);
    }

    public void inputSoThe(String _soThe) {
        enterText(soThe, _soThe);
    }

    public void inputTenChuThe(String _tenChuThe) {
        enterText(tenChuThe, _tenChuThe);
    }

    public void inputNgayPhatHanh(String _ngayPhatHanh) {
        enterText(ngayPhatHanh, _ngayPhatHanh);
    }
    public void inputOTP(String _OTP) {
        enterText(OTP, _OTP);
    }
    public void clickBtnContinue() {
        clickElement(tiepTuc);
    }

    public void clickBtnConfirm() {
        clickElement(xacNhan);
    }


    public void paymentWithData(String file)  throws InterruptedException  {
        String[][] data = ExcelUtils.getTableArray(file, false);
        if (data != null && data.length > 0) {
            for (int i = 0; i < data.length; i++) {
                String soThe = data[i][0];
                String tenChuThe = data[i][1];
                String ngayPhatHanh = data[i][2];
                String OTP = data[i][3];
                if(soThe.length()>0 && tenChuThe.length()>0 && ngayPhatHanh.length()>0 && OTP.length()>0){
                    this.inputSoThe(soThe);
                    this.inputTenChuThe(tenChuThe);
                    this.inputNgayPhatHanh(ngayPhatHanh);
                    this.clickBtnContinue();
                    this.clickDongY();
                    Thread.sleep(1000);
                    this.inputOTP(OTP);
                    this.clickBtnConfirm();
                }
            }
        } else {
            System.out.println("No data returned from the Excel file or insufficient data.");
        }
    }

}