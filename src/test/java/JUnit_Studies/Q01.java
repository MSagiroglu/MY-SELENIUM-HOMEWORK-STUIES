package JUnit_Studies;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q01 {
    WebDriver driver;
    @Before
    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        System.out.println("Her Test'den önce Before çalışır");
    }

    @Test
    public void test01() {
        driver.get("https://amazon.com");
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

    }
    @Test
    public void test02() {

    }
    @Test
    public void test03() {
    }

    @After
    public void tearDown() throws Exception {
    driver.close();
        System.out.println("Her Test'den sonra After çalışır");

    }
}
