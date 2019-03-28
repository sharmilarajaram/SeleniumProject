package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Iframe {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com");
		//driver.findElement(By.xpath("//a[@href='http://jqueryui.com/draggable/']")).click();
		driver.findElement(By.xpath("//a[@href='http://jqueryui.com/droppable/']")).click();
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		Actions s=new Actions(driver);
		s.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
				System.out.println(driver.findElements(By.tagName("iframe")).size());
				driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/ul/li[2]/a")).click();
		

	}

}
