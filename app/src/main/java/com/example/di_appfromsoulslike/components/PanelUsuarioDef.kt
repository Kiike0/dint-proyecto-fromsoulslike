package com.example.di_appfromsoulslike.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import com.example.di_appfromsoulslike.R
import com.google.relay.compose.BoxScopeInstanceImpl.align
import com.google.relay.compose.EmptyPainter
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayVector
import com.google.relay.compose.RowScopeInstanceImpl.weight
import com.google.relay.compose.tappable

/* Esta es la version de relay (actualizada) que no va
/**
 * This composable was generated from the UI Package 'panel_usuario'.
 * Generated code; do not edit directly
 */
@Composable
fun PanelUsuarioVFinal(
    modifier: Modifier = Modifier,
    logo: Painter = EmptyPainter(),
    usuario: () -> Unit = {},
    buscador: () -> Unit = {},
    post: () -> Unit = {},
    secciones: () -> Unit = {}
) {
    TopLevelVFinal(modifier = modifier) {
        FondoNegroVFinal(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        DegradadoVFinal(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        IconoUsuarioVFinal(
            usuario = usuario,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 151.5.dp,
                    y = -2.0.dp
                )
            )
        ) {
            VectorUsuarioVFinal(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        IconoBuscadorVFinal(
            buscador = buscador,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 76.5.dp,
                    y = -2.0.dp
                )
            )
        ) {
            VectorBusquedaVFinal(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -0.35416603088378906.dp,
                        y = -0.35416603088378906.dp
                    )
                )
            )
        }
        IconoPostVFinal(
            post = post,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.5.dp,
                    y = 0.0.dp
                )
            )
        ) {
            VectorPostVFinal(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        IconoSeccionesVFinal(
            secciones = secciones,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -75.5.dp,
                    y = -4.0.dp
                )
            )
        ) {
            VectorSectVFinal(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0000209808349609375.dp,
                        y = 0.0000209808349609375.dp
                    )
                )
            )
        }
        LogoVFinal(
            logo = logo,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -155.5.dp,
                    y = -4.0.dp
                )
            )
        )
    }
}

@Preview(widthDp = 393, heightDp = 72)
@Composable
private fun PanelUsuarioPreviewVFinal() {
    MaterialTheme {
        RelayContainer {
            PanelUsuarioVFinal(
                usuario = {},
                buscador = {},
                post = {},
                secciones = {},
                logo = painterResource(R.drawable.panel_usuario_logo),
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun FondoNegroVFinal(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.panel_usuario_fondo_negro),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun DegradadoVFinal(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.panel_usuario_degradado),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun VectorUsuarioVFinal(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.panel_usuario_vector_usuario),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 3.3333740234375.dp,
                top = 3.33331298828125.dp,
                end = 3.3332901000976562.dp,
                bottom = 3.3333511352539062.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun IconoUsuarioVFinal(
    usuario: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.tappable(onTap = usuario).requiredWidth(40.0.dp).requiredHeight(40.0.dp)
    )
}

@Composable
fun VectorBusquedaVFinal(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.panel_usuario_vector_busqueda),
        modifier = modifier.requiredWidth(29.291667938232422.dp).requiredHeight(29.291667938232422.dp)
    )
}

@Composable
fun IconoBuscadorVFinal(
    buscador: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.tappable(onTap = buscador).requiredWidth(40.0.dp).requiredHeight(40.0.dp)
    )
}

@Composable
fun VectorPostVFinal(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.panel_usuario_vector_post),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 3.3333740234375.dp,
                top = 3.33331298828125.dp,
                end = 3.3332862854003906.dp,
                bottom = 5.656454086303711.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun IconoPostVFinal(
    post: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.tappable(onTap = post).requiredWidth(40.0.dp).requiredHeight(40.0.dp)
    )
}

@Composable
fun VectorSectVFinal(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.panel_usuario_vector_sect),
        modifier = modifier.requiredWidth(26.666667938232422.dp).requiredHeight(26.666667938232422.dp)
    )
}

