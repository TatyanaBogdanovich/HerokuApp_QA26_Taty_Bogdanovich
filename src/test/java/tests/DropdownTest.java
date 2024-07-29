package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class DropdownTest  extends BaseTest {

    @Test
    public void dropdownTest() {

        driver.get("https://the-internet.herokuapp.com/dropdown");
        Select select = new Select(driver.findElement(By.id("dropdown")));
        List <WebElement> elements = select.getOptions();
        Assert.assertTrue(elements.get (0).isDisplayed(), "Наличие первого элемента dropdown" );
        Assert.assertTrue(elements.get (1).isDisplayed(), "Наличие второго элемента dropdown" );
        Assert.assertTrue(elements.get (2).isDisplayed(), "Наличие третьего элемента dropdown" );

        select.selectByIndex(0);
        Assert.assertEquals(select.getFirstSelectedOption().getText(),"Option", "Название первого элемента dropdown ");

        select.selectByIndex(1);
        Assert.assertEquals(select.getFirstSelectedOption().getText(),"Option 1", "Название второго элемента dropdown ");


    }
}
