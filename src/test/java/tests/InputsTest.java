package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InputsTest extends BaseTest {

    @Test
    public void inputsTest(){

        driver.get("https://the-internet.herokuapp.com/inputs");
        WebElement input = driver.findElement(By.cssSelector("input[type=number]"));
        Assert.assertEquals(input.getAttribute("value"), "");

        input.sendKeys("qwerty");
        Assert.assertEquals(input.getAttribute("value"),"", "Ввод нецифрового значения");

        input.sendKeys("12345");
        Assert.assertEquals(input.getAttribute("value"), "12345", "Ввод цифрового значения");

        input.sendKeys(Keys.ARROW_UP);
        input.sendKeys(Keys.ARROW_UP);
        input.sendKeys(Keys.ARROW_DOWN);
        Assert.assertEquals(input.getAttribute("value"), "123");
  }
}
