package Facebook;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmaillogin {

	public static void main(String[] args) {
		int a=10;
		int b= 10;
		String c = "The sum is";
		int sum=a+b;
		System.out.println(c + sum);
		System.out.println(a+b+c);
		System.out.println(c+(a+b));
		System.out.println(c+sum);
		System.out.println(c+10+10);
		System.out.println(10+10+c);
		System.out.println(c+a+(b+sum));
		System.out.println(a+b+sum);
		System.out.println(a+b+c+sum);
		System.out.println(a+b+c+(sum));
		System.out.println(Arrays.asList(c.split(" ")));
		Gmaillogin gm = new Gmaillogin();
		gm.printsample(a + "+" + b + "+" + c);
		//System.out.println(c+(Stringa)+(Stringb));


 	    System.setProperty("webdriver.chrome.driver","F:\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("pranathi");
		driver.findElement(By.id("lastName")).sendKeys("moorthy79");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("pranathisuguna");
        driver.findElement(By.xpath("//*[@id=\"passwd\"]/div[1]/div/div[1]/input")).sendKeys("9985785759");
        driver.findElement(By.xpath("//*[@id=\"confirm-passwd\"]/div[1]/div/div[1]/input")).sendKeys("9985785759");
        driver.findElement(By.className("CwaK9")).click();
        try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        driver.findElement(By.xpath("//*[@id=\"phoneNumberId\"]")).sendKeys("9989631235");
        driver.findElement(By.className("CwaK9")).click();
        
       
        
	}
	
	public void printsample(String a) {
		String[] arr = a.split("+");
		int i1,i2;
		String s1,s2;
		for(int i=0; i<arr.length;i++) {
			try {
				i1 = Integer.parseInt(arr[i]);
			}
			catch(Exception e) {
				s1 = arr[i];
			}
		}
	}

}
