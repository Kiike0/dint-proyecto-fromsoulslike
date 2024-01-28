package com.example.di_appfromsoulslike.components

import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.di_appfromsoulslike.R
import com.example.di_appfromsoulslike.cabecera.Cabecera
import com.example.di_appfromsoulslike.cabecera.bebasNeue
import com.google.relay.compose.BoxScopeInstanceImpl.align
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector


@Composable
fun CabeceraVfinal(
    modifier: Modifier = Modifier,
    fromSoulsLike: String = ""
) {
    TopLevel(modifier = modifier.align(Alignment.TopCenter)) {
        FondoNegro(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 0.0.dp
                )
            )
        )
        Degradado(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 0.0.dp
                )
            )
        )
        FromSoulsLike(
            fromSoulsLike = fromSoulsLike,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 17.5.dp,
                    y = 0.5.dp
                )
            )
        )
    }
}

@Preview(widthDp = 393, heightDp = 64)
@Composable
private fun CabeceravFinalPreview() {
    MaterialTheme {
        RelayContainer {
            CabeceraVfinal(
                fromSoulsLike = "FromSoulsLike",
                modifier = Modifier
                    .rowWeight(1.0f)
                    .columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun FondoNegro(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.cabecera_fondo_negro),
        modifier = modifier
            .requiredWidth(393.0.dp)
            .requiredHeight(64.0.dp)
    )
}

@Composable
fun Degradado(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.cabecera_degradado),
        modifier = modifier
            .requiredWidth(393.0.dp)
            .requiredHeight(64.0.dp)
    )
}

@Composable
fun FromSoulsLike(
    fromSoulsLike: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = fromSoulsLike,
        fontSize = 32.0.sp,
        fontFamily = bebasNeue,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2000000476837158.em,
        letterSpacing = 1.92.sp,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier
            .requiredWidth(216.0.dp)
            .requiredHeight(37.0.dp)
    )
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.align(Alignment.TopCenter)
    )
}