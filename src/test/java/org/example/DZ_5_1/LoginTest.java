package org.example.DZ_5_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import org.example.DZ_5_1.Project;
import org.example.DZ_5_1.MainTest;
import static org.example.DZ_5_1.Configuration.*;

public class LoginTest extends MainTest{

    @BeforeEach
    public void beforeEach() {
        driver.get(LOGIN_PAGE_URL);
    }

    @Test
    @DisplayName("Проверка авторизации на сайте")
    public void authorizationTest() {
        Project.login(driver, LOGIN_PAGE_URL, STUDENT_LOGIN, STUDENT_PASSWORD);
        String result = driver.findElement(By.xpath(
                ".//ul[@class='nav nav-multilevel main-menu']/li[@class='dropdown']/a[@class='unclickable']/span[text()='Проекты']")).getText();
        Assertions.assertEquals("Проекты", result);
    }


}
