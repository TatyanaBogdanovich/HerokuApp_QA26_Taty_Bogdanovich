package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InputsTest extends BaseTest {

    @Test
    public void inputsTest()  {


        driver.get("https://the-internet.herokuapp.com/inputs");
        WebElement input = driver.findElement(By.cssSelector("input[type=number]"));
        Assert.assertEquals(input.getAttribute("value"), "");

        input.sendKeys("qwerty");
        Assert.assertEquals(input.getAttribute("value"), "");

        input.clear();

        input.sendKeys("100");
        Assert.assertEquals(input.getAttribute("value"), "100");

        input.sendKeys(Keys.ARROW_DOWN);
        input.sendKeys(Keys.ARROW_DOWN);
        input.sendKeys(Keys.ARROW_DOWN);
        input.sendKeys(Keys.ARROW_UP);
        input.sendKeys(Keys.ARROW_UP);
        Assert.assertEquals(input.getAttribute("value"), "99");
    }
}
