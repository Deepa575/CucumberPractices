package Practice;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.GenericUtilities.ExcelFileUtility;



public class CashFlow_Table {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://realpage.vassarlabs.com/");
		driver.findElement(By.xpath("//a[3]")).click();
		driver.findElement(By.xpath("//img[@title='Sunrise Estates']")).click();
		driver.findElement(By.xpath("//a[@id='ngb-nav-5']")).click();
		List<WebElement> no_of_rows = driver.findElements(By.xpath("//table[@class='table m-0 table-rp table-rp-fl']//tr[*]"));
		List<WebElement> no_of_columns = driver.findElements(By.xpath("//table[@class='table m-0 table-rp table-rp-fl']//tr[1]//td[*]"));
		ExcelFileUtility eUtil = new ExcelFileUtility();
		
		for(int i=1;i<no_of_rows.size();i++)
		{
			for(int j=0;j<no_of_columns.size();j++)
			{
			  
				String value=driver.findElement(By.xpath("//table[@class='table m-0 table-rp table-rp-fl']//tr["+i+"]//td["+j+"]")).getText();
			
				eUtil.writeDataIntoExcel("CashFlow", i, j,value);	
		}}
		
		
		String DR= driver.findElement(By.xpath("//table[1]//thead//tr[1]//th[1]")).getText();
		eUtil.writeDataIntoExcel("CashFlow", 10, 0, DR);
		String DR_value= driver.findElement(By.xpath("//table[1]//tbody//tr[1]//td[1]")).getText();
		eUtil.writeDataIntoExcel("CashFlow", 10, 1, DR_value);
		String TCR= driver.findElement(By.xpath("//table[1]//thead//tr[1]//th[2]")).getText();
		eUtil.writeDataIntoExcel("CashFlow", 11, 0, TCR);
		String TCR_value= driver.findElement(By.xpath("//table[1]//tbody//tr[1]//td[2]")).getText();
		eUtil.writeDataIntoExcel("CashFlow", 11, 1, TCR_value);
		String SC = driver.findElement(By.xpath("//h5[text()='Sale Assumptions']/parent::div/following-sibling::div/descendant::tr[2]/td[1]")).getText();
		eUtil.writeDataIntoExcel("CashFlow", 12, 0, SC);
		String SC_value = driver.findElement(By.xpath("//h5[text()='Sale Assumptions']/parent::div/following-sibling::div/descendant::tr[2]/td[2]")).getText();
		eUtil.writeDataIntoExcel("CashFlow", 12, 1, SC_value);
		String SPA = driver.findElement(By.xpath("//h5[text()='Sale Assumptions']/parent::div/following-sibling::div/following-sibling::div/descendant::tr[2]/td[1]")).getText();
		eUtil.writeDataIntoExcel("CashFlow", 13, 0, SPA);
		String SPA_value = driver.findElement(By.xpath("//h5[text()='Sale Assumptions']/parent::div/following-sibling::div/following-sibling::div/descendant::tr[2]/td[2]")).getText();
		eUtil.writeDataIntoExcel("CashFlow", 13, 1, SPA_value);
}}
