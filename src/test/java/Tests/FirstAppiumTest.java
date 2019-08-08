package Tests;

import com.sun.xml.internal.rngom.parse.host.Base;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class FirstAppiumTest extends BaseTest {




    public void validateText()
    {
        driver.findElementByAccessibilityId("Accessibility").click();
        String text = driver.findElementByAccessibilityId("Accessibility Node Provider").getText();
        if(text.equalsIgnoreCase("Accessibility Node Provider"))
        {
            System.out.println("Passed");
        } else
        {
            System.out.println("Failed");
        }
    }



    @Test
    public  void testingAppium () {

        FirstAppiumTest obj = new FirstAppiumTest();
        obj.setUP();
        obj.validateText();
        obj.tearDown();

    }
}
