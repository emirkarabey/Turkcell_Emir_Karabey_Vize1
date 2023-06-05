package soru1

fun main() {
    print("Lütfen 3 basamaklı bir sayı girin: ")
    val number = readLine()!!.toInt()

    // Basamakları ayırmak için mod ve bölme işlemleri kullanılır
    val ones = number % 10
    val tens = (number % 100) / 10
    val hundreds = number / 100

    val sum = ones + tens + hundreds

    println("Girdiğiniz sayının basamakları toplamı: $sum")
}