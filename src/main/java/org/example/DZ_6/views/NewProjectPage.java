package org.example.DZ_6.views;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NewProjectPage extends BaseView{
    @FindBy(xpath = ".//input[@data-name='field__name']")
    private WebElement projectNameTextInput;

    @FindBy(xpath = ".//div[@class='select2-container select2 input-widget']")
    private WebElement company;

    @FindBy(xpath = ".//div[@id='select2-drop']/div/input")
    private WebElement companyNameTextInput;

    @FindBy(xpath = ".//div[@class='select2-container select2']']/input")
    private WebElement persona;

    @FindBy(xpath = ".//div[@id='select2-drop']/div/input")
    private WebElement personaNameTextInput;

    @FindBy(xpath = ".//div[@class='select2-result-label']")
    private WebElement personaNameResult;

    @FindBy(name = "crm_project[businessUnit]")
    private Select businessUnit;

    @FindBy(name = "crm_project[curator]")
    private WebElement curator;

    @FindBy(name = "crm_project[rp]")
    private WebElement rp;

    @FindBy(name = "crm_project[manager]")
    private WebElement manager;

    @FindBy(name = "crm_project[configManagement]")
    private WebElement configManagement;

    @FindBy(name = "crm_project[skipSpeedChecks]")
    private WebElement skipSpeedChecks;

    @FindBy(xpath = ".//div[@class='pull-right title-buttons-container']/div[3]")
    private WebElement saveButtons;


    public NewProjectPage(WebDriver driver) {
        super(driver);
    }

    public void checkUrl(String url) {
        wait15second.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//input[@data-name='field__name']")));
        assertEquals(driver.getCurrentUrl(), url);
        System.out.println(driver.getCurrentUrl());
    }

    public NewProjectPage insertProjectName(String projectName){
        projectNameTextInput.sendKeys(projectName);
        return this;
    }
    public NewProjectPage insertCompanyName(String companyName){
        company.click();
        companyNameTextInput.click();
        companyNameTextInput.sendKeys(companyName);
        driver.findElement(By.xpath(".//div[@class='select2-result-label']/span[text()='"+companyName+"']")).click();
        return this;
    }
    public NewProjectPage insertPersonaName(String personaName){
        persona.click();
        personaNameTextInput.click();
        personaNameTextInput.sendKeys(personaName);
        personaNameResult.click();
        return this;
    }
    public NewProjectPage selectBusinessUnit(String businessUnit){
        businessUnit.selectByValue("1");

        return this;
    }

}
