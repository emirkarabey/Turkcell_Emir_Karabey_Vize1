package soru3

fun main() {
    print("Lütfen bir n sayısı girin: ")
    val n = readLine()!!.toInt()

    var sum = 1.0 // Serinin ilk terimi
    var factorial = 1 // Faktöriyel değeri

    for (i in 1..n) {
        factorial *= i // Faktöriyel değerini güncelle
        val term = i.toDouble() / factorial // Terim hesapla
        sum += term // Toplamı güncelle
    }

    println("Serinin toplamı: $sum")
}