package Facebook;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowshandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signup");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		driver.findElement(By.xpath("//a[@href='https://support.google.com/accounts?hl=en-GB']")).click(); 
		System.out.println("Before Switcing");
		System.out.println(driver.getTitle());
		Set<String> ids=driver.getWindowHandles();
		java.util.Iterator<String> it=ids.iterator();
		String parentid=it.next();
		String Childid=it.next();
		System.out.println("After Switcing");
		driver.switchTo().window(Childid);
		System.out.println(driver.getTitle());
		System.out.println("Back to Parent Switcing");
		driver.switchTo().window(parentid);
	}

}
