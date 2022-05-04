package choucairtesting.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OpenCardProducts extends PageObject {
    public static final Target INPUTNAMEPRODUCT=  Target.the("Input Name Product").
            located(By.id("input-name1"));
    public static final Target BUTTONSAVE =  Target.the("Button Save").
            located(net.serenitybdd.core.annotations.findby.By.xpath("//*[@id=\"content\"]/div[1]/div/div/button"));
    public static final Target ERRORMESSAGE = Target.the("Button Save").
            located(net.serenitybdd.core.annotations.findby.By.xpath("//*[@id=\"content\"]/div[2]/div[1]"));
    public static final Target BUTTONNEWPRODUCT = Target.the("Button new product").
            located(net.serenitybdd.core.annotations.findby.By.xpath("//*[@id=\"content\"]/div[1]/div/div/a"));
    public static final Target INPUTMETATITLE=  Target.the("Input Meta Tag Title").
            located(By.id("input-meta-title1"));
    public static final Target INPUTMODEL=  Target.the("Input Name Product").
            located(By.id("input-model"));
    public static final Target SECTIONDATA = Target.the("Section Data").
            located(net.serenitybdd.core.annotations.findby.By.xpath("//*[@id=\"form-product\"]/ul/li[2]/a"));

}

