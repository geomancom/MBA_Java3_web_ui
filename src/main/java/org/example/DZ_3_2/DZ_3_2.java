package org.example.DZ_3_2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.DZ_3_1.Contact;
import org.example.DZ_3_1.Project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class DZ_3_2 {
    private static WebDriver driver;
    private static final String LOGIN_PAGE_URL = "https://notepadonline.ru/app";
    private static final String NOTA_TITLE = "NOTA_TITLE";
    private static final String NOTA_TEXT = "NOTA_TEXT";

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-popup-blocking");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        //создаем
        createNota();
        //проверяем
        checkNota();
        Thread.sleep(2000);
        //удаляем
        deleteNota();

        Thread.sleep(2000);
        driver.quit();
    }

    public static void createNota(){
        driver.get(LOGIN_PAGE_URL);
        driver.findElement(By.xpath(".//button[@id='new_btn']")).click();
        driver.findElement(By.xpath(".//input[@id='n_title']")).sendKeys(NOTA_TITLE);
        driver.findElement(By.xpath(".//textarea[@id='n_text']")).sendKeys(NOTA_TEXT);
        driver.findElement(By.xpath(".//ul[@class='menu']/li[1]/a")).click();
        driver.findElement(By.xpath(".//a[@id='file_save']")).click();
    }

    public static void checkNota(){
        String getNotaTitle = driver.findElement(By.xpath(".//ul[@class='notes']/li/b")).getText();
        String getNotaText = driver.findElement(By.xpath(".//ul[@class='notes']/li/p")).getText();
        if (getNotaTitle.equals(NOTA_TITLE) & getNotaText.equals(NOTA_TEXT)){
            System.out.println("completed");
        }else{
            System.out.println("not created");
        }
    }

    public static void deleteNota(){
        driver.findElement(By.xpath(".//a[@id='del_btn']")).click();
        driver.findElement(By.xpath(".//button[@id='del_yes']")).click();
    }
}
