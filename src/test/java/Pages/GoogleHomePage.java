package Pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GoogleHomePage {
    GoogleHomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
