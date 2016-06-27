package com.example.guest.myrestaurants;
import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;


/**
 * Created by Guest on 6/27/16.
 */
public class MainActivityInstumentationTest {
    @Rule
    public ActivityTestRule<MainActivity> activityTestRule =
            new ActivityTestRule<>(MainActivity.class);
    @Test
    public void validateEditText() {
        onView(withId(R.id.locationEditText)).perform(typeText("Portland"))
                .check(matches(withText("Portland")));
    }
}
