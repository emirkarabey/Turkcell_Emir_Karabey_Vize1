package soru6

fun main() {
    val memur = Memur()
    val mudur = Mudur()
    val genelMudur = GenelMudur()

    val memurMaasi = memur.maasHesapla(10)
    val mudurMaasi = mudur.maasHesapla(10)
    val genelMudurMaasi = genelMudur.maasHesapla(10)

    println("Memur maaşı: $memurMaasi")
    println("Müdür maaşı: $mudurMaasi")
    println("Genel müdür maaşı: $genelMudurMaasi")
}