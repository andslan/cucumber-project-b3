package io.loop.pages;

import io.loop.utilities.ConfigurationReader;
import io.loop.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBearLoginPage {


    public SmartBearLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//label[contains(text(), 'Username')]/following-sibling::input[1]")
    public WebElement usernameBox;

    @FindBy(xpath = "//label[contains(text(), 'Password')]/following-sibling::input[1]")
    public WebElement passwordBox;

    @FindBy(id = "ctl00_MainContent_login_button")
    public WebElement loginButton;

    String smartUsername = ConfigurationReader.getProperties("smart.username");
    String smartPassword = ConfigurationReader.getProperties("smart.password");

    public void loginAsTester() {

        usernameBox.sendKeys(ConfigurationReader.getProperties("smart.username"));
        passwordBox.sendKeys(ConfigurationReader.getProperties("smart.password"));
        loginButton.click();
    }


}