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
import com.example.di_appfromsoulslike.components.HiloTOPvFinal
import com.example.di_appfromsoulslike.components.NoticiaTopvFinalNoticias
import com.example.di_appfromsoulslike.components.PanelUsuarioVFinal
import com.example.di_appfromsoulslike.noticiatop.NoticiaTop
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
fun PantallaNoticias(

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
            ListaNoticias()
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
 * Funcion que muestra las noticias en un lazy column, el usuario tendrá que deslizar hacia abajo para ver más noticias
 */
@Composable
fun ListaNoticias(){
    LazyColumn {
        item {
            NoticiaTopvFinalNoticias (
                Modifier.size(415.dp, 140.dp),
                painterResource(R.drawable.noticia_top_imagen_noticia),
                AnnotatedString("Tras cumplir el primer mes en las tiendas, se ha hecho pública la buena noticia " +
                        "de que ha alcanzado nada más y nada menos que un millón de unidades vendidas en todas las " +
                        "plataformas para las que ha salido.\n"),
                "Lies of P supera el éxito previsto y llegan al millón de copias vendidas"
            )
        }
        item {
            NoticiaTopvFinalNoticias (
                Modifier.size(415.dp, 140.dp),
                painterResource(R.drawable.eldenring),
                AnnotatedString("Shadow of Erdrtree, el primer DLC de Elden Ring anunciado hace un año. Se desveló " +
                        "su existencia y desapareció del mapa, aunque parece que eso podría estar a punto de cambiar.\n"),
                "El DLC de Elden Ring está más cerca que nunca según rumores"
            )
        }
        item {
            NoticiaTopvFinalNoticias (
                Modifier.size(415.dp, 140.dp),
                painterResource(R.drawable.imgblsphms),
                AnnotatedString("Penitente. Ten Piedad. El Milagro. Son nombres que pueden recordar al imaginario " +
                        "cristiano, pero en la cultura del videojuego son personajes de una de las obras españolas " +
                        "más exitosas. \n"),
                "Blasphemous II cosecha una buena acogida por su público"
            )
        }
        item {
            NoticiaTopvFinalNoticias (
                Modifier.size(415.dp, 140.dp),
                painterResource(R.drawable.sekiro23),
                AnnotatedString("Traza tu propio camino hacia la venganza enfrentándote cara a cara a enemigos " +
                        "descomunales en una oscura y tortuosa aventura de la mano de From Software. Vuelve a haver " +
                        "stock en físido de Sekiro.\n"),
                "Vuelve el stock del juego más deseado"
            )
        }
        item {
            NoticiaTopvFinalNoticias (
                Modifier.size(415.dp, 140.dp),
                painterResource(R.drawable.lof2),
                AnnotatedString("Lords of the Fallen aprovecha su mundo dual para convertirse en un soulslike " +
                        "muy divertido que destaca como aventura con mayúsculas.\n"),
                "Lords of the Fallen, el regreso de un proyecto que parecía maldito"
            )
        }
        item {
            NoticiaTopvFinalNoticias (
                Modifier.size(415.dp, 140.dp),
                painterResource(R.drawable.darksouls3),
                AnnotatedString("FromSoftware anuncia a través de un comunicado que suspenderá los servidores " +
                        "en línea de Dark Souls: Remastered, Dark Souls 2 y Dark Souls 3 por la brecha de " +
                        "seguridad.\n"),
                "Desactivado el online de todos los Dark Souls en PC"
            )
        }
    }
}