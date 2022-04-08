import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;


public class InputsTest extends BaseTest{

        @Test
        public void inputsTest() {
                driver.get("http://the-internet.herokuapp.com/inputs");
                WebElement input = driver.findElement(By.tagName("input"));
                input.sendKeys("19");
                String value = input.getAttribute("value");
                input.sendKeys(Keys.ARROW_DOWN);
                assertEquals(value, "18");
                input.sendKeys(Keys.ARROW_UP);
                assertEquals(value, "19");
                input.clear();
                input.sendKeys("qwerty");
                assertEquals(value, null);

        }
}
