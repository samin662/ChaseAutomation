package chasePOM;

import Reusable_Library.Abstract_class;
import Reusable_Library.Reusable_Methods_Loggers_Page_Object;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class chaseApply extends Abstract_class {
    ExtentTest logger;
    public chaseApply(WebDriver driver) {
        super();
        PageFactory.initElements(driver, this);
        this.logger = super.logger;
    }
    @FindBy (xpath = "//*[@name='firstName']")
    WebElement firstName;
    @FindBy (xpath = "//*[@name='lastName']")
    WebElement lastName;
    @FindBy (xpath = "//*[@name='streetAddress']")
    WebElement streetAddr;
    //@FindBy (xpath = "//*[@name='mothersMaidenName']")
    //WebElement cityName;
    @FindBy (xpath = "//*[@name='stateId']")
    WebElement stateName;
    @FindBy (xpath = "//*[@name='zipCode']")
    WebElement zipCode;
    @FindBy (xpath = "//*[@name='dateOfBirth']")
    WebElement dobDate;
    @FindBy (xpath = "//*[@name='mothersMaidenName']")
    WebElement maidenName;
    @FindBy (xpath = "//*[@name='emailAddress']")
    WebElement emailAdd;
    @FindBy (xpath = "//*[@name='socialSecurityNumber']")
    WebElement ssnID;
    @FindBy (xpath = "//*[@name='grossAnnualIncome']")
    WebElement incomeAnn;
    @FindBy (xpath = "//*[@name='residenceOwnershipOptionId']")
    WebElement housingType;
    @FindBy (xpath = "//*[@name='primaryIncomeSourceId']")
    WebElement positionJob;
    @FindBy (xpath = "//*[@name='phoneNumber']")
    WebElement phoneNum;


public void chaseApply (String fName, String lName,String street, String city, String state, String zip, String dob, String maiden, String email,String ssn, String income, String housing, String position, String phone) {
    Reusable_Methods_Loggers_Page_Object.sendKeys(driver, firstName, fName,logger,"FirstName");
    Reusable_Methods_Loggers_Page_Object.sendKeys(driver, lastName, lName,logger,"Last name");
    Reusable_Methods_Loggers_Page_Object.sendKeys(driver, streetAddr, street,logger,"Street");
  //  Reusable_Methods_Loggers_Page_Object.sendKeys(driver, cityName, city,logger,"City");
    Reusable_Methods_Loggers_Page_Object.dropDownMenu(driver,stateName,state,logger,"State");
    Reusable_Methods_Loggers_Page_Object.sendKeys(driver,zipCode,zip,logger,"Zip Code");
    Reusable_Methods_Loggers_Page_Object.sendKeys(driver,dobDate,dob,logger,"Date of Birth");
    Reusable_Methods_Loggers_Page_Object.sendKeys(driver,maidenName,maiden,logger,"Maiden Name");
    Reusable_Methods_Loggers_Page_Object.sendKeys(driver,emailAdd,email,logger,"Email Address");
    Reusable_Methods_Loggers_Page_Object.sendKeys(driver,ssnID,ssn,logger,"SSN");
    Reusable_Methods_Loggers_Page_Object.sendKeys(driver,incomeAnn,income,logger,"Income");
    Reusable_Methods_Loggers_Page_Object.dropDownMenu(driver,housingType,housing,logger,"Housing");
    Reusable_Methods_Loggers_Page_Object.dropDownMenu(driver,positionJob,position,logger,"Position");
    Reusable_Methods_Loggers_Page_Object.sendKeys(driver,phoneNum,phone,logger,"Phone Number");

}

}
