package appium1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class ApiDemoApp {
	
	static AndroidDriver driver;

	public static void main(String[] args) throws Exception {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Galaxy A20s");
		cap.setCapability("udid", "R9SM901AXZJ");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "11");
		cap.setCapability("appPackage", "com.hmh.api");
		cap.setCapability("appActivity", "com.hmh.api.view.ExpandableList1");
		
		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AndroidDriver(url, cap);
		
		WebElement continuebutton = driver.findElement(By.id("com.android.permissioncontroller:id/continue_button"));
		 continuebutton.click();
		 
		 Thread.sleep(5000);
		
		 WebElement peoplenames = driver.findElement(By.xpath("//*[@text='People Names']"));
		 peoplenames.click();

	}

}
