package org.example.DZ_5_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Project extends DZ_5 {
    public static void login(WebDriver driver, String loginPageUrl, String studentLogin, String studentPassword) {
        driver.get(loginPageUrl);
        WebElement loginTextInput = driver.findElement(By.id("prependedInput"));
        loginTextInput.sendKeys(studentLogin);
        WebElement passwordTextInput = driver.findElement(By.name("_password"));
        passwordTextInput.sendKeys(studentPassword);
        driver.findElement(By.xpath(".//button[@name='_submit']")).click();



    }

    public static void addProject(WebDriver driver, String projectName, String companyName, String personaName, WebDriverWait WebDriverWait5sec) {
        driver.findElement(By.xpath(
                ".//ul[@class='nav nav-multilevel main-menu']/li[@class='dropdown']/a[@class='unclickable']/span[text()='Проекты']")).click();
        driver.findElement(By.xpath(".//span[@class='title' and text()='Мои проекты']")).click();
        WebDriverWait5sec.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(".//a[@title='Создать проект']"))));
        driver.findElement(By.xpath(".//a[@title='Создать проект']")).click();

        WebDriverWait5sec.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(".//input[@data-name='field__name']"))));
        WebElement fieldName = driver.findElement(By.xpath(".//input[@data-name='field__name']"));
        fieldName.sendKeys(projectName);

        driver.findElement(By.xpath(".//div[@class='select2-container select2 input-widget']")).click();

        WebElement inputCompany = driver.findElement(By.xpath(".//div[@id='select2-drop']/div/input"));
        inputCompany.click();
        inputCompany.sendKeys(companyName);
        // проверку надо на текст
        driver.findElement(By.xpath(
                ".//div[@class='select2-result-label']/span[text()='"+companyName+"']")).click();

        driver.findElement(By.xpath(".//div[@class='select2-container select2']")).click();
        WebElement inputPersona = driver.findElement(By.xpath(".//div[@id='select2-drop']/div/input"));
        inputPersona.click();
        inputPersona.sendKeys(personaName);
        // проверку надо на текст
        driver.findElement(By.xpath(".//div[@class='select2-result-label']")).click();

        Select businessUnit = new Select(driver.findElement(By.name("crm_project[businessUnit]")));
        businessUnit.selectByValue("1");

        Select curator = new Select(driver.findElement(By.name("crm_project[curator]")));
        curator.selectByVisibleText("Applanatest Applanatest Applanatest");

        Select rp = new Select(driver.findElement(By.name("crm_project[rp]")));
        rp.selectByVisibleText("Applanatest Applanatest Applanatest");

        Select manager = new Select(driver.findElement(By.name("crm_project[manager]")));
        manager.selectByVisibleText("Applanatest Applanatest Applanatest");

        driver.findElement(By.name("crm_project[configManagement]")).sendKeys(personaName);

        driver.findElement(By.name("crm_project[skipSpeedChecks]")).click();

        driver.findElement(By.xpath(".//div[@class='pull-right title-buttons-container']/div[3]")).click();

        pause(driver);
        driver.findElement(By.xpath(".//li[@class='current']")).isDisplayed();


        String result = driver.findElement(By.xpath(".//h1[@class='user-name']")).getText();

        if (result.equals(projectName)){
            System.out.println("PROJECT completed");
        }else{
            System.out.println("project not created");
        }


    }

    public static void deleteProject(WebDriver driver, WebDriverWait WebDriverWait5sec) {
        WebDriverWait5sec.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(".//div[@class='pull-left btn-group icons-holder']/a[@title='Удалить']"))));
        driver.findElement(By.xpath(".//div[@class='pull-left btn-group icons-holder']/a[@title='Удалить']")).click();
        driver.findElement(By.xpath(".//a[@class='btn ok btn-primary']")).click();
        pause(driver);

    }
}
