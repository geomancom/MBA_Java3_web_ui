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

@Feature("Create New Contact")
@Severity(SeverityLevel.CRITICAL)
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
                .moveCursorToNavigationTab(COUNTER_PARTIES)
                .clickSubMenuButtonGoAllContactPage(CONTACT_PERSONS)
                .checkUrl(CONTACT_URL)
        ;
    }

    @Test
    public void checkUrlCreateAllContactTest() {
        new LoginPage(driver)
                .enterLogin(STUDENT_LOGIN)
                .enterPassword(STUDENT_PASSWORD)
                .clickLoginButton()
                .getPageNavigation()
                .moveCursorToNavigationTab(COUNTER_PARTIES)
                .clickSubMenuButtonGoAllContactPage(CONTACT_PERSONS)
                .clickOnCreateNewContactButton()
                .checkUrl(CONTACT_CREATE_URL)
                ;
    }

    @Test
    public void checkCreateNewContactTest() {
        new LoginPage(driver)
                .enterLogin(STUDENT_LOGIN)
                .enterPassword(STUDENT_PASSWORD)
                .clickLoginButton()
                .getPageNavigation()
                .moveCursorToNavigationTab(COUNTER_PARTIES)
                .clickSubMenuButtonGoAllContactPage(CONTACT_PERSONS)
                .clickOnCreateNewContactButton()
                .insertLastName(PERSONA_NAME)
                .insertFirstName(PERSONA_FIRST_NAME)
                .insertJobTitle(JOB_TITLE)
                .selectCompany(COMPANY_NAME)
                .goSaveButtons()
                .checkNewContactPopUp()
        ;


    }
}

