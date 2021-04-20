package org.example.DZ_6.views;

import org.openqa.selenium.WebDriver;

public abstract class SubMenu extends BaseView{
    public SubMenu(WebDriver driver) {
        super(driver);
    }

    abstract public BaseView clickSubMenuButton(SubMenuButtons buttons);
}
