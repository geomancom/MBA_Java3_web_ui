package org.example.DZ_6.tests;

import org.example.DZ_6.BaseUITest;
import org.example.DZ_6.LoginPage;
import org.junit.jupiter.api.Test;

import static org.example.DZ_6.Configuration.*;
import static org.example.DZ_6.views.NavigationBarTabs.PROJECTS;
import static org.example.DZ_6.views.ProjectSubMenuButtons.ALL_PROJECT;

public class PositiveProjectTest extends BaseUITest {
    @Test
    public void checkProjectTabVisibilityTest() {
        new LoginPage(driver)
                .enterLogin(STUDENT_LOGIN)
                .enterPassword(STUDENT_PASSWORD)
                .clickLoginButton()
                .getPageNavigation().
                checkTabVisibility(PROJECTS)
        ;
    }
    @Test
    public void checkUrlAllProjectTest() {
        new LoginPage(driver)
                .enterLogin(STUDENT_LOGIN)
                .enterPassword(STUDENT_PASSWORD)
                .clickLoginButton()
                .getPageNavigation()
                .moveCursorToNavigationTab(PROJECTS)
                .clickSubMenuButtonGoAllProjectPage(ALL_PROJECT)
                .checkUrl(PROJECT_URL)
        ;
    }

    @Test
    public void checkUrlCreateAllProjectTest() {
        new LoginPage(driver)
                .enterLogin(STUDENT_LOGIN)
                .enterPassword(STUDENT_PASSWORD)
                .clickLoginButton()
                .getPageNavigation()
                .moveCursorToNavigationTab(PROJECTS)
                .clickSubMenuButtonGoAllProjectPage(ALL_PROJECT)
                .clickOnCreateNewProjectButton()
                .checkUrl(PROJECT_CREATE_URL)
        ;
    }

}
