package com.example.di_appfromsoulslike.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.unit.dp
import com.example.di_appfromsoulslike.R
import com.example.di_appfromsoulslike.components.CabeceraVfinal
import com.example.di_appfromsoulslike.components.CreacionUsuariovFinalCr
import com.example.di_appfromsoulslike.components.HiloTOPvFinal
import com.example.di_appfromsoulslike.components.PanelUsuarioVFinal
import com.example.di_appfromsoulslike.components.TarjetaJuegovFinalJuegos
import com.example.di_appfromsoulslike.creacionusuario.CreacionUsuario
import com.example.di_appfromsoulslike.ontop.OnTop
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
fun PantallaCreaciones(

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
        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {
            ListaCreaciones()
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

/**
 * Funcion que muestra los juegos en un lazy column, el usuario tendrá que deslizar hacia abajo para ver más juegos
 * de los que se hablan en el foro
 */
@Composable
fun ListaCreaciones(){
    LazyColumn {
        item {
            CreacionUsuariovFinalCr(
                Modifier.size(415.dp, 360.dp),
                painterResource(R.drawable.creacion_usuario_imagen_fan_art),
                "Melina fanArt",
                "raven124",
                painterResource(R.drawable.creacion_usuario_avatar_usuario)
            )
        }
        item {
            CreacionUsuariovFinalCr(
                Modifier.size(415.dp, 360.dp),
                painterResource(R.drawable.creacionelden),
                "Elden Rin fanArt",
                "sekiro666",
                painterResource(R.drawable.avtsekiro)
            )
        }
    }
}