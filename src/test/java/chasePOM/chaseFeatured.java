package chasePOM;

import Reusable_Library.Abstract_class;
import Reusable_Library.Reusable_Methods_Loggers_Page_Object;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class chaseFeatured extends Abstract_class {
    ExtentTest logger;
    public chaseFeatured(WebDriver driver) {
        super();
        PageFactory.initElements(driver, this);
        this.logger = super.logger;
    }
@FindBy (xpath = "//*[@data-pt-name='cc_homepage_allreward_LM1']")
    WebElement applyNow;
@FindBy (xpath = "//*[@data-pt-name='cc_homepage_allrewards']")
    WebElement viewAll;
@FindBy (xpath = "//*[@id='submenu-collapse-control']")
    WebElement categories;
@FindBy (xpath = "//*[@data-lh-name='CatNav_Travel']")
    WebElement catTrav;
@FindBy (xpath = "//*[@data-pt-name='cc_head_nav_crdfindr']")
    WebElement cardFind;
public chaseFeatured applyNow() {
    Reusable_Methods_Loggers_Page_Object.click(driver, applyNow, logger, "Apply Now");
    return new chaseFeatured(driver);
}
public chaseFeatured viewAll() {
    Reusable_Methods_Loggers_Page_Object.click(driver, viewAll, logger,"View All");
    return  new chaseFeatured(driver);
}
public chaseFeatured categories() {
    Reusable_Methods_Loggers_Page_Object.click(driver,categories,logger,"Categories");
    return new chaseFeatured(driver);
}
public chaseFeatured catTrav() {
    Reusable_Methods_Loggers_Page_Object.click(driver,catTrav,logger,"Travel");
    return new chaseFeatured(driver);
}
public chaseFeatured cardFind() {
    Reusable_Methods_Loggers_Page_Object.click(driver,cardFind,logger,"Card Finder");
    return new chaseFeatured(driver);
}

}
