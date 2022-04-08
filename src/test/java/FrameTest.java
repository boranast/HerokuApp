import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FrameTest extends  BaseTest{
    @Test
    public void iframe() {
        driver.get("");
        driver.switchTo().frame("mce_0_ifr");
        driver.findElement(By.tagName("p")).getText();
        driver.switchTo().defaultContent();
        Alert alert = driver.switchTo().alert();
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.id("mce_0_ifr")));
    }
}
