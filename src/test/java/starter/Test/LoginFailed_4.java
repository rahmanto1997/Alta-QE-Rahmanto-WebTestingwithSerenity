package starter.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Steps.LoginStepsFailed_4;

public class LoginFailed_4 {

    @Steps
    LoginStepsFailed_4 loginStepsFailed_4 ;

    @Given("I am in the Login Page")
    public void i_am_in_the_Login_Page() {
        loginStepsFailed_4.openHomePage();
        loginStepsFailed_4.openLoginPage();
    }

    @When("I am only fill username")
    public void i_am_only_fill_username() {
        loginStepsFailed_4.inputonlyusername();

    }

    @Then("I am not login page")
    public void i_am_not_login_page() {
        loginStepsFailed_4.validasi();

    }
}
