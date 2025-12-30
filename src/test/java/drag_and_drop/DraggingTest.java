package drag_and_drop;

import base.BaseTest;
import org.testng.annotations.Test;

public class DraggingTest extends BaseTest {
    @Test
    public void testDrag(){
        homePage.OpenDraggingPage().dragItem();
    }

}
