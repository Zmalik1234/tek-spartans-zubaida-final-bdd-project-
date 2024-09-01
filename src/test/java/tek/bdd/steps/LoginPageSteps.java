package tek.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.Assert;
import tek.bdd.pages.LoginPageObject;
import tek.bdd.utilities.SeleniumUtility;

public class LoginPageSteps extends SeleniumUtility {
    @When("click on login button")
    public void clickOnLoginButton() {
        clickOnElement(LoginPageObject.LOGIN_BUTTON);
    }

    @Then("validate Sign in to your account text is exist")
        public void validateSignInToTourAccountTextIsExist(){
            String loginPageText = getElementText(LoginPageObject.SIGN_IN_TO_YOUR_ACCOUNT_TEXT);
            Assert.assertEquals("Sign in to your account",loginPageText);
        }
        @Then("inter Username {String} and password{String}")
        public Void interUsernameAndPassword (String Username, String Password){
            sendText(LoginPageObject.USERNAME_INPUT);
            sendText(LoginPageObject.PASSWORD_INPUT);

        }
        @Then("click On Sign In Button")
                public Void clickOnSignInButton(){
            clickOnElement(LoginPageObjec.SIGN_IN_BUTTON);

        }
        @Then("validate User Navigate customer Service Portal")
                public Void validateUserNavigateCustomerServicePortal(){
            String actualCustomerServicePortal = getElementText(LoginPageObject.VALIDATE_CUSTOMER_SERVICES_PORTAL);
            Assert.assertEquals("customer service portal",actualCustomerServicePortal);

        }
        @Then("validate error message{String}")
                public Void validateErrorMessage(String expectedErrorMessage){
             String actualErrorMessage = getElementText(LoginPageObject.ERROR_MESSAGE);
             Assert.assertEquals("ERROR",actualErrorMessage);
        }
    }







