package com.devops;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

public class GreetingSteps {
    private String name;
    private String result;

    @Given("a name {string}")
    public void a_name(String name) {
        this.name = name;
    }

    @When("I ask for a greeting")
    public void i_ask_for_greeting() {
        result = new GreetingService().greet(name);
    }

    @Then("the response contains {string}")
    public void response_contains(String expected) {
        assertNotNull(result);
        assertTrue(result.contains(expected));
    }
}
