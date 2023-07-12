package org.cts;

	import org.junit.Assert;
	import org.junit.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Sample {

		@Test
	 public void test() {
			 WebDriver driver = new ChromeDriver();
			 driver.get("https://www.facebook.com/");
			 driver.manage().window().maximize();
			 Assert.assertTrue("verify url",driver.getCurrentUrl().contains("facebook"));
			 WebElement txtUser = driver.findElement(By.id("email"));
			 txtUser.sendKeys("greens");
			 Assert.assertEquals("verify username","greens",txtUser.getAttribute("value"));
			 WebElement txtPass = driver.findElement(By.id("pass"));
			 txtPass.sendKeys("prabha@1");
			 WebElement btnlogin = driver.findElement(By.
					name("login"));
			 btnlogin.click();
			 driver.quit();
			 
		}
		
		
		 
		 
		
		 
		 
		 
	}

}
