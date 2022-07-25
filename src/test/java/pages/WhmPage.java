package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;
import utils.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WhmPage {

    public WhmPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user")
    public WebElement userName;

    @FindBy(id = "pass")
    public WebElement password;

    @FindBy(xpath = "(//*[.='List Accounts'])[1]")
    public WebElement listAccounts;

    @FindBy(xpath = "//tbody/tr/td/a[@class]")
    public List<WebElement> urlOfCpanels;

    @FindBy(xpath = "//tr/td[5]")
    public List<WebElement> usernamesOnCpanel;

    @FindBy(xpath = "//td[@class='control-col']")
    public List<WebElement> changePassBttn;

    @FindBy(id = "passwordavantautocom")
    public WebElement changePassField;

    public static void changePassto(String newPassword) {
        List<WebElement> plusList = Driver.getDriver().findElements(By.xpath("//td[@class='account-table-radio text-center']"));


        for (int i = 0; i < plusList.size(); i++) {
            plusList.get(i).click();

            Driver.getDriver().findElement(By.id("password")).sendKeys(newPassword);
            BrowserUtils.sleep(1);
            Driver.getDriver().findElement(By.id("confirm-password")).sendKeys(newPassword + Keys.ENTER);
            BrowserUtils.sleep(1);
            BrowserUtils.sleep(3);
        }
    }

    public void logInWhm(String url, String username, String pass) {
        Driver.getDriver().get(url);
        userName.sendKeys(username);
        password.sendKeys(pass + Keys.ENTER);
    }

    @FindBy(xpath = "//tr/td[3]")
    List<WebElement> urls;

    public void checkWHMS() {

        List<String> usernames = new ArrayList<>(Arrays.asList("ladalimusic",
                "ladalimusic",
                "nitinmusic",
                "ladalimusic",
                "sakchhimusic",
                "djbiharbasti",
                "ladalimusic"));
        List<String> passwords = new ArrayList<>(Arrays.asList("Rhv#$d586@#bb",
                "Rhv#$d586@#bb",
                "ffy6[JoBCy+!  ",
                "gj#%fhAgb#45 ",
                "y8uhy0sga3bk",
                "y8uhy0sga3bk",
                "Rhv#$d586@#bb"));

        List<String> whmLink = new ArrayList<>(Arrays.asList("https://ahost.serverbox.ind.in:2087/",
                "https://serverbox.ind.in:2087/",
                "https://server01.balliahost.in:2087/cpsess9373170781/scripts5/wwwacctform",
                "https://data.onlinewebhost.co:2087/",
                "https://server01.balliahost.in:2087/cpsess9762661461/scripts5/wwwacctform",
                "https://server01.balliahost.in:2087/cpsess4536300273/scripts5/wwwacctform",
                "https://powerdns.serverbox.ind.in:2087/"));

        for (int i = 0; i <10; i++) {
            Driver.getDriver().get(whmLink.get(i));
            BrowserUtils.sleep(2);
            userName.sendKeys(usernames.get(i));
            password.sendKeys(passwords.get(i) + Keys.ENTER);
            BrowserUtils.sleep(6);
        }
    }
}
