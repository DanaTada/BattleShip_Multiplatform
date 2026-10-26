package lv.juras.kauja.ui.screens

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.content.MediaType.Companion.Text
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import lv.juras.kauja.core.handlers.CurrentScreenHandler.changeScreen
import lv.juras.kauja.core.handlers.MenuHandler
import lv.juras.kauja.core.handlers.Screen
import lv.juras.kauja.core.handlers.Theme
import lv.juras.kauja.ui.componets.TextButton
import lv.juras.kauja.ui.theme.bubblegumPink
import lv.juras.kauja.ui.theme.buttonBackground
import lv.juras.kauja.ui.theme.darkButtonBackground
import lv.juras.kauja.ui.theme.darkTextColor
import lv.juras.kauja.ui.theme.textColor

@Composable
fun MenuScreen() {
    val currentTheme by MenuHandler.theme.collectAsStateWithLifecycle()
    val textLabelColor = if (currentTheme == Theme.Light) textColor else darkTextColor
    val animatedBgColor by animateColorAsState(
        targetValue = if (currentTheme == Theme.Light) buttonBackground else darkButtonBackground,
        animationSpec = tween(durationMillis = 200)
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 10.dp, bottom = 10.dp),
        verticalArrangement = Arrangement.spacedBy(15.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            modifier = Modifier
                .padding(10.dp),
            text = "SEA BATTLE",
            fontSize = 50.sp ,
            fontWeight = FontWeight.Bold,
        )
        TextButton(
            text = "CONTINUE",
            textSize = 26.sp,
            backgroundColor = animatedBgColor,
            textColor = textLabelColor,
            onClick = {}
        )
        TextButton(
            text = "NEW GAME",
            textSize = 26.sp,
            backgroundColor = animatedBgColor,
            textColor = textLabelColor,
            onClick = {
                changeScreen(Screen.GameScreen)
            }
        )
        TextButton(
            text = "HIGH SCORES",
            textSize = 26.sp,
            backgroundColor = animatedBgColor,
            textColor = textLabelColor,
            onClick = {
                changeScreen(Screen.Score)
            }
        )
        TextButton(
            text = "SETTINGS",
            textSize = 26.sp,
            backgroundColor = animatedBgColor,
            textColor = textLabelColor,
            onClick = {
                MenuHandler.switchTheme()
            }
        )
    }
}
@Preview()
@Composable
fun MenuScreenPreview() {
    MenuScreen()
}