package ImmedisTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Users_008 {
    public static void main(String[] args) {
// Pre-condition
//1. Navigate to 	https://qa-task.immedis.com/
        WebDriver driver=new ChromeDriver();
        driver.get("https://qa-task.immedis.com/");
        driver.manage().window().maximize();
// 2. Input correct username and password
        WebElement username=driver.findElement(By.name("username"));
        WebElement password=driver.findElement(By.name("password"));
        WebElement signin=driver.findElement(By.xpath("//div[contains(text(),'Sign In')]"));
        username.sendKeys("admin");
        password.sendKeys("123456");
// 3. Click on “Sign in” button
        signin.click();

      //Steps
        //4. Click on “Users” button from the menu
        WebElement users=driver.findElement(By.xpath("//a[contains(text(),'Users')]"));
        users.click();
        //5. Navigate to the user QAER
        //6. Click on “Edit"
        WebElement edit=driver.findElement(By.xpath("//tbody/tr[1]/td[2]/a[1]"));
        edit.click();
    }
}
