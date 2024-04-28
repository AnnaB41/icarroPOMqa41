package tests;

import config.AppiumConfig;
import dto.UserDTO;
import pages.LoginPage;
import pages.SearchPage;
import pages.SplashScreenPage;

public class BaseTest extends AppiumConfig {

    UserDTO user = UserDTO.builder()
            .username("myemail2@mail.com")
            .password("Tt123456$")
            .build();
    SplashScreenPage splashScreenPage = new SplashScreenPage();

    SearchPage searchPage = new SearchPage();

    LoginPage loginPage = new LoginPage();




}
