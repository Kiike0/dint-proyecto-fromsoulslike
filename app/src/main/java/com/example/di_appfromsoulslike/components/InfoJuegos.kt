package com.example.di_appfromsoulslike.components

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.di_appfromsoulslike.R
import com.example.di_appfromsoulslike.tarjetajuego.openSans
import com.google.relay.compose.BorderAlignment
import com.google.relay.compose.EmptyPainter
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
/**
 * This composable was generated from the UI Package 'tarjeta_juego'.
 * Generated code; do not edit directly
 */
@Composable
fun TarjetaJuegovFinalJuegos(
    modifier: Modifier = Modifier,
    tituloJuego: String = "",
    imagenJuego: Painter = EmptyPainter(),
    informacion: String = ""
) {
    TopLevelvFinalJuegos(modifier = modifier) {
        RectangleJuegovFinalJuegos(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 111.5.dp,
                    y = 0.0.dp
                )
            )
        )
        RectangleFondoJvFinalJuegos(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -68.0.dp,
                    y = 0.0.dp
                )
            )
        )
        TituloJuegovFinalJuegos(
            tituloJuego = tituloJuego,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 111.0.dp,
                    y = 29.0.dp
                )
            )
        )
        ImagenJuegovFinalJuegos(
            imagenJuego = imagenJuego,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 112.0.dp,
                    y = -9.090909957885742.dp
                )
            )
        )
        InformacionvFinalJuegos(
            informacion = informacion,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -60.0.dp,
                    y = -27.0.dp
                )
            )
        )
    }
}

@Preview(widthDp = 360, heightDp = 80)
@Composable
private fun TarjetaJuegoPreview() {
    MaterialTheme {
        RelayContainer {
            TarjetaJuegovFinalJuegos(
                tituloJuego = "Nombre del juego",
                imagenJuego = painterResource(R.drawable.tarjeta_juego_imagen_juego),
                informacion = "Información del juego del que se habla en el foro.",
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun RectangleJuegovFinalJuegos(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.tarjeta_juego_rectangle_juego),
        modifier = modifier.requiredWidth(135.0.dp).requiredHeight(80.0.dp)
    )
}

@Composable
fun RectangleFondoJvFinalJuegos(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.tarjeta_juego_rectangle_fondo_j),
        modifier = modifier.requiredWidth(224.0.dp).requiredHeight(80.0.dp)
    )
}

@Composable
fun TituloJuegovFinalJuegos(
    tituloJuego: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = tituloJuego,
        fontSize = 10.0.sp,
        fontFamily = openSans,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.36181640625.em,
        letterSpacing = 0.6.sp,
        textAlign = TextAlign.Right,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(118.0.dp).requiredHeight(10.0.dp)
    )
}

@Composable
fun ImagenJuegovFinalJuegos(
    imagenJuego: Painter,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = imagenJuego,
        borderAlignment = BorderAlignment.Outside,
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(136.0.dp).requiredHeight(61.818180084228516.dp)
    )
}

@Composable
fun InformacionvFinalJuegos(
    informacion: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = informacion,
        fontSize = 10.0.sp,
        fontFamily = openSans,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.36181640625.em,
        letterSpacing = 0.6.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(196.0.dp).requiredHeight(12.0.dp)
    )
}

@Composable
fun TopLevelvFinalJuegos(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}