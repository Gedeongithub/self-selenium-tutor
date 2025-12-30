package webform;

import base.BaseTest;
import org.testng.annotations.Test;

public class WebFormPageTest extends BaseTest {

    @Test
    public void testWebForm(){
        var webform = homePage.clickWebFormPageLink();
        webform.fillOut();
        webform.checkBoxRadio();


    }

    @Test
    public void normalizeIt(){
        var normal = homePage.clickWebFormPageLink();
        normal.normalize();
    }
}
