package chasePOM;

import Reusable_Library.Abstract_class;
import Reusable_Library.Reusable_Methods_Loggers_Page_Object;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class applyTravel extends Abstract_class {
    ExtentTest logger;
    public applyTravel(WebDriver driver) {
        super();
        PageFactory.initElements(driver,this);
        this.logger = super.logger;
    }
@FindBy (xpath = "//*[@data-pt-name='cc_sapphire_pp_applynow']")
    WebElement apply;

    public applyTravel apply() {
        Reusable_Methods_Loggers_Page_Object.click(driver, apply, logger, "Apply");
        return new applyTravel(driver);
    }
}

