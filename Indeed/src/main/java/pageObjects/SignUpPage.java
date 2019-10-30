package pageObjects;

import common.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends MobileAPI {

    @FindBy(xpath = "//android.widget.TextView[@text='Iftaker Ahmed']")
    WebElement acceptSuggestionWE;
    @FindBy(xpath = "//android.widget.Button[@text='NONE OF THE ABOVE']")
    WebElement disMissSuggestionWE;
    @FindBy(xpath = "//android.widget.EditText[@resource-id='login-email-input']")
    WebElement emailFieldWE;
    @FindBy(xpath = "//android.widget.EditText[@resource-id='login-password-input']")
    WebElement passwordFieldWE;
    @FindBy(xpath = "//android.widget.Button[@text='Sign In']")
    WebElement signInButtonWE;


    public void DisMissSuggestion(){
        disMissSuggestionWE.click();
    }
    public void acceptSuggestion(){
        acceptSuggestionWE.click();
    }

    public void sigIn(String email,String password){
        emailFieldWE.click();
        emailFieldWE.sendKeys(email);
        passwordFieldWE.click();
        passwordFieldWE.sendKeys(password);
        signInButtonWE.click();
    }



}
