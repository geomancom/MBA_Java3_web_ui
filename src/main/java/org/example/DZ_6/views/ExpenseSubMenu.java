package org.example.DZ_6.views;

import org.openqa.selenium.WebDriver;

public class ExpenseSubMenu extends SubMenu{
    public ExpenseSubMenu(WebDriver driver) {
        super(driver);
    }

    public AllExpensesPage clickSubMenuButton(SubMenuButtons buttons) {
        if (buttons instanceof ExpenseSubMenuButtons) {
            switch ((ExpenseSubMenuButtons) buttons) {
                case EXPENSE_REQUEST:
                    driver.findElement(((ExpenseSubMenuButtons) buttons).getBy()).click();
                    return new AllExpensesPage(driver);
                default:
                    throw new IllegalArgumentException("Not implemented yet");
            }
        } else {
            throw new IllegalArgumentException("Incorrect button type");
        }
    }
}
