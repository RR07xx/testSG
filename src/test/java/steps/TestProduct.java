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

public class TestProduct{

    public static ChromeDriver driver;

    @Given("I login to the application and navigate to the home")
    public void iLoginToTheApplicationAndNavigateToTheHome() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(60));
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/");
        driver.findElement(By.partialLinkText("Signup / Login")).click();
        driver.findElement(By.name("email")).sendKeys("testex@mail.com");
        driver.findElement(By.name("password")).sendKeys("Test1234");
        driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/form/button")).click();
    }

    @When("I click on products")
    public void iClickOnProducts() {
        driver.findElement(By.partialLinkText("Products")).click();
        driver.navigate().refresh();
        driver.navigate().to("https://automationexercise.com/products");
    }

    @Then("I should see the products page")
    public void iShouldSeeTheProductsPage() {
        Assert.assertEquals(driver.getTitle(),"Automation Exercise - All Products");
    }

    @Then("I click on logout")
    public void iClickOnLogout() {
        driver.findElement(By.partialLinkText("Logout")).click();
    }

    @Then("I close the browser")
    public void iCloseTheBrowser() {
        driver.close();
    }
}

