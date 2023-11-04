package com.example.junit_testing

 // Mengimpor kelas Calculator dari package com.example.junit_test
import com.example.junit_test.Calculator
import org.junit.Test
// Mengimpor fungsi assertEquals dari package kotlin.test
import kotlin.test.assertEquals

 // Mendefinisikan kelas CalculatorTest
class CalculatorTest {

    // Membuat objek dari kelas Calculator
    val calculator = Calculator()

    @Test
    // Mendefinisikan metode pengujian
    fun `Test calculator can subtract two numbers`() {
        // Memanggil fungsi assertEquals untuk membandingkan hasil perhitungan 
        // dengan nilai yang diharapkan
        assertEquals(10, calculator.sub(20, 10))
    }
}
