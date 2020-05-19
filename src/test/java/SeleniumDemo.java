import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo {

    WebDriver driver;
    //Launching firefox driver
    public void launchBrowser() {
        System.setProperty("webdriver.gecko.driver","/Users/santoshsrinivas/Documents/DemoProject1/drivers/geckodriver");
        driver = new FirefoxDriver();
        driver.get("https://www.simplilearn.com/");
    }

    //business logic
    public void search() throws InterruptedException {
        driver.findElement(By.id("header_srch")).sendKeys("Selenium");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[@class='search_icon input-search-icon']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//h2[contains(text(),'Selenium 3.0 Training')]")).click();
        Thread.sleep(3000);
        System.out.println("The page title is " + driver.getTitle());
    }

    //close
    public void closeBrowser() {
        driver.quit();
    }

    public static void main(String[] args) throws InterruptedException {
        SeleniumDemo seleniumDemo = new SeleniumDemo();
        seleniumDemo.launchBrowser();
        seleniumDemo.search();
        //seleniumDemo.closeBrowser();

    }
}
