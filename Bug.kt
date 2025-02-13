fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it > 3 }
    println(list) // Output: [1, 2, 3]

    val set = mutableSetOf(1, 2, 3, 4, 5)
    set.removeIf { it > 3 }
    println(set) // Output: [1, 2, 3] 
}