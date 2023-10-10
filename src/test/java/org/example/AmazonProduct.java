package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.IOException;

public class AmazonProduct {
    public static void main(String[] args) throws IOException {
        WebDriver driver;
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.get("https://www.amazon.in");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("dell");
        driver.findElement(By.id("nav-search-submit-button")).submit();
        TakesScreenshot ts = (TakesScreenshot) driver;
        File file = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("./Screenshots/Image1.png"));
    }
}
