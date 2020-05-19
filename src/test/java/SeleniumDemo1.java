import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo1 {

    WebDriver driver;
    //Launching firefox driver
    public void launchBrowser() {
        System.setProperty("webdriver.gecko.driver","/Users/santoshsrinivas/Documents/DemoProject1/drivers/geckodriver");
        driver = new FirefoxDriver();
        driver.get("https://in.ebay.com/");
    }

    public void searchMethod() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("gh-ac")).sendKeys("JBL Speakers");
        driver.findElement(By.id("gh-btn")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Daily Deals")).click();

    }

    public void navigate() throws InterruptedException {
        Thread.sleep(2000);
        driver.navigate().to("https://www.simplilearn.com/");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        System.out.println("The title of the page is : "+driver.getTitle());
    }

    //close
    public void closeBrowser() {
        driver.quit();
    }

    public static void main(String[] args) throws InterruptedException {
        SeleniumDemo1 seleniumDemo = new SeleniumDemo1();
        seleniumDemo.launchBrowser();
        seleniumDemo.searchMethod();
        seleniumDemo.navigate();
        seleniumDemo.closeBrowser();

    }
}
