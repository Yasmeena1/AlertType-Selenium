package alerttype;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Alert {

	WebDriver driver = new ChromeDriver();

	@BeforeTest
	public void mybeforetest() {
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
	}

	@Test()
	public void mytest() throws InterruptedException {
		// normal alert

		driver.findElement(By.xpath("//input[@name='alert']")).click();
		org.openqa.selenium.Alert simplealert = driver.switchTo().alert();
		System.out.print(simplealert.getText());
		Thread.sleep(2000);
		simplealert.accept();
		Thread.sleep(2000);

		// confirmation alert
		driver.findElement(By.xpath("//input[@name='confirmation']")).click();
		org.openqa.selenium.Alert confirmationalert=driver.switchTo().alert();
		System.out.println(confirmationalert.getText());
		Thread.sleep(200);
		confirmationalert.dismiss();
		Thread.sleep(1000);


		//prompt alert
		
		driver.findElement(By.xpath("//input[@name='prompt']")).click();
		org.openqa.selenium.Alert propmtalert=driver.switchTo().alert();
		System.out.println(propmtalert.getText());
		Thread.sleep(2000);
		propmtalert.sendKeys("yasmeen");
		propmtalert.accept();
		Thread.sleep(1000);
		driver.close();
		
	}

}
