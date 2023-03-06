package org.powermilk

/**
 * Function extension for display most frequent element.
 */
fun IntArray.getMostFrequentElement(): List<String> {
    val count = toList().groupingBy { it }.eachCount()
    return count.filterValues { it == count.values.maxOrNull() }.map { "${it.key}x${it.value}" }
}
