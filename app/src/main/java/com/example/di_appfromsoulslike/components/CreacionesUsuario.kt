package com.example.di_appfromsoulslike.components

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.di_appfromsoulslike.R
import com.example.di_appfromsoulslike.creacionusuario.openSans
import com.google.relay.compose.EmptyPainter
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText

/**
 * This composable was generated from the UI Package 'creacion_usuario'.
 * Generated code; do not edit directly
 */
@Composable
fun CreacionUsuariovFinalCr(
    modifier: Modifier = Modifier,
    imagenFanArt: Painter = EmptyPainter(),
    textoPostCreacion: String = "",
    nombreUsuario: String = "",
    avatarUsuarioCreaciones: Painter = EmptyPainter()
) {
    TopLevelvFinalCr(modifier = modifier) {
        ImagenFanArtvFinalCr(
            imagenFanArt = imagenFanArt,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 33.5.dp,
                    y = -31.5.dp
                )
            )
        )
        TextoPostCreacionvFinalCr(
            textoPostCreacion = textoPostCreacion,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -50.0.dp,
                    y = 125.5.dp
                )
            )
        )
        NombreUsuariovFinalCr(
            nombreUsuario = nombreUsuario,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 17.0.dp,
                    y = 155.5.dp
                )
            )
        )
        AvatarUsuariovFinalCr(
            avatarUsuarioCreaciones = avatarUsuarioCreaciones,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -143.5.dp,
                    y = -141.5.dp
                )
            )
        )
    }
}

@Preview(widthDp = 337, heightDp = 333)
@Composable
private fun CreacionUsuarioPreview() {
    MaterialTheme {
        RelayContainer {
            CreacionUsuariovFinalCr(
                imagenFanArt = painterResource(R.drawable.creacion_usuario_imagen_fan_art),
                textoPostCreacion = "Aqui va texto",
                nombreUsuario = "aqui va nombre de usuario",
                avatarUsuarioCreaciones = painterResource(R.drawable.creacion_usuario_avatar_usuario),
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun ImagenFanArtvFinalCr(
    imagenFanArt: Painter,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = imagenFanArt,
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(270.0.dp).requiredHeight(270.0.dp)
    )
}

@Composable
fun TextoPostCreacionvFinalCr(
    textoPostCreacion: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = textoPostCreacion,
        fontSize = 15.0.sp,
        fontFamily = openSans,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.36181640625.em,
        letterSpacing = 0.8999999999999999.sp,
        textAlign = TextAlign.Left,
        modifier = modifier
    )
}

@Composable
fun NombreUsuariovFinalCr(
    nombreUsuario: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = nombreUsuario,
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
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier.padding(end = 160.dp)
    )
}

@Composable
fun AvatarUsuariovFinalCr(
    avatarUsuarioCreaciones: Painter,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = avatarUsuarioCreaciones,
        radius = 80.0,
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(50.0.dp).requiredHeight(50.0.dp)
    )
}

@Composable
fun TopLevelvFinalCr(
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
