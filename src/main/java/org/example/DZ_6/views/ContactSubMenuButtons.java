package org.example.DZ_6.views;

import org.openqa.selenium.By;

public enum ContactSubMenuButtons implements SubMenuButtons{

    CONTACT_PERSONS(".//span[@class='title' and text()='Контактные лица']");

    private final By by;

    ContactSubMenuButtons(String xpath) {
        this.by = By.xpath(xpath);
    }

    public By getBy() {
        return by;
    }
}
