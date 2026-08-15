import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Checkboxes
{
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        //to select 1 checkbox
        driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();

        //to select multiple checkboxes
        List<WebElement> checkboxes=driver.findElements(By.xpath("//div[@id='checkbox-example']//input[@type='checkbox']"));
      /*  for (int i=0; i<=checkboxes.size(); i++)
        {
            checkboxes.get(i).click();
        }

       */

        /*for(WebElement checkbox:checkboxes)
        {
            checkbox.click();
        }

         */

        for(int i=2; i<checkboxes.size(); i++)
        {
            checkboxes.get(i).click();
        }
    }
}
