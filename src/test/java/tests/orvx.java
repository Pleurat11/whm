package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import utils.BrowserUtils;
import utils.Driver;

import java.util.List;

public class orvx {
    @Test
    public void checkAll(){


        Driver.getDriver().get("https://orvx.pw/login");


        Driver.getDriver().findElement(By.id("email_signin")).sendKeys("lapiho5121@nuesond.com");

        Driver.getDriver().findElement(By.id("pass_signin")).sendKeys("pleurati123" + Keys.ENTER);

        BrowserUtils.sleep(1);

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 60);


        wait.until(ExpectedConditions.titleContains("Dashboard"));

        Actions actions = new Actions(Driver.getDriver());
        WebElement element = Driver.getDriver().findElement(By.xpath("(//a[@href='#'])[3]"));


        WebDriverWait wait2 = new WebDriverWait(Driver.getDriver(), 10);
        wait2.until(ExpectedConditions.titleIs("ORVX SHOP - CPANEL"));

        BrowserUtils.sleep(2);

//        WebElement selecttwo = Driver.getDriver().findElement(By.xpath("(//select[@class='select2 form-control select2-hidden-accessible'])[6]"));
//        Select select= new Select(selecttwo);
//        select.selectByVisibleText("Seller 43");


//        BrowserUtils.sleep(1);
//
//        Driver.getDriver().findElement(By.id("searchb")).click();
//
//        BrowserUtils.sleep(3);

        BrowserUtils.sleep(20);


        List<WebElement> check = Driver.getDriver().findElements(By.xpath("//div[@class='badge badge-pill badge-glow  badge-primary badge-md mr-1 mb-1']"));

        for (WebElement each: check) {
            each.click();
            BrowserUtils.sleep(5);
        }

    }
}
