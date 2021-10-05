package com.mycompany.app;

import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;


public class DifferentTextErrorTest
{
    @Test
    public void differentTextError() {
        open("https://todomvc.com/examples/emberjs");
        $("#new-todo").append("a").pressEnter();
        $$("#todo-list>li").findBy(exactText("a.")).shouldBe(visible);
    }
}
