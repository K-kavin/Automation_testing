package generic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotScript {

	public static void main(String[] args) 
	{
	.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.instagram.com");
		//step 1
		TakesScreenshot ts=(TakesScreenshot) driver;
		//step 2
		File src = ts.getScreenshotAs(OutputType.FILE);
		//step 3
		File dst=new File("./screenshot/ .jpeg");
		try {
			FileHandler.copy(src, dst);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("HELLO WORLD");
		System.out.println("HELLO WORLD");
	}

}
