package com.example.di_appfromsoulslike.screens


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
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
import com.example.di_appfromsoulslike.components.PanelUsuarioVFinal
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
fun PantallaInicial(

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
        HiloTOPvFinal(
            Modifier.size(415.dp, 150.dp),
            "¿Es Dark Souls II el más infravalorado?",
            AnnotatedString(
                "Para mi el Dark Souls 1 es el juego que mejores sensaciones me ha " +
                        "transmitido desde hace tiempo...\n"
            ),
            painterResource(R.drawable.hilo_top1_avatar_usuario)
        )
        HiloTOPvFinal(
            Modifier.size(415.dp, 150.dp),
            "Reimaginan los jefes de Lies of P como si fuese Cuphead",
            AnnotatedString(
                "Cuphead es uno de los juegos indies más exitosos" +
                        "de los últimos años y hace unos meses llegó ... \n"
            ),
            painterResource(R.drawable.avatarlies)
        )
        HiloTOPvFinal(
            Modifier.size(415.dp, 150.dp),
            "Nuevo Record Speedrun All Bosses en Dark Souls 3",
            AnnotatedString(
                "Nemz38 ha logrado superar Dark Souls 3 en una hora y " +
                        "media en la categoria All Bosses incluyendo ... \n"
            ),
            painterResource(R.drawable.avtsekiro)
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


/*
Box(
        modifier = Modifier
            .fillMaxSize() // Ocupa todo el espacio disponible
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth() // Ocupa todo el ancho disponible
                .height(70.dp) // Altura fija de 200dp
                .background(color = Color.Red) // Color de fondo rojo (puedes cambiarlo según tu preferencia)
                .align(Alignment.BottomCenter) // Alineado en la parte inferior del contenedor principal
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
 */

/*
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
                .fillMaxWidth()
                .height(200.dp),
            contentAlignment = Alignment.Center
        ) {
            OnTop(
                Modifier,
                "Retos",
                "Builds",
                "Encuentros",
                painterResource(R.drawable.on_top_imagen_retos),
                painterResource(R.drawable.on_top_imagen_builds),
                painterResource(R.drawable.on_top_imagen_encuentros)
            )
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp),
            contentAlignment = Alignment.Center
        ) {
            HiloTOPvFinal(
                Modifier,
                "¿Es Dark Souls II el más infravalorado?",
                AnnotatedString(
                    "Para mi el Dark Souls 1 es el juego que mejores sensaciones me ha " +
                            "transmitido desde hace tiempo...\n"
                ),
                painterResource(R.drawable.hilo_top1_avatar_usuario)
            )
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            contentAlignment = Alignment.Center
        ) {
            HiloTOPvFinal(
                Modifier,
                "Reimaginan los jefes de Lies of P como si fuese Cuphead",
                AnnotatedString(
                    "Cuphead es uno de los juegos indies más exitosos" +
                            "de los últimos años y hace unos meses llegó ... \n"
                ),
                painterResource(R.drawable.avatarlies)
            )
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp),
            contentAlignment = Alignment.Center
        ) {
            HiloTOPvFinal(
                Modifier,
                "Nuevo Record Speedrun All Bosses en Dark Souls 3",
                AnnotatedString(
                    "Nemz38 ha logrado superar Dark Souls 3 en una hora y " +
                            "media en la categoria All Bosses incluyendo ... ... \n"
                ),
                painterResource(R.drawable.avtsekiro)
            )
        }

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
 */
