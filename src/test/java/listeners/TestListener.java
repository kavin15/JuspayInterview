package listeners;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import base.Base;
public class TestListener extends Base implements ITestListener
{
	@Override
	public void onTestFailure (ITestResult result) 
	{
		File srcFile =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		try
		{
			FileHandler.copy(srcFile,new File(srcFile,System.getProperty("user.dir")+"\\Screenshot\\sc1Actual.png"));
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
