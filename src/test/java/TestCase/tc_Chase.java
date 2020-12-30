package TestCase;

import Reusable_Library.Abstract_class;
import Reusable_Library.ReusableMethod_Loggers;
import Reusable_Library.Reusable_Methods_Loggers_Page_Object;
import chasePOM.chaseBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class tc_Chase extends Abstract_class {
@Test
    public void Chase() throws InterruptedException {
        driver.navigate().to("https://creditcards.chase.com");

        ReusableMethod_Loggers.click(driver,"//*[@data-pt-name='cc_head_nav_allcards']",logger,"All cards");
        Thread.sleep(3000);
         List<WebElement> compareBtn = driver.findElements(By.xpath("//*[@class='compare-btn ']"));
        compareBtn.get(0).click();
        Thread.sleep(1500);
        compareBtn.get(1).click();
        Thread.sleep(1500);
        ReusableMethod_Loggers.mouseClick(driver,"//*[@id='message-close']",logger,"Start comparing");
        Thread.sleep(1500);
        ReusableMethod_Loggers.mouseClick(driver,"//*[@data-lh-name='Breadcrumb_BrowseAll']",logger,"Browse All");
        Thread.sleep(1500);
        chaseBase.chaseAllCards().prTerms();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        Thread.sleep(1000);
        driver.close();
        driver.switchTo().window(tabs.get(0));
}
}
