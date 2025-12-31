package keys;

import base.BaseTest;
import org.testng.annotations.Test;

public class MultipleKeysTest extends BaseTest {
    @Test
    public void testCtrlShiftAlt1(){
        homePage.openKeysPage().shortCut();
    }
}
