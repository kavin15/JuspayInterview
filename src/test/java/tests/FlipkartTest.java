package tests;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import base.Base;
import pages.CartPage;
import pages.HomePage;
import pages.PaymentPage;
import pages.ProductPage;
@Listeners(listeners.TestListener.class)
public class FlipkartTest extends Base
{
	@Test
	public void testFlipkart() throws InterruptedException
	{
		HomePage homePage = new HomePage(driver); 
		homePage.searchProduct("Mouse");

		ProductPage productPage=new ProductPage(driver);
		productPage.selectFirstProduct();
		productPage.addToCart();

		CartPage cartPage=new CartPage(driver);
		cartPage.placeOrder();

		PaymentPage paymentPage=new PaymentPage(driver);
		paymentPage.continueButtonClick();
		paymentPage.enterCardDetails("42424242424242", "09/25", "123");
	}
}
