package org.example.DZ_6.tests;

import org.example.DZ_6.LoginPage;
import org.junit.jupiter.api.Test;
import org.example.DZ_6.BaseUITest;

import static org.example.DZ_6.Configuration.*;

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
