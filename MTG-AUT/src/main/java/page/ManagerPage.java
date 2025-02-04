package page;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;
import java.util.NoSuchElementException;

public class ManagerPage extends BasePage {
    public ManagerPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.CLASS_NAME, using = "search-input")
    private WebElement searchFeedback;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Từ ngày']")
    private WebElement startDateFeedback;

    @FindBy(how = How.XPATH, using = "//div[@class='notification-list']//div")
    private WebElement thongBaoList;

    @FindBy(how = How.CLASS_NAME, using = "material-dialog-content")
    private WebElement danhSachChonVatLieu;

    @FindBy(how = How.XPATH, using = "//div[@class='rdm-materials-container']//button")
    private WebElement btnChonVatLieu;
    public void clickBtnChonVatLieu() throws InterruptedException {
        scrollToBottomPage();
        Thread.sleep(15000);
    }

    @FindBy(how = How.XPATH, using = "//a[@href='/request-manager']")
    private WebElement btnTuNgay;
    public void clickBtnTuNgay(){
        clickElement(btnTuNgay);
    }


    @FindBy(how = How.XPATH, using = "//input[@placeholder='Đến ngày']")
    private WebElement endDateFeedback;

    @FindBy(how = How.XPATH, using = "//button[text()='Từ chối']")
    private WebElement btnTuChoi;
    public void clickBtnTuChoi(){
        clickElement(btnTuChoi);
    }

    @FindBy(how = How.XPATH, using = "//button[text()='Xác nhận']")
    private WebElement btnXacNhan;
    public void clickBtnXacNhan(){
        if(isElementVisibility(btnXacNhan)){
            clickElement(btnXacNhan);
        }
    }

    @FindBy(how = How.CLASS_NAME, using = "detail-button")
    private WebElement detailFeedbackBtn;

    @FindBy(how = How.XPATH, using = "//div[@class='blog-manager-table-container']")
    WebElement blogList;

    public void clickBlogList(int index, String action) {
        try {
            List<WebElement> buttons = blogList.findElements(By.xpath(".//tr[" + index + "]//button"));

            for (WebElement button : buttons) {
                if (button.getText().equals(action)) {
                    this.isElementVisibility(button);
                    button.click();
                    return;
                }
            }
        } catch (NoSuchElementException e) {
            System.out.println("No element found at the specified index.");
        } catch (IndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException("Index out of bounds for blogList");
        }
    }

    @FindBy(how = How.XPATH, using = "//table[@class='staff-table']/tbody/tr")
    List<WebElement> staffList;


    public void clickStaffButtonByName(String staffName, String action) {
        try {
            for (WebElement row : staffList) {
                WebElement nameCell = row.findElement(By.xpath(".//td[2]"));

                if (nameCell.getText().equalsIgnoreCase(staffName)) {
                    WebElement button = row.findElement(By.xpath(".//button[@title='" + action + "']"));

                    this.isElementVisibility(button);
                    clickElement(button);
                    break;
                }
            }


        } catch (NoSuchElementException e) {
            System.out.println("No button with title '" + action + "' found for staff member '" + staffName + "'.");
        }
    }

    @FindBy(how = How.XPATH, using = "//div[@class='rm-table-container']")
    WebElement requestList;

    public void clickRequestList(int index) {
        try {
            List<WebElement> buttons = requestList.findElements(By.xpath(".//tr[" + index + "]//a"));

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

    public void clickChonVatLieu(String index) {
        try {
            List<WebElement> buttons = requestList.findElements(By.xpath(".//tr[" + index + "]//a"));

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

    // Function to select materials by a single string containing names separated by commas
    public void selectMaterialsByNames(String materialNames) {
        // Split the input string into an array based on commas
        String[] materialsArray = materialNames.split(",");

        // Loop through each material name
        for (String materialName : materialsArray) {
            materialName = materialName.trim();  // Trim spaces around names

            try {
                // Construct the XPath dynamically based on the material name
                WebElement material = driver.findElement(By.xpath("//div[@class='material-item']//h4[text()='" + materialName + "']/ancestor::div[@class='material-item']//div[@class='material-select']"));

                // Check if the material is not already selected (e.g., check for 'selected' class)
                if (!material.findElement(By.xpath("./ancestor::div[@class='material-item']")).getAttribute("class").contains("selected")) {
                    material.click();
                    System.out.println("Selected material: " + materialName);
                } else {
                    System.out.println("Material '" + materialName + "' is already selected.");
                }
            } catch (NoSuchElementException e) {
                System.out.println("Material with name '" + materialName + "' not found.");
            }
        }
    }






}
