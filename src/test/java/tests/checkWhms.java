package tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.OrvxLoginPage;
import utils.BrowserUtils;
import utils.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class checkWhms {
    @Test
    public void test() {
        Driver.getDriver().get("https://orvx.pw/login");

        OrvxLoginPage loginPage = new OrvxLoginPage();

        loginPage.email.sendKeys("interloudd@gmail.com");

        loginPage.password.sendKeys("PleuratBajrami1!2@3#4$5%");

        BrowserUtils.sleep(1);

        loginPage.SignInBttn.click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 60);


        wait.until(ExpectedConditions.titleContains("Dashboard"));

        Driver.getDriver().findElement(By.xpath("//a[contains(text(),'Seller pane')]")).click();

        Driver.getDriver().findElement(By.xpath("//a[@href='https://orvx.pw/seller/unsold_items']")).click();

        List<WebElement> deleteTools = Driver.getDriver().findElements(By.xpath("//button[@class='btn btn-danger btn-xs']"));


        for (WebElement each : deleteTools) {
            each.click();
            Alert alert = Driver.getDriver().switchTo().alert();
            alert.accept();
        }






    }
}
