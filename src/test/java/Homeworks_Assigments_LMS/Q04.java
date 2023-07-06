package Homeworks_Assigments_LMS;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Q04 extends TestBase {
    @Test
    public void test01() {
        //-http://demo.automationtesting.in/Alerts.html sayfasına gidiniz
        driver.get("http://demo.automationtesting.in/Alerts.html");
        //-Alert with OK karşısındaki click the button to display an alert box: butonuna tıklayınız
        WebElement element=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
        element.click();
        bekle(2);
        //-Çıkan alert üzerindeki yazıyı konsola yazdırınız ve tamam butonuna basınız
        System.out.println("alert message = "+driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        //-Alert with OK & Cancel butonuna basınız ve sonrasında click the button to display a confirm box butonuna basınız
        WebElement AWOAndC=driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']"));
        Actions actions=new Actions(driver);
        actions.moveToElement(AWOAndC).click().perform();
        bekle(2);
        WebElement clickToButton=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        actions.moveToElement(clickToButton).click().perform();
        bekle(2);
        //-Çıkan alert'te iptal butonuna basınız
        driver.switchTo().alert().dismiss();
        bekle(2);
        //-Alert with Textbox butonuna basınız ve sonrasında click the button to demonstrate the prompt box butonuna basınız
        WebElement textButton=driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']"));
        actions.moveToElement(textButton).click().perform();
        bekle(2);
        WebElement promtButton=driver.findElement(By.xpath("//button[@class='btn btn-info']"));
        actions.moveToElement(promtButton).click().perform();
        //-Çıkan prompt box'a 'isminizi' yazdırınız ve Tamam'a basınız
        bekle(2);
        Faker faker=new Faker();
        String name =faker.name().fullName();
        driver.switchTo().alert().sendKeys(name);
        bekle(2);
        driver.switchTo().alert().accept();
        //-Çıkan mesajı konsola yazdırınız
        WebElement message=driver.findElement(By.xpath("//p[@id='demo1']"));
        System.out.println("message = " + message.getText());
        //-Çıkan mesajın 'Hello <isminiz> How are you today' yazdığını doğrulayınız
        Assert.assertEquals("Hello "+name+" How are you today",message.getText());

    }






















    /*
    @Test
public void test01() throws InterruptedException {

    driver.get("http://demo.automationtesting.in/Alerts.html");
    WebElement alert = driver.findElement(By.xpath("//*[@onclick='alertbox()']"));
    alert.click();
    System.out.println(driver.switchTo().alert().getText());
    driver.switchTo().alert().accept();
    driver.findElement(By.xpath("(//*[@class='analystic'])[2]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@onclick='confirmbox()']")).click();
    Thread.sleep(2000);
    driver.switchTo().alert().dismiss();
    driver.findElement(By.xpath("//*[text()='Alert with Textbox ']")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("button[onclick='promptbox()']")).click();
    Thread.sleep(2000);
    driver.switchTo().alert().sendKeys("Erol");
    Thread.sleep(2000);
    driver.switchTo().alert().accept();
    System.out.println(driver.findElement(By.xpath("//*[@id='demo1']")).getText());
    Assert.assertEquals("Hello Erol How are you today",driver.findElement(By.xpath("//*[@id='demo1']")).getText());


}
     */
}
