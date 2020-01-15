package models.ui;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    public SelenideElement avatarButton = $(byXpath("//span[contains(@class, 'ant-avatar')]/.."));

}
