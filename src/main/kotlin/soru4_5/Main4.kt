package soru4_5

fun main() {
    print("Lütfen bir n sayısı girin: ")
    val n = readLine()!!.toInt()
    val sumOfPrimes = getSumOfAllPrimes(n)
    println("1'den $n'e kadar olan asal sayıların toplamı: $sumOfPrimes")
}

fun getSumOfAllPrimes(n: Int): Int {
    var sum = 0
    for (i in 1..n) {
        if (isPrime(i)) {
            sum += i
        }
    }
    return sum
}

fun isPrime(number: Int): Boolean {
    if (number <= 1) {
        return false
    }

    for (i in 2..(number / 2)) {
        if (number % i == 0) {
            return false
        }
    }

    return true
}