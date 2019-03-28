package Facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Udemy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.opodo.com.au");
			Thread.sleep(3000l);
			//WebDriverWait wait=new WebDriverWait(chromeDriver, pageLoadTimeout).until(webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
		driver.findElement(By.xpath("//*[@id=\"flights-manager\"]/div[2]/div[1]/ul/li[2]/span[2]")).click();
		Thread.sleep(3000l);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				Thread.sleep(1000l);
				driver.switchTo().frame("flightsManagerIframe");
				driver.findElement(By.xpath("//input[@id='b_destination']")).sendKeys("Bangalore, Karnataka, India");
		Select dropdown= new Select(driver.findElement(By.xpath("//*[@id=\"frm\"]/div[2]/div[3]/div[1]/label/select")));
		dropdown.selectByIndex(2);
		Select dropdown1= new Select(driver.findElement(By.xpath("//select[@name='group_adults']")));
		dropdown1.selectByIndex(5);
		driver.findElement(By.xpath("//input[@class='b-aff__submit--button']")).click();
Thread.sleep(1000l);
		  
	

	}

}
