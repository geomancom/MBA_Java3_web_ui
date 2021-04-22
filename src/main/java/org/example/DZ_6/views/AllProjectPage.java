package org.example.DZ_6.views;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AllProjectPage extends BaseView{

    @FindBy(css = "div[class='pull-left btn-group icons-holder']")
    private WebElement createNewProjectButton;

    @FindBy(xpath = ".//div[@class='pull-left btn-group icons-holder']/a[@title='Удалить']")
    private WebElement buttonDelete;

    @FindBy(xpath = ".//a[@class='btn ok btn-primary']")
    private WebElement buttonDeleteOk;


    public AllProjectPage(WebDriver driver) {
        super(driver);
    }

    public NewProjectPage clickOnCreateNewProjectButton() {
        createNewProjectButton.click();
        return new NewProjectPage(driver);
    }

    public AllProjectPage checkNewProjectPopUp() {
        String message = wait15second.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(
                "div[class='message']"))).getText();
        assertTrue(message.contains("Проект сохранен"));
        return this;
    }

    @Step(value = "Go Button Delete")
    public AllProjectPage goButtonDelete(){
        buttonDelete.click();
        return this;
    }

    @Step(value = "Go Button Delete Ok")
    public AllProjectPage goButtonDeleteOk(){
        buttonDeleteOk.click();
        return this;
    }


    public void checkUrl(String url) {
        assertEquals(driver.getCurrentUrl(), url);
    }
}
