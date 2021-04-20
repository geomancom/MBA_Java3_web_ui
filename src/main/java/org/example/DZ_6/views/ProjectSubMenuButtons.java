package org.example.DZ_6.views;

import org.openqa.selenium.By;

public enum ProjectSubMenuButtons implements SubMenuButtons{

    ALL_PROJECT(".//span[@class='title' and text()='Все проекты']");


    private final By by;

    ProjectSubMenuButtons(String xpath) {
        this.by = By.xpath(xpath);
    }

    public By getBy() {
        return by;
    }
}
