package Steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SampleForm {

	WebDriver driver;

	@Given("Open browser")
	public void open_browser() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@Given("User is in form page")
	public void user_is_in_form_page() {

		driver.get("https://v1.training-support.net/selenium/simple-form?");

	}

	@When("Enter {string} and {string} and {string} and {string} and {string}")
	public void enter_abhi_and_sek_and_abcd_gmail_com_and_and_hii_buddy(String firstname, String lastname, String email,
			String contactnumber, String message) {

		driver.findElement(By.id("firstName")).sendKeys(firstname);
		driver.findElement(By.id("lastName")).sendKeys(lastname);
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("number")).sendKeys(contactnumber);
		driver.findElement(By.cssSelector("textarea")).sendKeys(message);

	}

	@When("User click on submit")
	public void user_click_on_submit() {

		driver.findElement(By.cssSelector("input[class='ui green button']")).click();

	}

	@Then("I validate the assertion")
	public void i_validate_the_assertion() {

		String str = driver.switchTo().alert().getText();
		String str2 = "Thank You for reaching out to us, Abhi sek";
//		System.out.println(str + "=-=-=-=-=-=-=-=-=-==-=-=");
		str.equals(str2);
	}

	@When("User switch to alert")
	public void user_switch_to_alert() {

		driver.switchTo().alert().accept();

	}

	@Then("click on ok")
	public void click_on_ok() {
//		driver.close();
	}

}
