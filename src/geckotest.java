import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class geckotest {
	@Test
	public void firefox() throws MalformedURLException, URISyntaxException {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(CapabilityType.BROWSER_NAME, "firefox");
		
		WebDriver driver = new RemoteWebDriver(new URI("http://192.168.0.179:4444").toURL(), caps);
		driver.get("https://www.google.com/");
		System.out.println("**"+driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("SELENIUM");
		System.out.println("***");
		driver.quit();
	}
}
