package bugsmanager;

import com.company.infrastructure.base.TestBase;
import org.junit.Test;

public class BugsManagerTests extends TestBase {

    @Override
    protected void beforeTest() {
        logger.logger("Open Website");
        browser.get("http://bugsmanager.herokuapp.com/");
    }

    @Test
    public void testCheckListAndText(){
        logger.logger("Check List");
        logger.logger("Check text in the test 'First Bug'");


    }

}
