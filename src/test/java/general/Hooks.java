package general;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks extends Base{
    private Base base; // objeto local para a comuninação com o objeto da classe extendida

    // Construtor para a classe Base
    public Hooks(Base base) {
        this.base = base;
    }

    // Before
    @Before
    public void setup (){
        //Onde está o driver do browser
        System.setProperty("webdriver.chrome.driver","drivers/chrome/89/chromedriver.exe");
        // Instanciar o driver do chrome
        base.driver = new ChromeDriver();
        // Maximar a tela
        base.driver.manage().window().maximize();
        //Definir a espera implicita do Selenium Webdriver
        base.driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);
    }

    //After
    @After
    public void tearDown(){
        base.driver.quit(); // Destruir o objeto do Selenium

    }
}
