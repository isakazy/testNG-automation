package Tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.ApplicationFlow;
import utilities.Config;
import utilities.Driver;

import java.util.List;

public class TestPush1 {
    @Test
    public void Test1(){
        Driver.getDriver().get(Config.getValue("blazeDemo"));
        WebElement cities = Driver.getDriver().findElement(By.xpath("//select[1]"));
        Select select = new Select(cities);
        select.selectByValue("Boston");
        WebElement destination = Driver.getDriver().findElement(By.xpath("//select[2]"));
        Select select1 = new Select(destination);
        select1.selectByValue("Rome");
        String oldURL = Driver.getDriver().getCurrentUrl();
        Driver.getDriver().findElement(By.xpath("//input")).click();
        Assert.assertNotEquals("the url did not change ",oldURL, Driver.getDriver().getCurrentUrl());





    }
}
