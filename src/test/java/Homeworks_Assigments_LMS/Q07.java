package Homeworks_Assigments_LMS;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Q07 extends TestBase {
    @Test
    public void test01() {
       // -https://jqueryui.com/slider/#colorpicker adrese gidiniz
        driver.get("https://jqueryui.com/slider/#colorpicker");
       // -Kutucuk içindeki rengi önce kırmızı sonra sarı yapınız
        driver.switchTo().frame(0);
        WebElement button = driver.findElement(By.xpath("(//*[@tabindex=\"0\"])[2]"));
        Actions actions=new Actions(driver);
        actions.clickAndHold(button).perform();
        for (int i = 0; i < 11; i++) {
            actions.moveByOffset(-12,0).perform();

        }
        bekle(3);

        for (int i = 0; i < 23; i++) {
            actions.moveByOffset(12,0).perform();

        }

        actions.release().perform();

       // -Sarı olduğunu test edelim

        WebElement color = driver.findElement(By.xpath("//div[@id='swatch']"));
        String backgroundcolor=color.getCssValue("background-color");
        System.out.println("backgroundcolor = " + backgroundcolor);
        Assert.assertEquals(backgroundcolor, color.getCssValue("background-color"));

    }
}
