package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class addProdSteps {
	
	private static WebDriver driver;
	
	@BeforeAll
	public static void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Given("the user is in the login page1")
	public void theUserInLoginPage1()
	{
		driver.navigate().to("http://localhost:4200");
	}
	
	@When("the user enters the username in the username bar1")
	public void theUserEntersUsername1()
	{
		driver.findElement(By.id("IniciUsuari")).sendKeys("alex");
	}
	
	@When("the user enters the password in the password bar1")
	public void theUserEntersPassword1()
	{
		driver.findElement(By.id("IniciContrasenya")).sendKeys("alex");
	}
	
	@When("the user clicks the login button1")
	public void theUserClicksAccept1()
	{
		driver.findElement(By.id("acceptarb")).click();
	}
	
	@When ("the user is in the add product page")
	public void theUserInAddProdPage()
	{
		driver.navigate().to("http://localhost:4200/crear-producte");
	}
	
	@When ("the user enters the id in the id bar")
	public void theUserEntersID()
	{
		driver.findElement(By.id("prodId")).sendKeys("13");
	}
	
	@When ("the user enters the wrong id in the id bar")
	public void theUserEntersWrongID()
	{
		driver.findElement(By.id("prodId")).sendKeys("aa");
	}
	
	@When ("the user enters the name in the name bar")
	public void theUserEntersName()
	{
		driver.findElement(By.id("prodName")).sendKeys("test");
	}
	
	@When ("the user enters the description in the description bar")
	public void theUserEntersDescription()
	{
		driver.findElement(By.id("prodDesc")).sendKeys("test");
	}
	
	@When ("the user enters the price in the price bar")
	public void theUserEntersPrice()
	{
		driver.findElement(By.id("prodPrice")).sendKeys("50");
	}
	
	@When ("the user enters the brand in the brand bar")
	public void theUserEntersBrand()
	{
		driver.findElement(By.id("prodBrand")).sendKeys("test");
	}
	
	@When ("the user enters the image in the image bar")
	public void theUserEntersImage()
	{
		driver.findElement(By.id("prodImage")).sendKeys("test");
	}
	
	@When ("the user enters the sport in the sport bar")
	public void theUserEntersSport()
	{
		driver.findElement(By.id("prodSport")).sendKeys("Tenis");
	}
	
	@When ("the user enters the product type in the product type bar")
	public void theUserEntersProductType()
	{
		driver.findElement(By.id("prodType")).sendKeys("Raqueta");
	}
	
	@When ("the user enters the size in the size bar")
	public void theUserEntersSize()
	{
		driver.findElement(By.id("prodSize")).sendKeys("10");
	}
	
	@When ("the user clicks the accept button")
	public void theUserClickAccept()
	{
		driver.findElement(By.id("acceptarb")).click();
	}
	
	@Then ("the producte is added")
	public void theUProductAdded()
	{
		String title = driver.getCurrentUrl();
		Assert.assertTrue(title.contains("http://localhost:4200/llistar-productes"));
	}
	
	@Then ("the producte is not added")
	public void theProductNotAdded()
	{
		String title = driver.getCurrentUrl();
		Assert.assertTrue(title.contains("http://localhost:4200/crear-producte"));
	}
	
}
