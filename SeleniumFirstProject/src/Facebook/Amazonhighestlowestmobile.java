package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazonhighestlowestmobile {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.com/");
driver.manage().window().maximize();
driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Mobile");
driver.findElement(By.xpath("//input[@type='submit']")).click();
driver.findElement(By.xpath("//span[@class='a-size-small a-color-base']")).click();
driver.findElement(By.xpath("//select[@class='a-spacing-top-mini']")).click();
Select dropdown=new Select(driver.findElement(By.xpath("//select[@class='a-spacing-top-mini']")));
dropdown.selectByValue("price-desc-rank");
driver.findElement(By.xpath("//img[@alt='Kryptall 256GB Black Factory Unlocked Encrypted Smartphone X Series']")).click();
driver.findElement(By.xpath("//input[@id='add-to-wishlist-button-submit']")).click();
driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("8072593269");
driver.findElement(By.xpath("//input[@id='continue']")).click();
driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Dontforget");
driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
	}
}
