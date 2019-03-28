package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Trivago {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.hotelpricecomparison.net/");
		driver.findElement(By.xpath("//input[@id='hc_f_id_where_1']")).click();
		driver.findElement(By.xpath("//input[@id='hc_f_id_where_1']")).sendKeys("Bangalore,india");
		Select day = new Select(driver.findElement(By.xpath("//select[@id='hc_f_id_checkin_1']")));
		day.selectByValue("2");
		for(WebElement element : driver.findElements(By.xpath("//select[@data-track='SearchBox-MonthDropdownClicked']")))
		{
			Select month = new Select(driver.findElement(By.xpath("//select[@data-track='SearchBox-MonthDropdownClicked']")));
			month.selectByVisibleText("November 2018");
		}
	
	
		Select checkoutmonth = new Select(driver.findElement(By.xpath("//select[@id='hc_f_id_checkout_1']")));
		checkoutmonth.selectByVisibleText("Fri 7");
	Select checkoutdate = new Select(driver.findElement(By.xpath("//select([@id='hc_f_btn_v15'])[2]")));
	//(Check its HTML Code as same as of line no.18)
		checkoutdate.selectByValue("1");
		driver.findElement(By.xpath("//a[@class='hc_f_btn_v15']")).click();
				
	}

}
