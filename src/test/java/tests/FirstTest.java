package tests;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilites.ConfigReader;
import utilites.Driver;

public class FirstTest {

    AmazonPage amazonPage = new AmazonPage();

    @Test
    public void test01(){

        Driver.getDriver().get("https://www.amazon.com");

        amazonPage.amazonSearchBox.sendKeys("Nutella"+ Keys.ENTER);

    }
}
