package com.testProject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

public class SeleniumHelper {
	
	public void captureSreenshot(WebElement getElement) {
		
				try {
					File file=getElement.getScreenshotAs(OutputType.FILE);
					File destFile =new File("image.png");
					FileUtils.copyFile(file,destFile);
				} catch (WebDriverException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}

}
