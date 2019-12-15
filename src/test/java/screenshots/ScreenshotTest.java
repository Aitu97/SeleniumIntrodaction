package screenshots;

import com.techtorial.utils.DriverUtil;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ScreenshotTest {


    WebDriver driver;
    @BeforeClass
    public void setup(){
        driver = DriverUtil.driverSetup("chrome");
    }
    @Test
    public void screenshotTest(){
        driver.get("https://google.com");
        WebElement element = driver.findElement(By.id("asldfkadfj"));
        System.out.println(element.getText());
    }

    @AfterMethod
    public void tearDown(ITestResult result) throws IOException {
        if( result.getStatus() == ITestResult.FAILURE){

            long timestamp = System.currentTimeMillis();

            //(TakesScreenshot)driver is casting, it is coming from selenium
            //
            //.getScreenshotAs is taking screenshot
            //
            File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(srcFile, new File("src/test/java/screenshots/" + timestamp + ".jpg"));
        }

        driver.close();
    }
}
