package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousekeyboardActions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		//like select,Action is  also a class used for Mouse and keyboard interactions..Inside that class argument v ll pass that driver.Thus driver action wil be controlled by action class
		Actions d=new Actions(driver);
		//Build is used to notify that element is ready for execution and perform is to start execution
		d.moveToElement(driver.findElement(By.xpath("//a[@data-nav-ref='nav_ya_signin']"))).contextClick().build().perform();
d.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		
}
}