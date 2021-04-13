package org.example.DZ_5_2;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


import static org.example.DZ_5_2.Configuration.*;
import static org.example.DZ_5_2.DZ_5_2.*;

public class NotaTest extends MainTest{

    @BeforeEach
    public void beforeEach() {
        driver.get(PAGE_URL);
    }

    @Test
    @DisplayName("Проверка Заголовка Ноты")
    public void createNotaTitleTest() {
        createNota(PAGE_URL, NOTA_TITLE, NOTA_TEXT, driver);
        String getNotaTitle = driver.findElement(By.xpath(".//ul[@class='notes']/li/b")).getText();
        System.out.println(getNotaTitle);
        Assertions.assertEquals(NOTA_TITLE, getNotaTitle);
    }

    @Test
    @DisplayName("Проверка текста Ноты")
    public void createNotaTextTest() {
        createNota(PAGE_URL, NOTA_TITLE, NOTA_TEXT, driver);
        String getNotaText = driver.findElement(By.xpath(".//ul[@class='notes']/li/p")).getText();
        System.out.println(getNotaText);
        Assertions.assertEquals(NOTA_TEXT, getNotaText);
    }

    @Test
    @DisplayName("Проверка сообщения об удалении Ноты")
    public void deleteNotaTextTest() {
        createNota(PAGE_URL, NOTA_TITLE, NOTA_TEXT, driver);
        deleteNota(driver);
        WebElement messageSuccess = driver.findElement(By.xpath("//div[@class='toast-content' and text()='Заметка удалена']"));
        wait15second.until(ExpectedConditions.visibilityOf(messageSuccess));
        String status = messageSuccess.getText();
        System.out.println(status);
        Assertions.assertEquals("Заметка удалена", status);
    }

//    @Test
//    @DisplayName("Проверка скрытого удалении Ноты")
//    public void deleteNotaHiddenTest() {
//        createNota(PAGE_URL, NOTA_TITLE, NOTA_TEXT, driver);
//        deleteNotaHidden(driver);
//        WebElement messageSuccess = driver.findElement(By.xpath("//div[@class='toast-content' and text()='Заметка удалена']"));
//        wait15second.until(ExpectedConditions.visibilityOf(messageSuccess));
//        String status = messageSuccess.getText();
//        System.out.println(status);
//        Assertions.assertEquals("Заметка удалена", status);
//    }
}
