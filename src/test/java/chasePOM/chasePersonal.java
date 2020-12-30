package chasePOM;

import Reusable_Library.Abstract_class;
import Reusable_Library.Reusable_Methods_Loggers_Page_Object;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class chasePersonal extends Abstract_class {
    ExtentTest logger;

    public chasePersonal(WebDriver driver) {
        super();
        PageFactory.initElements(driver,this);
        this.logger = super.logger;
    }
    @FindBy (xpath = "//*[@id='button1']")
    WebElement personalBtn;
    @FindBy (xpath = "//*[@id='button2']")
    WebElement rewardsBtn;
    @FindBy (xpath = "//*[@id='button3']")
    WebElement cashbackBtn;
    @FindBy (xpath = "//*[@id='button5']")
    WebElement annualFee;
    @FindBy (xpath = "//*[@id='goBack']")
    WebElement goBack;
    @FindBy (xpath = "//*[@id='startOver']")
    WebElement startOver;
    @FindBy (xpath = "//*[@id='button25']")
    WebElement businessBtn;
    @FindBy (xpath = "//*[@id='button31']")
    WebElement savingMoneyBtn;


    public chasePersonal personalBtn() {
        Reusable_Methods_Loggers_Page_Object.click(driver,personalBtn,logger,"Personal");
        return new chasePersonal(driver);
    }
    public chasePersonal rewardsBtn() {
        Reusable_Methods_Loggers_Page_Object.click(driver,rewardsBtn,logger,"Rewards");
        return new chasePersonal(driver);
    }
    public chasePersonal cashbackBtn() {
        Reusable_Methods_Loggers_Page_Object.click(driver,cashbackBtn,logger,"Cash Back");
        return new chasePersonal(driver);
    }
    public chasePersonal annualFee() {
        Reusable_Methods_Loggers_Page_Object.click(driver,annualFee,logger,"No Annual Fee");
        return new chasePersonal(driver);
    }
    public chasePersonal goBack() {
        Reusable_Methods_Loggers_Page_Object.click(driver,goBack,logger,"Go back");
        return new chasePersonal(driver);
    }
    public chasePersonal startOver() {
        Reusable_Methods_Loggers_Page_Object.click(driver,startOver,logger,"Start Over");
        return new chasePersonal(driver);
    }
    public chasePersonal businessBtn() {
        Reusable_Methods_Loggers_Page_Object.click(driver,businessBtn,logger,"Business");
        return new chasePersonal(driver);
    }
    public chasePersonal savingMoneyBtn() {
        Reusable_Methods_Loggers_Page_Object.click(driver,savingMoneyBtn,logger,"Saving money");
        return new chasePersonal(driver);
    }
}
