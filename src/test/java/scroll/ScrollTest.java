package scroll;

import base.BaseTest;
import org.testng.annotations.Test;

public class ScrollTest extends BaseTest {
    @Test
    public void TestScroll(){
        homePage.openScrollPage().scroll();
    }
}
