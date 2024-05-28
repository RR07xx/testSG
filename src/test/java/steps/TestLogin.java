package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class TestLogin {

    public static ChromeDriver driver;

    @Given("I navigate to the home page")
    public void i_navigate_to_the_home_page() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(60));
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/");
    }
    @When("I click on login and enter credentials")
    public void i_click_on_login_and_enter_credentials() throws InterruptedException {
        driver.findElement(By.partialLinkText("Signup / Login")).click();
        driver.findElement(By.name("email")).sendKeys("testex@mail.com");
        driver.findElement(By.name("password")).sendKeys("Test1234");
        driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/form/button")).click();
    }
    @When("^I click on login and enter the (.+) and (.+)$")
    public void iClickOnLoginAndEnterTheAnd(String Username, String Password) {
        driver.findElement(By.partialLinkText("Signup / Login")).click();
        driver.findElement(By.name("email")).sendKeys(Username);
        driver.findElement(By.name("password")).sendKeys(Password);
        driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/form/button")).click();
    }
    @Then("I should see the login page and close")
    public void iShouldSeeTheLoginPageAndClose() throws InterruptedException {
        Assert.assertEquals(driver.getTitle(), "Automation Exercise");
        driver.close();
    }

}
