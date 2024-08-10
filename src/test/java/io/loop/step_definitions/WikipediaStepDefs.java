package io.loop.step_definitions;

import io.cucumber.java.en.*;
import io.loop.pages.WikipediaHomePage;

public class WikipediaStepDefs {

    WikipediaHomePage wikipediaHomePage = new WikipediaHomePage();


    @Given("user is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {

    }
    @When("user types {string} in the search box")
    public void user_types_in_the_search_box(String string) {

    }
    @When("user clicks wiki search button")
    public void user_clicks_wiki_search_button() {

    }
    @Then("user should see {string} in the wiki title")
    public void user_should_see_in_the_wiki_title(String string) {

    }

    @Then("user should see {string} in the main header")
    public void user_should_see_in_the_main_header(String string) {

    }

    @Then("user should see {string} in the image header")
    public void user_should_see_in_the_image_header(String string) {

    }


}
