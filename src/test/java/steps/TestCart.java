package steps;

import io.cucumber.core.cli.Main;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;


public class TestCart {

    public static ChromeDriver driver;

    @Given("I login to the application and navigate to the home page")
    public void iLoginToTheApplicationAndNavigateToTheHomePage() throws InterruptedException {
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

    @When("I add an item to the cart and click on add to cart")
    public void iAddAnItemToTheCartAndClickOnAddToCart() throws InterruptedException {
        driver.navigate().to("https://automationexercise.com/product_details/12");
        driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button")).click();
    }

    @Then("I should see the item in my cart")
    public void iShouldSeeTheItemInMyCart() {
        driver.findElement(By.partialLinkText("View Cart")).click();
    }

    @And("I should proceed to check out")
    public void iShouldProceedToCheckOut() {
        driver.findElement(By.xpath("/html/body/section/div/section/div[1]/div/div/a")).click();
    }
}
