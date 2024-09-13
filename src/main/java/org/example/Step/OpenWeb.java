package org.example.Step;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import static com.codeborne.selenide.Selenide.$x;

public class OpenWeb {
    private final SelenideElement clicc = $x("/html/body/div[1]/div[2]/div[1]/div[1]/div/div/div/button");
    private final SelenideElement polsovatelMenu = $x("/html/body/div[1]/div[2]/div/div[2]/header/div/div/div[2]/div[2]/div/button");
    private final SelenideElement poleEmail = $x("/html/body/div[1]/div[2]/div/div[2]/header/div/div/div[2]/div[2]/div/div/div[1]/form/div[1]/div[2]/input");
    private final SelenideElement polePassword = $x("/html/body/div[1]/div[2]/div/div[2]/header/div/div/div[2]/div[2]/div/div/div[1]/form/div[2]/div[2]/input");
    private final SelenideElement clickOpen= $x("/html/body/div[1]/div[2]/div/div[2]/header/div/div/div[2]/div[2]/div/div/div[1]/form/div[5]/input");

    @Given("Открываем сайт")
    public void openWeb() {
        Selenide.open("https://www.uralairlines.ru/");
    }

    @Given("Закрытие всплывающего окна")
    public void closeWeb() {
        clicc.click();
    }

    @And("Нажимаем на иконку профиля")
    public void clickProfile() {
        polsovatelMenu.click();
    }

    @And("Вводим  невалидный email")
    public void вводимНевалидныйEmail() {
        poleEmail.sendKeys("ertimen@gmail.com");
    }

    @And("Ввводим невалидный пароль")
    public void ввводимНевалидныйПароль() {
        polePassword.sendKeys("123456");
    }

    @And("Нажимаем кнопку Войти")
    public void нажимаемКнопкуВойти() {
        clickOpen.click();
    }
}
