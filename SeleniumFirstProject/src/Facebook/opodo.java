package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class opodo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.opodo.com.au");
		Thread.sleep(3000l);
		driver.findElement(By.xpath("//*[@id=\"flights-manager\"]/div[2]/div[1]/ul/li[2]")).click();
	Thread.sleep(5000l);
	driver.findElement(By.xpath("//input[@id='b_destination']")).sendKeys("Bangalore, Karnataka, India");

	}

}
