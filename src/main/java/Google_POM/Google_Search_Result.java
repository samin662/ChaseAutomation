package Google_POM;

import Reusable_Library.Abstract_class;
import Reusable_Library.Reusable_Methods_Loggers_Page_Object;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Google_Search_Result extends Abstract_class {

    ExtentTest logger;
    //constructor method to inherit the class name and you call the driver and logger
    //to be used locally for this class
    public Google_Search_Result(WebDriver driver){
        super();
        PageFactory.initElements(driver,this);
        this.logger = super.logger;
    }//end of constructor method

    @FindBy(xpath = "//*[@id='result-stats']")
    WebElement searchResult;

    public String getSearchNumber(){
        String result = Reusable_Methods_Loggers_Page_Object.captureResult(driver,searchResult,logger,"Search Result Text");
        String[] arrayresult = result.split(" ");
        return arrayresult[1];
    }//end of search number

}//end of class
