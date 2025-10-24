# Most Frequent Element

[![version](https://img.shields.io/badge/version-1.0.12-yellow.svg)](https://semver.org)
[![Awesome Kotlin Badge](https://kotlin.link/awesome-kotlin.svg)](https://github.com/KotlinBy/awesome-kotlin)
[![Build](https://github.com/rkociniewski/most-frequent-element/actions/workflows/main.yml/badge.svg)](https://github.com/rkociniewski/most-frequent-element/actions/workflows/main.yml)
[![codecov](https://codecov.io/gh/rkociniewski/most-frequent-element/branch/main/graph/badge.svg)](https://codecov.io/gh/rkociniewski/most-frequent-element)
[![Kotlin](https://img.shields.io/badge/Kotlin-2.2.20-blueviolet?logo=kotlin)](https://kotlinlang.org/)
[![Gradle](https://img.shields.io/badge/Gradle-9.10-blue?logo=gradle)](https://gradle.org/)
[![License: MIT](https://img.shields.io/badge/License-MIT-greem.svg)](https://opensource.org/licenses/MIT)

This Kotlin project provides a utility extension function for the `IntArray` type to find and display the most frequent
elements in the array in the format:

```

value x count

````

---

## 🔧 Usage

### Function

```kotlin
fun IntArray.getMostFrequentElement(): List<String>
````

### Example

```kotlin
val array = intArrayOf(1, 2, 5, 5, 5, 6, 6, 6, 7, 7)
println(array.getMostFrequentElement()) // Output: [5x3, 6x3]
```

---

## ✅ Test Coverage

The function is covered by parameterized tests written using JUnit 5.

### Example test cases include:

* Multiple most frequent values
* A single most frequent value
* All elements unique
* All elements identical
* Empty array
* Arrays with negative and zero values

Tests are located in:

```
src/test/kotlin/rk/powermilk/MostFrequentElementTest.kt
```

---

## 📦 Project Structure

```
rk.powermilk
├── getMostFrequentElement.kt        // Main function
└── MostFrequentElementTest.kt      // Parameterized tests
```

---

## License

This project is licensed under the MIT License.

## Built With

* [Gradle](https://gradle.org/) - Dependency Management

## Versioning

We use [SemVer](http://semver.org/) for versioning.

## Authors

* **Rafał Kociniewski** - [PowerMilk](https://github.com/rkociniewski)
