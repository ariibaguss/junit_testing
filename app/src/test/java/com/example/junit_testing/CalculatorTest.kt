package com.example.junit_testing

import com.example.junit_test.Calculator
import org.junit.Test
import kotlin.test.assertEquals

class CalculatorTest {

    val calculator = Calculator()

    @Test
    fun add() {
        val expected = 15
        assertEquals(expected, calculator.add(5, 10))
    }
}