package pageObjects;

import common.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class Registration extends MobileAPI {


    @FindBy(xpath = "//android.view.View[@text='Sign in'and@index='2']")
    WebElement signInWE;
    @FindBy(xpath = "//android.view.View[@text='Create account'and@index='3']")
    WebElement createAccountWE;
    @FindBy(xpath = "//android.view.View[@text='Have an account?']")
    WebElement haveAnAccountWE;
    @FindBy(xpath = "//android.view.View[@text='Use without account']")
    WebElement useWithOutAccWE;


    public void UIvalidations() {
        sleep(10);
        if (signInWE.isDisplayed()) {
            System.out.println(signInWE.getText() + " : is displayed");
        }
        if (createAccountWE.isDisplayed()) {
            System.out.println(createAccountWE.getText() + " : is displayed");
        }
        if (haveAnAccountWE.isDisplayed()) {
            System.out.println(haveAnAccountWE.getText() + " : is displayed");
        }
        if (useWithOutAccWE.isDisplayed()) {
            System.out.println(useWithOutAccWE.getText() + " : is displayed");
        }
    }



    public void clickOnUseWithOutAcc()  {
        sleep(10);
        //ad.findElement(By.xpath("abcd")).click();
        String account = useWithOutAccWE.getText();
        useWithOutAccWE.click();
        TestLogger.log(" message ");
        System.out.println(account + ": has been clicked");
    }

    public void clickOnsignIn()  {
        sleep(3);
        String signIn = signInWE.getText();
        signInWE.click();
        System.out.println(signIn + ": has been clicked");
        sleep(4);

    }
    public void createAccount(){
        sleep(3);
        String text = createAccountWE.getText();
        createAccountWE.click();
        System.out.println(text + ": has been clicked");
        sleep(4);

    }
    public void haveAnAccount() {
        sleep(3);
        String text = haveAnAccountWE.getText();
        haveAnAccountWE.click();
        System.out.println(text + ": has been clicked");
        sleep(4);

    }

    public void swipeDown(){
        sleep(5);
        MobileAPI.functionSwipe("up", 200, 200);

    }
}
