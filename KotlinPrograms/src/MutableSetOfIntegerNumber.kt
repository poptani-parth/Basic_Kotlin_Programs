fun main() {
    val numbers = mutableSetOf(1, 2, 3)
    numbers.add(4)
    numbers.add(5)

    for (num in numbers) {
        println(num)
    }
}
