package org.example.DZ_5_1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class DZ_5 {
    private static WebDriver driver;
    private static final String LOGIN_PAGE_URL = "https://crm.geekbrains.space/user/login";
    private static final String STUDENT_LOGIN = "Applanatest";
    private static final String STUDENT_PASSWORD = "Student2020!";
    private static final String PROJECT_NAME = "manbob";
    private static final String COMPANY_NAME = "1234";
    private static final String PERSONA_NAME = "Man";
    private static final String PERSONA_FIRST_NAME = "Boris";




    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-popup-blocking");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebDriverWait WebDriverWait5sec = new WebDriverWait(driver, 10);


        Project.login(driver, LOGIN_PAGE_URL, STUDENT_LOGIN, STUDENT_PASSWORD);
        //Project.addProject(driver, PROJECT_NAME, COMPANY_NAME, PERSONA_NAME, WebDriverWait5sec);
        //Project.deleteProject(driver, WebDriverWait5sec);

        Thread.sleep(2000);

        Contact.addPersona(driver, PERSONA_NAME, PERSONA_FIRST_NAME, COMPANY_NAME, WebDriverWait5sec);

        Thread.sleep(2000);
        driver.quit();
    }
    public static void pause(WebDriver driver){
        driver.findElements(By.xpath(".//a[@class='skip_turn']"));
        driver.findElements(By.xpath(".//a[@class='skip_turn2']"));
    }
}
