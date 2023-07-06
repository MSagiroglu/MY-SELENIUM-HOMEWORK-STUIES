package Homeworks_Assigments_LMS;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

public class Q03 extends TestBase {
    @Test
    public void test01() {
     //  -Amazon sayfasına gidelim
        driver.get("https://amazon.com");
     //  -Arama Kutusundaki Dropdown menuyu yazdıralım
        WebElement dropDownMenu=driver.findElement(By.id("searchDropdownBox"));
        Select select=new Select(dropDownMenu);
        int count=1;
        for (WebElement w:select.getOptions()) {

            System.out.println(count+". menu = "+w.getText());
            count++;

        }
     //  -Dropdown menuden sırasıyla ilk 5 başlığı (Arts&Crafts ile başlayıp Books'a kadar Books dahil) seçip
        for (int i = 0; i <5; i++) {
            Select option = new Select(driver.findElement(By.xpath("//*[@id='searchDropdownBox']")));
            option.selectByIndex(i);
            driver.findElement(By.xpath("//*[@type='submit']")).click();
            System.out.println(driver.getTitle());
            bekle(2);
            driver.navigate().back();
        }
     //  başlık altındakileri aratalım. Her aramada sayfa başlığını yazdıralım
     //  Not: Select Class'ı kullanalım
    }
    /*
    @Test
public void test01() throws InterruptedException {
    //Amazon sayfasına gidelim
    driver.get("https://amazon.com");

    //Dropdown menuyu yazdıralım
    Select select = new Select(driver.findElement(By.xpath("//*[@id='searchDropdownBox']")));
    for (WebElement w:select.getOptions()) {
        System.out.println(w.getText());
    }
    System.out.println("***********************************************");

    //Dropdown menuden sırasıyla ilk 5 başlığı (Arts&Crafts ile başlayıp Books'a kadar Books dahil) seçip başlık altındakileri aratalım.
    //Her aramada sayfa başlığını yazdıralım
    int sayac=1;
    for (WebElement w:select.getOptions()) {
        Select option = new Select(driver.findElement(By.xpath("//*[@id='searchDropdownBox']")));
        option.selectByIndex(sayac);
        driver.findElement(By.xpath("//*[@type='submit']")).click();
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        sayac++;
        if (sayac>=6){
            break;
        }
    }
}
     */

    @Test
    public void test02() {
        //  -Amazon sayfasına gidelim
        driver.get("https://amazon.com");
        //  -Arama Kutusundaki Dropdown menuyu yazdıralım
        WebElement ddm=driver.findElement(By.xpath("//*[@aria-describedby=\"searchDropdownDescription\"]"));
        Select select=new Select(ddm);
        select.getOptions().forEach(w-> System.out.println(w.getText()));
        //  -Dropdown menuden sırasıyla ilk 5 başlığı (Arts&Crafts ile başlayıp Books'a kadar Books dahil) seçip
        //  başlık altındakileri aratalım. Her aramada sayfa başlığını yazdıralım
        int count=1;
        for (int i = 1; i < 6; i++) {
            ddm=driver.findElement(By.xpath("//*[@aria-describedby=\"searchDropdownDescription\"]"));
            select=new Select(ddm);
            select.selectByIndex(i);
            WebElement searchButton=driver.findElement(By.xpath("//*[@class=\"nav-search-submit nav-sprite\"]"));
            searchButton.click();
            System.out.println(count+". ddm options ="+ driver.getTitle());
            count++;
            //driver.navigate().back();


        }

        //  Not: Select Class'ı kullanalım
    }
}
