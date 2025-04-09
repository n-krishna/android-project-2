package com.example.android.testing.espresso.BasicSampleGroup6

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.closeSoftKeyboard
import androidx.test.espresso.action.ViewActions.replaceText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.android.testing.espresso.BasicSample.MainActivity
import com.example.android.testing.espresso.BasicSample.R
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class TestValidateText {

    @get:Rule
    var activityScenarioRule = activityScenarioRule<MainActivity>()

    @Test
    fun TextViewStringTest(){
        onView(withId(R.id.editTextUserInput)).perform(replaceText("TextView Validation"),closeSoftKeyboard())
        onView(withId(R.id.changeTextBt)).perform(click())
        onView(withId(R.id.textToBeChanged)).check(matches(withText("TextView Validation")))
    }

    @Test
    fun testEditTextTest1() {
        onView(withId(R.id.editTextUserInput)).perform(replaceText("123"),closeSoftKeyboard())
        onView(withId(R.id.changeTextBt)).perform(click())
        onView(withId(R.id.textToBeChanged)).check(matches(withText("123")))
    }

    @Test
    fun testEditTextTest2() {
        onView(withId(R.id.editTextUserInput)).perform(replaceText("123"))
        onView(withId(R.id.activityChangeTextBtn)).perform(click())
        onView(withId(R.id.show_text_view)).check(matches(withText("123")))
    }
    @Test
    fun testEmptyEditText1() {
        onView(withId(R.id.changeTextBt)).perform(click())
        onView(withId(R.id.textToBeChanged)).check(matches(withText("")))
    }
    @Test
    fun testEmptyEditText2() {
        onView(withId(R.id.activityChangeTextBtn)).perform(click())
        onView(withId(R.id.show_text_view)).check(matches(withText("")))
    }

    @Test
    fun testEditText1() {
        onView(withId(R.id.editTextUserInput)).perform(replaceText("abcdef"),closeSoftKeyboard())
        onView(withId(R.id.changeTextBt)).perform(click())
        onView(withId(R.id.textToBeChanged)).check(matches(withText("abcdef")))
    }

    @Test
    fun testEditText2() {
        onView(withId(R.id.editTextUserInput)).perform(replaceText("abcdef"))
        onView(withId(R.id.activityChangeTextBtn)).perform(click())
        onView(withId(R.id.show_text_view)).check(matches(withText("abcdef")))
    }

}
