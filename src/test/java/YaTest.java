import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.junit.Test;
import org.junit.After;

public class YaTest {

    private WebDriver driver;

    @Test
    public void test() {
        driver = new ChromeDriver();
        driver.get("https://qa-mesto.praktikum-services.ru/");
        // Найди кнопку и кликни по ней
        driver.findElement(By.xpath(".//button[@class='auth-form__button']")).click();
    }

    @After
    public void teardown() {
        // Закрой браузер
        driver.quit();
    }
}