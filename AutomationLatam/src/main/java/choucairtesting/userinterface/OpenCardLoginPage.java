package choucairtesting.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl(" https://demo.opencart.com/admin/index.php?route=common/dashboard")
public class OpenCardLoginPage extends PageObject {

    public static final Target USER =
            Target.the("User").located(By.id("input-username"));

    public static final Target PASSWORD =
            Target.the("Password").located(By.id("input-password"));

    public static final Target ACCCESSBUTTON=  Target.the("Access Button").
            located(net.serenitybdd.core.annotations.findby.By.xpath("//button[contains(text(), 'Login')]"));
}
