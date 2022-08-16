package pages;

import static core.DriverFactory.getDriver;
import static io.appium.java_client.touch.offset.ElementOption.element;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;

import core.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class DragDropPage extends BasePage {
	
	public void arrastar(String origem, String destino) {
		MobileElement inicio = getDriver().findElement(By.xpath("//*[@text='"+origem+"']"));
		MobileElement fim = getDriver().findElement(By.xpath("//*[@text='"+destino+"']"));
		
		  TouchAction dragNDrop = new TouchAction(getDriver())
		          .longPress(element(inicio))
			      .waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
		          .moveTo(element(fim))
		          .release();
		  dragNDrop.perform();
	}
	
	public String[] obterLista() {
		List<MobileElement> elements = getDriver().findElements(By.className("android.widget.TextView"));
		String[] retorno = new String[elements.size()];
		for (int i = 0; i < elements.size(); i++) {
			retorno[i] = elements.get(i).getText();
//			System.out.println("\"" + retorno[i] + "\", ");
		}
		return retorno;
	}

}
