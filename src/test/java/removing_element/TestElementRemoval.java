package removing_element;

import base.BaseTest;
import org.testng.annotations.Test;

public class TestElementRemoval extends BaseTest {
    @Test
    public void testElementRemoval(){
        var home = homePage.clickDynamicLink();
        home.waitForRemoval();
    }
}
