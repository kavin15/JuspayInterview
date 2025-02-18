package base;
import org.testng.annotations.AfterMethod;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
public class Base 
{
	public static WebDriver driver;

	@BeforeMethod
	public void setup()
	{
		ChromeOptions options = new ChromeOptions(); 
		options.addArguments("--force-device-scale-factor=0.9"); 
		driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
	}
	@AfterMethod
	public void tearDown() 
	{	
		driver.quit();;
	}
}
