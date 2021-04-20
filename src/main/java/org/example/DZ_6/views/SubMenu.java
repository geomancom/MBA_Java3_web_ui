package org.example.DZ_6.views;

import org.openqa.selenium.WebDriver;

//public abstract class SubMenu extends BaseView{
public class SubMenu extends BaseView{
    public SubMenu(WebDriver driver) {
        super(driver);
    }

    //abstract public BaseView clickSubMenuButton(SubMenuButtons buttons);


    public AllContactPage clickSubMenuButtonGoAllContactPage(SubMenuButtons buttons){
        driver.findElement(((ContactSubMenuButtons) buttons).getBy()).click();
        return new AllContactPage(driver);
    };

    public AllProjectPage clickSubMenuButtonGoAllProjectPage(SubMenuButtons buttons){
        driver.findElement(((ProjectSubMenuButtons) buttons).getBy()).click();
        return new AllProjectPage(driver);
    };

    public AllExpensesPage clickSubMenuButtonGoAllExpensesPage(SubMenuButtons buttons){
        driver.findElement(((ContactSubMenuButtons) buttons).getBy()).click();
        return new AllExpensesPage(driver);
    };

}
