package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class DropDown {
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriver driver;
        WebDriverManager.edgedriver().setup();
        driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
        Thread.sleep(2000);
//SINGLE SELECTION DROP DOWN
        WebElement courseElement = driver.findElement(By.id("course"));
        Select courseNameDropdown = new Select(courseElement);
        List<WebElement> courseNameDropDownOptions = courseNameDropdown.getOptions();
        for (WebElement option : courseNameDropDownOptions) {
            System.out.println(option.getText());
        }
        courseNameDropdown.selectByIndex(1);
        Thread.sleep(3000);
        courseNameDropdown.selectByVisibleText("Java");
        Thread.sleep(2000);
        courseNameDropdown.selectByValue("python");
        String selectedText = courseNameDropdown.getFirstSelectedOption().getText();
        System.out.println("selected visible text" + selectedText);
        TakesScreenshot ts = (TakesScreenshot)driver;
        File file = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("./Screenshots/Sngdropdown.png"));
    }
}
