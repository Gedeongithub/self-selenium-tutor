package iframe;

import base.BaseTest;
import org.testng.annotations.Test;

public class TestIframe extends BaseTest {
    @Test
    public void testIframe(){
       var iframe= homePage.openFrame();
       iframe.openOtherFrame();
    }
}