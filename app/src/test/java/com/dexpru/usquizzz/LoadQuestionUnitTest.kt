package com.dexpru.usquizzz

import org.junit.Assert.assertEquals
import org.junit.Test

class LoadQuestionUnitTest {

    @Test
    fun loadQuestions() {
        val quiz = Quiz(LoadQuestionUnitTest::class.java.getResourceAsStream("/raw/test-states.json")!!)
        assertEquals(
            arrayListOf(
                State("State name", "SN", "Capitol", "Biggest City"),
                State("State name", "SN", "Capitol")
            ), quiz.states
        )
    }
}