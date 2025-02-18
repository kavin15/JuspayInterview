package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage 
{
	WebDriver driver;

	@FindBy(xpath = "//span[text()='Place Order']")
	private WebElement placeOrderButton;

	public CartPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void placeOrder() 
	{
		placeOrderButton.click();
	}
}

