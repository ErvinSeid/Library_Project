package ImmedisTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Books_013 {
    public static void main(String[] args) {
//Editing existing  book

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
       // 3. Click on “Edit"
        WebElement edit=driver.findElement(By.xpath("//tbody/tr[423]/td[5]/a[1]"));
        edit.click();
       // 4. Edit the name to “tam ilmihal"
        WebElement name=driver.findElement(By.id("Name"));
        name.sendKeys("tam ilmihal");
       // 5. Click on “Save” button.
        WebElement save=driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/form[1]/div[5]/input[1]"));
        save.click();
    }
}
