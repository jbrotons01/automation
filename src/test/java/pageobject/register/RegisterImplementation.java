package pageobject.register;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterImplementation {

    private RegisterPage registerPage;

    public RegisterImplementation(WebDriver driver) {
        registerPage = PageFactory.initElements(driver, RegisterPage.class);
    }

    public void fillRegisterForm(Integer genderId) {
        selectGender(genderId);
        selectBirthDay(10);
    }

    private void selectGender(Integer genderId) {
        registerPage.getGenderRadioBtn().get(genderId).click();
    }

    private void selectBirthDay(Integer day) {
        Select selectBirthDay = new Select(registerPage.getBirthDaySelect());
        selectBirthDay.selectByIndex(day);
    }


}
