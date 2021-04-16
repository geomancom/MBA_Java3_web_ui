package org.example.DZ_5_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Contact extends DZ_5 {

    public static void addPersona(WebDriver driver, String personaName, String personaFirstName, String companyName, WebDriverWait WebDriverWait5sec) {
        driver.findElement(By.xpath(
                ".//li[@class='dropdown first']/a[@class='unclickable']/span[text()='Контрагенты']")).click();
        driver.findElement(By.xpath(".//span[@class='title' and text()='Контактные лица']")).click();
        WebDriverWait5sec.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(".//a[@title='Создать контактное лицо']"))));
        driver.findElement(By.xpath(".//a[@title='Создать контактное лицо']")).click();

        WebDriverWait5sec.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("crm_contact[lastName]"))));
        WebElement lastName = driver.findElement(By.name("crm_contact[lastName]"));
        lastName.click();
        lastName.sendKeys(personaName);
        WebElement firstName = driver.findElement(By.name("crm_contact[firstName]"));
        firstName.click();
        firstName.sendKeys(personaFirstName);

        driver.findElement(By.xpath(".//span[@class='select2-chosen']")).click();
        WebElement inputCompany = driver.findElement(By.xpath(".//div[@class='select2-search']/input"));
        inputCompany.click();
        inputCompany.sendKeys(companyName);
        // проверку надо на текст
        driver.findElement(By.xpath(
                ".//div[@class='select2-result-label']/span[text()='"+companyName+"']")).click();
        WebElement jobTitle = driver.findElement(By.name("crm_contact[jobTitle]"));
        jobTitle.click();
        jobTitle.sendKeys("пони");
        driver.findElement(By.xpath(".//div[@class='pull-right title-buttons-container']/div[3]")).click();
        pause(driver); //ждем новую подгрузку страницы
        //WebDriverWait5sec.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(".//h1[@class='user-name']"))));

        String result = driver.findElement(By.xpath(".//h1[@class='user-name']")).getText();
        //System.out.println(result);
        String fulName = personaName+" "+personaFirstName;
        //System.out.println(fulName);

        if (result.equals(fulName)){
            System.out.println("persona completed");
        }else{
            System.out.println("persona not created");
        }
    }
}
