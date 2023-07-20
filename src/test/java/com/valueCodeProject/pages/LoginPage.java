package com.valueCodeProject.pages;



import com.valueCodeProject.utilities.ConfigurationReader;
import com.valueCodeProject.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    @FindBy(id="user_email")
    public WebElement email;

    @FindBy(id="user_password")
    public WebElement password;

    @FindBy(name = "commit")
    public WebElement signIn;












    public void login() {
        email.sendKeys(
                ConfigurationReader.getProperty("email")
        );
        password.sendKeys(ConfigurationReader.getProperty("password"));
        signIn.click();
        // verification that we logged
    }

}
