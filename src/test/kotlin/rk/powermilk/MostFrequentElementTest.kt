package rk.powermilk

import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MostFrequentElementTest {

    @ParameterizedTest
    @MethodSource("mostFrequentElement")
    fun `should return most frequent elements`(array: IntArray, expected: List<String>) {
        assertEquals(expected, array.getMostFrequentElement())
    }

    private fun mostFrequentElement() = listOf(
        // standard case with two max elements
        Arguments.of(intArrayOf(1, 2, 5, 5, 5, 6, 6, 6, 7, 7), listOf("5x3", "6x3")),
        // standard case with one max element
        Arguments.of(intArrayOf(1, 2, 5, 5, 5, 6, 6, 7, 7), listOf("5x3")),
        // edge case: empty array
        Arguments.of(intArrayOf(), emptyList<String>()),
        // edge case: all unique values
        Arguments.of(intArrayOf(1, 2, 3), listOf("1x1", "2x1", "3x1")),
        // edge case: only one element most frequent
        Arguments.of(intArrayOf(1, 1, 2, 3), listOf("1x2")),
        // edge case: all elements the same
        Arguments.of(intArrayOf(4, 4, 4, 4), listOf("4x4")),
        // edge case: negatives and zero
        Arguments.of(intArrayOf(-1, -1, 0, 0, 0, -2), listOf("0x3")),
        // edge case: equal frequency, negatives and positives
        Arguments.of(intArrayOf(-2, -2, 3, 3), listOf("-2x2", "3x2"))
    )
}
