package formpage;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;

public class FormPageTest extends BaseTest {

    @Test
    public void testFormPage (){

        var formPage = homePage.clickFormLink();
        formPage.fillForm();
        formPage.checkIt();
        formPage.dropDown();
        formPage.chooseFile();


    }
    @Test
    public void testRelative(){
        var relativeElement = homePage.clickFormLink();
        relativeElement.findElementByRelation();
    }
}
