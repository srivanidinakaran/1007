package FIS.Activity;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alert {
	public static void main(String[] args) throws InterruptedException  {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\srivani.dinakaran\\Documents\\chromedriver_win32\\chromedriver.exe");


        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));     
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("JavaScript Alerts")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
        org.openqa.selenium.Alert alert = driver.switchTo().alert();
        String alertMessage =driver.switchTo().alert().getText();
        alert.accept();
        
       
	}

}
