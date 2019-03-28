package Facebook;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//	driver.switchTo().alert().accept(); 
	//input[@id='onward_cal']
	
		driver.findElement(By.xpath("//div[@class='fl search-box date-box gtm-onwardCalendar']")).click();;
		//driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']//td[@class='monthTitle']")).getText().contains("Nov");
		while(!driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']//td[@class='monthTitle']")).getText().contains("Nov"))
		{
			driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[3]/button")).click();
		}

		List<WebElement> list=driver.findElements(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[4]"));
		int calender=driver.findElements(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[4]")).size();
		System.out.println(calender);
		//driver.switchTo().alert().accept();
		
		for(int i=0;i<calender;i++)
		{
		 	String S=driver.findElements(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[4]")).get(i).getText();
			System.out.println(S);
					
		if(S.equalsIgnoreCase("6"))
				{
			driver.findElements(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[4]")).get(i).click();
				}
		}
		}

}
