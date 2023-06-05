package soru2

class Sayi : TerstenYazdir {
    override fun sayiTerstenYazdir(sayi: Int) {
        val birlerBasamagi = sayi % 10
        val onlarBasamagi = (sayi / 10) % 10
        val yuzlerBasamagi = sayi / 100

        print("Girilen sayının rakamları tersten yazdırıldığında: $birlerBasamagi$onlarBasamagi$yuzlerBasamagi")
    }
}