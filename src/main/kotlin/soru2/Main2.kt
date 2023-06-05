package soru2

fun main() {
    print("Lütfen 3 haneli bir sayı giriniz: ")
    val sayi = readLine()!!.toInt()

    val sayiNesnesi = Sayi()
    sayiNesnesi.sayiTerstenYazdir(sayi)
}