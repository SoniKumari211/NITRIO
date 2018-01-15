import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Login {

	public static void main(String[] args) throws InterruptedException {
        WebDriver driver=null;
      //chrome driver path for 63+ version...
        //System.setProperty("webdriver.chrome.driver", "/Users/intellisqa/Downloads/chromedriver");
		
		//chrome driver path for 43+  version...
		System.setProperty("webdriver.chrome.driver", "/Users/intellisqa/Downloads/chromedriver-3");
		
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addExtensions(new File("/Users/intellisqa/Downloads/Nitrio-SalesAware_v0.12.1.crx"));
        DesiredCapabilities desiredCapabilities=DesiredCapabilities.chrome();
        desiredCapabilities.setCapability(ChromeOptions.CAPABILITY,chromeOptions);
        driver = new ChromeDriver(desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        System.out.println("Go to the NITRIO");
        driver.findElement(By.cssSelector("#dashboard > div > div.nitrio-login > div > a > div")).click();
		System.out.println("Click on Sign in with  Google link");
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("selenium@heytester.org");
		System.out.println("Enter the User Name");
		driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
		System.out.println("Click on Next button");
		driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("Selen2018!");
		System.out.println("Enter the Password");
		Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='passwordNext']/content/span")).click();
        System.out.println("Click on Next button");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='submit_approve_access']/content/span")).click();
        System.out.println("Click on ALLOW button");
        System.out.println("User is successfully Login...");
        Thread.sleep(3000);
	}

}
