This repository demonstrates an uncommon bug in Kotlin related to the `removeIf()` function. The function behaves inconsistently with null values when used with `MutableList` and `MutableSet`. Lists throw exceptions, while Sets silently ignore null values. This inconsistency can be problematic and lead to unexpected behavior in applications. The `Bug.kt` file shows the inconsistent behavior, and `BugSolution.kt` provides a solution to handle these inconsistencies and ensure consistent behavior.