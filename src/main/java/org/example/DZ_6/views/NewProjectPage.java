package org.example.DZ_6.views;

import io.qameta.allure.Step;
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

    @FindBy(xpath = ".//div[@class='controls']/div[@class='select2-container select2']/a")
    private WebElement persona;

    @FindBy(xpath = ".//div[@id='select2-drop']/div/input")
    private WebElement personaNameTextInput;

    @FindBy(xpath = ".//div[@class='select2-result-label']")
    private WebElement personaNameResult;

    @FindBy(name = "crm_project[businessUnit]")
    private WebElement businessUnit;

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

    @Step(value = "Check Url {url}")
    public void checkUrl(String url) {
        wait15second.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//input[@data-name='field__name']")));
        assertEquals(driver.getCurrentUrl(), url);
        System.out.println(driver.getCurrentUrl());
    }

    @Step(value = "Insert Project Name {projectName}")
    public NewProjectPage insertProjectName(String projectName){
        projectNameTextInput.sendKeys(projectName);
        return this;
    }

    @Step(value = "Insert Company Name {companyName}")
    public NewProjectPage insertCompanyName(String companyName){
        company.click();
        companyNameTextInput.click();
        companyNameTextInput.sendKeys(companyName);
        driver.findElement(By.xpath(".//div[@class='select2-result-label']/span[text()='"+companyName+"']")).click();
        return this;
    }

    @Step(value = "Insert Persona Name {personaName}")
    public NewProjectPage insertPersonaName(String personaName){
        persona.click();
        personaNameTextInput.click();
        personaNameTextInput.sendKeys(personaName);
        personaNameResult.click();
        return this;
    }

    @Step(value = "Select Business Unit {BusinessUnitValue}")
    public NewProjectPage selectBusinessUnit(String BusinessUnitValue){
        Select sUnit = new Select(businessUnit);
        sUnit.selectByValue(BusinessUnitValue);
        return this;
    }

    @Step(value = "Select Сurator {ApplanatestApplanatestApplanatestValue}")
    public NewProjectPage selectСurator(String ApplanatestApplanatestApplanatestValue){
        Select sСurator = new Select(curator);
        sСurator.selectByVisibleText(ApplanatestApplanatestApplanatestValue);
        return this;
    }

    @Step(value = "Select RP {ApplanatestApplanatestApplanatestValue}")
    public NewProjectPage selectRp(String ApplanatestApplanatestApplanatestValue){
        Select sRp = new Select(rp);
        sRp.selectByVisibleText(ApplanatestApplanatestApplanatestValue);
        return this;
    }

    @Step(value = "Select Manager {ApplanatestApplanatestApplanatestValue}")
    public NewProjectPage selectManager(String ApplanatestApplanatestApplanatestValue){
        Select sManager = new Select(manager);
        sManager.selectByVisibleText(ApplanatestApplanatestApplanatestValue);
        return this;
    }

    @Step(value = "Insert Config Management {personaName}")
    public NewProjectPage insertConfigManagement(String personaName){
        configManagement.sendKeys(personaName);
        return this;
    }

    @Step(value = "Select Skip Speed Checks")
    public NewProjectPage selectSkipSpeedChecks(){
        skipSpeedChecks.click();
        return this;
    }

    @Step(value = "Go Save Buttons")
    public AllProjectPage goSaveButtons(){
        saveButtons.click();
        return new AllProjectPage(driver);
    }
}
