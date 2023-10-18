package test;

import driver.DriverSingleton;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Listeners;

@Listeners(TestListener.class)
public class BaseTest {

    @AfterTest
    public void stopBrowser() {
        DriverSingleton.getInstance().closeDriver();
    }
}
