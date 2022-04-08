import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class CheckboxesTest extends BaseTest{

    @Test
    public void checboxes() {
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        boolean checkbox1 = driver.findElements(By.cssSelector("[type=checkbox]")).get(0).isSelected();
        assertFalse(checkbox1, "checkbox 1 is checked");
        driver.findElements(By.cssSelector("[type=checkbox]")).get(0).click();
        checkbox1 = driver.findElements(By.cssSelector("[type=checkbox]")).get(0).isSelected();
        assertTrue(checkbox1, "checkbox 1 isnt checked");
        boolean checkbox2 = driver.findElements(By.cssSelector("[type=checkbox]")).get(1).isSelected();
        assertTrue(checkbox2, "checkbox 2 isnt selected");
        driver.findElements(By.cssSelector("[type=checkbox]")).get(1).click();
        checkbox2 = driver.findElements(By.cssSelector("[type=checkbox]")).get(1).isSelected();
        assertFalse(checkbox2, "checkbox 2 is checked");
    }
}