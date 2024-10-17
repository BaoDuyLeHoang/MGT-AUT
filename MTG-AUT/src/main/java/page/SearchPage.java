package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchPage extends BasePage {

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.ID, using = "search-input")
    private WebElement inputName;

    @FindBy(how = How.CLASS_NAME, using = "filter-input-byear")
    private WebElement inputBirthYear;

    @FindBy(how = How.CLASS_NAME, using = "filter-input-dyear")
    private WebElement inputDeathYear;

    @FindBy(how = How.CLASS_NAME, using = "filter-input-hometown")
    private WebElement inputHomeTown;

    @FindBy(how = How.CLASS_NAME, using = "search-button")
    private WebElement btnSearch;

    public void sendTextToName(String name){
        enterText(inputName, name);
    }
    public void sendTextToBirthYear(String birthYear){
        enterText(inputBirthYear, birthYear);
    }
    public void sendTextToDeathYear(String deathYear){
        enterText(inputDeathYear, deathYear);
    }
    public void sendTextToHomeTown(String homeTown){
        enterText(inputHomeTown, homeTown);
    }

    public void tapButtonSearch(){
        clickElement(btnSearch);
    }


}
