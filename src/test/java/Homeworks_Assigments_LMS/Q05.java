package Homeworks_Assigments_LMS;

import com.github.javafaker.App;
import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Q05 extends TestBase {
    @Test
    public void test01() {
        // https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/ sitesine gidin
       driver.get("https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/");
        // ikinci emojiye tıklayın
        driver.switchTo().frame("emoojis");
        WebElement secondEmoji=driver.findElement(By.xpath("(//span[@class=\"mdl-tabs__ripple-container mdl-js-ripple-effect\"])[2]"));
        secondEmoji.click();
        // İkinci emoji öğelerini yazdırınız
        WebElement  secondEmojielements=driver.findElement(By.xpath(" //div[@id='nature']//div"));
        System.out.println("Secon Emoji Elements : \n "+secondEmojielements.getText());
        // Parent iframe e geri donun
        driver.switchTo().defaultContent();
        // Formu doldurun,(Formu istediğiniz metinlerle doldurun)
        Faker faker =new Faker();
        WebElement textElement=driver.findElement(By.xpath("//*[@id=\"text\"]"));
        textElement.sendKeys(faker.artist().name(), Keys.TAB,faker.artist().name(),Keys.TAB,faker.artist().name(),Keys.TAB,faker.artist().name(),
                Keys.TAB,faker.artist().name(),Keys.TAB,faker.artist().name(),Keys.TAB,faker.artist().name(),Keys.TAB,faker.artist().name(),
                Keys.TAB,faker.artist().name(),Keys.TAB,faker.artist().name(),Keys.TAB,faker.artist().name(),Keys.TAB);
        // Apply button a basiniz
        WebElement ApplyButton=driver.findElement(By.xpath("//button[@id='send']"));
        ApplyButton.click();
    }






    /*
    @Test
public void test02() throws InterruptedException {
    driver.get("https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/");
    WebElement iframe = driver.findElement(By.xpath("//*[@id='emoojis']"));
    driver.switchTo().frame(iframe);
    driver.findElement(By.xpath("(//*[@data-upgraded=',MaterialRipple'])[2]")).click();
    List<WebElement> emojiler = driver.findElements(By.xpath("//*[@id='nature']//div"));
    for (WebElement w:emojiler) {
        System.out.println(w.getText());
    }
    driver.switchTo().defaultContent();

    List<WebElement> list = driver.findElements(By.xpath("//input[@class='mdl-textfield__input']"));

    List<String> veriler = new ArrayList<>(Arrays.asList(
            "Erol","Evren","selenium","lambda","java","sql","gitgithub","fsd","dfasf","lkjl","asdasd","asd","sda"));

    for (int i = 0; i < list.size(); i++) {
        list.get(i).sendKeys(veriler.get(i));
    }
    driver.findElement(By.xpath("//*[text()='Apply']")).click();
}
     */
}
