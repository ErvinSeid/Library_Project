package ImmedisTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetBooks_006 {
    public static void main(String[] args) {
        //Editing existing book
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
        // 3. Scroll to “Ernej” book
        // 4. Click on “Edit”
        WebElement edit=driver.findElement(By.xpath("//tbody/tr[85]/td[4]/a[1]"));
        edit.click();
        // 5. By clicking BookId change the bookid name
        WebElement bookIddrop=driver.findElement(By.id("BookId"));
        bookIddrop.click();
        WebElement bookIddr=driver.findElement(By.xpath("//option[contains(text(),'Ernej')]"));
        bookIddr.click();
        // 6. Click on “Save” button
        WebElement save=driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/form[1]/div[4]/input[1]"));
        save.click();
    }
}
