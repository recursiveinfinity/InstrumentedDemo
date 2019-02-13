package com.example.instrumenteddemo;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.ViewInteraction;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testIfLoginIsSucccessful() {
        Espresso.onView(ViewMatchers.withId(R.id.etUserName))
                .perform(ViewActions.typeText("Sidd"),
                        ViewActions.closeSoftKeyboard());
        Espresso.onView(ViewMatchers.withId(R.id.etPassword))
                .perform(ViewActions.typeText("Password"),
                        ViewActions.closeSoftKeyboard());
        Espresso.onView(ViewMatchers.withId(R.id.btnLogin))
                .perform(ViewActions.click());

        Espresso.onView(ViewMatchers.withId(R.id.tvStatus))
                .check(ViewAssertions
                        .matches(ViewMatchers.withText("Success!")));
    }
}
