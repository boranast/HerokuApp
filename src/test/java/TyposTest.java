import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TyposTest extends BaseTest{

    @Test
    public void typosTest() {
        driver.get("http://the-internet.herokuapp.com/typos");
        String firstElement = driver.findElement(By.tagName("p")).getText();
        assertEquals(firstElement, "Sometimes you'll see a typo, other times you won't.", "Error in text");
        driver.navigate().refresh();
        String secondElement = driver.findElement(By.tagName("p")).getText();
        assertEquals(secondElement, "Sometimes you'll see a typo, other times you won't.", "Error in text");
    }

}
