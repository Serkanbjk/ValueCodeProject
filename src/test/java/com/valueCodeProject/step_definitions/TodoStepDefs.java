package com.valueCodeProject.step_definitions;


import com.valueCodeProject.pages.TodoPage;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class TodoStepDefs {
    TodoPage todoPage = new TodoPage();

    @Given("the user click My Tasks")
    public void the_user_click_my_tasks() {

        todoPage.myTask.click();

    }
    @Given("the user enter message in the input box")
    public void the_user_enter_message_in_the_input_box() {
     todoPage.newTask.click();
     todoPage.newTask.sendKeys("cvc");
    }
    @Given("the user click plus button")
    public void the_user_click_plus_button() {
     todoPage.plusButton.click();
    }

    @Then("the user should see that is added")
    public void the_user_should_see_that_is_added() {
        Assert.assertEquals("cvc",todoPage.text.getText());

    }


}
