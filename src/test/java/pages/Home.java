package pages;

import general.Base;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


// Mapeamento de Elementos
    @FindBy By(id = "search")
    private WebElement txtInputSearch;

    @FindBy (css = "button.button-search")
    private WebElement btnSearch;

    // Construtor

public class Home extends Base {
    public Home(WebDriver driver) {
        super(driver);
    }

    // ações sobre os elementos
    public void search (String product){
        txtInputSearch.click(); // clicar na caixa de pesquisa
        txtInputSearch.clear(); // limpar o conteudo da caixa de texto
        txtInputSearch.sendKeys(product); // escreve na caixa de texto
    }


    public void searchWIthMagnifierButton(String product){
        search(product);
        btnSearch.click(); // clicar no botao da lupa
    }
    public void searchWIthEnter(String product){
        search(product);
         txtInputSearch.sendKeys(Keys.ENTER); // escreve na caixa de texto

    }
}
