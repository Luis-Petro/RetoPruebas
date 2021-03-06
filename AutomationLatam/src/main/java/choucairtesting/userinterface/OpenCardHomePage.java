package choucairtesting.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OpenCardHomePage extends PageObject {

    public static final Target CATALOG =  Target.the("Catalog").
                       located(By.id("menu-catalog"));
    public static final Target PRODUCTS =  Target.the("Products").
    located(net.serenitybdd.core.annotations.findby.By.xpath("//li//a[contains(text(), 'Products')]"));
    public static final Target PRODUCTNAME =  Target.the("Product Name").
            located(By.id("input-name"));
    public static final Target BUTTONFILTER =  Target.the("Button Filter").
            located(By.id("button-filter"));
    public static final Target BUTTONEDIT =  Target.the("Button Edit").
            located(net.serenitybdd.core.annotations.findby.By.xpath("//a//i[contains(@class, 'fa fa-pencil')]"));
    public static final Target CHECKBOX =  Target.the("Check Box").
            located(net.serenitybdd.core.annotations.findby.By.xpath("//*[@id=\"form-product\"]/div/table/tbody/tr/td[1]/input"));
    public static final Target BUTTONDELETE =  Target.the("Botton delete product").
            located(net.serenitybdd.core.annotations.findby.By.xpath("//button[contains(@class, 'btn btn-danger')]"));
}
