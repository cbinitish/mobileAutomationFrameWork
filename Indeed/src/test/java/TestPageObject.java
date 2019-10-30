import common.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import pageObjects.JobSearchPage;
import pageObjects.Registration;
import pageObjects.SignUpPage;

public class TestPageObject extends MobileAPI {
    JobSearchPage jobSearchPage;
    public void getJobsearchPage(){
        jobSearchPage = PageFactory.initElements(appiumDriver,JobSearchPage.class);
    }
    public void setJobSearchPage(){
        jobSearchPage.isSignInButtonClickable();
        jobSearchPage.jobPageValidation();
        jobSearchPage.postJob();
        jobSearchPage.scrollDownToReadText();
        jobSearchPage.searchForJob();

    }
    Registration registration;
    public void getRegistration(){
        registration = PageFactory.initElements(appiumDriver,Registration.class);
    }
    public void setRegistration(){
        registration.clickOnsignIn();
        registration.clickOnUseWithOutAcc();
        registration.createAccount();
        registration.swipeDown();
        registration.haveAnAccount();
        registration.UIvalidations();

    }
    SignUpPage signUpPage;
    public void getSignuppage(){
        signUpPage=PageFactory.initElements(appiumDriver,SignUpPage.class);
    }
    public void setSignUpPage(){
        signUpPage.acceptSuggestion();
        signUpPage.DisMissSuggestion();
        signUpPage.sigIn("cbinitish@gmail.com","++++++++");
    }
}
