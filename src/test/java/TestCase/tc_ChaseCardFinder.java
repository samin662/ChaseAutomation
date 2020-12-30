package TestCase;

import Reusable_Library.Abstract_class;
import chasePOM.chaseBase;
import org.testng.annotations.Test;

public class tc_ChaseCardFinder extends Abstract_class {
    @Test
    public void chaseCardfinder() throws InterruptedException {
        driver.navigate().to("https://creditcards.chase.com");
        Thread.sleep(1500);
        chaseBase.chaseFeaturedcards().cardFind();
        Thread.sleep(1500);
        chaseBase.personal().personalBtn();
        Thread.sleep(1500);
        chaseBase.personal().rewardsBtn();
        Thread.sleep(1100);
        chaseBase.personal().cashbackBtn();
        Thread.sleep(1100);
        chaseBase.personal().annualFee();
        Thread.sleep(1500);
        chaseBase.personal().startOver();
        Thread.sleep(1100);
        chaseBase.personal().businessBtn();
        Thread.sleep(1100);
        chaseBase.personal().savingMoneyBtn();
        Thread.sleep(1500);
    }
}
