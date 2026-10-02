package com.mudassiryaseen.i230017

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.NoActivityResumedException
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.assertThrows
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class NavigationTests {

    @get:Rule
    val activityRule = ActivityScenarioRule(LoginActivity::class.java)

    @Test
    fun homeToComments_andBackToHome() {
        onView(withId(R.id.btnLogin)).perform(click())
        Thread.sleep(1000)

        onView(withId(R.id.btnComment)).check(matches(isDisplayed()))
        onView(withId(R.id.btnComment)).perform(click())
        Thread.sleep(1000)

        onView(withId(R.id.btnBack)).perform(click())
        Thread.sleep(1000)

        onView(withId(R.id.btnComment)).check(matches(isDisplayed()))
    }

    @Test
    fun loginToMenu_logout_clearsBackStack() {
        onView(withId(R.id.btnLogin)).perform(click())
        Thread.sleep(1000)

        onView(withId(R.id.tabMenu)).check(matches(isDisplayed()))
        onView(withId(R.id.tabMenu)).perform(click())
        Thread.sleep(1000)

        onView(withId(R.id.btnLogout)).check(matches(isDisplayed()))
        onView(withId(R.id.btnLogout)).perform(click())
        Thread.sleep(1000)

        onView(withId(R.id.btnLogin)).check(matches(isDisplayed()))

        // Back stack is cleared, so pressing Back here has nothing left to
        // resume and the app exits — this IS the expected log-out behavior.
        assertThrows(NoActivityResumedException::class.java) {
            androidx.test.espresso.Espresso.pressBack()
        }
    }
}