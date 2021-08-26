package pageobject.register;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class RegisterPage {

    @FindBy(css ="#account-creation_form > div:nth-child(1) > div.clearfix > div")
    private List<WebElement> genderRadioBtn;

    @FindBy(id = "days")
    private WebElement birthDaySelect;

    public List<WebElement> getGenderRadioBtn() {
        return genderRadioBtn;
    }

    public WebElement getBirthDaySelect() {
        return birthDaySelect;
    }
}
