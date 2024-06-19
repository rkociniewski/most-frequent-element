package org.powermilk

import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MostFrequentElementTest {
    @ParameterizedTest
    @MethodSource("mostFrequentElement")
    fun `should returns most popular elements`(array: IntArray, expected: List<String>) =
        assertEquals(expected, array.getMostFrequentElement())

    private fun mostFrequentElement() = listOf(
        Arguments.of(intArrayOf(1, 2, 5, 5, 5, 6, 6, 6, 7, 7), listOf("5x3", "6x3")),
        Arguments.of(intArrayOf(1, 2, 5, 5, 5, 6, 6, 7, 7), listOf("5x3"))
    )
}
