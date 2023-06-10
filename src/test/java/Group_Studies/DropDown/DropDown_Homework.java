package Group_Studies.DropDown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class DropDown_Homework {
    /*
    ●https://www.amazon.com/ adresine gidin.
    -Test 1
    Arama kutusunun yanindaki kategori menusundeki kategori sayisinin 45
    oldugunu test edin
    -Test 2
    1.Kategori menusunden Books secenegini secin
    2.Arama kutusuna Java yazin ve aratin
    3.Bulunan sonuc sayisini yazdirin
    4.Sonucun Java kelimesini icerdigini test edin
     */
    WebDriver driver;
    @Before
    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // ●https://www.amazon.com/ adresine gidin.
        driver.get("https://www.amazon.com/");

    }

    @Test
    public void test01() {
        /*
        -Test 1
    Arama kutusunun yanindaki kategori menusundeki kategori sayisinin 45
    oldugunu test edin
         */
        WebElement kategori= driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        Select select=new Select(kategori);
        Assert.assertEquals(45,select.getOptions().size());
        System.out.println(select.getOptions().size());


    }

    @Test
    public void test2() {
        WebElement kategori= driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        Select select=new Select(kategori);
        select.selectByVisibleText("Books");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Java", Keys.ENTER);
        System.out.println("Sonuç = "+driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]")).
                getText().split(" ")[3]);
        Assert.assertTrue(driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]")).
                getText().contains("Java"));
        System.out.println("Sonuç yazısında 'Java' kelimesi vardır");

        /*
        -Test 2
    1.Kategori menusunden Books secenegini secin
    2.Arama kutusuna Java yazin ve aratin
    3.Bulunan sonuc sayisini yazdirin
    4.Sonucun Java kelimesini icerdigini test edin
         */
    }
}
