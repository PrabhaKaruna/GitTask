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
		
		private void newMethod1() {
			// TODO Auto-generated method stub

		}private void newMethod2() {
			// TODO Auto-generated method stub

		}private void newMethod3() {
			// TODO Auto-generated method stub
      
		}public void newMethod4() {
			// TODO Auto-generated method stub
		}
		
		public void newMethod5() {
			// TODO Auto-generated method stub
                }
    	private void testData() {
			// TODO Auto-generated method stub

		}private void inputData() {
			// TODO Auto-generated method stub

		}private void outputData() {
			// TODO Auto-generated method stub
		}
}
