package pages;

import static core.DriverFactory.getDriver;
import static io.appium.java_client.touch.offset.ElementOption.element;

import java.time.Duration;

import org.openqa.selenium.By;

import core.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class SwipeListPage extends BasePage {
	
	public void swipeElementRight(String opcao) {
		swipeElement(getDriver().findElement(By.xpath("//*[@text='"+opcao+"']/..")), 0.9, 0.1);
	}
}
