package ImmedisTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Login_001 {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://qa-task.immedis.com/");
        driver.manage().window().maximize();

        WebElement username=driver.findElement(By.name("username"));
        WebElement password=driver.findElement(By.name("password"));
        WebElement signin=driver.findElement(By.xpath("//div[contains(text(),'Sign In')]"));
        username.sendKeys("admin");
        password.sendKeys("123456");
        signin.click();
    }
}
