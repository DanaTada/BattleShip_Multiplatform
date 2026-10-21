package lv.juras.kauja.ui.componets

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import lv.juras.kauja.ui.theme.buttonBackground
import lv.juras.kauja.ui.theme.textColor
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import lv.juras.kauja.ui.theme.darkButtonBackground
import lv.juras.kauja.ui.theme.darkTextColor

@Composable
fun TextButton(
    text: String,
    textSize: TextUnit,
    modifier: Modifier = Modifier,
    backgroundColor: Color,
    textColor: Color,
    onClick: () -> Unit,
) {
    Box(
        modifier = modifier
            .height(80.dp)
            .width(220.dp)
            .background(
                color = backgroundColor,
                shape = RoundedCornerShape(5.dp),
            )
            .padding(
                horizontal = 10.dp,
                vertical = 10.dp,
            )
            .clickable(onClick = onClick),
        contentAlignment = Alignment.Center,
    ) {
        Text(
            text = text,
            fontSize = textSize,
            color = textColor,
        )
    }
}

@Preview
@Composable
private fun TextButtonSandbox() {
    var currentTheme by remember { mutableStateOf("lightTheme") }
    var bgrColor =if (currentTheme == "lightTheme") buttonBackground else darkButtonBackground
    var labelColor = if (currentTheme == "lightTheme") textColor else darkTextColor
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        TextButton(
            text = "Test1",
            textSize = 35.sp,
            backgroundColor = bgrColor,
            textColor = labelColor,
            onClick = {
                currentTheme = "DarkTheme"
            }
        )
        TextButton(
            text = "Test2",
            textSize = 35.sp,
            backgroundColor = bgrColor,
            textColor = labelColor,
            onClick = {
                currentTheme = "DarkTheme"
            }

        )
        TextButton(
            text = "Test3",
            textSize = 35.sp,
            backgroundColor = bgrColor,
            textColor = labelColor,
            onClick = {
                currentTheme = "DarkTheme"
            }
        )
    }
}