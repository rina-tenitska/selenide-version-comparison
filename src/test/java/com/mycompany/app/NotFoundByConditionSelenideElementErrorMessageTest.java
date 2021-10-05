package com.mycompany.app;

import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;


public class NotFoundByConditionSelenideElementErrorMessageTest
{
    @Test
    public void shouldContainInfoWithAllDetails_WhenCallingAction(){
        open("http://todomvc.com/examples/emberjs/");
        $("#new-todo").setValue("a").pressEnter();
        $$("#todo-list>li").findBy(exactText("a.")).hover().find(".destroy").click();
        $$("#todo-list>li").shouldHaveSize(0);
    }
}
