package tests;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.ApplicationFlow;
import utilities.Driver;

public class Google {
    @Test
    public  void  search(){
        Faker faker = new Faker();

        String testData = faker.lorem().word();
Driver.getDriver().get("https://google.com");
Driver.getDriver().findElement(By.name("q")).sendKeys(testData + Keys.ENTER);
String title = Driver.getDriver().getTitle();
        ApplicationFlow.scroll(500);

        Assert.assertTrue("Title failed" , title.contains(testData));
        Driver.quit();
    }


    @Test
    public void  googleImage(){
        Driver.getDriver().get("https://google.com");
        System.out.println("Checking some images");
        Driver.quit();
    }
}
