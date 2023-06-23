package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class userSteps {
	
	private static WebDriver driver;
	
	@BeforeAll
	public static void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Given("the user is in the login page2")
	public void theUserInLoginPage2()
	{
		driver.navigate().to("http://localhost:4200");
	}
	
	@When("the user enters the username in the username bar2")
	public void theUserEntersUsername2()
	{
		driver.findElement(By.id("IniciUsuari")).sendKeys("alex");
	}
	
	@When("the user enters the password in the password bar2")
	public void theUserEntersPassword2()
	{
		driver.findElement(By.id("IniciContrasenya")).sendKeys("alex");
	}
	
	@When("the user clicks the login button2")
	public void theUserClicksAccept2()
	{
		driver.findElement(By.id("acceptarb")).click();
	}
	
	@When ("the user is in the create user page")
	public void theUserInCreateUserPage()
	{
		driver.navigate().to("http://localhost:4200/crear-usuari");
	}
	
	@When ("the user enters the usernameTest in the username bar")
	public void theUserEntersUsernameTest()
	{
		driver.findElement(By.id("username")).sendKeys("testtest");
	}
	
	@When ("the user enters the repeated usernameTest in the username bar")
	public void theUserEntersRepeatedUsername()
	{
		driver.findElement(By.id("username")).sendKeys("testtest");
	}
	
	@When ("the user enters the emailTest in the email bar")
	public void theUserEntersEmailTest()
	{
		driver.findElement(By.id("email")).sendKeys("testtest@test");
	}
	
	@When ("the user enters the nameTest in the name bar")
	public void theUserEntersNameTest()
	{
		driver.findElement(By.id("name")).sendKeys("testtest");
	}
	
	@When ("the user enters the passwordTest in the password bar")
	public void theUserEntersPasswordTest()
	{
		driver.findElement(By.id("password")).sendKeys("test");
	}
	
	//funciona cuando clico la pantalla que se abre?
	@When ("the user clicks the accept button2")
	public void theUserClicksAccpetButton2()
	{
		driver.findElement(By.id("acceptbutton")).click();
	}
	
	@When ("the user enters the username2Test in the username2 bar")
	public void theUserEntersUsername2Test()
	{
		driver.findElement(By.id("username2")).sendKeys("testtest");
	}
	
	@When ("the user enters the wrong username2Test in the username2 bar")
	public void theUserEntersWrongUsername2()
	{
		driver.findElement(By.id("username2")).sendKeys("testtesttest");
	}
	
	@When ("the user clicks the accept2 button2")
	public void theUserClicksAccept2Button()
	{
		driver.findElement(By.id("accpet2button")).click();
	}
	
	@Then ("is the same link")
	public void theLinkIsTheSame()
	{
		String title = driver.getCurrentUrl();
		Assert.assertTrue(title.contains("http://localhost:4200"));
	}
	
}
