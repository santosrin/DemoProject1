import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectSeleniumDemo {

    WebDriver driver;

    public void launchBrowser() {
        System.setProperty("webdriver.gecko.driver","/Users/santoshsrinivas/Documents/DemoProject1/drivers/geckodriver");
        driver = new FirefoxDriver();
    }

    public void selectDemo() throws InterruptedException {
        //driver.manage().window().maximize();
        Dimension dim = new Dimension(600,600);
        driver.manage().window().setSize(dim);
        driver.get("https://www.facebook.com");
        WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
        WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
        WebElement year = driver.findElement(By.xpath("//select[@id='year']"));

        Select day_sel = new Select(day);
        Select month_sel = new Select(month);
        Select year_sel = new Select(year);

        day_sel.selectByValue("21");
        month_sel.selectByIndex(4);
        year_sel.selectByVisibleText("2020");

        Thread.sleep(4000);

    }

    public void findElements() {
        List<WebElement> elements = driver.findElements(By.xpath("//input[starts-with(@class,'input')]"));
        for(WebElement element : elements) {
            System.out.println(element.getAttribute("id"));

        }
    }

    public void closeBrowser() {
        driver.quit();
    }

    public static void main(String[] args) throws InterruptedException {
        SelectSeleniumDemo ds = new SelectSeleniumDemo();
        ds.launchBrowser();
        ds.selectDemo();
        ds.findElements();
        ds.closeBrowser();

    }
}
