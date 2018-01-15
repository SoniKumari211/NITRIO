import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Create_Recommendation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=null;
		//chrome 63 version...
        //System.setProperty("webdriver.chrome.driver", "/Users/intellisqa/Downloads/chromedriver");
		
		//chrome 53 version...
		System.setProperty("webdriver.chrome.driver", "/Users/intellisqa/Downloads/chromedriver-3");
		
		ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addExtensions(new File("/Users/intellisqa/Downloads/Nitrio-SalesAware_v0.12.1.crx"));
        DesiredCapabilities desiredCapabilities=DesiredCapabilities.chrome();
        desiredCapabilities.setCapability(ChromeOptions.CAPABILITY,chromeOptions);
        driver = new ChromeDriver(desiredCapabilities);
        System.out.println("Go to the NITRIO");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
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
        driver.findElement(By.xpath("//*[@id='dashboard']/div/div[1]/div/nav/div[1]/ul/li[2]/a")).click();
        System.out.println("Click on Recommendations tab");
        driver.findElement(By.xpath("//*[@id='dashboard']/div/div[2]/div[3]/div/div[2]")).click();
        System.out.println("Click on link “+ new Recommendation”");
        driver.findElement(By.xpath("//*[@id='nitrio-edit-recommendation-modal']/div/div[1]/input")).sendKeys("Soni");
        System.out.println("Enter the Name in Subject field...");
        driver.findElement(By.xpath("//*[@id='nitrio-edit-recommendation-modal']/div/div[2]/textarea")).sendKeys("Kumari");
        System.out.println("Enter the Surname in recommendation field...");
        driver.findElement(By.xpath("//*[@id='nitrio-edit-recommendation-modal']/div/div[3]/div/div/input")).
        sendKeys("Customer is interested in A/B testing of their product");
        System.out.println("Search for any topic");
        driver.findElement(By.xpath("//*[@id='nitrio-edit-recommendation-modal']/div/div[3]/div/div/div")).click();
        System.out.println("Select the Search topic");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='nitrio-edit-recommendation-modal']/div/button[2]")).click();
        System.out.println("Click on Save button...");
        driver.findElement(By.xpath("//*[@id='dashboard']/div/div[2]/div[3]/table/tbody/tr[1]/td[4]/div")).isDisplayed();
        System.out.println("The new recommendation has been created successfully...");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

	}

}
