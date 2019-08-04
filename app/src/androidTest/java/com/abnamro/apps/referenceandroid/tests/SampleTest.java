package com.abnamro.apps.referenceandroid.tests;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.SmallTest;
import com.abnamro.apps.referenceandroid.page.BaseTest;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.*;

import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static com.abnamro.apps.referenceandroid.page.Page.*;

@RunWith(AndroidJUnit4.class)
@SmallTest
public class SampleTest extends BaseTest {

        /**
         * Given I Launch the app
         * When I am at the ReferenceAndroid page
         * Then I can see the header and the content
         */
        @Test
        public void testCheckHeader() {
                header().check(matches(isDisplayed()));
                content().check(matches(isDisplayed()));
        }

        /**
         * Given I am on the ReferenceAndroid page
         * When I click on the mail button
         * Then I should see the snack bar
         */
        @Test
        public void testVerifyMailButton() {
                mailButton().perform(click());
                snackBar().check(matches(isDisplayed()));
        }

        /**
         * Given I am on the ReferenceAndroid page
         * When I click on more options Menu
         * Then I could see the settings option displayed
         */
        @Test
        public void testMoreOptionsMenu() {
                moreOptionsMenu().perform(click());
                settingsButton().check(matches(isDisplayed()));
                settingsButton().perform(click());
                settingsButton().check(doesNotExist());
        }

}
