package hover_over;

import base.BaseTest;
import org.testng.annotations.Test;

public class TestHover extends BaseTest {
    @Test
    public void testHover(){
        homePage.openHoverPage().hoverOver();
    }
}
