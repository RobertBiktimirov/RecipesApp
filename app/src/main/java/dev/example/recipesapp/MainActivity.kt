package dev.example.recipesapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import dev.example.recipesapp.ui.screens.LoginScreen
import dev.example.recipesapp.ui.themes.MainTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainTheme {
                TestScreen()
            }
        }
    }
}
@Preview
@Composable
fun TestScreen() {
    LoginScreen()
}