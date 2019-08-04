package com.abnamro.apps.referenceandroid.page;

import androidx.test.rule.ActivityTestRule;
import com.abnamro.apps.referenceandroid.MainActivity;
import org.junit.Rule;

public class BaseTest {

    /**
     * Launch the app to start testing
     */
    @Rule
    public ActivityTestRule<MainActivity> activityRule =
            new ActivityTestRule<>(MainActivity.class);

}
