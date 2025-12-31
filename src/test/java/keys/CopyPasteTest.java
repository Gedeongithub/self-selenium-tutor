package keys;

import base.BaseTest;
import org.testng.annotations.Test;

public class CopyPasteTest extends BaseTest {

    @Test
    public void testCopypaste(){
        homePage.openCopypastePage().copyPaste();
    }
}
