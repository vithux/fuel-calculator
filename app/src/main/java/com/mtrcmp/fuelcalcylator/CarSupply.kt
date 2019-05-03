package com.mtrcmp.fuelcalcylator

data class CarSupply(
    var fuelPrice: Double,
    var kilometersRotated: Double,
    var littersSupply: Double
) {
    fun kmperliter(): Double {
        return this.kilometersRotated / this.littersSupply
    }

    fun kmperprice(): Double {
        return this.fuelPrice / this.kilometersRotated
    }
}