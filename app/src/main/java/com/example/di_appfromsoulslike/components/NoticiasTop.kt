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
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.di_appfromsoulslike.R
import com.example.di_appfromsoulslike.noticiatop.montserrat
import com.example.di_appfromsoulslike.noticiatop.openSans
import com.google.relay.compose.EmptyPainter
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector

/**
 * This composable was generated from the UI Package 'noticia_top'.
 * Generated code; do not edit directly
 */
@Composable
fun NoticiaTopvFinalNoticias(
    modifier: Modifier = Modifier,
    imagenNoticia: Painter = EmptyPainter(),
    contenido: AnnotatedString = AnnotatedString(""),
    titulo: String = ""
) {
    TopLevelvFinalNoticias(modifier = modifier) {
        ImagenNoticiavFinalNoticias(
            imagenNoticia = imagenNoticia,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 124.0.dp,
                    y = 0.0.dp
                )
            )
        )
        FondoTextovFinalNoticias(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -64.0.dp,
                    y = 0.0.dp
                )
            )
        )
        ContenidovFinalNoticias(
            contenido = contenido,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -66.59395599365234.dp,
                    y = 21.5.dp
                )
            )
        )
        TitulovFinalNoticias(
            titulo = titulo,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -64.54491424560547.dp,
                    y = -37.5.dp
                )
            )
        )
    }
}

@Preview(widthDp = 376, heightDp = 127)
@Composable
private fun NoticiaTopPreview() {
    MaterialTheme {
        RelayContainer {
            NoticiaTopvFinalNoticias(
                imagenNoticia = painterResource(R.drawable.noticia_top_imagen_noticia),
                contenido = buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            fontFamily = openSans,
                            fontSize = 10.0.sp,
                            fontWeight = FontWeight(400.0.toInt())
                        )
                    ) {
                        append("Tras cumplir el primer mes en las tiendas, se ha hecho pública la buena noticia de que ha alcanzado nada más y nada menos que un millón de unidades vendidas en todas las plataformas para las que ha salido.\n")
                    }
                    append("\n")
                },
                titulo = "Lies of P supera el éxito previsto y llegan al millón de copias vendidas",
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun ImagenNoticiavFinalNoticias(
    imagenNoticia: Painter,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = imagenNoticia,
        contentScale = ContentScale.Crop,
        modifier = modifier
            .requiredWidth(128.0.dp)
            .requiredHeight(127.0.dp)
            .clip(RoundedCornerShape(0.dp, 16.dp, 16.dp, 0.dp))
    )
}

@Composable
fun FondoTextovFinalNoticias(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.noticia_top_fondo_texto),
        modifier = modifier.requiredWidth(248.0.dp).requiredHeight(127.0.dp)
    )
}

@Composable
fun ContenidovFinalNoticias(
    contenido: AnnotatedString,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = contenido,
        fontSize = 9.8.sp,
        fontFamily = openSans,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.219000021616618.em,
        letterSpacing = 0.72.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight.Normal,
        maxLines = -1,
        modifier = modifier
            .requiredWidth(230.51771545410156.dp)
            .requiredHeight(72.0.dp)
    )
}

@Composable
fun TitulovFinalNoticias(
    titulo: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = titulo,
        fontSize = 12.0.sp,
        fontFamily = openSans,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.36181640625.em,
        letterSpacing = 0.72.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(234.6157989501953.dp).requiredHeight(46.0.dp)
    )
}

@Composable
fun TopLevelvFinalNoticias(
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
