import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class DynamicControlsTest extends BaseTest{

    @Test
    public void dynamicControlsTest() {
        driver.get("http://the-internet.herokuapp.com/dynamic_controls");
        WebElement checkbox = driver.findElement(By.xpath("//input"));
        driver.findElement(By.tagName("button")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String message = driver.findElement(By.id("message")).getText();
        assertEquals(message, "It's gone");
        assertEquals(checkbox, "Not defined such element"); //проверить что его нет
        WebElement input = driver.findElement(By.xpath("//input"));



    }
}
