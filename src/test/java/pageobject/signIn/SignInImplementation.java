package pageobject.signIn;

import utils.WaitUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SignInImplementation {

    private SignInPage signInPage;
    private WaitUtils waitUtils;

    public SignInImplementation(WebDriver driver) {
        signInPage = PageFactory.initElements(driver, SignInPage.class);
        waitUtils = new WaitUtils(driver);
    }

    public void fillLoginForm(String email, String password) {
        waitUtils.waitUntilClickable(10, signInPage.getEmailField());
        setEmail(email);
        setPassword(password);
        clickSubmit();
    }

    public void goToRegisterForm(String email) {
        setEmailRegister(email);
        submitCreateForm();
    }


    private void setEmail(String email) {
        signInPage.getEmailField().sendKeys(email);
    }

    private void setPassword(String password) {
        signInPage.getPasswordField().sendKeys(password);
    }

    private void clickSubmit() {
        signInPage.getSubmitBtn().click();
    }

    public String getErrorMsg() {
        return signInPage.getErrorMessage().getText();
    }

    private void setEmailRegister(String email) {
        signInPage.getNewEmailField().sendKeys(email);
        signInPage.getSubmitCreateBtn().click();
    }

    private void submitCreateForm() {
        signInPage.getSubmitCreateBtn().click();
    }

}
