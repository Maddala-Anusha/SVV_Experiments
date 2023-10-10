package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Amazon {
    public static void main(String[] args) throws IOException {
        WebDriver driver;
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.get("https://www.amazon.in");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("dell");
        driver.findElement(By.id("nav-search-submit-button")).click();
        TakesScreenshot ts=(TakesScreenshot) driver;
        File file=ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("C:\\Users\\HP\\IdeaProjects\\Demo\\Screenshots\\Image1.png"));
    }
}
