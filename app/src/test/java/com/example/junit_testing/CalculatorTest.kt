package com.example.junit_testing

import com.example.junit_test.Calculator
import org.junit.Test
import kotlin.test.assertEquals

class CalculatorTest {

    val calculator = Calculator()

    @Test
    fun `Test calculator can subtract two numbers`() {
        assertEquals(10, calculator.sub(20, 10))
    }
}