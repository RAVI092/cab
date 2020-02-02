package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
  
	WebDriver d1;
	@BeforeMethod
	public void launchUrl()
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ravi\\Selenium\\chromedriver_win32\\chromedriver.exe");
		 d1=new ChromeDriver();
		d1.get("http://67.43.12.211/NavotarReservation/?clientid=321&amp;mode=qa&amp;&amp;AspxAutoDetectCookieSupport=1#/?lang=en");

	}
	
	
	
	@Test
  public void f() throws InterruptedException {
		Select s=new Select(d1.findElement(By.xpath("//select[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required']")));
		s.selectByIndex(2);
	
		Select s1=new Select(d1.findElement(By.xpath("//*[@ng-options='times for times in sdata.checkoutTimeList']")));
		s1.selectByIndex(23);
		
		d1.findElement(By.xpath("//*[@is-open='openedCheckIn']")).clear();
		d1.findElement(By.xpath("//*[@is-open='openedCheckIn']")).sendKeys("28-February-2020");

		Select s3=new Select(d1.findElement(By.xpath("//*[@ng-options='times for times in sdata.checkinTimeList']")));
		s3.selectByIndex(30);
		
		d1.findElement(By.xpath("//*[@ng-click='openCheckOut($event)']")).click();
d1.findElement(By.xpath("//*[contains(@aria-labelledby,'datepicker-6')]//thead//tr[1]//th[2]")).click();
		d1.findElement(By.xpath("//*[contains(@aria-labelledby,'datepicker-6')]//thead//tr[1]//th[2]//button//following::tbody[1]//tr[1]//td[2]")).click();
int x=d1.findElements(By.xpath("//*[contains(@id,'datepicker-6')]")).size();
		java.util.List<WebElement> y=d1.findElements(By.xpath("//*[contains(@id,'datepicker-6')]"));
	for(int j=0;j<x;j++)
		{
			if(y.get(j).getText().equals("05"))
			{
				y.get(j).click();	
			}
		}
	
d1.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	Select s4=new Select(d1.findElement(By.xpath("//*[@data-ng-model='search.checkedOutLocation']")));
	s4.selectByIndex(0);
	
	d1.findElement(By.xpath("//input[@type='checkbox']")).click();
	
	Select s5=new Select(d1.findElement(By.xpath("//*[@data-ng-model='search.checkedInLocation']")));
	s5.selectByIndex(1);
	System.out.println(d1.getCurrentUrl());	
	
	d1.findElement(By.xpath("//*[@class=' pull-right btn btn-blue']")).click();
	Thread.sleep(5000);
	d1.findElement(By.xpath("//*[@for='radio_0']")).click();
	
System.out.println(d1.getCurrentUrl());	
Thread.sleep(5000);
//d1.navigate().refresh();
		d1.findElement(By.xpath("//*[@ng-click='redirectToSecond()']")).click();
		Thread.sleep(3000);
  }
	@Test
	  public void f1() throws InterruptedException {
			Select s=new Select(d1.findElement(By.xpath("//select[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required']")));
			s.selectByIndex(2);
		
			Select s1=new Select(d1.findElement(By.xpath("//*[@ng-options='times for times in sdata.checkoutTimeList']")));
			s1.selectByIndex(23);
			
			d1.findElement(By.xpath("//*[@is-open='openedCheckIn']")).clear();
			d1.findElement(By.xpath("//*[@is-open='openedCheckIn']")).sendKeys("28-February-2020");

			Select s3=new Select(d1.findElement(By.xpath("//*[@ng-options='times for times in sdata.checkinTimeList']")));
			s3.selectByIndex(45);
			
			
			
			
			d1.findElement(By.xpath("//*[@ng-click='openCheckOut($event)']")).click();
	d1.findElement(By.xpath("//*[contains(@aria-labelledby,'datepicker-6')]//thead//tr[1]//th[2]")).click();
			d1.findElement(By.xpath("//*[contains(@aria-labelledby,'datepicker-6')]//thead//tr[1]//th[2]//button//following::tbody[1]//tr[1]//td[2]")).click();
	int x=d1.findElements(By.xpath("//*[contains(@id,'datepicker-6')]")).size();
			java.util.List<WebElement> y=d1.findElements(By.xpath("//*[contains(@id,'datepicker-6')]"));
		for(int j=0;j<x;j++)
			{
				if(y.get(j).getText().equals("05"))
				{
					y.get(j).click();	
				}
			}
		
	d1.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Select s4=new Select(d1.findElement(By.xpath("//*[@data-ng-model='search.checkedOutLocation']")));
		s4.selectByIndex(0);
		
		d1.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		Select s5=new Select(d1.findElement(By.xpath("//*[@data-ng-model='search.checkedInLocation']")));
		s5.selectByIndex(1);
		
		d1.findElement(By.xpath("//*[@class=' pull-right btn btn-blue']")).click();
		
	
	  }

}
