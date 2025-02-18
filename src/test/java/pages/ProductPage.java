package pages;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class ProductPage 
{
	WebDriver driver;

	@FindBy(xpath="//a[@class='wjcEIp'][contains(text(),'Arctic Fox Breathing Lights ')]") 
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
		List<String> l=new ArrayList<String>(allWindows);
		driver.switchTo().window(l.get(1));
	}
	public void addToCart() throws InterruptedException 
	{
		Thread.sleep(3000);
		addToCartButton.click();
	}
}
