import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Getwindowhandles
{
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://forum.uipath.com/t/forum-faq-beginner-s-guide/200562");
        driver.findElement(By.xpath("//a[@class='dropbtn status']")).click();
        Set<String> windowids=driver.getWindowHandles();
        List<String> windowlist=new ArrayList(windowids);
        String parentid=windowlist.get(0);
        String childid=windowlist.get(1);

        driver.switchTo().window(childid);
        System.out.println(driver.getTitle());

        driver.switchTo().window(parentid);
        System.out.println(driver.getTitle());

       for(String winid:windowids)
        {
            String title=driver.switchTo().window(winid).getTitle();
            if (title.equals("UiPath Status"))
            {
                System.out.println(driver.getCurrentUrl());
            }

        }

    }
}
