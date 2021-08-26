package pageobject.signIn;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage {

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "passwd")
    private WebElement passwordField;

    @FindBy(id = "SubmitLogin")
    private WebElement submitBtn;

    @FindBy(css = "#center_column > div.alert.alert-danger")
    private WebElement errorMessage;

    @FindBy(id = "email_create")
    private WebElement newEmailField;

    @FindBy(id = "SubmitCreate")
    private WebElement submitCreateBtn;

    public WebElement getEmailField() {
        return emailField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public WebElement getSubmitBtn() {
        return submitBtn;
    }

    public WebElement getErrorMessage() {
        return errorMessage;
    }

    public WebElement getNewEmailField() {
        return newEmailField;
    }

    public WebElement getSubmitCreateBtn() {
        return submitCreateBtn;
    }


}
