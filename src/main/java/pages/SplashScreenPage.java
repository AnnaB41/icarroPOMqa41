package pages;

import org.openqa.selenium.By;

public class SplashScreenPage extends BasePage{

    By textVersion = By.xpath("//*[@resource-id='com.telran.ilcarro:id/versionText']");

    public String getTextVersion() {
        return getTextBase(textVersion);
    }

    //    By.xpath("//*[@resource-id='com.sheygam.contactapp:id/action_bar']" +
//            "/android.widget.TextView")
    // second by class
    // By.xpath("//*[@resource-id='com.sheygam.contactapp:id/action_bar']/..");
    // one level up
    // By.xpath("//*[@resource-id='com.sheygam.contactapp:id/action_bar']/../..");
// 2 levels up



}
