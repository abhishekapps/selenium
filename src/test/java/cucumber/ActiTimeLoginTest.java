package cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class ActiTimeLoginTest {
	
	
	WebDriver driver = null;
	static {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\singh\\Desktop\\chromedriver_win32\\chromedriver.exe");
	}
	
	
	@Given("User open the login page")
	public void user_open_the_login_page() {
		
		driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
	   
	}

//	@When("User enter the correct user name and passowrd")
//	public void user_enter_the_correct_user_name_and_passowrd() {
//		
//		System.out.println("user_enter_the_correct_user_name_and_passowrd");
//	  
//	}
	
	@When("User enter the correct {string} and {string}")
	public void user_enter_the_correct_and(String username, String password) {
	    
		WebElement usName  = driver.findElement(By.id("username"));
		WebElement paas = driver.findElement(By.name("pwd"));
		
		usName.sendKeys(username);
		paas.sendKeys(password);
	}

	@And("User click on the login button")
	public void user_click_on_the_login_button() {
		
		driver.findElement(By.id("loginButton")).click();
	  
	}

	@Then("Login successful message should be display")
	public void login_successful_message_should_be_displayed() {
		
		String title= driver.getTitle();
		
		System.out.println("++++++++++++++++++++++");
		System.out.println(title);
		
		Assert.assertEquals(title,"actiTIME - Login");

	}


}
