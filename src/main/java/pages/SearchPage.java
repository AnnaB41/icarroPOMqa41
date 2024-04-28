package pages;

import org.openqa.selenium.By;

public class SearchPage extends BasePage{

    By textTitleMain = By.xpath("//*[@resource-id='com.telran.ilcarro:id/findTitle']");

    By btnOpenMenu = By.xpath("//*[@content-desc='More options']");
    By buttonsInMenu = By.xpath("//*[@resource-id='com.telran.ilcarro:id/title']");



    public String getTextMainTitle(){
        wait(textTitleMain, 15000);
        // получаем заголовок на странице поиска
        return getTextBase(textTitleMain);
    }

    public void clickMenu(){
        wait(textTitleMain, 15000);
        clickBase(btnOpenMenu);

    }
    public void openLoginPage(){
        clickBase(buttonsInMenu);
    }
    public void openRegistrationPage(){
        clickByIndex(buttonsInMenu, 1);  // индекс 1, т.е. вторая кнопка

    }

    public boolean validateMyCarsExist() {
        clickBase(btnOpenMenu);
        return getTextBase(buttonsInMenu).equals("My Cars");
    }
}
