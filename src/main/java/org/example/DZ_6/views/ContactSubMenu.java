package org.example.DZ_6.views;

import org.openqa.selenium.WebDriver;

public class ContactSubMenu extends SubMenu{
    public ContactSubMenu(WebDriver driver) {
        super(driver);
    }

    @Override
    public BaseView clickSubMenuButton(SubMenuButtons buttons) {
        if (buttons instanceof ContactSubMenuButtons) {
            switch ((ContactSubMenuButtons) buttons) {
                case CONTACT_PERSONS:
                    driver.findElement(((ContactSubMenuButtons) buttons).getBy()).click();
                    return new AllContactPage(driver);
                default:
                    throw new IllegalArgumentException("Not implemented yet");
            }
        } else {
            throw new IllegalArgumentException("Incorrect button type");
        }
    }
}
