package automationExercises;

import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class TestCase04 extends TestBase {
    @Test
    public void test01() {
      // 1. Launch browser
        extentReport("Chrome","TestCase04");
        extentTest=extentReports.createTest("AutoExercisesReport","Test Raporu");
      // 2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");
        extentTest.info("Sayfaya gidildi.");
        tumSayfaResmi();
        // 3. Verify that home page is visible successfully
        WebElement homePage=driver.findElement(By.xpath("(//a[@href=\"/\"])[2]"));
        assert homePage.isDisplayed();
        webElementResmi(homePage);
        extentTest.info("Home page'in göünür olduğu doğrulandı.");

        // 4. Click on 'Signup / Login' button
        WebElement signUpLogIn=driver.findElement(By.xpath("//*[@href=\"/login\"]"));
        webElementResmi(signUpLogIn);
        signUpLogIn.click();
        extentTest.info("Sign up butonuna click yapıldı.");
        bekle(2);
      // 5. Verify 'Login to your account' is visible
        WebElement Logintoyouraccount=driver.findElement(By.xpath("(//h2)[1]"));
        assert Logintoyouraccount.isDisplayed();
        extentTest.info("Login to your account'un görünür olduğu doğrulandı.");
        webElementResmi(Logintoyouraccount);
        bekle(2);
        // 6. Enter correct email address and password
        // 7. Click 'login' button

        WebElement email=driver.findElement(By.xpath("(//input[@type=\"email\"])[1]"));
        email.sendKeys("mustafasagiroglu06452@gmail.com", Keys.TAB,"Password",Keys.TAB,Keys.ENTER);
        extentTest.info("Email ve password girilip login butonuna click yapıldı.");
        // 8. Verify that 'Logged in as username' is visible
        WebElement loogedInAsMustafa=driver.findElement(By.xpath("//li[10]//a[1]"));
        assert loogedInAsMustafa.isDisplayed();
        extentTest.info("Logged in as Mustafa 'nın görünür olduğu doğrulandı");
        webElementResmi(loogedInAsMustafa);
        // 9. Click 'Logout' button
        WebElement logout=driver.findElement(By.xpath("//*[@href=\"/logout\"]"));
        webElementResmi(logout);
        logout.click();
        extentTest.info("Logout tuşuna click yapıldı");
      // 10. Verify that user is navigated to login page
        WebElement signUp=driver.findElement(By.xpath("//li[4]//a[1]"));
        assert signUp.isDisplayed();
        extentTest.info("Log in sayfasına gittiği doğrulandı");
        tumSayfaResmi();
        extentReports.flush();
    }
}
