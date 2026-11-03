package lv.juras.kauja.ui.screens

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.semantics.hideFromAccessibility
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
import org.jetbrains.compose.resources.painterResource
import seabattle.shared.generated.resources.Res
import seabattle.shared.generated.resources.ship_icon

@Composable
fun MenuScreen() {
    val currentTheme by MenuHandler.theme.collectAsStateWithLifecycle()
    val textLabelColor = if (currentTheme == Theme.Light) textColor else darkTextColor
    val animatedBgColor by animateColorAsState(
        targetValue = if (currentTheme == Theme.Light) buttonBackground else darkButtonBackground,
        animationSpec = tween(durationMillis = 200),
        )
    Column(
        modifier = Modifier
            .widthIn(max = 450.dp)
            .padding(top = 20.dp, bottom = 10.dp),
        verticalArrangement = Arrangement.spacedBy(15.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth(0.7f)
                .aspectRatio(1.5f)

        ) {

            Image(
                painter = painterResource(Res.drawable.ship_icon),
                contentDescription = "Ship logo",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Fit,
            )
        }
        Box(contentAlignment = Alignment.Center) {
            Text(
                text = "SEA BATTLE",
                fontSize = 50.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                style = TextStyle(drawStyle = Stroke(width = 7f, join = StrokeJoin.Round)),
                modifier = Modifier
                    .semantics { hideFromAccessibility() }
            )
            Text(
                text = "SEA BATTLE",
                fontSize = 50.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
            )
        }
        UniversalButton(
            text = "CONTINUE",
            textSize = 26.sp,
            height = 53f,
            width = 251f,
            backgroundColor = animatedBgColor,
            textColor = textLabelColor,
            onClick = {}
        )
        UniversalButton(
            text = "NEW GAME",
            textSize = 26.sp,
            height = 53f,
            width = 251f,
            backgroundColor = animatedBgColor,
            textColor = textLabelColor,
            onClick = {
                changeScreen(Screen.GameScreen)
            }
        )
        UniversalButton(
            text = "HIGH SCORES",
            textSize = 26.sp,
            height = 53f,
            width = 251f,
            backgroundColor = animatedBgColor,
            textColor = textLabelColor,
            onClick = {
                changeScreen(Screen.Score)
            }
        )
        UniversalButton(
            text = "SETTINGS",
            textSize = 26.sp,
            height = 53f,
            width = 251f,
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