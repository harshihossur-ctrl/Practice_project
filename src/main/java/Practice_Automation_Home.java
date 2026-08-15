import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Practice_Automation_Home
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        WebElement button=driver.findElement(By.xpath("right click me"));
        Actions act=new Actions(driver);
        act.contextClick(button).build().perform();
        driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-edit']")).click();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();

    }
}
