package lv.juras.kauja

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import lv.juras.kauja.ui.screens.DrawMenuButtons
import org.jetbrains.compose.resources.painterResource
import seabattle.shared.generated.resources.Res
import seabattle.shared.generated.resources.compose_multiplatform

@Composable
@Preview
fun App() {
    Column(
        modifier = Modifier
            .background(MaterialTheme.colorScheme.primaryContainer)
            .safeContentPadding()
            .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            DrawMenuButtons()
        }

}