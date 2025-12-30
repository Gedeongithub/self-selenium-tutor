package right_click_or_context_click;

import base.BaseTest;
import org.testng.annotations.Test;

public class ClickContextTest extends BaseTest {

    @Test
    public void testRightClick(){
        homePage.openDoubleClickPage().rightClick();
    }
}
