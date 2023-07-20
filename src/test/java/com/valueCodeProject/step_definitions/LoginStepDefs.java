package com.valueCodeProject.step_definitions;


import com.valueCodeProject.pages.LoginPage;
import com.valueCodeProject.pages.MainPage;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class LoginStepDefs {


    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("User on the page in HOOKS");

    }

    @Given("the user logged in with valid credential")
    public void the_user_logged_in_with_valid_credential() {
        new LoginPage().login();
    }

    @Then("the user navigates the Todo App")
    public void the_user_navigates_the_todo_app() {
        Assert.assertTrue(new MainPage().toDoListTıtle.isDisplayed());
    }


}
