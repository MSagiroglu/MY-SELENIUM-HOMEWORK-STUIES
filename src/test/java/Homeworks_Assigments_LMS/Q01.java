package Homeworks_Assigments_LMS;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class Q01 extends TestBase {
    @Test
    public void test01() {
      // - Before methodu ile drive'i olusturup ayarlamalari yapiniz
      //         - ebay sayfasına gidiniz
        driver.get("https://ebay.com");
      // - electronics bölümüne tıklayınız
        WebElement electronics=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
        electronics.click();
        // - Genişliği 225 ve Uzunluğu 225 olan resimlerin hepsine tıklayalım
        List<WebElement> resimler=driver.findElements(By.xpath("//img[@width='225' and @height='225']"));
        for (int i = 0; i < resimler.size(); i++) {
            resimler=driver.findElements(By.xpath("//img[@width='225' and @height='225']"));
            resimler.get(i).click();
            // - Her sayfanın sayfa başlığını yazdıralım
            System.out.println(i+". Sayfa başlığı = "+driver.getTitle());
            bekle(2);
            driver.navigate().back();

        }




    }

    @Test
    public void test02() {
        // - Before methodu ile drive'i olusturup ayarlamalari yapiniz
        //         - ebay sayfasına gidiniz
        driver.get("https://ebay.com");
        // - electronics bölümüne tıklayınız
        WebElement electronics=driver.findElement(By.xpath("//*[@class=\"hl-cat-nav__js-tab\"]"));
        click(electronics);
        // - Genişliği 225 ve Uzunluğu 225 olan resimlerin hepsine tıklayalım
        List<WebElement> products=driver.findElements(By.xpath("//img[@width='225' and @height='225']"));
       int count=1;
        for (int i = 0; i < products.size(); i++) {
            products=driver.findElements(By.xpath("//img[@width='225' and @height='225']"));
            products.get(i).click();
            System.out.println(count +". website = "+driver.getTitle());
            count++;
            driver.navigate().back();
        }
        // - Her sayfanın sayfa başlığını yazdıralım
    }
}
