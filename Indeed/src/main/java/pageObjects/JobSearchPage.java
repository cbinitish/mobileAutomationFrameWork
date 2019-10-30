package pageObjects;

import common.MobileAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import reporting.TestLogger;

public class JobSearchPage extends MobileAPI {
    @FindBy(xpath = "//android.widget.EditText[@resource-id='qinput']")
    WebElement jobTypeWE;
    @FindBy(xpath = "//android.widget.EditText[@resource-id='linput']")
    WebElement jobLocationWE;
    @FindBy(xpath = "//android.widget.Button[@ text='Find Jobs']")
    WebElement findJobsWE;
    @FindBy(xpath = "//android.view.View[@text='Post a Job']\n")
    WebElement postAJobWE;
    @FindBy(xpath = "//android.view.View[@text='for employers']")
    WebElement indeedForEmployers;
    @FindBy(xpath = "//android.view.View[@text='Terms Of Service']")
    WebElement termsNservicesWE;
    @FindBy(xpath = "//android.view.View[@text='Sign in']")
    WebElement signInWE;
    @FindBy(xpath = "//android.widget.LinearLayout[@resource-id\t='com.google.android.gms:id/credential_picker_layout']")
    WebElement suggestionWE;




    public void jobPageValidation() {
        if (appiumDriver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']")).isDisplayed()) {

            SoftAssert softAssertion= new SoftAssert();
            softAssertion.assertEquals(jobTypeWE.isDisplayed(),true);
            softAssertion.assertEquals(jobLocationWE.isDisplayed(),true);
            softAssertion.assertEquals(findJobsWE.isDisplayed(),true);
            softAssertion.assertAll();
        }
    }


    public void searchForJob()  {
        sleep(3);
        jobTypeWE.click();
        jobTypeWE.sendKeys("QA Analyst");
        jobLocationWE.click();
        jobLocationWE.sendKeys("New York");
        findJobsWE.click();
    }

    public void postJob()  {
        sleep(3);
        String jobText = postAJobWE.getText();
        System.out.println("clicking on"+jobText);
        postAJobWE.click();
        Assert.assertEquals(indeedForEmployers.isDisplayed(),true);
        System.out.println(postAJobWE + ": has been clicked");
        sleep(4);
    }
    public void scrollDownToReadText(){
        sleep(3);
        MobileAPI.functionSwipe("up", 200, 200);
        String termsText = termsNservicesWE.getText();
        System.out.println("reading: "+termsText);
        sleep(4);

    }
    public void isSignInButtonClickable(){
        signInWE.click();
        suggestionWE.isDisplayed();
    }

}
