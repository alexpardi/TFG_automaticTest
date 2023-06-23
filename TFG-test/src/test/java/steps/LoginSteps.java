package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	private static WebDriver driver;
	
	@BeforeAll
	public static void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Given("the user is in the login page")
	public void theUserInLoginPage()
	{
		driver.navigate().to("http://localhost:4200/");
	}
	
	@When("the user enters the username in the username bar")
	public void theUserEntersUsername()
	{
		driver.findElement(By.id("IniciUsuari")).sendKeys("alex");
	}
	
	@When("the user enters the wrong username in the username bar")
	public void theUserEntersWrongUsername()
	{
		driver.findElement(By.id("IniciUsuari")).sendKeys("ale");
	}
	
	@When("the user enters the password in the password bar")
	public void theUserEntersPassword()
	{
		driver.findElement(By.id("IniciContrasenya")).sendKeys("alex");
	}
	
	@When("the user enters the wrong password in the password bar")
	public void theUserEntersWrongPassword()
	{
		driver.findElement(By.id("IniciContrasenya")).sendKeys("ale");
	}
	
	@When("the user clicks the login button")
	public void theUserClicksAccept()
	{
		driver.findElement(By.id("acceptarb")).click();
	}
	
	//sin el breakPoint me sale error!
	@Then("the products list appears")
	public void theProductListAppears()
	{
		String title = driver.getCurrentUrl();
		Assert.assertTrue(title.contains("http://localhost:4200/llistar-productes"));
	}
	
	@Then("the link is the same")
	public void theSameLink()
	{
		String title = driver.getCurrentUrl();
		Assert.assertTrue(title.contains("http://localhost:4200"));
	}
	
	
}
