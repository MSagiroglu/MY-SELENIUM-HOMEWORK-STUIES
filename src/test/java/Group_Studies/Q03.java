package Group_Studies;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;
import java.time.Duration;

public class Q03 {
    // https://www.sahibinden.com/ sayfasina gidin
    // Title ve Url'ini alın ve yazdırın
    // Title'in "Online" kelimesini içerip içermedigini test edin
    // Url'in "sahibinden" kelimesini içerip içermedigini test edin
    // https://www.amazon.com/ sayfasına gidin
    // Title'ini alın ve yazdırın
    // Title'in "more" kelimesini içerip içermedigini test edin
    // sahibinden.com'a geri dönün
    // sayfayı yenileyin
    // amazon.com'a tekrar gelin
    WebDriver driver;
    @BeforeClass
    public static void beforeClass() throws Exception {
        WebDriverManager.chromedriver().setup();

    }

    @Before
    public void setUp() throws Exception {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @Test
    public void test01 () throws InterruptedException {
        // https://www.sahibinden.com/ sayfasina gidin
        driver.get("https://www.sahibinden.com/");
        driver.findElement(By.cssSelector("button[id='onetrust-reject-all-handler']")).click();
        Thread.sleep(5000);
        WebElement x=driver.findElement(By.xpath("//body/img[@id='i9']"));
        x.click();

        }

    @After
    public void tearDown() throws Exception {
    //driver.close();
    }

    @AfterClass
    public static void afterClass() throws Exception {

    }
}
