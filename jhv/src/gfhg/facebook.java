package gfhg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class facebook {
	WebDriver driver;
	
	@Test
	public void test()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (8)\\chromedriver.exe");
		driver=new ChromeDriver();
	   driver.get("https://www.facebook.com/?stype=lo&jlou=AfcCiQppBsO09snH9MeC7Xt4xPTe0YfQTSTqwD9J0K_38dEr3PulVhqji1kcyVqc788Vx8rSDAIsbioqLk5pFvcNvGyewKrp5-IPk7yOV0IYOg&smuh=50132&lh=Ac9980M_9CgRkxcHO4o");
		//WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Tanujaanvitha@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("tanujarith");
		driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
		driver.findElement(By.xpath("(//span[contains(.,'Tanuja Anvitha')])[1]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div/div/div[3]/div/div/div/div[1]/div/div/div[1]/div/div/div/div/div/div/a[3]/div[1]/span")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div/div/div[4]/div[2]/div/div[2]/div[3]/div[27]/div/div/div/div/div/div/div/div/div/div/div/div[2]/div/div[4]/div/div/div[1]/div/div[2]/div/div[3]/div/div[1]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div/div[2]/div/div/div[1]/div[1]/div/div/div[1]/div/div/div[1]/div/div[4]/div/div[1]/div[2]/div/div/div/div/span/span")).click();
		//driver.findElement(By.xpath("//input[contains(@value,'Tanuja Anvitha')]")).click();
		//driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div/div/label/input")).sendKeys("SShravan Kumar");
		//driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div/div/label/input")).click();
	//	driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div/div[3]/div/div/div/div/div[2]/div/div[2]/div/ul/div/li[5]/div/div/div/a/div[1]/div[2]/div/div/div/div/span")).click();
		//driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div/div/div[3]/div/div/div/div[2]/div/div/div/div[2]/div/span/div/div[1]/div/img")).click();
		//driver.findElement(By.xpath("//path[contains(@d,'M19.492 4.112a.972.972 0 00-1.01.063l-3.052 2.12a.998.998 0 00-.43.822v5.766a1 1 0 00.43.823l3.051 2.12a.978.978 0 001.011.063.936.936 0 00.508-.829V4.94a.936.936 0 00-.508-28zM10.996 18A3.008 3.008 0 0014 14.996V5.004A3.008 3.008 0 0010.996 2H3.004A3.008 3.008 0 000 5.004v9.992A3.008 3.008 0 003.004 18h7.992z')]")).click();
		//driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div/div/div[3]/div/div/div/div[2]/div/div/div/div[2]/div/span/div/div[1]/div/img")).click();
		//driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div/div/div[4]/div[2]/div/div[2]/div[1]/div/div/div/div/div[1]/div/div[1]/span")).sendKeys("HI");
		//driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[5]/div/div[1]/div[1]/div[1]/div/div/div/div/div/div/div[2]/div/div[2]/form/div/div[3]/div[2]/div[2]/div/span/div")).click();
		//driver.findElement(By.xpath("//div[contains(@aria-label,'Press Enter to send')]")).sendKeys("HI");
		//driver.findElement(By.xpath("//div[contains(@aria-label,'Press Enter to send')]")).click();
		//driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[5]/div/div[1]/div[1]/div[2]/div/div/div[1]/div[1]/div/div/div[1]/div/div[2]/div/div/div[2]/div[1]/div/div/table/tbody/tr[5]/td[1]/div/button")).click();
	///driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[5]/div/div[1]/div[1]/div[1]/div/div/div/div/div/div/div[2]/div/div[2]/form/div/div[3]/div[2]/div[2]/div/span/div/svg")).click();
		//driver.findElement(By.xpath("//div[contains(@class,'_1mf _1mj')]")).sendKeys("IHCKJ");
	//	driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[5]/div/div[1]/div[1]/div[1]/div/div/div/div/div/div/div[2]/div/div[2]/form/div/div[3]/div[2]/div[2]/div/span/div")).click();
		//driver.findElement(By.xpath("//div[contains(@class,'_1mf _1mj')]")).sendKeys("INCREDIABLE MOVIE");
	//	driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[5]/div/div[1]/div[1]/div[1]/div/div/div/div/div/div/div[2]/div/div[2]/form/div/div[3]/span[2]/div")).click();
	//	driver.findElement(By.xpath("//path[contains(@d,'M19.492 4.112a.972.972 0 00-1.01.063l-3.052 2.12a.998.998 0 00-.43.822v5.766a1 1 0 00.43.823l3.051 2.12a.978.978 0 001.011.063.936.936 0 00.508-.829V4.94a.936.936 0 00-.508-.828zM10.996 18A3.008 3.008 0 0014 14.996V5.004A3.008 3.008 0 0010.996 2H3.004A3.008 3.008 0 000 5.004v9.992A3.008 3.008 0 003.004 18h7.992z')]")).click();
		//driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[5]/div/div[1]/div[1]/div[1]/div/div/div/div/div/div/div[2]/div/div[2]/form/div/div[3]/div[2]/div[1]/div/div/div/div/div[2]/div/div/div/div")).sendKeys("INCREDIABLE MOVIE");
	}

}
