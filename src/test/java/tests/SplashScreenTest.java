package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SplashScreenTest extends BaseTest{

    @Test
    public void versionTextTest(){
        String version = splashScreenPage.getTextVersion();
        Assert.assertEquals(version, "Version 1.0.0");
    }
}
