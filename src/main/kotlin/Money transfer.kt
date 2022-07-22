package ru.cifrium

fun main () {
    val itemAmount: Int = 300_000
    val itemCommission: Double = 0.075
    val CommStart: Int = 3_500

    var totalCommission: Double = itemAmount * itemCommission
    if (totalCommission <= 3_500) {
        totalCommission = CommStart.toDouble()
    }
    println ("Commission: $totalCommission ")
}
