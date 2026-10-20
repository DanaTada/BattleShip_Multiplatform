package lv.juras.kauja.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import lv.juras.kauja.ui.componets.TextButton

@Composable
fun MenuScreen() {
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