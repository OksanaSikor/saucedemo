package test;

import driver.DriverSingleton;
import org.testng.annotations.AfterTest;

public class BaseTest {
    @AfterTest
    public void stopBrowser() {
        DriverSingleton.getInstance().closeDriver();
    }
}
