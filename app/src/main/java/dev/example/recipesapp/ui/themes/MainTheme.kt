package dev.example.recipesapp.ui.themes

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import com.example.jcft.ui.theme.themes.BlackBLue
import com.example.jcft.ui.theme.themes.LightCyan
import com.example.jcft.ui.theme.themes.LightCyan2
import com.example.jcft.ui.theme.themes.VeryBlackCyan
import com.example.jcft.ui.theme.themes.White

private val DarkColorScheme = darkColorScheme(
    background = White,
    primary = LightCyan,
    secondary = VeryBlackCyan,
    tertiary = BlackBLue,
    onBackground = LightCyan2
)

private val LightColorScheme = lightColorScheme(
    background = White,
    primary = LightCyan,
    secondary = VeryBlackCyan,
    tertiary = BlackBLue,
    onBackground = LightCyan2
)

@Composable
fun MainTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) {
        DarkColorScheme
    } else {
        LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content,
        shapes = Shapes()
    )
}