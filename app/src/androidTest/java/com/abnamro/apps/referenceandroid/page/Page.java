package com.abnamro.apps.referenceandroid.page;

import androidx.test.espresso.ViewInteraction;
import androidx.test.espresso.matcher.ViewMatchers;
import com.abnamro.apps.referenceandroid.R;

import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static org.hamcrest.core.AllOf.allOf;

public class Page {

    public static ViewInteraction header() {
        return onView(withText("ReferenceAndroid"));
    }

    public static ViewInteraction mailButton() {
        return onView(ViewMatchers.withId(R.id.fab));
    }

    public static ViewInteraction settingsButton() {
        return  onView(withText("Settings"));
    }

    public static ViewInteraction snackBar() {
        return  onView(allOf(withText("Replace with your own action")));
    }

    public static ViewInteraction content() {
        return  onView(withText("Hello World!"));
    }

    public static ViewInteraction moreOptionsMenu() {
        return  onView(withContentDescription("More options"));
    }
}