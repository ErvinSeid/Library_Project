package ImmedisTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Users_005 {
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
// 1. Click on “Users” button from the menu
        WebElement users=driver.findElement(By.xpath("//a[contains(text(),'Users')]"));
        users.click();

// 2. Click on “Create New”
        WebElement createNew= driver.findElement(By.xpath("//body[1]/div[1]/p[1]/a[1]"));
        createNew.click();

//3. Input new name into the “Name” field
        WebElement name=driver.findElement(By.name("Name"));
        WebElement create=driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/form[1]/div[2]/input[1]"));
        name.sendKeys("QAER");

//4. Click on “Create” button
        create.click();
    }
}
