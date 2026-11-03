package lv.juras.kauja.ui.screens

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import lv.juras.kauja.core.handlers.CurrentScreenHandler.changeScreen
import lv.juras.kauja.core.handlers.MenuHandler
import lv.juras.kauja.core.handlers.Screen
import lv.juras.kauja.core.handlers.Theme
import lv.juras.kauja.ui.componets.UniversalButton
import lv.juras.kauja.ui.theme.buttonBackground
import lv.juras.kauja.ui.theme.darkButtonBackground
import lv.juras.kauja.ui.theme.darkTextColor
import lv.juras.kauja.ui.theme.textColor
import seabattle.shared.generated.resources.Res
import seabattle.shared.generated.resources.back_2

@Preview
@Composable
fun SettingsScreen() {
    val currentTheme by MenuHandler.theme.collectAsStateWithLifecycle()
    val textLabelColor = if (currentTheme == Theme.Light) textColor else darkTextColor
    val animatedBgColor by animateColorAsState(
        targetValue = if (currentTheme == Theme.Light) buttonBackground else darkButtonBackground,
        animationSpec = tween(durationMillis = 200),
    )
    Column(

        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFB069C4))

    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,

            ) {
            UniversalButton(
                height = 55f,
                width = 55f,
                backgroundColor = animatedBgColor,
                textColor = darkTextColor,
                image = Res.drawable.back_2,
                contentDescription = "Test",
                onClick = { changeScreen(Screen.Menu) }
            )
        }
    }
}