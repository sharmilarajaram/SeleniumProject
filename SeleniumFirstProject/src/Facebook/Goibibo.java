package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Goibibo {

	private static Object dropdown;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.goibibo.com");
		Thread.sleep(300l);
		driver.manage().window().maximize();
		Thread.sleep(300l);
			driver.findElement(By.xpath("//i[@class='icon-bus db blue ico24 lh1-2 padT5 padB5']")).click();
			Thread.sleep(5000l);
		//driver.findElement(By.cssSelector("div[class='close tablecell']")).click();
			driver.findElement(By.xpath("//input[@id='gi_source']")).sendKeys("Chennai,Tamil Nadu");
			driver.findElement(By.xpath("//input[@id='gi_destination']")).sendKeys("Bhopal,Madhya Pradesh");
			driver.findElement(By.xpath("//input[@id='gi_onward_text']")).click();
			driver.findElement(By.xpath("//td[@id='jrdp_start-calen_11_4_2018']")).click();
			driver.findElement(By.xpath("//*[@id='gi_return_text']")).click();
			driver.findElement(By.xpath("//td[@id='jrdp_end-calen_11_4_2018']")).click();
		driver.findElement(By.xpath("//div[@id='gi_search_btn']")).click();
			//Select dropdown = new Select(driver.findElement(By.xpath("//input[@id='gi_source']")));
			//dropdown.selectByVisibleText("Bangaore, Karnataka");
			//Select dropdown1 = new Select(driver.findElement(By.xpath("//input[@id='gi_destination']")));
			//dropdown1.selectByVisibleText("Chennai, TamilNadu");
					
		
	
		

	}

}
