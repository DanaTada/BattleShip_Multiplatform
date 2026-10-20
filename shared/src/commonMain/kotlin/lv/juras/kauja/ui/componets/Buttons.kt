package lv.juras.kauja.ui.componets

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import lv.juras.kauja.ui.theme.buttonBackground
import lv.juras.kauja.ui.theme.textColor

@Composable
fun TextButton(
    text: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
) {
    Box(
        modifier = modifier
            .background(
                color = buttonBackground,
                shape = RoundedCornerShape(8.dp),
            )
            .padding(
                horizontal = 8.dp,
                vertical = 4.dp,
            )
            .clickable(onClick = onClick)
    ) {
        Text(
            text = text,
            color = textColor,
        )
    }
}

@Preview
@Composable
private fun ButtonPreview() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        TextButton(
            text = "Test1",
            onClick = {}
        )
        TextButton(
            text = "Test2",
            onClick = {}
        )
    }
}