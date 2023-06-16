package com.example.menuelpapi.presentacion.data.model

class PapasProvider {
    companion object{
        val paponasList = listOf<Papas>(
            Papas(
                "TRADICIONALES",
                "$60",
                "Papas fritas tradicionales con los aderezos de la casa y chesswhizz."
            ),
            Papas(
                "PAPI PAPAS",
                "$75",
                "Papas fritas con los aderezos de la casa, queso chesswhizz, que manchego y tocino."
            ),
            Papas(
                "PAPAS GAJO",
                "$75",
                "Papas gajo sazonadas con los aderezos de la casa y chesswhizz."

            ),
            Papas(
                "PIZZA PAPAS",
                "$85",
                "Papas gajo o a la francesa, " +
                        "aderezos, chesswhizz, mozarella gratinado y peperoni ahumado."
            ),
            Papas(
                "PAPAS GRILL",
                "$95",
                "Papas a la francesa, aderezos de la casa, chesswhizz, guacamole, chistorra, queso manchego y sirlon."
            ),
            Papas(
                "PAPAS BRAVAS",
                "$85",
                "Papas gajo o a la francesa con nuestra salsa picante especial, aderezo ranch, queso chesswhizz con trozos de tocino."
            )
        )

    }
}