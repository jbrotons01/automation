package pageobject.home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(className = "login")
    private WebElement signInBtn;

    public WebElement getSignInBtn() {
        return signInBtn;
    }

}
