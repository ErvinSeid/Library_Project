package ImmedisTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetBooks_004 {
    public static void main(String[] args) {

        //“Add new request” button functionality
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
        // 1. Click on “Get a book” from the menu
        WebElement getAbook=driver.findElement(By.xpath("//a[contains(text(),'Books')]"));
        getAbook.click();
        // 2. Click on “Add new request” link
        WebElement addbook=driver.findElement(By.xpath("//a[contains(text(),'Create New')]"));
        addbook.click();
        // 3. Click on UserID option
        WebElement userId=driver.findElement(By.id("UserId"));
        userId.click();
        // 4. Select from the drop-down option userid and click on it
        WebElement userDrop=driver.findElement(By.xpath("//option[contains(text(),'QAER')]"));
        userDrop.click();
        // 5. Click on BookId option
        WebElement bookIddrop=driver.findElement(By.id("BookId"));
        bookIddrop.click();
        // 6. Select from the drop-down option bookid and click on it
        WebElement bookIddr=driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/form[1]/div[2]/select[1]/option[423]"));
        bookIddr.click();
        // 7. Click on Create button
        WebElement bookDrop=driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/form[1]/div[3]/input[1]"));
        bookDrop.click();

    }
}
