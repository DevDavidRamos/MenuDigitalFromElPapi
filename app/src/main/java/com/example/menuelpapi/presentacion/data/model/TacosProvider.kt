package com.example.menuelpapi.presentacion.data.model

class TacosProvider {
    companion object{
        val tacosList = listOf<Tacos>(
            Tacos(
                "VAMPIROS",
                "$70",
                "Doble tortilla taquera con queso manchego, arrachera o sirlon con guacamole encima (3 Piezas)."
            ),
            Tacos(
                "VAMPIROS CAMPECHANOS",
                "$85",
                "Doble tortilla taquera arrachera o sirlon con queso manchego, guacamole y chistorra (3 Piezas)."
            ),
            Tacos(
                "SUIZOS",
                "$85",
                "Doble tortilla taquera arrachera o sirlon con queso manchego, guacamole y champiñones ( 3 Piezas) "

            ),
            Tacos(
                "GRINGAS",
                "$75",
                "Doble tortilla de harina al medio queso manchego, sirlon o arrachera y guacamole."
            ),
            Tacos(
                "EL BABO",
                "$60",
                "Salchicha de asar con tocino ahumado, queso manchego, lechuga, tomate, aderezos de la casa y guacamole en una tortilla de harina."
            )
        )

    }
}