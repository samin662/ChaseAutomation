package chasePOM;

import Reusable_Library.Abstract_class;
import Reusable_Library.Reusable_Methods_Loggers_Page_Object;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class chaseAll extends Abstract_class {
    ExtentTest logger;

    public chaseAll(WebDriver driver){
        super();
        PageFactory.initElements(driver,this);
        this.logger = super.logger;
    } //END OF CONSTRUCTOR

    //STORE VARIABLES
    @FindBy (xpath = "//*[@data-pt-name='cc_freedom_ulim_allcc_priceterm']")
    WebElement prTerms;
    @FindBy (xpath = "//*[@data-pt-name='cc_freedom_ulim_allcc_rpa']")
    WebElement rpa;

    public chaseAll prTerms(){
        Reusable_Methods_Loggers_Page_Object.click(driver, prTerms,logger,"Pricing Terms");
        return new chaseAll(driver);
    }
    public chaseAll rpa() {
        Reusable_Methods_Loggers_Page_Object.click(driver, rpa, logger, "RPA");
        return new chaseAll(driver);
    }



}// end of class



