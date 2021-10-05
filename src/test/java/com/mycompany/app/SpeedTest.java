package com.mycompany.app;

import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;


public class SpeedTest
{
    @Test
    public void speed() {
        open("http://todomvc4tasj.herokuapp.com/");
        long start = System.currentTimeMillis();
        for (int i=0; i<10; i++)
        {
            $(By.id("new-todo")).append(Integer.toString(i));
        }
        System.out.println(System.currentTimeMillis() - start);
    }
}
