package org.example.DZ_6.views;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class NewContactPage extends BaseView{
    @FindBy(name = "crm_contact[lastName]")
    private WebElement lastNameTextInput;

    @FindBy(name = "crm_contact[firstName]")
    private WebElement firstNameTextInput;

    @FindBy(xpath = ".//span[@class='select2-chosen']")
    private WebElement select2Chosen;

    @FindBy(xpath = ".//div[@class='select2-search']/input")
    private WebElement select2Search;

    @FindBy(name = "crm_contact[jobTitle]")
    private WebElement jobTitle;

    @FindBy(xpath = ".//div[@class='pull-right title-buttons-container']/div[3]")
    private WebElement titleButtons;

    @FindBy(xpath = ".//h1[@class='user-name']")
    private WebElement userName;

    public NewContactPage(WebDriver driver) {
        super(driver);
    }



}
