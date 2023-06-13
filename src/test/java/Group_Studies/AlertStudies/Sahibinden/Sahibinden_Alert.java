package Group_Studies.AlertStudies.Sahibinden;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class Sahibinden_Alert extends TestBase {
    @Test
    public void test01() {
        driver.get("https://sahibinden.com");
        driver.findElement(By.xpath("//*[@id='onetrust-reject-all-handler']")).click();
        bekle(5);

        driver.findElement(By.xpath("//*[@src='data:image/gif;base64,R0lGODlhAQABAPAAAAAAAAAAACH5BAEAAAAALAAAAAABAAEAAAICRAEAOw==']")).click();
    }
}
