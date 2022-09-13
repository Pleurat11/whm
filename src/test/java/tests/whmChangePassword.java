package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.WhmPage;
import utils.BrowserUtils;
import utils.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class whmChangePassword {
    @Test
    public void test() {
        WhmPage whmPage = new WhmPage();

        BrowserUtils.sleep(5);
        whmPage.logInWhm("https://svr165.edns1.com:2087/", "root", "K$mk&14eG6");

        BrowserUtils.sleep(20);

        WhmPage.changePassto("PEJAATTACK#@!");


    }
    List<String> usernames = new ArrayList<>(Arrays.asList("appprofeciaexpre"));
    List<String> password = new ArrayList<>(Arrays.asList("bB6]xN0akAn&"));
    @Test
    public void tesat(){
        List<String> myList = new ArrayList<>(Arrays.asList("https://acesso.centercast.com.br:2087/"));
        for (int i = 0; i <100; i++) {
            Driver.getDriver().get(myList.get(i));
            WhmPage whmPage = new WhmPage();
            whmPage.userName.sendKeys(usernames.get(i));
            whmPage.password.sendKeys(password.get(i) + Keys.ENTER);
        }
    }
}
