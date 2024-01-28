package com.example.di_appfromsoulslike.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.di_appfromsoulslike.R
import com.example.di_appfromsoulslike.components.CabeceraVfinal
import com.example.di_appfromsoulslike.components.PanelUsuarioVFinal
import com.example.di_appfromsoulslike.forootros.ForoOtros
import com.example.di_appfromsoulslike.forotemas.ForoTemas
import com.google.relay.compose.BoxScopeInstanceImpl.align

/**
 * Función composable que representa la pantalla principal para seleccionar el tipo de juego.
 *
 * @param navController El controlador de navegación utilizado para navegar en las diferentes pantallas.
 * @param viewModel El ViewModel responsable de gestionar la lógica del juego de Blackjack.
 *
 * poner luego esto: navController: NavHostController,
 *     viewModel: PantallaInicioViewModel
 *
 */
@Composable
fun PantallaForo(

) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        CabeceraVfinal(
            modifier = Modifier.align(Alignment.TopCenter),
            fromSoulsLike = "fromSoulslike"
        )
        ForoTemas(
            Modifier.size(415.dp, 335.dp),
            "General",
            "Encuentros Online",
            "Quedadas para que puedas jugar con quien quieras",
            "Las mejores builds para que puedas plantar cara a los bosses más difíciles",
            "Builds",
            "Guías de tus juegos favoritos",
            "Guias",
            "Temas sobre juegos de temática souls",
            "Videojuegos soulslike"
        )
        ForoOtros(
            Modifier.size(415.dp, 300.dp),
            "Creaciones",
            "Off-Topic y humor",
            "MMO",
            "Temas sobre cualquier videojuego de todas las índoles",
            "Otros videojuegos",
            "Otros menesteres"
        )
        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(70.dp)
                    .background(color = Color.Black)
                    .align(Alignment.BottomCenter)
            ) {
                PanelUsuarioVFinal(
                    modifier = Modifier.align(Alignment.BottomCenter), // Modificador personalizado opcional
                    logo = painterResource(id = R.drawable.logomejorado),
                    usuario = {
                        // Lógica cuando se hace clic en el área de usuario
                    },
                    buscador = {
                        // Lógica cuando se hace clic en el área de buscador
                    },
                    post = {
                        // Lógica cuando se hace clic en el área de posts
                    },
                    secciones = {
                        // Lógica cuando se hace clic en el área de secciones
                    }
                )
            }
        }

    }
}