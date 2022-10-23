package Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RealPage {

	public void realPage() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://realpage-staging.vassarlabs.com/");
		WebElement asset = driver.findElement(By.xpath("//i[@class='icon rpi-properties']"));
		asset.click();
		
		List<WebElement> a = driver.findElements(By.xpath("//h6"));
		HashMap<Object,Object> map=new HashMap<>();
		List<String> l=new ArrayList<>();
		
		for(int i=0;i<a.size();i++)
		{
			l.add(a.get(i).getText());
		}
		System.out.println(l);
		
		List<WebElement> a1 = driver.findElements(By.xpath("//strong[text()='Category:']"));
		List<String> l1=new ArrayList<>();
		for(int i=0;i<a.size();i++)
		{
			l.add(a.get(i).getText());
		}
		System.out.println(l);
}}
