package pages;

import org.openqa.selenium.WebDriver;

public class PaginaMain extends BasePage{

    public PaginaMain() {
        super(driver);
    }

    public void navigateToIndex(){
        navigateToUrl("https://qalab.bensg.com/store/pe/");
    }
}
