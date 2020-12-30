package chasePOM;

import Reusable_Library.Abstract_class;
import Reusable_Library.Reusable_Methods_Loggers_Page_Object;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class chaseLearnMore extends Abstract_class {
    ExtentTest logger;

    public chaseLearnMore(WebDriver driver) {
        super();
        PageFactory.initElements(driver, this);
        this.logger = super.logger;
    }
    @FindBy (xpath = "//*[@data-pt-name='cc_pp_breadcrumb_allcards']")
    WebElement browseAll;

    public chaseLearnMore browseAll() {
        Reusable_Methods_Loggers_Page_Object.click(driver, browseAll, logger, "Browse All");
        return new chaseLearnMore(driver);
    }

}