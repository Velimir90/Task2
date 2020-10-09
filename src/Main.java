import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome. ChromeDriver;
import org.openqa.selenium.WebElement;

public class Main {


    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.get("https://www.delfi.rs/");

        WebElement registrationButton = driver.findElement(By.xpath("//a[@href='/registracija.html']"));
        registrationButton.click();
        
        WebElement nameAndSurnameField = driver.findElement(By.id("profil_ime"));
        nameAndSurnameField.sendKeys("Marko Markovic");
    }
    
}
