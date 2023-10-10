package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class DynamicLocator {
    @Test
    void test()
    {
        WebDriver driver;
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.get("https://lms.kluniversity.in/login/index.php");
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("2100031469");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Anush@200329");
        driver.findElement(By.xpath("//*[@id=\"loginbtn\"]")).submit();
    }
}
