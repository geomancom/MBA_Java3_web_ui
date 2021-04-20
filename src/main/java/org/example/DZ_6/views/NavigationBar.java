package org.example.DZ_6.views;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.junit.jupiter.api.Assertions;

public class NavigationBar extends BaseView {
    public NavigationBar(WebDriver driver) {
        super(driver);
    }

    public SubMenu moveCursorToNavigationTab(NavigationBarTabs tab) {
        Actions actions = new Actions(driver);
        actions
                .moveToElement(driver.findElement(tab.getBy()))
                .build()
                .perform();
        switch (tab) {
            case EXPENSES:
                return new ExpenseSubMenu(driver);
            case COUNTER_PARTIES:
                return new ContactSubMenu(driver);
            case PROJECTS:
                return new ProjectSubMenu(driver);
            default:
                throw new IllegalArgumentException("Another tabs currently not implemented");
        }
    }

    public NavigationBar checkTabVisibility(NavigationBarTabs tab) {
        Assertions.assertTrue(driver.findElement(tab.getBy()).isDisplayed());
        return this;
    }
}
