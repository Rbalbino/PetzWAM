package general;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {
    protected WebDriver driver; // Objeto do Selenium Webdriver,  vulgo bola
// ao usar pagefactory mudar de public para protected

//  criar um construtor e inicializar os elementos do PageFactory
    public Base(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
