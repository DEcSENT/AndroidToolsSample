package dvinc.androidtoolssample

import org.junit.Assert.*
import org.junit.Test

class SampleClassTest {

    @Test
    fun check_10ValueAreCreate() {
        val sampleClass = SampleClass()
        val values = sampleClass.createListWith10Values()
        assertEquals(10, values.size)
    }

}