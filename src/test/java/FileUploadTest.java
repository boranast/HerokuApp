import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.File;

import static org.testng.Assert.assertEquals;

public class FileUploadTest extends BaseTest{

    @Test
    public void fileUploadTest() {
        driver.get("http://the-internet.herokuapp.com/upload");
        File file = new File("src/test/Picture/pic.jpg");
        driver.findElement(By.id("file-upload")).sendKeys(file.getAbsolutePath());
        driver.findElement(By.className("button")).click();
        String uploadedFile = driver.findElement(By.id("uploaded-files")).getText();
        assertEquals(uploadedFile, "pic.jpg");
    }
}
