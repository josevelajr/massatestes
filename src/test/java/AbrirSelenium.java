import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AbrirSelenium {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/jvela/IdeaProjects/cursoMassa/cursoMassa/src/drivers/chromedriver_linux64/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://seubarriga.wcaquino.me/");
        driver.findElement(By.id("email")).sendKeys("jose.vela.jr@outlook.com");
        driver.findElement(By.id("senha")).sendKeys("123456");
        driver.findElement(By.tagName("button")).click();

        driver.quit();





    }


}
