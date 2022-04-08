import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class ContextMenuTest extends BaseTest{

    @Test
    public void contextMenuTest() {
        driver.get("http://the-internet.herokuapp.com/context_menu");
        Actions actions = new Actions(driver);
        WebElement elementLocator = driver.findElement(By.id("hot-spot"));
        actions.contextClick(elementLocator).perform();
        String alert = driver.findElement(By.xpath("//*[@id=\"content\"]/script")).getText();
        assertEquals(alert, "You selected a context menu");
        driver.findElement(By.xpath("//*[@id=\"content\"]/script")).click();


    }
}
