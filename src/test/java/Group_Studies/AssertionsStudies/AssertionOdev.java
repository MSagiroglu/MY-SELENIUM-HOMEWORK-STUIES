package Group_Studies.AssertionsStudies;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AssertionOdev {
   WebDriver driver;
    @Before
    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // https://www.youtube.com adresine gidin
        driver.get("https://youtube.com");

    }

    @Test
    public void test01() {
        // Sayfa başlığının “YouTube” oldugunu test edin
        Assert.assertEquals("YouTube",driver.getTitle());
        System.out.println("Sayfa başlığının “YouTube”  'dır");
    }

    @Test
    public void test02() {
        // YouTube resminin görüntülendiğini (isDisplayed()) test edin
        Assert.assertTrue(driver.findElement(By.xpath("(//yt-icon)[6]")).isDisplayed());
        System.out.println("YouTube resminin görüntülendiğini ispatladım");
    }

    @Test
    public void test03() {
        // YouTube resminin görüntülendiğini (isDisplayed()) test edin
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='search']")).isEnabled());
        System.out.println("Search Box 'in erisilebilir oldugunu ispat ettim");
    }

    @Test
    public void test04() {
        // ○ wrongTitleTest => Sayfa basliginin “youtube” olmadigini dogrulayin
        Assert.assertNotEquals(driver.getTitle(),"youtube");
        System.out.println("Sayfa basliginin “youtube” olmadigini dogruladım");
    }

}
