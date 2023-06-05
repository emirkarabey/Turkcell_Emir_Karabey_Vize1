package soru6

open class Personel(val maas: Int, val ekSaatUcreti: Double) {

    fun maasHesapla(ekSaatler: Int): Double {
        return maas + (ekSaatler * ekSaatUcreti)
    }
}