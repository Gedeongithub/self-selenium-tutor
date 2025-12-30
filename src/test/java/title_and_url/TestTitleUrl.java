package title_and_url;

import base.BaseTest;
import org.testng.annotations.Test;

public class TestTitleUrl extends BaseTest {

    @Test
    public void testTitleUrl(){
        homePage.getTitle();
    }

}
