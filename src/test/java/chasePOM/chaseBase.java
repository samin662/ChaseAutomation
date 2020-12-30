package chasePOM;

import Reusable_Library.Abstract_class;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class chaseBase extends Abstract_class {
    public chaseBase(WebDriver driver) {
        super();
        PageFactory.initElements(driver, this);
    } // END OF CONSTRUCTOR
    //CREATE STATIC METHODS
    //Learn More
    public static chaseAll chaseAllCards() {
        chaseAll chaseAllCards = new chaseAll(driver);
        return chaseAllCards;
    }
    public static chaseLearnMore chase_LearnMore() {
        chaseLearnMore chase_LearnMore = new chaseLearnMore(driver);
        return  chase_LearnMore;
    }
    public static chaseFeatured chaseFeaturedcards() {
        chaseFeatured chaseFeaturedcards = new chaseFeatured(driver);
        return chaseFeaturedcards;
    }
    public static chaseApply createCheckingAcc() {
        chaseApply createCheckingAcc = new chaseApply(driver);
        return createCheckingAcc;
    }
    public static chaseTravelcards travelcards() {
        chaseTravelcards travelcards = new chaseTravelcards(driver);
        return travelcards;
    }
    public static applyTravel travel() {
        applyTravel travel = new applyTravel(driver);
        return travel;
    }
    public static chaseApply apply() {
        chaseApply apply = new chaseApply(driver);
        return apply;
    }
    public static chasePersonal personal() {
        chasePersonal personal = new chasePersonal(driver);
        return personal;
    }

}//end of class


