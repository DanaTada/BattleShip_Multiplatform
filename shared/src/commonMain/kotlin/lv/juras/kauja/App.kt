package lv.juras.kauja

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import lv.juras.kauja.core.handlers.CurrentScreenHandler
import lv.juras.kauja.core.handlers.Screen
import lv.juras.kauja.ui.screens.GameScreen
import lv.juras.kauja.ui.screens.MenuScreen
import lv.juras.kauja.ui.screens.ScoreScreen
import lv.juras.kauja.ui.screens.SettingsScreen
import lv.juras.kauja.ui.theme.steelAzure
import lv.juras.kauja.ui.theme.steelBlue
import lv.juras.kauja.ui.theme.teal

@Composable
fun App() {
    val screen by CurrentScreenHandler.currentScreen.collectAsStateWithLifecycle()
    Column(
        modifier = Modifier
            .background(
                Brush.verticalGradient(colors = listOf(teal, steelBlue, steelAzure))
            )
            .safeContentPadding()
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        when (screen) {
            Screen.Menu -> MenuScreen()
            Screen.GameScreen -> GameScreen()
            Screen.Score -> ScoreScreen()
            Screen.Settings -> SettingsScreen()
            else -> error("No valid screen")
        }
    }
}

@Preview
@Composable
fun AppPreview() {
    App()
}
