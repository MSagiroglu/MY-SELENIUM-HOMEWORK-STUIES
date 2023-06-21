package Homeworks_Lesson;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Q09{
    public static void main(String[] args) throws InterruptedException {

        //1.) https://www.diemol.com/selenium-4-demo/relative-locators-demo.html adresine
        //gidin
        //2.) Berlin’i 3 farkli relative locator ile locate
        //edin 3 ) Relative locator’larin dogru calistigini
        //test edin

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //1.) https://www.diemol.com/selenium-4-demo/relative-locators-demo.html adresine gidin
        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");

        //2.) Berlin’i 3 farkli relative locator ile locate edin
        WebElement nyc = driver.findElement(By.cssSelector("img#pid3_thumb"));
        WebElement bayArea = driver.findElement(By.cssSelector("img#pid8_thumb"));
        WebElement boston = driver.findElement(By.cssSelector("img#pid6_thumb"));
        WebElement sailor = driver.findElement(By.cssSelector("img#pid11_thumb"));

        WebElement berlin1 = driver.findElement(with(By.tagName("a")).below(nyc));
        WebElement berlin2 = driver.findElement(with(By.tagName("a")).above(sailor));
        WebElement berlin3 = driver.findElement(with(By.tagName("a")).toLeftOf(bayArea));

        //*[contains(text(), 'Mountie')]  text olarak arama icin kullaniyoruz.

        //  berlin1.click();
        //  Thread.sleep(2000);

        //  driver.navigate().refresh();

        // berlin2.click();
        berlin3.click();





        // 3 ) Relative locator’larin dogru calistigini
        //test edin


    }
}