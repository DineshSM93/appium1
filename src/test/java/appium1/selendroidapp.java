package appium1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class selendroidapp {

	static AndroidDriver driver;

	public static void main(String[] args) throws Exception {

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Galaxy A20s");
		cap.setCapability("udid", "R9SM901AXZJ");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "11");
		cap.setCapability("appPackage", "io.selendroid.testapp");
		cap.setCapability("appActivity", "io.selendroid.testapp.HomeScreenActivity");
		// cap.setCapability("autoGrantPermissions", true);
		// cap.setCapability("autoAcceptAlerts",true);
		
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AndroidDriver(url, cap);

		 WebElement continuebutton = driver.findElement(By.id("com.android.permissioncontroller:id/continue_button"));
		 continuebutton.click();
		
		 Thread.sleep(5000);
		WebElement registrationbutton = driver.findElement(By.id("io.selendroid.testapp:id/my_text_field"));
		registrationbutton.click();
		
		Thread.sleep(3000);
		
		WebElement username = driver.findElement(By.xpath("//*[@text='E-Mail']"));
		
		// WebElement username = driver.findElement(By.id("io.selendroid.testapp:id/label_username"));
		username.sendKeys("Dinesh");
	}

}
