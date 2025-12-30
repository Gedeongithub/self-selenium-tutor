package double_click;

import base.BaseTest;
import org.testng.annotations.Test;

public class TestDoubleclick extends BaseTest {
    @Test
    public void doubleClickTest(){
        homePage.openDoubleClickPage().doubleClick();
    }
}
