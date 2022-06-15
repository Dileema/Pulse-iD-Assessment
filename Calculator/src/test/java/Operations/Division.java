package Operations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Division {

	WebDriver driver = null;


	public Division(WebDriver driver) {
		this.driver = driver;
	}

	public void devide() throws InterruptedException{

		
		WebElement canvas = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("canvas")));


		//clicking on 3
		new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(0,(255/6)*3).click().build().perform();
		Thread.sleep(2000);
		//clicking on the division sign (/)
		new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset((174/5)*3,-(255/6)*1).click().build().perform();
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

	public void devideby_zero() throws InterruptedException {

		WebElement canvas = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("canvas")));

		//clicking on 3
		new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(0,(255/6)*3).click().build().perform();
		Thread.sleep(2000);
		//clicking on the division sign (/)
		new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset((174/5)*3,-(255/6)*1).click().build().perform();
		Thread.sleep(2000);
		//clicking on 0
		new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(-(174/5)*4,(255/6)*5).click().build().perform();
		Thread.sleep(2000);
		//clicking on equals to sign (=)
		new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset((174/5)*5,(255/6)*5).click().build().perform();
		Thread.sleep(2000);
        //clicking on clear
		new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset((174/5)*5,-(255/6)*2).click().build().perform();

	}

	public void zerodevideby_zero() throws InterruptedException {

		WebElement canvas = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("canvas")));

		//clicking on 0
		new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(-(174/5)*4,(255/6)*5).click().build().perform();
		Thread.sleep(2000);
		//clicking on the division sign (/)
		new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset((174/5)*3,-(255/6)*1).click().build().perform();
		Thread.sleep(2000);
		//clicking on 0
		new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset(-(174/5)*4,(255/6)*5).click().build().perform();
		Thread.sleep(2000);
		//clicking on equals to sign (=)
		new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset((174/5)*5,(255/6)*5).click().build().perform();
		Thread.sleep(2000);
		//clicking on clear
		new Actions(driver).moveToElement(canvas, 0, 0).moveByOffset((174/5)*5,-(255/6)*2).click().build().perform();

	}

}


