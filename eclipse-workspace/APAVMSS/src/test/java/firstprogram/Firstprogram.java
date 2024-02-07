package firstprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Firstprogram {

	public static void main(String[] args) {
		
		 WebDriver driver= new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.findElement(By.name("q")).sendKeys("amazon");
			System.out.println(driver.getTitle());

	}

}
