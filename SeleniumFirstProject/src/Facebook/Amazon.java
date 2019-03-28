package Facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
		driver.get("https://www.amazon.in/");
				driver.findElement(By.id("desktop-grid-2")).click();
				//driver.switchTo().frame("flightsManagerIframe");
		//driver.findElement(By.partialLinkText("submit.add-to-cart")).click();
//driver.findElement(By.xpath(" //input[@data-hover='Select <b>__dims__</b> from the left<br> to add to Shopping Cart']")).click();
//driver.findElement(By.id(id))
driver.findElement(By.xpath("//img[contains(@src,'/I/41lWYdlMk7L._AC_UL260_SR200,260_FMwebp_QL70_.jpg')]")).click();
WebDriverWait wait=new WebDriverWait(driver,100);
wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
		"//*[@id=\"add-to-cart-button\"]")));

driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
driver.findElement(By.xpath("//inupt[@type='email']")).click();
}
}