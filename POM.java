package Framework;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class POM extends BaseClassFRM{

	static SoftAssert sa;

	@FindBy(id = "loginBtn")
	public static WebElement LogButton;

	@FindBy(id = "Email")
	public static WebElement Username;

	@FindBy(id = "Password")
	public static WebElement Password;

	@FindBy(id = "Login")
	public static WebElement LoginButton;

	@FindBy(xpath = "(//button[@type='button'])[1]")
	public WebElement settings;

	@FindBy(xpath = "//li[text()='Logout']")
	public WebElement logoutbuton;

	@FindBy(id = "mensProd")
	public WebElement menmodule;

	@FindBy(xpath = "(//a[@aria-current='page'])[2]")
	public WebElement menlink;

	@FindBy(xpath = "(//img)[1]")
	public WebElement shoppersstackicon; 

	@FindBy(xpath = "//a[@aria-current='page']")
	public WebElement tshirtelement;

	@FindBy(xpath = "//a[text()='men shirt']")
	public WebElement shirtelement;

	@FindBy(xpath = "//a[text()='Sweatshirt']")
	public WebElement sweatshirt;

	@FindBy(xpath = "//a[text()='Sweaters']")
	public WebElement sweaters;

	@FindBy(xpath = "//a[text()='Jackets']")
	public WebElement jackets;

	@FindBy(xpath = "//a[text()='Blazers&Coats']")
	public WebElement blazers;

	@FindBy(xpath = "//a[text()='Kurtas & kurta Sets']")
	public WebElement kurtas;

	@FindBy(xpath = "//a[text()='Sherwanis']")
	public WebElement sherwanis;

	@FindBy(xpath = "//a[text()='Nehru Jakets']")
	public WebElement nehrujakets;

	@FindBy(xpath = "//a[text()='Dhotis']")
	public WebElement Dhotis;

	@FindBy(xpath = "//a[text()='Jeans']")
	public WebElement jeans;

	@FindBy(xpath = "//a[text()='Trousers']")
	public WebElement trousers;

	@FindBy(xpath = "//a[text()='Shorts']")
	public WebElement shorts;

	@FindBy(xpath = "//a[text()='Tracks Pants & Joggers']")
	public WebElement trackspantsjoggers;

	@FindBy(xpath = "//div[@class='featuredProducts_footerRight__Qlwal']/*[2]")
	public WebElement likebutton1;

	@FindBy(xpath = "//div[@class='featuredProducts_footerRight__Qlwal']/button")
	public WebElement addtocartbutton;

	@FindBy(xpath = "(//div[@data-aos-offset='200'])[1]")
	public WebElement firstproduct;

	@FindBy(id = "compare")
	public WebElement compareicon;

	@FindBy(id = "cartIcon")
	public WebElement carticon;

	@FindBy(xpath = "(//input[@type='text'])[1]")
	public WebElement checkaddress;

	@FindBy(id = "Check")
	public WebElement checkbutton;

	@FindBy(xpath = "//p[text()='Deliverable']")
	public WebElement deliverabletext;

	@FindBy(xpath = "//a[text()='Check deliverable pins.']")
	public WebElement notdeliverable;

	@FindBy(xpath = "//a[text()='Check deliverable pins.']")
	public WebElement checkdeliverablebutton;

	@FindBy(id = "Buy Now")
	public WebElement buynowbutton;

	@FindBy(xpath = "//h3[text()='Select a delivery address']")
	public WebElement selectdeliveryaddress;

	@FindBy(xpath = "(//label[@class='selectaddress_addname__Rb+hg'])[1]")
	public WebElement invalidaddress;

	@FindBy(xpath = "(//label[@class='selectaddress_addname__Rb+hg'])[2]")
	public WebElement validaddress;

	@FindBy(xpath = "//button[text()='Proceed']")
	public WebElement proceedbutton;

	@FindBy(xpath = "//div[text()='Please select address to be delivered. Order not deliverable at this pincode']")
	public WebElement popupsdisplay;

	@FindBy(xpath = "//h1[text()='Select a payment method']")
	public WebElement paymentsection;

	@FindBy(xpath = "//button[text()='Add Card']")
	public WebElement addcardbutton;

	@FindBy(xpath = "(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng'])[1]")
	public WebElement cardholdername;

	@FindBy(xpath = "(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng'])[2]")
	public WebElement cardnumber;

	@FindBy(xpath = "(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng'])[3]")
	public WebElement pinnumber;

	@FindBy(xpath = "(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng'])[4]")
	public WebElement expirymonth;

	@FindBy(xpath = "(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng'])[5]")
	public WebElement expiryyear;

	@FindBy(xpath = "(//input[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-1o6z5ng'])[6]")
	public WebElement cvvnumber;

	@FindBy(xpath = "//span[text()='Debit']")
	public WebElement debitbutton;
	
	@FindBy(xpath = "//span[text()='Credit']")
	public WebElement creditbutton;

	@FindBy(xpath = "//button[text()='Add']")
	public WebElement addbutton;

	@FindBy(xpath = "//div[text()='Created']")
	public WebElement createdpopup;

	@FindBy(xpath = "(//button[text()='Remove Card'])[1]")
	public WebElement removecard;

	@FindBy(xpath = "//div[text()='Data Deleted']")
	public WebElement deletepopup;

	@FindBy(xpath = "//span[text()='Net Banking']")
	public WebElement netbanking;

	@FindBy(xpath = "//button[text()='Clear Selection']")
	public WebElement clearsectionbutton;
	
	@FindBy(xpath = "//span[text()='Cash On Delivery (COD)']")
	public WebElement cashondeliverybutton;
	
	@FindBy(xpath = "//div[text()='Created']")
	public WebElement ordercreatedpopup;
	
	@FindBy(xpath = "(//button[text()='add to cart'or text()='added'])[1]")
	public WebElement firstproductaddtocart;
	
	@FindBy(xpath = "//div[@class='placeorder_checkoutcard__3aHBA']/h1")
	public WebElement orderconfirmed;
	

	static int productscount=18;

	public void invalidlog() throws InterruptedException, IOException {

		Thread.sleep(5000);
		settings.click();
		logoutbuton.click();
		LogButton.click();
		Username.sendKeys(un);
		Password.sendKeys(invalid);
		LoginButton.click();

		String Expected="ShoppersStack | Login";
		String Actual = sabash.getTitle();

		if (Expected==Actual) {
			Reporter.log("MN_002--->User is Able to Login",true);
		} else {
			Reporter.log("MN_002--->User is Not Able to Login",true);
		}

		SoftAssert sa = new SoftAssert();
		sa.assertEquals(Actual, Expected);
		sa.assertAll();
		Thread.sleep(4000);
		sabash.findElement(By.id("Email")).sendKeys(un);
		sabash.findElement(By.id("Password")).sendKeys(pass);
		sabash.findElement(By.id("Login")).click();
	}

	public void Menmodule() throws InterruptedException {

		Thread.sleep(7000);
		menmodule.click();
		Thread.sleep(7000);

		if(menlink.isDisplayed()) {

			Reporter.log("MN_003--->User is Able to navigate to Men Module",true);
		}
		else {
			Reporter.log("MN_003--->User is Not Able to navigate to Men Module",true);
		}
		Thread.sleep(4000);
		shoppersstackicon.click();
	}

	public void Menmodule1() throws InterruptedException {

		Thread.sleep(4000);
		menmodule.click();
		List<WebElement> image = sabash.findElements(By.xpath("//div[@class='featuredProducts_cardBody__gWfky']"));
		int imagecount = image.size();

		if (imagecount==18) {
			Reporter.log("MN_004---> all the product are visible",true);
		}else {
			Reporter.log("MN_004---> all the product are not visible",true);
		}
		shoppersstackicon.click();
	}

	public void Tshirt() throws InterruptedException {

		Thread.sleep(3000);
		sabash.findElement(By.xpath("(//a[@href='/men'])[1]")).click();
		Thread.sleep(3000);
		sabash.findElement(By.xpath("(//a[@href='/sub-category/men-tshirt'])")).click();
		Thread.sleep(3000);
		if(tshirtelement.isDisplayed()) {

			Reporter.log("MN_005--->User is Able to navigate to T-SHIRTS",true);
		}
		else {
			Reporter.log("MN_005--->User is Not Able to navigate to T-SHIRTS",true);
		}
		Thread.sleep(4000);
		shoppersstackicon.click();

	}

	public void Shirt() throws InterruptedException {

		Thread.sleep(3000);
		sabash.findElement(By.xpath("(//a[@href='/men'])[1]")).click();
		Thread.sleep(3000);
		sabash.findElement(By.xpath("(//a[@href='/sub-category/men-shirt'])")).click();
		Thread.sleep(3000);
		if(shirtelement.isDisplayed()) {

			Reporter.log("MN_006--->User is Able to navigate to SHIRTS",true);
		}
		else {
			Reporter.log("MN_006--->User is Not Able to navigate to SHIRTS",true);
		}
		Thread.sleep(4000);
		shoppersstackicon.click();
	}

	public void sweatshirt() throws InterruptedException {

		Thread.sleep(3000);
		sabash.findElement(By.xpath("(//a[@href='/men'])[1]")).click();
		Thread.sleep(3000);
		sabash.findElement(By.xpath("//a[@href='/sub-category/men-sweatshirt']")).click();
		Thread.sleep(3000);
		if(sweatshirt.isDisplayed()) {

			Reporter.log("MN_007--->User is Able to navigate to Sweat shirt",true);
		}
		else {
			Reporter.log("MN_007--->User is Not Able to navigate to Sweat shirt",true);
		}
		Thread.sleep(4000);
		shoppersstackicon.click();
	}

	public void sweater() throws InterruptedException {

		Thread.sleep(3000);
		sabash.findElement(By.xpath("(//a[@href='/men'])[1]")).click();
		Thread.sleep(3000);
		sabash.findElement(By.xpath("//a[@href='/sub-category/men-sweater']")).click();
		Thread.sleep(3000);
		if(sweaters.isDisplayed()) {

			Reporter.log("MN_008--->User is Able to navigate to Sweater",true);
		}
		else {
			Reporter.log("MN_008--->User is Not Able to navigate to Sweater",true);
		}
		Thread.sleep(4000);
		shoppersstackicon.click();
	}

	public void jackets() throws InterruptedException {

		Thread.sleep(3000);
		sabash.findElement(By.xpath("(//a[@href='/men'])[1]")).click();
		Thread.sleep(3000);
		sabash.findElement(By.xpath("(//a[@href='/sub-category/men-jacket'])")).click();
		Thread.sleep(3000);
		if(jackets.isDisplayed()) {

			Reporter.log("MN_009--->User is Able to navigate to Jackets",true);
		}
		else {
			Reporter.log("MN_009--->User is Not Able to navigate to Jackets",true);
		}
		Thread.sleep(4000);
		shoppersstackicon.click();
	}

	public void blazerscoats() throws InterruptedException {

		Thread.sleep(3000);
		sabash.findElement(By.xpath("(//a[@href='/men'])[1]")).click();
		Thread.sleep(3000);
		sabash.findElement(By.xpath("(//a[@href='/sub-category/men-blazer-coat'])")).click();
		Thread.sleep(3000);
		if(blazers.isDisplayed()) {

			Reporter.log("MN_010--->User is Able to navigate to Blazerscoats",true);
		}
		else {
			Reporter.log("MN_010--->User is Not Able to navigate to Blazerscoats",true);
		}
		Thread.sleep(4000);
		shoppersstackicon.click();
	}

	public void kurtaskurtasets() throws InterruptedException {

		Thread.sleep(3000);
		sabash.findElement(By.xpath("(//a[@href='/men'])[1]")).click();
		Thread.sleep(3000);
		sabash.findElement(By.xpath("(//a[@href='/sub-category/men-kurta'])")).click();
		Thread.sleep(3000);
		if(kurtas.isDisplayed()) {

			Reporter.log("MN_011--->User is Able to navigate to kurta",true);
		}
		else {
			Reporter.log("MN_011--->User is Not Able to navigate to kurta",true);
		}
		Thread.sleep(4000);
		shoppersstackicon.click();
	}

	public void sherwanis() throws InterruptedException {

		Thread.sleep(3000);
		sabash.findElement(By.xpath("(//a[@href='/men'])[1]")).click();
		Thread.sleep(3000);
		sabash.findElement(By.xpath("(//a[@href='/sub-category/men-nehru-jacket'])")).click();
		Thread.sleep(3000);
		if(sherwanis.isDisplayed()) {

			Reporter.log("MN_012--->User is Able to navigate to Sherwanis",true);
		}
		else {
			Reporter.log("MN_012--->User is Not Able to navigate to Sherwanis",true);
		}
		Thread.sleep(4000);
		shoppersstackicon.click();
	}

	public void nehrujakets() throws InterruptedException {

		Thread.sleep(3000);
		sabash.findElement(By.xpath("(//a[@href='/men'])[1]")).click();
		Thread.sleep(3000);
		sabash.findElement(By.xpath("(//a[@href='/sub-category/men-dhoti'])")).click();
		Thread.sleep(3000);
		if(nehrujakets.isDisplayed()) {

			Reporter.log("MN_013--->User is Able to navigate to Nehrujakets",true);
		}
		else {
			Reporter.log("MN_013--->User is Not Able to navigate to Nehrujakets",true);
		}
		Thread.sleep(4000);
		shoppersstackicon.click();
	}

	public void dhotis() throws InterruptedException {

		Thread.sleep(3000);
		sabash.findElement(By.xpath("(//a[@href='/men'])[1]")).click();
		Thread.sleep(3000);
		sabash.findElement(By.xpath("(//a[@href='/sub-category/men-jeans'])")).click();
		Thread.sleep(3000);
		if(Dhotis.isDisplayed()) {

			Reporter.log("MN_014--->User is Able to navigate to Dhotis",true);
		}
		else {
			Reporter.log("MN_014--->User is Not Able to navigate to Dhotis",true);
		}
		Thread.sleep(4000);
		shoppersstackicon.click();
	}

	public void jeans() throws InterruptedException {

		Thread.sleep(3000);
		sabash.findElement(By.xpath("(//a[@href='/men'])[1]")).click();
		Thread.sleep(3000);
		sabash.findElement(By.xpath("(//a[@href='/sub-category/men-trouser'])")).click();
		Thread.sleep(3000);
		if(jeans.isDisplayed()) {

			Reporter.log("MN_015--->User is Able to navigate to Jeans",true);
		}
		else {
			Reporter.log("MN_015--->User is Not Able to navigate to Jeans",true);
		}
		Thread.sleep(4000);
		shoppersstackicon.click();
	}

	public void trousers() throws InterruptedException {

		Thread.sleep(3000);
		sabash.findElement(By.xpath("(//a[@href='/men'])[1]")).click();
		Thread.sleep(3000);
		sabash.findElement(By.xpath("(//a[@href='/sub-category/men-short'])")).click();
		Thread.sleep(3000);
		if(trousers.isDisplayed()) {

			Reporter.log("MN_016--->User is Able to navigate to Trousers",true);
		}
		else {
			Reporter.log("MN_016--->User is Not Able to navigate to Trousers",true);
		}
		Thread.sleep(4000);
		shoppersstackicon.click();
	}

	public void shorts() throws InterruptedException {

		Thread.sleep(3000);
		sabash.findElement(By.xpath("(//a[@href='/men'])[1]")).click();
		Thread.sleep(3000);
		sabash.findElement(By.xpath("(//a[@href='/sub-category/men-jogger-track-pant'])")).click();
		Thread.sleep(3000);
		if(shorts.isDisplayed()) {

			Reporter.log("MN_017--->User is Able to navigate to Shorts",true);
		}
		else {
			Reporter.log("MN_017--->User is Not Able to navigate to Shorts",true);
		}
		Thread.sleep(4000);
		shoppersstackicon.click();
	}

	public void trackspantsjoggers() throws InterruptedException {

		Thread.sleep(3000);
		sabash.findElement(By.xpath("(//a[@href='/men'])[1]")).click();
		Thread.sleep(3000);
		sabash.findElement(By.xpath("(//a[@href='/sub-category/men-shirt'])")).click();
		Thread.sleep(3000);
		if(trackspantsjoggers.isDisplayed()) {

			Reporter.log("MN_018--->User is Able to navigate to Trackspants Joggers",true);
		}
		else {
			Reporter.log("MN_018--->User is Not Able to navigate to Trackspants Joggers",true);
		}
		Thread.sleep(4000);
		shoppersstackicon.click();
	}

	public void likebuttonverify() throws InterruptedException {

		Thread.sleep(3000);
		menmodule.click();
		Thread.sleep(3000);
		List<WebElement> like = sabash.findElements(By.xpath("//div[@class='featuredProducts_footerRight__Qlwal']/*[2]"));	
		int likecount = like.size();

		if (likecount==17) {
			Reporter.log("MN_019--->User is able to see all the like buttons",true);
		} else {
			Reporter.log("MN_019--->User is not able to see all the like buttons",true);
		}
		Thread.sleep(4000);
		shoppersstackicon.click();
	}
	public void addtocartbuttonverify() throws InterruptedException {

		Thread.sleep(3000);
		menmodule.click();
		Thread.sleep(3000);
		List<WebElement> addtocart = sabash.findElements(By.xpath("//div[@class='featuredProducts_footerRight__Qlwal']/button"));	
		int addtocartcount = addtocart.size();

		if (addtocartcount==18) {
			Reporter.log("MN_020--->User is able to see all the Add to Cart buttons",true);
		} else {
			Reporter.log("MN_020--->User is not able to see all the Add to Cart buttons",true);
		}
		Thread.sleep(4000);
		shoppersstackicon.click();
	}

	public void ratingpresent() throws InterruptedException {

		Thread.sleep(3000);
		menmodule.click();
		Thread.sleep(3000);
		List<WebElement> ratings = sabash.findElements(By.xpath("//div[@class='featuredProducts_cardHeader__v5AIX']"));	
		int ratingscount = ratings.size();

		if (ratingscount==18) {
			Reporter.log("MN_021--->User is able to see Ratings for all the products",true);
		} else {
			Reporter.log("MN_021--->User is not able to see Ratings for all the products",true);
		}
		Thread.sleep(4000);
		shoppersstackicon.click();
	}

	public void starverification() throws InterruptedException {

		Thread.sleep(3000);
		menmodule.click();
		Thread.sleep(3000);
		List<WebElement> star = sabash.findElements(By.xpath("//div[@class='star-container']"));	
		int starcount = star.size();

		if (starcount==90) {
			Reporter.log("MN_022--->User is able to verify all the product having 5 star",true);
		} else {
			Reporter.log("MN_022--->User is not able to verify all the product having 5 star",true);
		}
		Thread.sleep(4000);
		shoppersstackicon.click();
	}

	public void decimalvalue() throws InterruptedException {

		Thread.sleep(3000);
		menmodule.click();
		Thread.sleep(3000);
		List<WebElement> decimal = sabash.findElements(By.xpath("//div[@class='featuredProducts_cardHeader__v5AIX']/span"));	
		double decimalcount = decimal.size();

		for (int i = 0; i < decimal.size(); i++) {
			String value = decimal.get(i).getText();
			System.out.println(value);
		}

		if (decimalcount==18) {
			Reporter.log("MN_023--->User is Able to Verify The Ratings in Decimal Value",true);
		} else {
			Reporter.log("MN_023--->User is not Able to Verify The Ratings in Decimal Value",true);
		}
		Thread.sleep(4000);
		shoppersstackicon.click();
	}

	public void pricelist() throws InterruptedException {

		Thread.sleep(3000);
		menmodule.click();
		Thread.sleep(3000);
		List<WebElement> price = sabash.findElements(By.xpath("//p[@class='CalculateOffer_wrapper__R8RZf']/span[1]"));	
		double pricecount = price.size();

		for (int i = 0; i < price.size(); i++) {
			String value1 = price.get(i).getText();
			System.out.println(value1);
		}

		if (pricecount==18) {
			Reporter.log("MN_024--->User is Able to Verify The Price for all the Product",true);
		} else {
			Reporter.log("MN_024--->User is not Able to Verify The Price for all the Product",true);
		}
		Thread.sleep(4000);
		shoppersstackicon.click();
	}

	public void rupees() throws InterruptedException {

		Thread.sleep(3000);
		menmodule.click();
		Thread.sleep(3000);
		List<WebElement> rupees = sabash.findElements(By.xpath("//span[contains(.,'₹')]/../span[1]"));	
		double rupeescount = rupees.size();

		for (int i = 0; i < rupees.size(); i++) {
			String value2 = rupees.get(i).getText();
			System.out.println(value2);
		}

		if (rupeescount==18) {
			Reporter.log("MN_025--->User is Able to see The Price in Rupees",true);
		} else {
			Reporter.log("MN_025--->User is not Able to see The Price in Rupees",true);
		}
		Thread.sleep(4000);
		shoppersstackicon.click();
	}

	public void discount() throws InterruptedException {

		Thread.sleep(3000);
		menmodule.click();
		Thread.sleep(3000);
		List<WebElement> discount = sabash.findElements(By.xpath("//span[contains(.,'₹')]/../span[3]"));	
		int discountcount = discount.size();

		for (int i = 0; i < discount.size(); i++) {
			String value3 = discount.get(i).getText();
			System.out.println(value3);
		}

		if (discountcount==18) {
			Reporter.log("MN_026--->User is Able to see The Discount in All the Product",true);
		} else {
			Reporter.log("MN_026--->User is Not Able to see The Discount in All the Product",true);
		}
		Thread.sleep(4000);
		shoppersstackicon.click();
	}

	public void image() throws InterruptedException {

		Thread.sleep(3000);
		menmodule.click();
		Thread.sleep(3000);
		List<WebElement> image = sabash.findElements(By.xpath("//div[@class='featuredProducts_cardBody__gWfky']/img"));	
		int imagecount = image.size();

		if (imagecount==18) {
			Reporter.log("MN_027--->User is Able to see Picture in all the Module",true);
		} else {
			Reporter.log("MN_027--->User is Not Able to see Picture in all the Module",true);
		}
		Thread.sleep(4000);
		shoppersstackicon.click();
	}

	/*public void clicklike() throws InterruptedException {

		Thread.sleep(3000);
		menmodule.click();
		Thread.sleep(3000);
		List<WebElement> likebutton = sabash.findElements(By.xpath("//div[@class='featuredProducts_footerRight__Qlwal']/*[2]"));	
		int likebuttons = likebutton.size();

	}*/

	public void addtocartbutton() throws InterruptedException {

		Thread.sleep(4000);
		menmodule.click();
		Thread.sleep(4000);
		//JavascriptExecutor jse = (JavascriptExecutor)sabash;
		//jse.executeScript("window.scrollTo(0,2000)");
		//WebDriverWait wait = new WebDriverWait(sabash, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//button[text()='add to cart']")));
		Thread.sleep(6000);
		List<WebElement> addtocart = sabash.findElements(By.xpath("//button[text()='add to cart'or text()='added']"));
		int addbuttcount = addtocart.size();
		String added = "ADDED";
		for (int i = 0; i <= 17; i++) {
			Thread.sleep(5000);
			addtocart.get(i).click();
			Reporter.log("MN_030--->User is Able to Click ADD TO CART Button for all the product",true);
			Thread.sleep(5000);
			String text = addtocart.get(i).getText();
			if (text.contains(added)) {
				Reporter.log("MN_031-->User is Able to see the Button changes from ADD TO CART to ADDED",true);
			} else {
				Reporter.log("MN_031-->User is not Able to see the Button changes from ADD TO CART to ADDED",true);
			}
		}
		//Thread.sleep(5000);
		/*carticon.click();
		Thread.sleep(7000);
		List<WebElement> yes = sabash.findElements(By.xpath("//button[text()='Yes']"));
		int yesss = yes.size();
		List<WebElement> remove = sabash.findElements(By.xpath("//button[text()='Remove from cart']"));
		int removecount = remove.size();
		for (int i = 0; i < removecount; i++) {
			Thread.sleep(2000);
			remove.get(i).click();
			Thread.sleep(4000);
			yes.get(i).click();

		}*/

		Thread.sleep(4000);
		shoppersstackicon.click();
	}

	public void firstproduct() throws InterruptedException {

		
		Thread.sleep(5000);
		menmodule.click();
		Thread.sleep(5000);
		firstproduct.click();
		Thread.sleep(5000);

		String Expected="https://www.shoppersstack.com/products_page/86";
		String Actual=sabash.getCurrentUrl();
		System.out.println(Actual);
		//boolean reviewdiaplay = sabash.findElement(By.xpath("//a[text()='Product Description']")).isDisplayed();
		Thread.sleep(5000);
		if (Expected.contentEquals(Actual)) {
			Reporter.log("MN_032--->User is able to click the firstproduct Product",true);
		} else {
			Reporter.log("MN_032--->User is not able to click the firstproduct Product",true);
		}
		Thread.sleep(5000);
		shoppersstackicon.click();
	}

	public void firstproductback() throws InterruptedException {

		
		Thread.sleep(5000);
		menmodule.click();
		Thread.sleep(5000);
		firstproduct.click();
		Thread.sleep(4000);
		sabash.navigate().back();
		Thread.sleep(5000);
		String Expected="https://www.shoppersstack.com/men";
		Thread.sleep(4000);
		String Actual = sabash.getCurrentUrl();
		Thread.sleep(5000);
		if (Expected.contentEquals(Actual)) {
			Reporter.log("MN_033--->User is able to redirect to the men module",true);
		} else {
			Reporter.log("MN_033--->User is not able to redirect to the men module",true);
		}
		//sa.assertEquals(Actual, Expected);
		//sa.assertAll();
		Thread.sleep(4000);
		shoppersstackicon.click();
	}

	public void review() throws InterruptedException {

		//timeout.implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000);
		menmodule.click();
		Thread.sleep(5000);
		firstproduct.click();
		Thread.sleep(5000);

		int yaxis = sabash.findElement(By.xpath("(//h3)[2]")).getLocation().getY();
		JavascriptExecutor jsa = (JavascriptExecutor)sabash;
		Thread.sleep(4000);
		jsa.executeScript("window.scrollTo(0,"+yaxis+")");
		Thread.sleep(5000);

		List<WebElement> tabs = sabash.findElements(By.xpath("//div[@class='MuiPaper-root MuiPaper-elevation MuiPaper-rounded MuiPaper-elevation1 MuiCard-root ProductDisplay_reviewContainer__RvXGU css-s18byi']"));
		int tabsize = tabs.size();
		Thread.sleep(5000);
		for (int i = 0; i < 5; i++) {
			Thread.sleep(5000);
			boolean display = tabs.get(i).isDisplayed();
			Thread.sleep(4000);
			if (display) {
				Reporter.log("MN_034-->User is Able to see the Review Section",true);
			} else {
				Reporter.log("MN_034-->User is Not Able to see the Review Section",true);
			}
		}
		Thread.sleep(4000);
		shoppersstackicon.click();
	}

	public void compareicon() throws InterruptedException, IOException {

		
		Thread.sleep(5000);
		menmodule.click();
		Thread.sleep(6000);
		firstproduct.click();
		Thread.sleep(5000);
		String parentwindow = sabash.getWindowHandle();
		Thread.sleep(3000);
		compareicon.click();
		Thread.sleep(10000);
		Set<String> wh = sabash.getWindowHandles();
		int count = wh.size();
		System.out.println(count);
		int acount=4;
		if (count==acount) {
			Reporter.log("MN_035-->User is Able to Click the Compare Icon in Description and child window is Displayed",true);
		} else {
			Reporter.log("MN_035-->User is not Able to Click the Compare Icon in Description and child window is Displayed",true);
		}
		Thread.sleep(6000);
		for (String i : wh) {

			String Homewindow = sabash.switchTo().window(i).toString();
			Thread.sleep(5000);
			//System.out.println(Homewindow);
			String text = sabash.getTitle();
			System.out.println(text);
			Thread.sleep(5000);
			if (text.contains("Online Shopping")||text.contains("Electronics")) {
				Thread.sleep(2000);
				sabash.close();
				Reporter.log("MN_036-->User is Able to Close the Child Window",true);

			}
		}
		sabash.switchTo().window(parentwindow);
		Thread.sleep(4000);
		shoppersstackicon.click();
	}

	public void validpin() throws InterruptedException {
		Thread.sleep(4000);
		menmodule.click();
		Thread.sleep(5000);
		firstproduct.click();
		Thread.sleep(5000);

		checkaddress.sendKeys("560010");
		Thread.sleep(3000);
		checkbutton.click();
		Thread.sleep(3000);

		if (deliverabletext.isDisplayed()) {
			Reporter.log("MN_037-->User is able to get Deliverable msg",true);
		} else {
			Reporter.log("MN_037-->User is not able to get Deliverable msg",true);
		}

		Thread.sleep(4000);
		shoppersstackicon.click();
	}

	public void invalidpin() throws InterruptedException {
		Thread.sleep(3000);
		menmodule.click();
		Thread.sleep(3000);
		firstproduct.click();
		Thread.sleep(5000);

		checkaddress.sendKeys("600016");
		Thread.sleep(3000);
		checkbutton.click();
		Thread.sleep(3000);
		checkaddress.clear();
		Thread.sleep(5000);
		if (notdeliverable.isDisplayed()) {
			Reporter.log("MN_038-->User is able to get Not Deliverable msg",true);
		} else {
			Reporter.log("MN_038-->User is not able to get Not Deliverable msg",true);
		}

		Thread.sleep(4000);
		shoppersstackicon.click();
	}

	public void checkdeliverablepin() throws InterruptedException {

		Thread.sleep(3000);
		menmodule.click();
		Thread.sleep(3000);
		firstproduct.click();
		Thread.sleep(5000);

		checkaddress.sendKeys("600016");
		Thread.sleep(3000);
		checkbutton.click();
		Thread.sleep(3000);

		if (checkdeliverablebutton.isDisplayed()) {
			Reporter.log("MN_039-->User is getting Check deliverable pins Sugession",true);
		} else {
			Reporter.log("MN_039-->User is Not getting Check deliverable pins Sugession",true);
		}

		Thread.sleep(4000);
		shoppersstackicon.click();
	}

	public void deliverablepinsection() throws InterruptedException {

		Thread.sleep(3000);
		menmodule.click();
		Thread.sleep(3000);
		firstproduct.click();
		Thread.sleep(5000);

		checkaddress.sendKeys("600016");
		Thread.sleep(3000);
		checkbutton.click();
		Thread.sleep(4000);
		checkdeliverablebutton.click();
		Thread.sleep(4000);

		String Expected="https://www.shoppersstack.com/help";
		String Actual=sabash.getCurrentUrl();

		if (Actual==Expected) {
			Reporter.log("MN_040-->User is able to Redirect to the Deliverable pin Section",true);
		} else {
			Reporter.log("MN_040-->User is Not able to Redirect to the Deliverable pin Section",true);
		}
		Thread.sleep(4000);
		shoppersstackicon.click();
	}

	public void buynow() throws InterruptedException {

		Thread.sleep(3000);
		menmodule.click();
		Thread.sleep(3000);
		firstproduct.click();
		Thread.sleep(5000);

		buynowbutton.click();
		Thread.sleep(5000);

		String Expected="https://www.shoppersstack.com/selectaddress";
		String Actual=sabash.getCurrentUrl();

		if (Actual==Expected) {
			Reporter.log("MN_041-->User is Able to Click BUY NOW Button",true);
		} else {
			Reporter.log("MN_041-->User is not Able to Click BUY NOW Button",true);
		}
		Thread.sleep(4000);
		shoppersstackicon.click();		
	}

	public void addresssection() throws InterruptedException {

		Thread.sleep(3000);
		menmodule.click();
		Thread.sleep(4000);
		firstproduct.click();
		Thread.sleep(4000);

		buynowbutton.click();
		Thread.sleep(5000);

		if (selectdeliveryaddress.isDisplayed()) {
			Reporter.log("MN_042-->User is able to navigate to address page",true);
		} else {
			Reporter.log("MN_042-->User is not able to navigate to address page",true);
		}
		Thread.sleep(4000);
		shoppersstackicon.click();		
	}

	public void invalidaddress() throws InterruptedException {

		Thread.sleep(3000);
		menmodule.click();
		Thread.sleep(3000);
		firstproduct.click();
		Thread.sleep(4000);

		buynowbutton.click();
		Thread.sleep(4000);

		invalidaddress.click();
		Thread.sleep(4000);
		proceedbutton.click();
		Thread.sleep(2000);

		if (popupsdisplay.isDisplayed()) {
			Reporter.log("MN_043-->User is getting a popuo of Please select address to be delivered. Order not deliverable at this pincode",true);
		} else {
			Reporter.log("MN_043-->User is not getting a popuo of Please select address to be delivered. Order not deliverable at this pincode",true);
		}
		Thread.sleep(4000);
		shoppersstackicon.click();

	}

	public void validaddress() throws InterruptedException {

		Thread.sleep(3000);
		menmodule.click();
		Thread.sleep(3000);
		firstproduct.click();
		Thread.sleep(4000);

		buynowbutton.click();
		Thread.sleep(4000);

		validaddress.click();
		Thread.sleep(4000);
		proceedbutton.click();
		Thread.sleep(2000);

		if (paymentsection.isDisplayed()) {
			Reporter.log("MN_044-->User is able to Navigate to Payment Method Page",true);
		} else {
			Reporter.log("MN_044-->User is Not able to Navigate to Payment Method Page",true);
		}
		Thread.sleep(6000);
		shoppersstackicon.click();
	}

	public void addcarddebit1() throws InterruptedException {

		Thread.sleep(3000);
		menmodule.click();
		Thread.sleep(3000);
		firstproduct.click();
		Thread.sleep(4000);

		buynowbutton.click();
		Thread.sleep(4000);

		validaddress.click();
		Thread.sleep(4000);
		proceedbutton.click();
		Thread.sleep(2000);

		addcardbutton.click();
		Thread.sleep(3000);
		cardholdername.sendKeys("Sabash");
		Thread.sleep(3000);

		cardnumber.sendKeys("1033209401903218");
		Thread.sleep(3000);

		pinnumber.sendKeys("5990");
		Thread.sleep(3000);

		expirymonth.sendKeys("5");
		Thread.sleep(3000);

		expiryyear.sendKeys("28");
		Thread.sleep(3000);

		cvvnumber.sendKeys("507");
		Thread.sleep(3000);

		debitbutton.click();
		Thread.sleep(4000);

		addbutton.click();
		Thread.sleep(3000);

		if (createdpopup.isDisplayed()) {
			Reporter.log("MN_045-->User is able to add Card",true);
		} else {
			Reporter.log("MN_045-->User is Not able to add Card",true);
		}
		Thread.sleep(4000);
		shoppersstackicon.click();
	}
	
	public void addcarddebit2() throws InterruptedException {

		Thread.sleep(3000);
		menmodule.click();
		Thread.sleep(3000);
		firstproduct.click();
		Thread.sleep(4000);

		buynowbutton.click();
		Thread.sleep(4000);

		validaddress.click();
		Thread.sleep(4000);
		proceedbutton.click();
		Thread.sleep(2000);

		addcardbutton.click();
		Thread.sleep(3000);
		cardholdername.sendKeys("Sabash");
		Thread.sleep(3000);

		cardnumber.sendKeys("3014401191608739");
		Thread.sleep(3000);

		pinnumber.sendKeys("2585");
		Thread.sleep(3000);

		expirymonth.sendKeys("6");
		Thread.sleep(3000);

		expiryyear.sendKeys("28");
		Thread.sleep(3000);

		cvvnumber.sendKeys("540");
		Thread.sleep(3000);

		debitbutton.click();
		Thread.sleep(4000);

		addbutton.click();
		Thread.sleep(3000);

		if (createdpopup.isDisplayed()) {
			Reporter.log("MN_046-->User is able to add Debit Card",true);
		} else {
			Reporter.log("MN_046-->User is Not able to add Debit Card",true);
		}
		Thread.sleep(4000);
		shoppersstackicon.click();
	}
	
	public void addcarddebit3() throws InterruptedException {

		Thread.sleep(3000);
		menmodule.click();
		Thread.sleep(3000);
		firstproduct.click();
		Thread.sleep(4000);

		buynowbutton.click();
		Thread.sleep(4000);

		validaddress.click();
		Thread.sleep(4000);
		proceedbutton.click();
		Thread.sleep(2000);

		addcardbutton.click();
		Thread.sleep(3000);
		cardholdername.sendKeys("Sabash");
		Thread.sleep(3000);

		cardnumber.sendKeys("5014401191607695");
		Thread.sleep(3000);

		pinnumber.sendKeys("2590");
		Thread.sleep(3000);

		expirymonth.sendKeys("6");
		Thread.sleep(3000);

		expiryyear.sendKeys("28");
		Thread.sleep(3000);

		cvvnumber.sendKeys("715");
		Thread.sleep(3000);

		debitbutton.click();
		Thread.sleep(4000);

		addbutton.click();
		Thread.sleep(3000);

		if (createdpopup.isDisplayed()) {
			Reporter.log("MN_047-->User is able to add Debit Card",true);
		} else {
			Reporter.log("MN_047-->User is Not able to add Debit Card",true);
		}
		Thread.sleep(4000);
		shoppersstackicon.click();
	}
	
	public void addcardcredit1() throws InterruptedException {

		Thread.sleep(3000);
		menmodule.click();
		Thread.sleep(3000);
		firstproduct.click();
		Thread.sleep(4000);

		buynowbutton.click();
		Thread.sleep(4000);

		validaddress.click();
		Thread.sleep(4000);
		proceedbutton.click();
		Thread.sleep(2000);

		addcardbutton.click();
		Thread.sleep(3000);
		cardholdername.sendKeys("Sabash");
		Thread.sleep(3000);

		cardnumber.sendKeys("3014401191608740");
		Thread.sleep(3000);

		pinnumber.sendKeys("7099");
		Thread.sleep(3000);

		expirymonth.sendKeys("6");
		Thread.sleep(3000);

		expiryyear.sendKeys("28");
		Thread.sleep(3000);

		cvvnumber.sendKeys("782");
		Thread.sleep(3000);

		creditbutton.click();
		Thread.sleep(4000);

		addbutton.click();
		Thread.sleep(3000);

		if (createdpopup.isDisplayed()) {
			Reporter.log("MN_048-->User is able to add Credit Card",true);
		} else {
			Reporter.log("MN_048-->User is Not able to add Credit Card",true);
		}
		Thread.sleep(4000);
		shoppersstackicon.click();
	}
	
	public void addcardcredit2() throws InterruptedException {

		Thread.sleep(3000);
		menmodule.click();
		Thread.sleep(3000);
		firstproduct.click();
		Thread.sleep(4000);

		buynowbutton.click();
		Thread.sleep(4000);

		validaddress.click();
		Thread.sleep(4000);
		proceedbutton.click();
		Thread.sleep(2000);

		addcardbutton.click();
		Thread.sleep(3000);
		cardholdername.sendKeys("Sabash");
		Thread.sleep(3000);

		cardnumber.sendKeys("1033209401904197");
		Thread.sleep(3000);

		pinnumber.sendKeys("2748");
		Thread.sleep(3000);

		expirymonth.sendKeys("6");
		Thread.sleep(3000);

		expiryyear.sendKeys("28");
		Thread.sleep(3000);

		cvvnumber.sendKeys("408");
		Thread.sleep(3000);

		creditbutton.click();
		Thread.sleep(4000);

		addbutton.click();
		Thread.sleep(3000);

		if (createdpopup.isDisplayed()) {
			Reporter.log("MN_049-->User is able to add Credit Card",true);
		} else {
			Reporter.log("MN_049-->User is Not able to add Credit Card",true);
		}
		Thread.sleep(4000);
		shoppersstackicon.click();
	}
	
	public void addcardcredit3() throws InterruptedException {

		Thread.sleep(3000);
		menmodule.click();
		Thread.sleep(3000);
		firstproduct.click();
		Thread.sleep(4000);

		buynowbutton.click();
		Thread.sleep(4000);

		validaddress.click();
		Thread.sleep(4000);
		proceedbutton.click();
		Thread.sleep(2000);

		addcardbutton.click();
		Thread.sleep(3000);
		cardholdername.sendKeys("Sabash");
		Thread.sleep(3000);

		cardnumber.sendKeys("5014401191607696");
		Thread.sleep(3000);

		pinnumber.sendKeys("5228");
		Thread.sleep(3000);

		expirymonth.sendKeys("6");
		Thread.sleep(3000);

		expiryyear.sendKeys("28");
		Thread.sleep(3000);

		cvvnumber.sendKeys("580");
		Thread.sleep(3000);

		creditbutton.click();
		Thread.sleep(4000);

		addbutton.click();
		Thread.sleep(3000);

		if (createdpopup.isDisplayed()) {
			Reporter.log("MN_050-->User is able to add Credit Card",true);
		} else {
			Reporter.log("MN_050-->User is Not able to add Credit Card",true);
		}
		Thread.sleep(4000);
		shoppersstackicon.click();
	}

	public void removecard() throws InterruptedException {

		Thread.sleep(5000);
		menmodule.click();
		Thread.sleep(5000);
		firstproduct.click();
		Thread.sleep(5000);

		buynowbutton.click();
		Thread.sleep(5000);

		validaddress.click();
		Thread.sleep(5000);
		proceedbutton.click();
		Thread.sleep(5000);

		removecard.click();
		Thread.sleep(5000);

		if (deletepopup.isDisplayed()) {
			Reporter.log("MN_051-->User is able to Remove Card",true);
		} else {
			Reporter.log("MN_051-->User is Not able to Remove Card",true);
		}
		Thread.sleep(4000);
		shoppersstackicon.click();

	}

	public void clearsection() throws InterruptedException {

		Thread.sleep(5000);
		menmodule.click();
		Thread.sleep(5000);
		firstproduct.click();
		Thread.sleep(5000);

		buynowbutton.click();
		Thread.sleep(5000);

		validaddress.click();
		Thread.sleep(5000);
		proceedbutton.click();
		Thread.sleep(5000);

		netbanking.click();
		Thread.sleep(5000);

		clearsectionbutton.click();
		Reporter.log("MN_052--> User is able to Click on Clear Section",true);
		Thread.sleep(4000);
		shoppersstackicon.click();
	}
	
	public void cashondelivery() throws InterruptedException {

		Thread.sleep(5000);
		menmodule.click();
		Thread.sleep(5000);
		firstproduct.click();
		Thread.sleep(5000);
		
		buynowbutton.click();
		Thread.sleep(5000);

		validaddress.click();
		Thread.sleep(4000);
		proceedbutton.click();
		Thread.sleep(5000);

		cashondeliverybutton.click();
		Reporter.log("MN_053-->User is able to Select Cash on Delivery(COD)",true);
		Thread.sleep(2000);

		Thread.sleep(4000);
		shoppersstackicon.click();
	}
	
	public void netbanking() throws InterruptedException {

		Thread.sleep(5000);
		menmodule.click();
		Thread.sleep(5000);
		firstproduct.click();
		Thread.sleep(5000);

		buynowbutton.click();
		Thread.sleep(5000);

		validaddress.click();
		Thread.sleep(5000);
		proceedbutton.click();
		Thread.sleep(5000);

		netbanking.click();
		Reporter.log("MN_054-->User is able to Select Net Banking",true);
		Thread.sleep(5000);

		Thread.sleep(4000);
		shoppersstackicon.click();
	}

	
	public void orderplace() throws InterruptedException {

		Thread.sleep(5000);
		menmodule.click();
		Thread.sleep(5000);
		
		firstproductaddtocart.click();
		Thread.sleep(5000);
		firstproduct.click();
		Thread.sleep(5000);
		
		buynowbutton.click();
		Thread.sleep(5000);

		validaddress.click();
		Thread.sleep(5000);
		proceedbutton.click();
		Thread.sleep(5000);

		cashondeliverybutton.click();
		Thread.sleep(5000);

		proceedbutton.click();
		
		if (ordercreatedpopup.isDisplayed()) {
			Reporter.log("MN_055-->User is able to Place an order",true);
		} else {
			Reporter.log("MN_055-->User is not able to Place an order",true);
		}
		
		Thread.sleep(4000);
		shoppersstackicon.click();
	}
	
	public void conformationpage() throws InterruptedException {

		timeout.implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000);
		menmodule.click();
		Thread.sleep(5000);
		
		firstproductaddtocart.click();
		Thread.sleep(5000);
		firstproduct.click();
		Thread.sleep(5000);
		
		buynowbutton.click();
		Thread.sleep(5000);

		validaddress.click();
		Thread.sleep(5000);
		proceedbutton.click();
		Thread.sleep(5000);

		cashondeliverybutton.click();
		Thread.sleep(5000);

		proceedbutton.click();
		
		if (orderconfirmed.isDisplayed()) {
			Reporter.log("MN_056-->User is able to redirect to Order Conformation Page",true);
		} else {
			Reporter.log("MN_056-->User is not able to redirect to Order Conformation Page",true);
		}
		
		Thread.sleep(5000);
		shoppersstackicon.click();
	}
}