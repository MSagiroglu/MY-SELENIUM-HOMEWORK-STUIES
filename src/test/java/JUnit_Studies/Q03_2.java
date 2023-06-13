package JUnit_Studies;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Q03_2 {
    /*
     //BeforeClass methodu ile driver ı olusturun ve Maximize edin, 15 sn bekletin
     //Before methodunda http://www.google.com adresine gidin
     //Üç farklı test methodu ile;
     //arama kutusuna "The God Father" yazip, cikan sonuc sayisini yazdirin
     //arama kutusuna  "Lord of the Rings" yazip, cikan sonuc sayisini yazdirin
    //arama kutusuna  "Kill Bill" yazip, cikan sonuc sayisini yazdirin
    //After method'u ile başlıkları yazdırınız
    //AfterClass ile browser'ı kapatınız
  */
    static WebDriver driver;
    @BeforeClass
    public static void beforeClass() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @Before
    public void setUp() {
        driver.get("http://www.google.com");
    }
    @Test
    public void test01() {
        WebElement aramaKutusu = driver.findElement(By.xpath("//*[@class='gLFyf']"));
        aramaKutusu.sendKeys("The God Father", Keys.ENTER);
        WebElement theGodFather = driver.findElement(By.cssSelector("div#result-stats"));
        String [] sonucYazisi = theGodFather.getText().split(" ");
        System.out.println("TheGodFather arama sonucu : "+sonucYazisi[1]);
    }
    @Test
    public void test02() {
        WebElement aramaKutusu = driver.findElement(By.xpath("//*[@class='gLFyf']"));
        aramaKutusu.sendKeys("Lord of the Rings", Keys.ENTER);
    }
    @Test
    public void test03() {
        WebElement aramaKutusu = driver.findElement(By.xpath("//*[@class='gLFyf']"));
        aramaKutusu.sendKeys("Kill Bill", Keys.ENTER);
    }
    @After
    public void tearDown() {
        System.out.println(driver.getTitle());
    }
    @AfterClass
    public static void afterClass() throws Exception {
        driver.close();
    }
}
