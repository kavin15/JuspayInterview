package utils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
public class Utility 
{
    public static void captureScreenshot(WebDriver driver, String testName) 
    {
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try 
        {
            FileUtils.copyFile(screenshot, new File("./screenshots/" + testName + ".png"));
        } catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}

