package com.example.compose_trainings

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose_trainings.ui.theme.Compose_trainingsTheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import org.intellij.lang.annotations.JdkConstants

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Row(
                modifier = Modifier.fillMaxSize(),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                CustomItem(weight = 2f)
                CustomItem(weight = 6f, color = Color.Yellow)
            }
        }
    }
}

@Composable
fun RowScope.CustomItem(weight: Float, color: Color = Color.Red) {
    Surface(
        modifier = Modifier
            .height(50.dp)
            .weight(weight),
        color = color
    ) {}
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Row(
        modifier = Modifier.fillMaxSize(),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        CustomItem(weight = 2f)
        CustomItem(weight = 6f, color = Color.Yellow)
    }
}