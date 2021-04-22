package org.example.DZ_6.tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.example.DZ_6.BaseUITest;
import org.example.DZ_6.LoginPage;
import org.junit.jupiter.api.Test;

import static org.example.DZ_6.Configuration.*;
import static org.example.DZ_6.views.ContactSubMenuButtons.CONTACT_PERSONS;
import static org.example.DZ_6.views.NavigationBarTabs.COUNTER_PARTIES;
import static org.example.DZ_6.views.NavigationBarTabs.PROJECTS;
import static org.example.DZ_6.views.ProjectSubMenuButtons.ALL_PROJECT;


@Feature("Create New Project")
@Severity(SeverityLevel.CRITICAL)
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

    @Test
    public void checkCreateNewProjectTest() {
        new LoginPage(driver)
                .enterLogin(STUDENT_LOGIN)
                .enterPassword(STUDENT_PASSWORD)
                .clickLoginButton()
                .getPageNavigation()
                .moveCursorToNavigationTab(PROJECTS)
                .clickSubMenuButtonGoAllProjectPage(ALL_PROJECT)
                .clickOnCreateNewProjectButton()
                .insertProjectName(PROJECT_NAME)
                .insertCompanyName(COMPANY_NAME)
                .selectSkipSpeedChecks()
                .selectBusinessUnit(BUV)
                .selectСurator(AAAV)
                .selectRp(AAAV)
                .selectManager(AAAV)
                .insertPersonaName(PERSONA_NAME)
                .insertConfigManagement(PERSONA_NAME)
                .goSaveButtons()
                .checkNewProjectPopUp()
                .goButtonDelete()
                .goButtonDeleteOk()

        ;


    }

}
