package JUnit_Studies;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02 {
      /*
    a.Verilen web sayfasına gidin.
    https://the-internet.herokuapp.com/checkboxes
    b.Checkbox1 ve checkbox2 elementlerini locate edin.
    c.Checkbox1 seçili değilse onay kutusunu tıklayın
    d.Checkbox2 seçili değilse onay kutusunu tıklayın
     */
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
    public void test01() throws InterruptedException {
       // a.Verilen web sayfasına gidin.
        //https://the-internet.herokuapp.com/checkboxes
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        //b.Checkbox1 ve checkbox2 elementlerini locate edin.
        WebElement checkBox1=driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        WebElement checkBox2=driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        Thread.sleep(3000);
        //c.Checkbox1 seçili değilse onay kutusunu tıklayın
        if (!checkBox1.isSelected()){
            checkBox1.click();
        }

       //d.Checkbox2 seçili değilse onay kutusunu tıklayın
        if (checkBox2.isSelected()){
            checkBox2.click();
            checkBox2.click();
            checkBox2.click();

        }else {
            System.out.println("checkBox2 seçilidir.");
        }
    }

    @After
    public void tearDown() throws Exception {
        driver.close();
    }

    @AfterClass
    public static void afterClass() throws Exception {
        System.out.println(" a.Verilen web sayfasına gidin.\n" +
                "    https://the-internet.herokuapp.com/checkboxes\n" +
                "    b.Checkbox1 ve checkbox2 elementlerini locate edin.\n" +
                "    c.Checkbox1 seçili değilse onay kutusunu tıklayın\n" +
                "    d.Checkbox2 seçili değilse onay kutusunu tıklayın \n İşlemleri gerçekleşti");
    }
}
