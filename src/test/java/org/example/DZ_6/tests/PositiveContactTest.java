package org.example.DZ_6.tests;

import org.example.DZ_6.BaseUITest;
import org.example.DZ_6.LoginPage;
import org.junit.jupiter.api.Test;

import static org.example.DZ_6.Configuration.*;
import static org.example.DZ_6.views.ContactSubMenuButtons.CONTACT_PERSONS;
import static org.example.DZ_6.views.ExpenseSubMenuButtons.EXPENSE_REQUEST;
import static org.example.DZ_6.views.NavigationBarTabs.COUNTER_PARTIES;
import static org.example.DZ_6.views.NavigationBarTabs.EXPENSES;

public class PositiveContactTest extends BaseUITest {
    @Test
    public void checkContactTabVisibilityTest() {
        new LoginPage(driver)
                .enterLogin(STUDENT_LOGIN)
                .enterPassword(STUDENT_PASSWORD)
                .clickLoginButton()
                .getPageNavigation().
                checkTabVisibility(COUNTER_PARTIES)
        ;
    }


    @Test
    public void checkUrlAllContactTest() {
        new LoginPage(driver)
                .enterLogin(STUDENT_LOGIN)
                .enterPassword(STUDENT_PASSWORD)
                .clickLoginButton()
                .getPageNavigation()
                //.moveCursorToNavigationTab(EXPENSES)
                //.clickSubMenuButton(EXPENSE_REQUEST)
                .moveCursorToNavigationTab(COUNTER_PARTIES)
                .clickSubMenuButton(CONTACT_PERSONS)

                ;
    }
}
