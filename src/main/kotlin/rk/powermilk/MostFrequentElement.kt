package rk.powermilk

/**
 * Function extension for display most frequent element.
 */
fun IntArray.getMostFrequentElement(): List<String> {
    val counts = toList().groupingBy { it }.eachCount()
    val max = counts.maxOfOrNull { it.value } ?: return emptyList()
    return counts.filterValues { it == max }.toSortedMap().map { "${it.key}x${it.value}" }
}
