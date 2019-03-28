package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		//System.setProperty("webdriver.firefox.profile", "default");
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver(); 
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize(); 
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("sharmilarajaram93@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("dhfhkkjjjjhgggg");
		driver.findElement(By.id("u_0_2")).click();
		
		
	
	}

}
