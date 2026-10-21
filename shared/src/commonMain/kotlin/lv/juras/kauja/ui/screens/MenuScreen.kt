package lv.juras.kauja.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import lv.juras.kauja.ui.componets.TextButton
import lv.juras.kauja.ui.theme.buttonBackground
import lv.juras.kauja.ui.theme.darkButtonBackground
import lv.juras.kauja.ui.theme.darkTextColor
import lv.juras.kauja.ui.theme.textColor

@Preview
@Composable
fun DrawMenuButtons() {
    var currentTheme by remember { mutableStateOf("lightTheme") }
    var textBgrColor =if (currentTheme == "lightTheme") buttonBackground else darkButtonBackground
    var textLabelColor = if (currentTheme == "lightTheme") textColor else darkTextColor

    Column(

        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(45.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        TextButton(
            text = "PLAY",
            textSize = 35.sp,
            backgroundColor = textBgrColor,
            textColor = textLabelColor,
            onClick = {}
        )
        TextButton(
            text = "TOP SCORE",
            textSize = 35.sp,
            backgroundColor = textBgrColor,
            textColor = textLabelColor,
            onClick = {}
        )
        TextButton(
            text = "CHANGE THEME",
            textSize = 26.sp,
            backgroundColor = textBgrColor,
            textColor = textLabelColor,
            onClick = {
                currentTheme = if (currentTheme == "lightTheme") "DarkTheme" else "lightTheme"
            }
        )
    }
}