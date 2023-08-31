package ImmedisTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Books_014 {
    public static void main(String[] args) {

        //Deleting existing  book
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
        // 1. Click on “Books” button from the menu
        WebElement books=driver.findElement(By.xpath("//a[contains(text(),'Books')]"));
        books.click();

        // 2. Navigate to the book named “tam”
        // 3. Click on “Delete"
        WebElement delete=driver.findElement(By.xpath("//tbody/tr[423]/td[5]/a[3]"));
        delete.click();
        // 4. On the confirmation page click on “Delete” button
        WebElement confdelete=driver.findElement(By.xpath("//body/div[1]/div[1]/form[1]/input[2]"));
        confdelete.click();
    }
}
