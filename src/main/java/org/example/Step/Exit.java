package org.example.Step;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.Given;

import static com.codeborne.selenide.Selenide.$x;

public class Exit {
    private final SelenideElement glavMenu = $x("/html/body/div[1]/div[2]/div/div[2]/header/div/div/div[1]/a/img[1]");

    @Given("Закрытие")
    public void openMenu(){
        glavMenu.click();
    }
}
