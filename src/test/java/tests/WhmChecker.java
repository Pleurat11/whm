package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.WhmPage;
import utils.BrowserUtils;
import utils.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WhmChecker {
    WhmPage whmPage = new WhmPage();

    List<WebElement> urlOfCpn = whmPage.urlOfCpanels;
    List<WebElement> usernames = whmPage.usernamesOnCpanel;
    int a = 0;

    @Test
    public void test() {

        whmPage.logInWhm("https://iuri0156.hospedagemdesites.ws:2087/", "charles1", "Cha$280748240645");

        BrowserUtils.sleep(20);

        for (int i = 0; i <usernames.size(); i++) {
            System.out.println("https://" + urlOfCpn.get(i).getText()+":2083|" + usernames.get(i).getText());
        }



//        for (WebElement each : whmPage.urlOfCpanels) {
//            System.out.println("https://" + each.getText() + ":2083|");
//        }
//
//        for (WebElement each1 : whmPage.usernamesOnCpanel) {
//            System.out.println(each1.getText());
//        }
//    }
    }
    @Test
    public void getTEst(){
        whmPage.checkWHMS();
    }


}
