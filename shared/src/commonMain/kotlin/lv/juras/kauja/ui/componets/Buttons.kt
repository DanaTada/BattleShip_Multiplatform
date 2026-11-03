package lv.juras.kauja.ui.componets


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.dropShadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.shadow.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import lv.juras.kauja.ui.theme.buttonBackground
import lv.juras.kauja.ui.theme.darkTextColor
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource
import seabattle.shared.generated.resources.Res
import seabattle.shared.generated.resources.back_2

@Composable
fun UniversalButton(
    text: String? = "",
    textSize: TextUnit = 26.sp,
    height: Float,
    width: Float,
    modifier: Modifier = Modifier,
    backgroundColor: Color,
    textColor: Color,
    image: DrawableResource? = null,
    contentDescription: String? = null,
    onClick: () -> Unit,
) {
    val shape = RoundedCornerShape(35.dp)
    Box(
        modifier = modifier
            .height(height.dp)
            .width(width.dp)
            .dropShadow(
                shape = shape,
                shadow = Shadow(
                    radius = 1.dp,
                    color = Color(0xF300116F),
                    offset = DpOffset(x = 0.dp, y = 2.dp)
                )
            )
            .background(
                color = backgroundColor,
                shape = shape,
            )
            .border(1.5.dp, Color.Black, shape)
            .padding(horizontal = 10.dp, vertical = 10.dp)
            .clickable(onClick = onClick),
        contentAlignment = Alignment.Center,
    ) {
        if (image != null) {
            Image(
                painter = painterResource(image),
                contentDescription = contentDescription,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Fit,
            )
        } else if (text != null) {
            Text(
                text = text,
                fontSize = textSize,
                color = textColor,
                fontWeight = FontWeight.Bold,
            )
        }
    }
}


@Preview
@Composable
private fun TextButtonPreview() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        UniversalButton(
            text = "Text Button",
            textSize = 35.sp,
            height = 53f,
            width = 251f,
            backgroundColor = buttonBackground,
            textColor = darkTextColor,
            onClick = {}
        )
    }
}

@Preview
@Composable
private fun ImageButtonPreview() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        UniversalButton(
            height = 70f,
            width = 70f,
            backgroundColor = buttonBackground,
            textColor = darkTextColor,
            image = Res.drawable.back_2,
            contentDescription = "Test",
            onClick = {}
        )
    }
}

