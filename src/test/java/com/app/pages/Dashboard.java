package com.app.pages;

import static org.testng.Assert.expectThrows;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.log4testng.Logger;

import com.app.test.reusable_utility;

public class Dashboard extends reusable_utility{

	static Logger log = Logger.getLogger(Dashboard.class);
	
	reusable_utility utility = new reusable_utility();
	
	WebDriver driver;
	
	//Contructor to assign driver object 
	public Dashboard(WebDriver driver)
	{
		this.driver=driver;
	}
	//Locator for product Sauce Labs Bike Light
	private By TotalProduct = By.xpath("//div[@id='inventory_container']/div/div[@id='inventory_container']");
	//Locator for select dropdown
	private By Dropdown = By.xpath("//select[@class='product_sort_container']");
	//Locator to verify Sauce Labs Bike Light product
	private By Product2 = By.xpath("//*[text()='Sauce Labs Bike Light']");
	//Locator to click on product 3 add to cart button
	private By Product3_Button = By.xpath("//div[@id='inventory_container']/div/div[3]/div[3]/button");
	//Locator to click on cart button
	private By CartButton = By.xpath("//*[@id='shopping_cart_container']/a");
	//Locator to verify qty and description
	private By ProductDetails = By.xpath("//*[@class='cart_list']/div[3]");	
	//Locator for remove button
	private By RemoveButton = By.xpath("//*[@id='cart_contents_container']/div/div[1]/div[3]/div[2]/div[2]/button");
	//Locator to click on continue shopping button
	private By ContinueShoppingButton = By.xpath("//*[@id='cart_contents_container']/div/div[2]/a[1]");
	//Locator to click on checkout
	private By Checkout = By.xpath("//*[@id='cart_contents_container']/div/div[2]/a[2]");
	//Locator for first name
	private By FirstName = By.xpath("//input[@id='first-name' and @class='form_input']"); 
	//Locator for last name
	private By LastName = By.xpath("//input[@id='last-name' and @class='form_input']");
	//Locator for postal code
	private By PostalCode = By.xpath("//input[@id='postal-code' and @class='form_input']");
	//Locator for cancel button
	private By CancelButton = By.xpath("//*[@id='checkout_info_container']/div/form/div[2]/a");
	//Locator for continue button
	private By ContinueButton = By.xpath("//*[@id='checkout_info_container']/div/form/div[2]/input");
	//Locator for finish button
	private By FinishButton = By.xpath("//div[@class='cart_footer']/a[2]");
	//Locator for product1
	private By Product1 = By.xpath("//*[text()='Sauce Labs Backpack']");
	//Locator for product2
	private By Product_2 = By.xpath("//*[text()='Sauce Labs Bike Light']");
	//Locator for Product3
	private By Product3 = By.xpath("//*[text()='Sauce Labs Bolt T-Shirt']");
	//Locator for Product4
	private By Product4 = By.xpath("//*[text()='Sauce Labs Fleece Jacket']");
	//Locator for Product5
	private By Product5 = By.xpath("//*[text()='Sauce Labs Onesie']");
	//Locator for Product6
	private By Product6 = By.xpath("//*[text()='Test.allTheThings() T-Shirt (Red)']");
	
