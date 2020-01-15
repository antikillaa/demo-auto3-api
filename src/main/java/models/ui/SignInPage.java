package models.ui;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SignInPage {
    private SelenideElement loginInput = $(By.cssSelector("#form_email"));
    private SelenideElement passwordInput = $(By.cssSelector("#form_password"));
    private SelenideElement firstNAmeInput = $(By.cssSelector("#form_firstName"));
    private SelenideElement lastNameInput = $(By.cssSelector("#form_lastName"));
    private SelenideElement agreementCheckBox = $(By.cssSelector("#form_agreement"));



    public void inputEmail(String text) {
        this.loginInput.val(text);
    }

    public void inputPassword(String text) {
        this.passwordInput.val(text);
    }

    public void inputFirstName(String text) {
        firstNAmeInput.val(text);
    }

    public void inputLastName(String text) {
        lastNameInput.val(text);
    }

    public void clickAgreementCheckBox() {
        agreementCheckBox.click();
    }

    public String getFirstName() {
        return firstNAmeInput.getValue();
    }

    public String getLastName() {
        return lastNameInput.getValue();
    }

}
