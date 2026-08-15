package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test
{
    public static void main(String[]args)
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("userid")).sendKeys("sto001");
        driver.findElement(By.xpath("//input[@name='logsubmit']")).click();
    }
}