	public void setVerifyDashboard() {
		Assert.assertEquals(driver.getTitle(), "Swag Labs");
	}
	public void setVerifyCart() {
		Assert.assertEquals(driver.getTitle(), "Swag Labs");
	}
	public void setVerifyCheckout() {
		Assert.assertEquals(driver.getTitle(), "Swag Labs");
	}
	public By getTotalProduct() {
		return TotalProduct;
	}
	public void setTotalProduct() {
		this.TotalProduct=TotalProduct;
	
		List<WebElement> Product = driver.findElements(By.xpath("//div[@id='inventory_container']/div/div[@id='inventory_container']"));
	
		String Product1 = driver.findElement(By.xpath("//*[text()='Sauce Labs Backpack']")).getText();
		String Product2 = driver.findElement(By.xpath("//*[text()='Sauce Labs Bike Light']")).getText();
		String Product3 = driver.findElement(By.xpath("//*[text()='Sauce Labs Bolt T-Shirt']")).getText();
		String Product4 = driver.findElement(By.xpath("//*[text()='Sauce Labs Fleece Jacket']")).getText();
		String Product5 = driver.findElement(By.xpath("//*[text()='Sauce Labs Onesie']")).getText();
		String Product6 = driver.findElement(By.xpath("//*[text()='Test.allTheThings() T-Shirt (Red)']")).getText();
		
		for(WebElement ProductName:Product)
		{
			if(ProductName.getText().contains(Product1))
			{
				System.out.println(Product1);
				//log.info("Product1 is verified");
				System.out.println(Product2);
				//log.info("Product2 is verified");
				System.out.println(Product3);
				//log.info("Product3 is verified");
				System.out.println(Product4);
				//log.info("Product4 is verified");
				System.out.println(Product5);
				//log.info("Product5 is verified");
				System.out.println(Product6);
				//log.info("Product6 is verified");
			}
			else
			{
				System.out.println("Product is not verified");
				//log.info("Product is not verified");
			}
		}
	}
	public void setTotalProduct(By TotalProduct) {
		this.TotalProduct=TotalProduct;
	
		List<WebElement> Product = driver.findElements(By.xpath("//div[@id='inventory_container']/div/div[@id='inventory_container']"));
		for(WebElement ProductName:Product)
		{
			System.out.println(ProductName.getText());
		}
	}
	public void setDropdown() {
		
		Select select = new Select(driver.findElement(By.xpath("//select[@class='product_sort_container']")));
		select.selectByVisibleText("Price (high to low)");
		List<WebElement> value = driver.findElements(By.xpath("//select[@class='product_sort_container']"));
		for(WebElement dropdown:value)
		{
			if(dropdown.equals("Price (high to low)"))
			{
				System.out.println("Price (high to low) dropdown is verified");
			}
			else
			{
				System.out.println("Price (high to low) dropdown is not verified");
			}
		}
	}
	public void setDropdown2() {
		
		Select select = new Select(driver.findElement(By.xpath("//select[@class='product_sort_container']")));
		select.selectByVisibleText("Price (low to high)");
		List<WebElement> dropdown = driver.findElements(By.xpath("//select[@class='product_sort_container']"));
		for(WebElement dropdown1:dropdown)
		{
			if(dropdown1.equals("Price (low to high)"))
			{
				System.out.println("Price (low to high) dropdown is verified");
			}
			else
			{
				System.out.println("Price (low to high) dropdown is not verified");
			}
		}
	}
	public By getProduct2() {
		return Product2;
	}
	//Method to verify and click on product 2
	public void setProduct2(By Product2) {
		this.Product2=Product2;
		String Product = driver.findElement(By.xpath("//*[text()='Sauce Labs Bike Light']")).getText();
		//Assert.assertEquals(Product, "Sauce Labs Bike Light']");
		try {
			driver.findElement(Product2).click();
			utility.takeScreenshot(driver);
		}
		catch(IOException e)
		{
			log.error("Exception Occured");
			//System.out.println("Exception Occured");
		}
	}
	public By getProduct3_Button() {
		return Product3_Button;
	}
	public void setProduct3_Button(By Product3_Button) throws IOException {
			this.Product3_Button=Product3_Button;
			driver.findElement(Product3_Button).click();
			System.out.println("Product 3 is added to cart");
			//log.info("Product 3 is added to cart");
			utility.takeScreenshot(driver);
	}
	public void setProduct3_Button(By Product3_Button, By Product3_Remove) {
		this.Product3_Button=Product3_Remove;
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(Product3_Remove));
			driver.findElement(Product3_Remove).click();
			System.out.println("Product 3 is removed from the cart");
			//log.info("Product 3 is added to cart");
		}
		catch(ElementClickInterceptedException e)
		{
			log.error("Exception Occured");
			//System.out.println("Exception Occured");
		}
	}
	public By getCartButton() {
		return CartButton;
	}
	public void setCartButton(By CartButton) {
		this.CartButton=CartButton;
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(CartButton));
			driver.findElement(CartButton).click();
		}
		catch(ElementClickInterceptedException e)
		{
			log.error("Exception Occured");
			//System.out.println("Exception Occured");
		}
	}
	public By getProductDetails() {
		return ProductDetails;
	}
	public void setProductDetails(By ProductDetails) {
		//WebElement ProductDescription = driver.findElement(By.xpath("//*[@class='cart_list']/div[3]"));
		this.ProductDetails=ProductDetails;
		List<WebElement> ProductInfo = driver.findElements(ProductDetails);
		for(WebElement ProductDescription:ProductInfo)
		{
			System.out.println(ProductDescription.getText());
		}
	}
	public By getRemoveButton() {
		return RemoveButton;
	}
	public void setRemoveButton(By RemoveButton) throws IOException {
		this.RemoveButton=RemoveButton;
		driver.findElement(RemoveButton).click();
		utility.takeScreenshot(driver);
	}
	public void verifyRemoveButton(By RemoveButton) {
		this.RemoveButton=RemoveButton;
		String ProductDescription = driver.findElement(By.xpath("//*[@class='cart_list']/div[3]")).getText();
		if(ProductDescription.isEmpty() && ProductDescription.isBlank())
		{
			System.out.println("Product description in cart page is empty or blank");
		}
		else
		{
			System.out.println("Product description in cart page is not empty or blank");
		}
	}
	public By getContinueShoppingButton() {
		return ContinueShoppingButton;
	}
	public void setContinueShoppingButton(By ContinueShoppingButton) throws IOException {
		this.ContinueShoppingButton = ContinueShoppingButton;
		driver.findElement(ContinueShoppingButton).click();
		utility.takeScreenshot(driver);
	}
	public By getCheckout() {
		return Checkout;
	}
	public void setCheckout(By Checkout) {
		this.Checkout=Checkout;
		driver.findElement(Checkout).click();
	}
	public By getFirstName() {
		return FirstName;
	}
	public void setFirstName(String value) {
		this.FirstName=FirstName;
		driver.findElement(FirstName).sendKeys(value);
	}
	public By getLastName() {
		return LastName;
	}
	public void setLastName(String value) {
		this.LastName=LastName;
		driver.findElement(LastName).sendKeys(value);
	}
	public By getPostalCode() {
		return PostalCode;
	}
	public void setPostalCode(String value) {
		this.PostalCode=PostalCode;
		driver.findElement(PostalCode).sendKeys(value);
	}
	public By getCancelButton() {
		return CancelButton;
	}
	public void setCancelButton(By CancelButton) {
		this.CancelButton=CancelButton;
		driver.findElement(CancelButton).click();
	}
	public By getContinueButton() {
		return ContinueButton;
	}
	public void setContinueButton(By ContinueButton) throws IOException {
		this.ContinueButton=ContinueButton;
		driver.findElement(ContinueButton).click();
		utility.takeScreenshot(driver);
	}
	public void setverifyTotalAmount() {
		String TotalItem = driver.findElement(By.xpath("//div[@class='summary_info']/div[5]/text()[2]")).getText();
		String TotalTax = driver.findElement(By.xpath("//div[@class='summary_info']/div[6]/text()[2]")).getText();
		String TotalAmount = driver.findElement(By.xpath("//div[@class='summary_info']/div[7]/text()[2]")).getText();
		String Amount = TotalItem+TotalTax;
		
		if(Amount.equalsIgnoreCase(TotalAmount))
		{
			System.out.println("Total amount is verified");
		}
		else
		{
			System.out.println("Total amount is not verified");
		}
	}
	public void setverifyCheckoutInfo() {
		List<WebElement> CheckoutInfo = driver.findElements(By.xpath("//div[@class='cart_list']"));
		for(WebElement Info:CheckoutInfo)
		{
			if(Info.equals(Product1))
			{
				System.out.println("Product1 is verified in checkout overview page");
			}
			else if(Info.equals(Product_2))
			{
				System.out.println("Product_2 is verified in checkout overview page");
			}
			else if(Info.equals(Product3))
			{
				System.out.println("Product3 is verified in checkout overview page");
			}
			else if(Info.equals(Product4))
			{
				System.out.println("Product4 is verified in checkout overview page");
			}
			else if(Info.equals(Product5))
			{
				System.out.println("Product5 is verified in checkout overview page");
			}
			else if(Info.equals(Product6))
			{
				System.out.println("Product6 is verified in checkout overview page");
			}
			else
			{
				System.out.println("Product is not found in checkout overview page");
			}
		}
	}
	public By getFinishButton() {
		return FinishButton;
	}
	public void setFinishButton(By FinishButton) throws IOException {
		this.FinishButton=FinishButton;
		driver.findElement(FinishButton).click();
		utility.takeScreenshot(driver);
	}
}
