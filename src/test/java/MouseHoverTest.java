import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import java.nio.file.Path;


public class MouseHoverTest {

    WebDriver driver;

    public void launchBrowser() {
        System.setProperty("webdriver.gecko.driver","/Users/santoshsrinivas/Documents/DemoProject1/drivers/geckodriver");
        driver = new FirefoxDriver();
    }

    public void mouseOver() throws InterruptedException, IOException {
        driver.get("https://www.amazon.in");
        WebElement ele = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
        Actions act = new Actions(driver);
        act.moveToElement(ele).perform();
        Thread.sleep(2000);
        System.out.println(ele.getCssValue("height"));

        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File dest = new File("/Users/santoshsrinivas/Documents/DemoProject1/screenshot.png");
        FileUtils.copyFile(source,dest);




    }

    public void closeBrowser() {
        driver.quit();
    }

    public static void main(String[] args) throws InterruptedException, IOException {
        MouseHoverTest mv = new MouseHoverTest();
        mv.launchBrowser();
        mv.mouseOver();
        mv.closeBrowser();
    }
}
