package com.valueCodeProject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TodoPage extends BasePage{

    @FindBy(id="my_task")
    public WebElement myTask;

    @FindBy(id="new_task")
    public WebElement newTask;

    @FindBy(xpath="//span[@class=\"input-group-addon glyphicon glyphicon-plus\"]")
    public WebElement plusButton;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div[2]/table/tbody/tr/td[2]/a")
    public WebElement text;





}
