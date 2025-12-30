package alert_on_newtab;

import base.BaseTest;
import org.testng.annotations.Test;

public class TestAlertonNewtab extends BaseTest {
    @Test
    public void testAlert(){
        homePage.openPageToNewTab().openNewtab();
    }
}
