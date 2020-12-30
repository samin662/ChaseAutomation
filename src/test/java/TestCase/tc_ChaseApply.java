package TestCase;

import Reusable_Library.Abstract_class;
import Reusable_Library.ReusableMethod_Loggers;
import chasePOM.chaseBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class tc_ChaseApply extends Abstract_class {
@Test
    public void applyChase() throws InterruptedException {
    driver.navigate().to("https://creditcards.chase.com");
    Thread.sleep(1500);
    chaseBase.chaseFeaturedcards().categories();
    Thread.sleep(1500);
    chaseBase.chaseFeaturedcards().catTrav();
    Thread.sleep(1500);
    chaseBase.travelcards().lrnMore();
    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    ReusableMethod_Loggers.click(driver,"//*[@id='ApplyNowDAO']",logger,"Apply");
    ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
    driver.switchTo().window(tabs.get(1));
    Thread.sleep(2000);
    chaseBase.apply().chaseApply("Shaf","Amin","171 st", "Queens","New York","11432","04/30/1997","Ferd","abc@yahoo.com","012345678","100000","Rent","Employed","1231231234");

}
}