@Composable
fun IconoSeccionesVFinal(
    secciones: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.tappable(onTap = secciones).requiredWidth(40.0.dp).requiredHeight(40.0.dp)
    )
}

@Composable
fun LogoVFinal(
    logo: Painter,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = logo,
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 16.0.dp,
                top = 7.0.dp,
                end = 327.0.dp,
                bottom = 15.0.dp
            )
        )
            .width(50.dp)
            .height(50.dp)
    )
}

@Composable
fun TopLevelVFinal(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.align(Alignment.BottomCenter)
    )
}
 */




@Composable
fun PanelUsuarioVFinal(
    modifier: Modifier = Modifier,
    logo: Painter = EmptyPainter(),
    usuario: () -> Unit = {},
    buscador: () -> Unit = {},
    post: () -> Unit = {},
    secciones: () -> Unit = {}
) {
    BotLevel(modifier = modifier) {
        FondoNegroVFinal(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        DegradadoVFinal(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        IconoUsuarioVFinal(
            usuario = usuario,
            modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
        ) {
            VectorUsuarioVFinal(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        IconoBuscadorVFinal(
            buscador = buscador,
            modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
        ) {
            VectorBusquedaVFinal(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        IconoPostVFinal(
            post = post,
            modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
        ) {
            VectorPostVFinal(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        IconoSeccionesVFinal(
            secciones = secciones,
            modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
        ) {
            VectorSectVFinal(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        LogoVFinal(
            logo = logo,
            modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
        )
    }
}

@Preview(widthDp = 393, heightDp = 72)
@Composable
private fun PanelUsuarioPreview() {
    MaterialTheme {
        RelayContainer {
            com.example.di_appfromsoulslike.panelusuario.PanelUsuario(
                usuario = {},
                buscador = {},
                post = {},
                secciones = {},
                logo = painterResource(R.drawable.panel_usuario_logo),
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun FondoNegroVFinal(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.panel_usuario_fondo_negro),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun DegradadoVFinal(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.panel_usuario_degradado),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun VectorUsuarioVFinal(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.panel_usuario_vector_usuario),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 3.3333740234375.dp,
                top = 3.33331298828125.dp,
                end = 3.3332901000976562.dp,
                bottom = 3.3333511352539062.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun IconoUsuarioVFinal(
    usuario: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 328.0.dp,
                top = 14.0.dp,
                end = 25.0.dp,
                bottom = 18.0.dp
            )
        ).tappable(onTap = usuario).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun VectorBusquedaVFinal(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.panel_usuario_vector_busqueda),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 5.0.dp,
                top = 5.0.dp,
                end = 5.708332061767578.dp,
                bottom = 5.708332061767578.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun IconoBuscadorVFinal(
    buscador: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 253.0.dp,
                top = 14.0.dp,
                end = 100.0.dp,
                bottom = 18.0.dp
            )
        ).tappable(onTap = buscador).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun VectorPostVFinal(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.panel_usuario_vector_post),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 3.3333740234375.dp,
                top = 3.33331298828125.dp,
                end = 3.3332862854003906.dp,
                bottom = 5.656454086303711.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun IconoPostVFinal(
    post: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 177.0.dp,
                top = 16.0.dp,
                end = 176.0.dp,
                bottom = 16.0.dp
            )
        ).tappable(onTap = post).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun VectorSectVFinal(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.panel_usuario_vector_sect),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 6.66668701171875.dp,
                top = 6.66668701171875.dp,
                end = 6.666645050048828.dp,
                bottom = 6.666645050048828.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun IconoSeccionesVFinal(
    secciones: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 101.0.dp,
                top = 12.0.dp,
                end = 252.0.dp,
                bottom = 20.0.dp
            )
        ).tappable(onTap = secciones).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun LogoVFinal(
    logo: Painter,
    modifier: Modifier = Modifier
) {
    RelayImage(
        image = logo,
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 16.0.dp,
                top = 7.0.dp,
                end = 327.0.dp,
                bottom = 15.0.dp
            )
        )
            .width(50.dp)
            .height(50.dp)
    )
}

@Composable
fun BotLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.align(Alignment.BottomCenter)
    )
}
