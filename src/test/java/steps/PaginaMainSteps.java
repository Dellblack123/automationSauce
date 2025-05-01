package steps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PaginaMain;

public class PaginaMainSteps{

    PaginaMain main = new PaginaMain();
    private String pestana = "//*[@id=\"category-6\"]/a";

    @Given("dado caso")
    public void dadoCaso(){
        main.navigateToIndex();
        main.clickElement(pestana);
    }

    @When("cuando")
    public void cuando(){

    }

    @Then("entonces")
    public void entonces(){

    }

}
