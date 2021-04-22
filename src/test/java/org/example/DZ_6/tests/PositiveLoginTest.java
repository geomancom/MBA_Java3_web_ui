package org.example.DZ_6.tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.example.DZ_6.LoginPage;
import org.junit.jupiter.api.Test;
import org.example.DZ_6.BaseUITest;

import static org.example.DZ_6.Configuration.*;

@Feature("Login")
@Severity(SeverityLevel.BLOCKER)
public class PositiveLoginTest extends BaseUITest {
    @Test
    public void loginWithBaseUserTest() {
        new LoginPage(driver)
                .enterLogin(STUDENT_LOGIN)
                .enterPassword(STUDENT_PASSWORD)
                .clickLoginButton()
                .checkUrl(BASE_URL);
    }
}
