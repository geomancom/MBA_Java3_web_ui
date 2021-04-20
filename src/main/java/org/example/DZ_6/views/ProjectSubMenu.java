package org.example.DZ_6.views;

import org.openqa.selenium.WebDriver;

public class ProjectSubMenu extends SubMenu{
    public ProjectSubMenu(WebDriver driver) {
        super(driver);
    }

    public AllProjectPage clickSubMenuButton(SubMenuButtons buttons) {
        if (buttons instanceof ProjectSubMenuButtons) {
            switch ((ProjectSubMenuButtons) buttons) {
                case ALL_PROJECT:
                    driver.findElement(((ProjectSubMenuButtons) buttons).getBy()).click();
                    return new AllProjectPage(driver);
                default:
                    throw new IllegalArgumentException("Not implemented yet");
            }
        } else {
            throw new IllegalArgumentException("Incorrect button type");
        }
    }
}
