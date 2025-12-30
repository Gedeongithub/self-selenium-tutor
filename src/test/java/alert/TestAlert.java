package alert;

import base.BaseTest;
import org.testng.annotations.Test;

public class TestAlert extends BaseTest {

    @Test
    public void testAlert(){
        homePage.openAlert().clickAlert();
    }
}
