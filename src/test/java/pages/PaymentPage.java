package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class PaymentPage 
{
	WebDriver driver;
	
	@FindBy(xpath="//span[text()='CONTINUE']")
	private WebElement continueButton;

	@FindBy(xpath="//div[text()='Credit/Debit / ATM Card']")
	private WebElement cardPaymentOption;

	@FindBy (name= "cardNumber")
	private WebElement cardNumberField;

	@FindBy(name= "expiryDate") 
	private WebElement expiryDateField;

	@FindBy(name= "cvv") 
	private WebElement cvvField;

	@FindBy(xpath="//button[text()='PAY']")
	private WebElement payButton;

	public PaymentPage(WebDriver driver) 
	{
		this.driver=driver; 
		PageFactory.initElements(driver, this);
	}
	public void enterCardDetails(String card_number, String card_exp_month, String card_security_code) 
	{
		cardPaymentOption.click();
		cardNumberField.sendKeys(card_number);
		expiryDateField.sendKeys(card_exp_month);
		cvvField.sendKeys(card_security_code);
	}
	public void continueButtonClick() 
	{
		continueButton.click();
	}
}
