package com.example.di_appfromsoulslike.components

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
import com.example.di_appfromsoulslike.hilotop1.openSans
import com.google.relay.compose.EmptyPainter
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText

/**
 * This composable was generated from the UI Package 'hilo_top1'.
 * Generated code; do not edit directly
 */
@Composable
fun HiloTOPvFinal(
    modifier: Modifier = Modifier,
    tituloPost: String = "",
    textPost: AnnotatedString = AnnotatedString(""),
    avatarUsuario: Painter = EmptyPainter()
) {
    TopLevelvFinal(modifier = modifier) {
        TituloPostvFinal(
            tituloPost = tituloPost,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 36.5.dp,
                    y = -44.0.dp
                )
            )
        )
        TextPostvFinal(
            textPost = textPost,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 35.0.dp,
                    y = 25.0.dp
                )
            )
        )
        AvatarUsuariovFinal(
            avatarUsuario = avatarUsuario,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -151.0.dp,
                    y = -41.0.dp
                )
            )
        )
    }
}

@Preview(widthDp = 352, heightDp = 132)
@Composable
private fun HiloTOPvFinal() {
    MaterialTheme {
        RelayContainer {
            HiloTOPvFinal(
                tituloPost = "¿Es Dark Souls II el más infravalorado?",
                textPost = buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            fontFamily = openSans,
                            fontSize = 15.0.sp,
                            fontWeight = FontWeight(400.0.toInt())
                        )
                    ) {
                        append("Para mi el Dark Souls 1 es el juego que mejores sensaciones me ha \ntransmitido desde hace tiempo...\n")
                    }
                    append("\n")
                },
                avatarUsuario = painterResource(R.drawable.hilo_top1_avatar_usuario),
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun TituloPostvFinal(
    tituloPost: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = tituloPost,
        fontSize = 16.0.sp,
        fontFamily = openSans,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.36181640625.em,
        letterSpacing = 0.96.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight.Bold,
        maxLines = -1,
        modifier = modifier.requiredWidth(279.0.dp)
    )
}

@Composable
fun TextPostvFinal(
    textPost: AnnotatedString,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = textPost,
        fontSize = 14.0.sp,
        fontFamily = openSans,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.36181640625.em,
        letterSpacing = 0.96.sp,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight.Normal,
        maxLines = -1,
        modifier = modifier.requiredWidth(276.0.dp).requiredHeight(82.0.dp)
    )
}

@Composable
fun AvatarUsuariovFinal(
    avatarUsuario: Painter,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = avatarUsuario,
        radius = 80.0,
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(50.0.dp).requiredHeight(50.0.dp)
    )
}

@Composable
fun TopLevelvFinal(
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