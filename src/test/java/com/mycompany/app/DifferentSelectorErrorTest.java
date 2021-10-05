package com.mycompany.app;

import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;


public class DifferentSelectorErrorTest
{
    @Test
    public void differentSelectorError() {
        open("http://todomvc.com/examples/emberjs");
        $("#new-todo").append("a").pressEnter();
        $$("#task-list>li").findBy(exactText("a")).doubleClick();
    }
}
