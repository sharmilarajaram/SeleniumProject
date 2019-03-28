package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newcreation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("u_0_j")).click();
		//driver.findElement(By.id("u_0_j")).sendKeys("sharmilaaaaaa");
		driver.findElement(By.id("u_0_p")).click();
		driver.findElement(By.id("u_0_p")).sendKeys("gggggggggggg");
		
	}

}
