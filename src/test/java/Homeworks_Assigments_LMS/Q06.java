package Homeworks_Assigments_LMS;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Q06 extends TestBase {
    @Test
    public void test01() {
       //- http://szimek.github.io/signature_pad/ sayfasına gidiniz
        driver.get("http://szimek.github.io/signature_pad/");
       //- Çıkan ekrana istediğiniz çizgi yada şekli çiziniz
        WebElement element = driver.findElement(By.xpath("//*[@class=\"signature-pad--body\"]"));
        Actions actions=new Actions(driver);
        actions.clickAndHold(element).perform();

        for (int i = 0; i < 10; i++) {
            actions.moveByOffset(-20,-20).perform();
        }
        for (int i = 0; i < 10; i++) {
            actions.moveByOffset(0,20).perform();
        }
        for (int i = 0; i < 10; i++) {
            actions.moveByOffset(20,0).perform();
        }
        actions.release().build().perform();
        bekle(3);
        //- Çizimden sonra clear butonuna basınız
        WebElement clear=driver.findElement(By.xpath("//*[@class=\"button clear\"]"));
        clear.click();


       //- Sayfayi kapatiniz
        driver.quit();
    }
}
