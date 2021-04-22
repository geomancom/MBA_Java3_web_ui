package org.example.DZ_6.tests;

import org.example.DZ_6.BaseUITest;
import org.example.DZ_6.Configuration;
import org.example.DZ_6.LoginPage;
import org.example.DZ_6.views.NavigationBarTabs;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;


public class NavigationTest extends BaseUITest {
    @ParameterizedTest
    @MethodSource("navigationTabProvider")
    public void checkMainNavigationTabsTest(NavigationBarTabs barTab) {
        new LoginPage(driver)
                .authoriseScenario(Configuration.STUDENT_LOGIN, Configuration.STUDENT_PASSWORD)
                .getPageNavigation()
                .checkTabVisibility(barTab);
    }

    static NavigationBarTabs[] navigationTabProvider() {
        return NavigationBarTabs.values();
    }

}
