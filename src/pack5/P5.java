package pack5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P5 
{
	public static void main(String[] args) throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.Google.co.in");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("selenium");
		Thread.sleep(2000);
		
		List<WebElement> suggestions = driver.findElements(By.xpath("//span[text()='selenium']"));
		for(WebElement a:suggestions)
		{
			String text = a.getText();
			System.out.println(text);
			
			System.out.println();
		}
	}

}
