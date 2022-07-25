package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class OrvxLoginPage {

    public OrvxLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "email_signin")
    public WebElement email;

    @FindBy(id="pass_signin")
    public WebElement password;

    @FindBy(id = "loginbutt")
    public WebElement SignInBttn;
}
