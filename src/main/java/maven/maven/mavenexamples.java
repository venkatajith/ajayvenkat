package maven.maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mavenexamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c:\\users\\babbi\\Downloads\\chromedriver");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.9.0");
	}

}
