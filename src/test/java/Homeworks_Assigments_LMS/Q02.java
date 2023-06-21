package Homeworks_Assigments_LMS;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Q02 extends TestBase {
    @Test
    public void test01() {

        //Before methodunda http://www.google.com adresine gidin
        driver.get("http://www.google.com");
        //Üç farklı test methodu ile;
        //arama kutusuna "The God Father" yazip, cikan sonuc sayisini yazdirin
        WebElement aramaKutusu=driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
        aramaKutusu.sendKeys("The God Father", Keys.ENTER);

        String result=driver.findElement(By.cssSelector("div#result-stats")).getText().split(" ")[1];
        System.out.println("result = " + result);
        System.out.println("Sayfa Başlığı = " + driver.getTitle());
        //After method'u ile başlıkları yazdırınız
        //AfterClass ile browser'ı kapatınız
    }

    @Test
    public void test02() {
        //Before methodunda http://www.google.com adresine gidin
        driver.get("http://www.google.com");
        //Üç farklı test methodu ile;
        //arama kutusuna  "Lord of the Rings" yazip, cikan sonuc sayisini yazdirin
        WebElement aramaKutusu=driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
        aramaKutusu.sendKeys("Lord of the Rings", Keys.ENTER);

        String result=driver.findElement(By.cssSelector("div#result-stats")).getText().split(" ")[1];
        System.out.println("result = " + result);
        System.out.println("Sayfa Başlığı = " + driver.getTitle());
        //After method'u ile başlıkları yazdırınız
        //AfterClass ile browser'ı kapatınız

    }

    @Test
    public void test03() {
        //Before methodunda http://www.google.com adresine gidin
        driver.get("http://www.google.com");
        //Üç farklı test methodu ile;
        //arama kutusuna  "Kill Bill" yazip, cikan sonuc sayisini yazdirin
        WebElement aramaKutusu=driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
        aramaKutusu.sendKeys("Kill Bill", Keys.ENTER);

        String result=driver.findElement(By.cssSelector("div#result-stats")).getText().split(" ")[1];
        System.out.println("result = " + result);
        System.out.println("Sayfa Başlığı = " + driver.getTitle());
        //After method'u ile başlıkları yazdırınız
        //AfterClass ile browser'ı kapatınız

    }
/*
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
     */
}
