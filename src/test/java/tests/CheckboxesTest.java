package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class CheckboxesTest extends BaseTest {

    @Test
    public void checkboxesTest() {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        List<WebElement> checkBoxesTest = driver.findElements(By.cssSelector("div#content input[type=checkbox]"));
        Assert.assertFalse(checkBoxesTest.get(0).isSelected(), "Проверка,что первый чекбокс unchecked");

        checkBoxesTest.get(0).click();
        Assert.assertTrue(checkBoxesTest.get(0).isSelected(), "Проверка,что первый чекбокс checked");

        Assert.assertTrue(checkBoxesTest.get(1).isSelected(), "Проверка,что второй чекбокс checked");

        checkBoxesTest.get(1).click();
        Assert.assertFalse(checkBoxesTest.get(1).isSelected(), "Проверка,что второй чекбокс unchecked");
    }
}
