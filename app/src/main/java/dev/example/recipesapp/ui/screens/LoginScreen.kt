package dev.example.recipesapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.example.recipesapp.ui.themes.MainTheme
import dev.example.recipesapp.R


@Preview
@Composable
fun LoginScreen() {
    MainTheme {
        Scaffold {
            Box(modifier = Modifier.fillMaxSize()
                .padding(it)
                .background(MaterialTheme.colorScheme.primary)) {
                LoginScreenLines()
                Column(
                    modifier = Modifier.fillMaxSize()
                ) {
                    LaterButton()
                    Spacer(modifier = Modifier.height(64.dp))
                    LoginScreenFoodIcons()
                    Spacer(modifier = Modifier.height(84.dp))
                    LoginText(Modifier.height(72.dp))
                    Spacer(modifier = Modifier.height(20.dp))
                    LoginButton(Modifier.height(54.dp))
                    CreateNewAccountButton(Modifier.height(54.dp))
                }
            }
        }
    }
}

@Composable
fun LoginScreenFoodIcons() {
    Box(modifier = Modifier.height(312.dp).fillMaxWidth(), contentAlignment = Alignment.Center) {
        Box(modifier = Modifier.width(312.dp), contentAlignment = Alignment.Center) {

            Image(imageVector = ImageVector.
            vectorResource(R.drawable.login_auth_screen_bg_illustration),
                contentDescription = null)

            Image(imageVector = ImageVector.
            vectorResource(R.drawable.login_auth_screen_bg_group_4),
                contentDescription = null, modifier = Modifier
                    .align(Alignment.TopStart).padding(horizontal = 32.dp, vertical = 8.dp))

            Image(imageVector = ImageVector.
            vectorResource(R.drawable.login_auth_screen_bg_group_3),
                contentDescription = null, modifier = Modifier
                    .align(Alignment.CenterStart).padding(horizontal = 76.dp)
                    .offset(0.dp, (-8).dp))
            Image(imageVector = ImageVector.
            vectorResource(R.drawable.login_auth_screen_bg_group_3),
                contentDescription = null, modifier = Modifier
                    .align(Alignment.CenterStart).padding(horizontal = 64.dp)
                    .offset(0.dp, (20).dp))

            Image(imageVector = ImageVector.
            vectorResource(R.drawable.login_auth_screen_bg_group_2),
                contentDescription = null, modifier = Modifier
                    .align(Alignment.BottomEnd).padding(horizontal = 8.dp, vertical = 16.dp))

            Image(imageVector = ImageVector.
            vectorResource(R.drawable.login_auth_screen_bg_group_1),
                contentDescription = null, modifier = Modifier
                    .align(Alignment.TopEnd).padding(horizontal = 24.dp, vertical = 12.dp))

            Image(imageVector = ImageVector.
            vectorResource(R.drawable.login_auth_screen_bg_group_6),
                contentDescription = null, modifier = Modifier
                    .align(Alignment.CenterEnd).padding(horizontal = 80.dp))

            Image(imageVector = ImageVector.
            vectorResource(R.drawable.login_auth_screen_bg_group_5),
                contentDescription = null, modifier = Modifier
                    .align(Alignment.BottomStart).padding(36.dp, 8.dp) )

        }   
    }
}

@Composable
fun LoginScreenLines() {
    Box() {
        LoginLineFirst()
        LoginLineSecond()
        LoginLineThird()
    }
}


@Composable
fun LaterButton() {
    Box(contentAlignment = Alignment.CenterEnd,
        modifier = Modifier
            .padding(32.dp)
            .fillMaxWidth()
    ) {
        Text(text = "Later", color = MaterialTheme.colorScheme.background,
            fontWeight = FontWeight.W600, fontSize = 16.sp)
    }
}

@Composable
fun LoginText(modifier: Modifier) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier.fillMaxWidth().padding(horizontal = 32.dp)
    ) {
        Text(
            textAlign = TextAlign.Center,
            text = "Help your path to health goals with happiness",
            color = MaterialTheme.colorScheme.background,
            fontWeight = FontWeight.W500,
            fontSize = 28.sp,
            lineHeight = 36.sp
        )
    }
}

@Composable
fun LoginButton(modifier: Modifier) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .padding(horizontal = 32.dp)
            .clickable {  /*TODO*/ }
            .clip(
                RoundedCornerShape(16.dp)
            )
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.secondary),
    ) {
        Text(
            text = "Login",
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier,
            color = MaterialTheme.colorScheme.background
        )
    }
}

@Composable
fun CreateNewAccountButton(modifier: Modifier) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .clickable {  /*TODO*/ }
            .fillMaxWidth()
    ) {
        Text(
            text = "Create New Account",
            textAlign = TextAlign.Center,
            color = MaterialTheme.colorScheme.background
        )
    }
}


@Composable
fun LoginLineFirst() {
    Box(contentAlignment = Alignment.TopEnd,
        modifier = Modifier
            .fillMaxSize()) {
        Image(
            imageVector = ImageVector.vectorResource(R.drawable.login_auth_screen_line_1 ),
            contentDescription = "line1",
            modifier = Modifier
        )
    }
}

@Composable
fun LoginLineSecond() {
    Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()) {
        Image(
            imageVector = ImageVector.vectorResource(R.drawable.login_auth_screen_line_2),
            contentDescription = "line2",
            modifier = Modifier
                .rotate(-8f)
                .offset(12.dp, 28.dp)
        )
    }
}

@Composable
fun LoginLineThird() {
    Box(contentAlignment = Alignment.TopStart, modifier = Modifier.fillMaxSize()) {
        Image(
            imageVector = ImageVector.vectorResource(R.drawable.login_auth_screen_line_3),
            contentDescription = "line3"
        )
    }
}