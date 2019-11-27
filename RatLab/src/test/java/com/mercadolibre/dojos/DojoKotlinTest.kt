package com.mercadolibre.dojos

import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertSame
import org.junit.Before
import org.junit.Test

/**
 * Tests for the dojo in Kt
 */
class DojoKotlinTest {
    @Before
    fun setup() {

    }

    @Test
    fun test_case_00() {
        val o = Any()

        // ...
        // Code here!
        // ...
        assertEquals(1, 1)
        assertSame(o, o)
    }

    @Test(expected = RuntimeException::class)
    fun test_case_01() {

        throw RuntimeException()
    }
}