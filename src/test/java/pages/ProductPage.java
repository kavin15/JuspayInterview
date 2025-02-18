package pages;
//import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
public class ProductPage 
{
	WebDriver driver;

	@FindBy(xpath="(//a[@target='_blank'])[position()=1]") 
	private WebElement firstProduct;

	@FindBy(xpath="//button[text()='Add to cart']")
	private WebElement addToCartButton;

	public ProductPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void selectFirstProduct() 
	{
		firstProduct.click();
		Set<String> allWindows =driver.getWindowHandles();
		for(String window:allWindows)
		{
			driver.switchTo().window(window);
		}
	}
	public void addToCart() throws InterruptedException 
	{
		Actions a1=new Actions(driver);
		Thread.sleep(3000);
		a1.moveToElement(addToCartButton).perform();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement button = wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
		addToCartButton.click();
	}
}
