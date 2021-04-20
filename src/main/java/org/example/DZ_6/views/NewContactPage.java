package org.example.DZ_6.views;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NewContactPage extends BaseView{
    @FindBy(name = "crm_contact[lastName]")
    private WebElement lastNameTextInput;

    @FindBy(name = "crm_contact[firstName]")
    private WebElement firstNameTextInput;

    @FindBy(xpath = ".//span[@class='select2-chosen']")
    private WebElement company;

    @FindBy(xpath = ".//div[@class='select2-search']/input")
    private WebElement companyInput;

    @FindBy(name = "crm_contact[jobTitle]")
    private WebElement jobTitleTextInput;

    @FindBy(xpath = ".//div[@class='pull-right title-buttons-container']/div[3]")
    private WebElement saveButtons;

    @FindBy(xpath = ".//h1[@class='user-name']")
    private WebElement newUserName;

    public NewContactPage(WebDriver driver) {
        super(driver);
    }

    public void checkUrl(String url) {
        wait15second.until(ExpectedConditions.presenceOfElementLocated(By.name("crm_contact[lastName]")));
        assertEquals(driver.getCurrentUrl(), url);
        System.out.println(driver.getCurrentUrl());
    }

    public NewContactPage insertLastName(String lastName){
        lastNameTextInput.sendKeys(lastName);
        return this;
    }
    public NewContactPage insertFirstName(String firstName){
        firstNameTextInput.sendKeys(firstName);
        return this;
    }
    public NewContactPage selectCompany(String companyName){
        company.click();
        companyInput.click();
        companyInput.sendKeys(companyName);
        driver.findElement(By.xpath(".//div[@class='select2-result-label']/span[text()='"+companyName+"']")).click();
        return this;
    }
    public NewContactPage insertJobTitle(String jobTitle){
        jobTitleTextInput.sendKeys(jobTitle);
        return this;
    }

    public AllContactPage goSaveButtons(){
        saveButtons.click();
        return new AllContactPage(driver);
    }


}
