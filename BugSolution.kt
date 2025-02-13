fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5, null)
    val newList = list.filterNotNull().toMutableList()
    newList.removeIf { it > 3 }
    println(newList) // Output: [1, 2, 3]

    val set = mutableSetOf(1, 2, 3, 4, 5, null)
    val newSet = set.filterNotNull().toMutableSet()
    newSet.removeIf { it > 3 }
    println(newSet) // Output: [1, 2, 3]
    
    //Alternative approach using a custom predicate
    fun <T> MutableCollection<T?>.removeIfNotNull(predicate: (T) -> Boolean) {
        val iterator = this.iterator()
        while (iterator.hasNext()) {
            val element = iterator.next()
            if(element != null && predicate(element)) {
                iterator.remove()
            }
        }
    }
    val list2 = mutableListOf(1, 2, 3, 4, 5, null)
    list2.removeIfNotNull {it > 3}
    println(list2) //Output: [1,2,3, null]
    val set2 = mutableSetOf(1,2,3,4,5, null)
    set2.removeIfNotNull { it > 3 }
    println(set2) //Output: [1,2,3, null]
}