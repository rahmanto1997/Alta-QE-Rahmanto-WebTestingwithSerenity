package starter.Steps;

import starter.Pages.LoginPageFailed_4;

public class LoginStepsFailed_4 {
    LoginPageFailed_4 loginPageFailed_4 ;

    public void openHomePage() {
        loginPageFailed_4.open();
    }
    public void openLoginPage(){
        loginPageFailed_4.clickIconBookstore();
        loginPageFailed_4.clickButtonLogin();
    }
    public void inputonlyusername(){
        loginPageFailed_4.inputUsernamePassword();
        loginPageFailed_4.clickBtnLogin();
    }
    public void validasi(){
        loginPageFailed_4.validasiPassword();
    }
}