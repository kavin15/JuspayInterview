package listeners;
import org.testng.ITestListener;
import org.testng.ITestResult;
import base.Base;
import utils.Utility;
public class TestListener extends Base implements ITestListener
{
	@Override
	public void onTestFailure (ITestResult result) 
	{
		Utility.captureScreenshot(driver, result.getName());
	}
}
