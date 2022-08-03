package com.testProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class App 
{
	WebDriver d;
    @Test
    public void startTest() throws InterruptedException {
    	System.out.println("First sample test started");
    	System.setProperty("webdriver.edge.driver", "C:\\Ramakrishna\\Softwares\\edgedriver_win32\\msedgedriver.exe");
    	d = new EdgeDriver();
    	d.get("https://www.toolsqa.com/selenium-webdriver/run-selenium-tests-on-edge/");
    	Thread.sleep(10000);
    	d.quit();
    	System.out.println("Execution ot completed");
    }
}
