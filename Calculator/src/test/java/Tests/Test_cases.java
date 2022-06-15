package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Operations.Addition;
import Operations.Division;
import Operations.Multiplication;
import Operations.Substraction;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_cases {

	WebDriver driver = null;


	@BeforeSuite
	public void setup() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		}

	@Test(priority=1)
	public void launch_calcluator() {
		driver.get("https://www.online-calculator.com/full-screen-calculator");
		new WebDriverWait(driver, 10).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("fullframe")));
		
	}	


	@Test(priority=2)
	public void operate1() throws InterruptedException {
		Addition add = new Addition(driver);
		add.add();
		System.out.println("Addition is successful");
		Thread.sleep(3000);
	}	

	@Test(priority=3)
	public void operate2() throws InterruptedException {
		Substraction sub = new Substraction(driver);
		sub.subtract();
		System.out.println("Substraction is successful");
		Thread.sleep(3000);
	}

	@Test(priority=4)
	public void operate3() throws InterruptedException {
		Division devide = new Division(driver);
		devide.devide();
		System.out.println("Division is successful");
		Thread.sleep(3000);
	}

	@Test(priority=5)
	public void operate4() throws InterruptedException {
		Multiplication multi = new Multiplication(driver);
		multi.multiply();
		System.out.println("Multiplication is successful");
		Thread.sleep(3000);

	}	

	@Test(priority=6)
	public void positivedevide_byzero() throws InterruptedException {
		Division zero = new Division(driver);
		zero.devideby_zero();
		System.out.println("Positive number devided by zero test is successful");
		Thread.sleep(3000);
	}	
    
    @Test(priority=7)
	public void dividingzero_byzero() throws InterruptedException {
		Division zero2 = new Division(driver);
		zero2.zerodevideby_zero();
		System.out.println("Zero devided by zero test is successful");
		Thread.sleep(3000);
	}
    
    @Test(priority=8)
	public void postivemultiply_bynegative() throws InterruptedException {
		Multiplication neg = new Multiplication(driver);
		neg.multiply_negative();
		System.out.println("Positive number multiply by negative number test is successful");
		Thread.sleep(3000);
	}
    
    @Test(priority=9)
	public void adding_negative() throws InterruptedException {
		Addition neg1 = new Addition(driver);
		neg1.add_negative();
		System.out.println("Adding negative number to positive number test is successful");
		Thread.sleep(3000);
	}
    
    @Test(priority=10)
	public void substracting_negative() throws InterruptedException {
		Substraction neg2 = new Substraction(driver);
		neg2.subtract_fromgreaternumber();
		System.out.println("Substract from greater number test is successful");
		Thread.sleep(3000);
	}
    
 //To verify the output of the operations, can use OCR image verification to compare the image of actual output and expected output  
    
    @AfterSuite
    public void close_window() {
    	driver.close();
    	System.out.println("Calculator test cases are completed");
    }

}
