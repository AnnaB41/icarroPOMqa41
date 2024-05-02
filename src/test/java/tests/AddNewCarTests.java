package tests;

import dto.CarDTO;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Random;

public class AddNewCarTests extends BaseTest{

    @BeforeClass
    public void classPreconditions(){
        searchPage.clickMenu();
        searchPage.openLoginPage();
        loginPage.positiveLogin(user);
    }

    @Test
    public void addNewCarPositive(){
        Random random = new Random();
        String serNum = String.valueOf(random.nextLong(1000000000000L, 9999999999999L));
        // для 12-ти значного числа записываем 1 + 12 нулей и 9 + 12 девяток
        CarDTO car = CarDTO.builder()
                .serNumber(serNum)
                .manufacture("honda")
                .model("jazz")
                .city("Tel Aviv")
                .price(130)
                .carClass("A")
                .fuelType("Diesel")
                .year(2020)
                .seats(5)
                .about("automat")
                .build();

        searchPage.clickMenu();
        searchPage.clickMyCars();
        myCarsPage.clickAddCar();
                addNewCarPage.addNewCar(car);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertTrue(myCarsPage.isSerNumberDisplays(serNum));


    }
}
