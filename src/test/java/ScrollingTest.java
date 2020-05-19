import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollingTest {

    WebDriver driver;

    public void launchBrowser() {
        System.setProperty("webdriver.gecko.driver","/Users/santoshsrinivas/Documents/DemoProject1/drivers/geckodriver");
        driver = new FirefoxDriver();
    }

    public void scrollDown() throws InterruptedException {
        driver.get("https://www.amazon.in");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,6000)");

        //type without sendkeys
        js.executeScript("document.getElementById('twotabsearchtextbox').value='Iphone'");
        Thread.sleep(4000);
    }

    public void closeBrowser() {
        driver.quit();
    }

    public static void main(String[] args) throws InterruptedException {
        ScrollingTest scrollingTest = new ScrollingTest();
        scrollingTest.launchBrowser();
        scrollingTest.scrollDown();
        scrollingTest.closeBrowser();

    }
}
