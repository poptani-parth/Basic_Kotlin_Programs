fun main() {
    val cities = mapOf(
        1 to "Rajkot",
        2 to "Ahmedabad",
        3 to "Surat"
    )

    for ((key, city) in cities) {
        println("Key: $key, City: $city")
    }
}
