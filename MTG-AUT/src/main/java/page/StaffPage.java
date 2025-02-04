package page;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;
import java.util.NoSuchElementException;

public class StaffPage extends BasePage {
    public StaffPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.CLASS_NAME, using = "blog-mgmt-create-button")
    private WebElement createBlogButton;

    @FindBy(how = How.XPATH, using = "//div[@class='notification-content']")
    private List<WebElement> thongBaoList;

    @FindBy(how = How.XPATH, using = "//div[@class='blog-mgmt-filter']/select")
    private WebElement blogStatusSelector;

    @FindBy(how = How.XPATH, using = "//a[@href='/notifications-staff']")
    private WebElement thongBaoBtn;

    @FindBy(how = How.CSS, using = "action-button.edit")
    private WebElement editButton;

    @FindBy(how = How.XPATH, using = "//button[text()='Tất cả']")
    private WebElement allTask;

    @FindBy(how = How.XPATH, using = "//button[text()='Đã hoàn thành']")
    private WebElement taskComplete;

    @FindBy(how = How.XPATH, using = "//button[text()='Chưa hoàn thành']")
    private WebElement taskImcomplete;

    @FindBy(how = How.CLASS_NAME, using = "view-detail-button")
    private WebElement xemChiTietBtn;

    @FindBy(how = How.CLASS_NAME, using = "staff-task-list-table")
    private WebElement congViec;

    @FindBy(how = How.CLASS_NAME, using = "task-action-accept")
    private WebElement chapNhanBtn;

    @FindBy(how = How.CSS, using = "tbody.MuiTableBody-root > tr")
    List<WebElement> rows;

    @FindBy(how = How.CSS, using = ".popup-task-list .popup-task-item")
    List<WebElement> tasks;

    @FindBy(how = How.XPATH, using = "//button[contains(text(), 'Tuần Sau')]")
    private WebElement btnTuanSau;

    @FindBy(how = How.CLASS_NAME, using = "gr-table-row")
    List<WebElement>  baoCaoMoList;

    public void clickFirstElementInBaoCaoMoList() throws InterruptedException {
        scrollToTopPage();
        if (baoCaoMoList != null && !baoCaoMoList.isEmpty()) {
            Thread.sleep(2000);
            baoCaoMoList.get(0).click();
            Thread.sleep(20000);

        } else {
            System.out.println("Danh sách baoCaoMoList trống hoặc không được khởi tạo.");
        }
    }



    public void clickThemCongViec(String day) {
        try {
            for (WebElement row : rows) {
                WebElement dayElement = row.findElement(By.cssSelector("h6.MuiTypography-subtitle1"));

                // Kiểm tra nếu ngày khớp với giá trị truyền vào
                if (dayElement.getText().equalsIgnoreCase(day)) {
                    // Tìm nút "Thêm Công Việc" trong hàng
                    WebElement addButton = row.findElement(By.cssSelector("button[type='button']"));

                    // Kiểm tra nếu nút hiển thị và có thể click
                    if (addButton.isDisplayed() && addButton.isEnabled()) {
                        addButton.click(); // Bấm nút
                        System.out.println("Đã bấm nút 'Thêm Công Việc' cho ngày: " + day);
                        return;
                    } else {
                        System.out.println("Nút 'Thêm Công Việc' không khả dụng cho ngày: " + day);
                    }
                }
            }

            System.out.println("Không tìm thấy hàng nào với ngày: " + day);
        } catch (NoSuchElementException e) {
            System.out.println("Lỗi: Không tìm thấy phần tử cần thiết.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void selectTask(String taskName, String confirmation) {
        try {
            // Tìm danh sách các công việc trong popup
            //List<WebElement> tasks = driver.findElements(By.cssSelector(".popup-task-list .popup-task-item"));
            Thread.sleep(5000);
            for (WebElement task : tasks) {
                // Lấy tên công việc từ thẻ h4
                WebElement taskTitle = task.findElement(By.cssSelector(".task-info h4"));
                this.isElementVisibility(taskTitle);
                // Kiểm tra nếu tên công việc khớp với taskName
                String taskNameList = taskTitle.getText();
                System.out.println("Công việc hiện có" +taskNameList);

                if (taskNameList.contains(taskName)) {
                    // Click vào công việc nếu tìm thấy
                    clickElement(task);
                    System.out.println("Đã chọn công việc: " + taskName);
                    handleConfirmationDialog(confirmation);
                    return;
                }
            }

            System.out.println("Không tìm thấy công việc với tên: " + taskName);
        } catch (NoSuchElementException e) {
            System.out.println("Lỗi: Không tìm thấy phần tử cần thiết.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void handleConfirmationDialog(String confirmation) {
        try {
            // Kiểm tra giá trị của confirmation ("Có" hoặc "Không")
            if ("Có".equalsIgnoreCase(confirmation)) {
                WebElement yesButton = driver.findElement(By.cssSelector(".confirm-dialog-actions .confirm-button.primary"));
                clickElement(yesButton);
                System.out.println("Đã bấm nút 'Có'.");
            } else if ("Không".equalsIgnoreCase(confirmation)) {
                WebElement noButton = driver.findElement(By.cssSelector(".confirm-dialog-actions .confirm-button.secondary"));
                Thread.sleep(2000);
                clickElement(noButton);
                System.out.println("Đã bấm nút 'Không'.");
            } else {
                System.out.println("Giá trị xác nhận không hợp lệ: " + confirmation);
            }
        } catch (NoSuchElementException e) {
            System.out.println("Lỗi: Không tìm thấy nút xác nhận.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }




    public void clickChapNhanBtn(){
        clickElement(chapNhanBtn);
    }

    public void clickXemChiTietBtn() {
        this.isElementVisibility(xemChiTietBtn);
        clickElement(xemChiTietBtn);
    }

    public void clickBtnThongBao(){
        clickElement(thongBaoBtn);
    }

    public void clickBtnTuanSau(){
        clickElement(btnTuanSau);
    }

    public void clickThongBaoList(int index) {
        try {
            WebElement button = thongBaoList.get(index);
                this.isElementVisibility(button);
                button.click();
                return;
        } catch (NoSuchElementException e) {
            System.out.println("No element found at the specified index.");
        } catch (IndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException("Index out of bounds for blogList");
        }
    }
    public void clickCongViecList(int index) {
        try {
            List<WebElement> buttons = congViec.findElements(By.xpath(".//tr[" + index + "]//td//button"));
            for (WebElement button : buttons) {
                this.isElementVisibility(button);
                button.click();
                return;
            }
        } catch (NoSuchElementException e) {
            System.out.println("No element found at the specified index.");
        } catch (IndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException("Index out of bounds for blogList");
        }
    }
}
