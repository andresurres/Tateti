package com.mercadolibre.dojos

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.junit.platform.runner.JUnitPlatform
import org.junit.runner.RunWith
import kotlin.test.assertEquals

/**
 * Tests for the dojo in Kt with Spek
 *
 * Info: https://www.baeldung.com/kotlin-spek
 */
@RunWith(JUnitPlatform::class)
class DojoKotlinSpekTest: Spek( {
    describe("adding 1 + 2") {
        var result: Int? = null

        beforeEachTest {
            result = 1 + 2
        }

        it("result should be 3") {
            assertEquals(result, 3)
        }
    }

    given("an object") {
        val obj = Any()

        on("doing some operation") {
            //do something
            it("assert some condition") {
                assertEquals(1, 1)
            }
        }
    }
})