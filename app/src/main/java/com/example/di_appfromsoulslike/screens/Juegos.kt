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
import com.example.di_appfromsoulslike.components.NoticiaTopvFinalNoticias
import com.example.di_appfromsoulslike.components.PanelUsuarioVFinal
import com.example.di_appfromsoulslike.components.TarjetaJuegovFinalJuegos
import com.example.di_appfromsoulslike.ontop.OnTop
import com.example.di_appfromsoulslike.tarjetajuego.TarjetaJuego
import com.example.di_appfromsoulslike.titulojuegos.TituloJuegos
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
fun PantallaJuegos(

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
        OnTop(
            Modifier.size(415.dp, 200.dp),
            "Retos",
            "Builds",
            "Encuentros",
            painterResource(R.drawable.on_top_imagen_retos),
            painterResource(R.drawable.on_top_imagen_builds),
            painterResource(R.drawable.on_top_imagen_encuentros)
        )
        TituloJuegos(
            Modifier.size(415.dp, 40.dp),
            "Juegos"
        )
        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {
            ListaJuegos()
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
fun ListaJuegos(){
    LazyColumn {
        item {
            TarjetaJuegovFinalJuegos(
                Modifier.size(415.dp, 100.dp),
                "Saga souls",
                painterResource(R.drawable.dssaga),
                "Los jugadores, como \"No Muertos\", enfrentan desafíos mortales y " +
                        "descubren la historia mientras buscan enlazar o usurpar la llama."
            )
        }
        item {
            TarjetaJuegovFinalJuegos(
                Modifier.size(415.dp, 100.dp),
                "Elden Ring",
                painterResource(R.drawable.eldenultra),
                "Los jugadores asumen el papel del Tarnished, buscando recoger fragmentos " +
                        "de la Elden Ring para desencadenar una nueva era. "
            )
        }
        item {
            TarjetaJuegovFinalJuegos(
                Modifier.size(415.dp, 100.dp),
                "Bloodborne",
                painterResource(R.drawable.blodultra),
                "Ambientado en la ciudad de Yharnam, los jugadores encarnan a un Cazador " +
                        "en busca de respuestas sobre una misteriosa enfermedad. "
            )
        }
        item {
            TarjetaJuegovFinalJuegos(
                Modifier.size(415.dp, 100.dp),
                "Lords of the fallen",
                painterResource(R.drawable.lof2),
                "Los jugadores asumen el papel de Harkyn, un criminal redimido, que se " +
                        "embarca en una misión para enfrentar a fuerzas demoníacas y un dios caído."
            )
        }
        item {
            TarjetaJuegovFinalJuegos(
                Modifier.size(415.dp, 100.dp),
                "Lies of p",
                painterResource(R.drawable.liesofpgame),
                "Lies of P, un videojuego que reinterpreta la tradicional historia de " +
                        "Pinocho convirtiéndola en un RPG de acción al estilo Dark Souls. "
            )
        }
        item {
            TarjetaJuegovFinalJuegos(
                Modifier.size(415.dp, 100.dp),
                "Saga Nioh",
                painterResource(R.drawable.imgnioh),
                "Ambientado en el Japón del siglo XVI y protagonizado por un valeroso " +
                        "samurái que deberá luchar contra todo tipo de criaturas demoníacas. "
            )
        }
    }
}