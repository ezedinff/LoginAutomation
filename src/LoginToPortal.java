import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class LoginToPortal {
    WebDriver driver;
    WebElement user, pass, button;
    public LoginToPortal() {
        Scanner scanner  =  new Scanner(System.in);
        String username = scanner.next("Enter your username: ");
        String password = scanner.next("Enter your password: ");
        if (username != null && password != null) {
            login(username, password);
        }else{
            System.err.println("sorry! you missed out the program.");
        }
    }
    public void login(String username, String password)
    {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver =  new ChromeDriver();
        driver.get("http://portal.aait.edu.et");
        user =  driver.findElement(By.id("UserName"));
        pass =  driver.findElement(By.id("Password"));
        pass =  driver.findElement(By.className("btn-success"));
        user.sendKeys(username);
        pass.sendKeys(password);
        button.click();
    }
}
