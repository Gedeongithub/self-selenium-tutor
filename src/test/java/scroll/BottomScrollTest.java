package scroll;

import base.BaseTest;
import org.testng.annotations.Test;

public class BottomScrollTest extends BaseTest {
    @Test
    public void testBottomScroll(){
        try {
            homePage.openLongPage().scrollToPageBottom();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
