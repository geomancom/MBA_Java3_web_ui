package org.example.DZ_6;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.example.DZ_6.views.BaseView;

public class LoginPage extends BaseView{

    @FindBy(css = "input[id='prependedInput']")
    private WebElement inputLogin;

    @FindBy(css = ".span2[name='_password']")
    private WebElement inputPassword;

    @FindBy(xpath = ".//button[@name='_submit']")
    private WebElement buttonSignIn;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Step(value = "Enter Login {login}")
    public LoginPage enterLogin(String login) {
        inputLogin.sendKeys(login);
        return this;
    }

    @Step(value = "Enter Password {password}")
    public LoginPage enterPassword(String password) {
        inputPassword.sendKeys(password);
        return this;
    }

    @Step(value = "Click Login Button")
    public HomePage clickLoginButton() {
        buttonSignIn.click();
        return new HomePage(driver);
    }

    @Step(value = "Authorise Scenario")
    public HomePage authoriseScenario(String login, String password) {
        inputLogin.sendKeys(login);
        inputPassword.sendKeys(password);
        buttonSignIn.click();
        return new HomePage(driver);
    }
}
