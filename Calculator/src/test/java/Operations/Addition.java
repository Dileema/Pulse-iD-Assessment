package Operations;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;






public class Addition {
	
  
    WebDriver driver = null;

	
	public Addition(WebDriver driver) {
		this.driver = driver;
	}
	
   
  	public void add() throws InterruptedException {
		
		
		WebElement canvas = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("canvas")));
		
			
			//clicking on 3
			new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(0,(255/6)*3).click().build().perform();
			Thread.sleep(2000);
			//clicking on the plus sign (+)
			new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset((174/5)*3,(255/6)*5).click().build().perform();
			Thread.sleep(2000);
			//clicking on 1
			new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(-(174/5)*4,(255/6)*3).click().build().perform();
			Thread.sleep(2000);
			//clicking on equals to sign (=)
			new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset((174/5)*5,(255/6)*5).click().build().perform();
			Thread.sleep(2000);
			//clicking on clear
			new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset((174/5)*5,-(255/6)*2).click().build().perform();
			
			
	}
  public void add_negative() throws InterruptedException {
		
		
		WebElement canvas = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("canvas")));
		
			
			//clicking on -3
		    new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(0,(255/6)*5).click().build().perform();
		    new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(0,(255/6)*3).click().build().perform();
			Thread.sleep(2000);
			//clicking on the plus sign (+)
			new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset((174/5)*3,(255/6)*5).click().build().perform();
			Thread.sleep(2000);
			//clicking on 1
			new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(-(174/5)*4,(255/6)*3).click().build().perform();
			Thread.sleep(2000);
			//clicking on equals to sign (=)
			new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset((174/5)*5,(255/6)*5).click().build().perform();
			Thread.sleep(2000);
			//clicking on clear
			new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset((174/5)*5,-(255/6)*2).click().build().perform();
			
	}
}
