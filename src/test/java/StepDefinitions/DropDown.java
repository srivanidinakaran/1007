package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

    public WebDriver driver;
    @Given("Open the Browser")
    public void openBrowser() {
    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\srivani.dinakaran\\Documents\\chromedriver_win32\\chromedriver.exe");
       //WebDriver driver = new ChromeDriver();
         ChromeOptions options=new ChromeOptions();
         options.addArguments("--remote-allow-origins=*");
         WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver(options);
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
         
    }
    @When ("Enter the url {string}")
    public void enter_the_url(String url){
    driver.get(url);
    }

    @When("Click the DropDown")
    public void clickDropdown() {
    	driver.findElement(By.linkText("Dropdown")).click();
    }

    @When("Select Option1 option1 From the DropDown {string}")
    public void selectOption1FromDropdown(String string) throws InterruptedException {
    	Select select = new Select(driver.findElement(By.id("dropdown")));
        select.selectByVisibleText(string);
        Thread.sleep(2000);
    }

    @When("Select Option2 option2 From the DropDown {string}")
    public void selectOption2FromDropdown(String string) throws InterruptedException {
    	Select select = new Select(driver.findElement(By.id("dropdown")));
        select.selectByVisibleText(string);
        Thread.sleep(2000);
    }
    @And("navigate back using the browser back button")
    public void navigateBack() {
        driver.navigate().back();
    }

   // @And("I should see the checkboxes page")
    //public void verifyCheckboxesPage() {
        //String title = driver.getTitle();
        //assert title.equals("Checkboxes");
   // }

    @Then("I select Checkboxes from the dropdown")
    public void selectCheckboxes() throws InterruptedException {
    	driver.findElement(By.linkText("Checkboxes")).click();
        driver.findElement(By.xpath("//*[@id='checkboxes']/input[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='checkboxes']/input[1]")).click();
        Thread.sleep(3000);
    }
    @Given ("I am on the-internet.herokuapp.com")
    public void Openurl() {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\srivani.dinakaran\\Documents\\chromedriver_win32\\chromedriver.exe");
    //WebDriver driver = new ChromeDriver();
      ChromeOptions options=new ChromeOptions();
      options.addArguments("--remote-allow-origins=*");
      WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver(options);
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
      driver.get("http://the-internet.herokuapp.com/");
    }
    @When ("I click on File Upload")
    public void Fileupload() throws InterruptedException {
    	driver.findElement(By.linkText("File Upload")).click();
    	Thread.sleep(3000);
    }
    @And ("I upload a file")
    public void Uploadfile() throws InterruptedException {
    	WebElement uploadElement = driver.findElement(By.id("file-upload"));
        uploadElement.sendKeys("E://a.bmp");
        Thread.sleep(3000);
    }
    @Then ("I should see the file uploaded successfully")
    public void Success() throws InterruptedException {
    	System.out.println("File is successfully uploaded");
    	Thread.sleep(3000);
    }
      

    @After
    public void AfterHook()  {
        System.out.println("browser closed");
        driver.quit();

}
    
}

