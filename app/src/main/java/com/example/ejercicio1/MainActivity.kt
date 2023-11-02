package com.example.ejercicio1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ejercicio1.ui.theme.Ejercicio1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Ejercicio1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Ejercicio1()
                }
            }
        }
    }


    //@Preview (showBackground = true)
    @Composable
    fun myVox() {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Box(
                modifier = Modifier
                    .width(50.dp)
                    .height(50.dp)
                    .background(Color.Cyan)
            )

        }

    }

    @Composable
    fun Ejercicio1(){
        Row (verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .horizontalScroll(rememberScrollState())
                .fillMaxSize()
                .background(Color.hsl(0.35f, 0.60f, 0.70f, 0.65f))
        ){
            Text(
                "Caja 1",
                modifier = Modifier
                    .width(150.dp)
                    .height(150.dp)
                    .background(color = Color.Yellow)
                    .wrapContentHeight(Alignment.CenterVertically)
                ,
                textAlign = TextAlign.Center,
                color = Color.Black,
                fontSize = 16.sp,
            )
            Text(
                "Caja 2",
                modifier = Modifier
                    .width(150.dp)
                    .height(150.dp)
                    .background(color = Color.Black)
                    .wrapContentHeight(Alignment.CenterVertically)
                ,
                textAlign = TextAlign.Center,
                color = Color.White,
                fontSize = 16.sp,
            )
            Text(
                "Caja 3",
                modifier = Modifier
                    .width(150.dp)
                    .height(150.dp)
                    .background(color = Color.Cyan)
                    .wrapContentHeight(Alignment.CenterVertically)
                ,
                textAlign = TextAlign.Center,
                color = Color.Black,
                fontSize = 16.sp,
            )
            Text(
                "Caja 4",
                modifier = Modifier
                    .width(150.dp)
                    .height(150.dp)
                    .background(color = Color.Green)
                    .wrapContentHeight(Alignment.CenterVertically)
                ,
                textAlign = TextAlign.Center,
                color = Color.Black,
                fontSize = 16.sp,
            )
            Text(
                "Caja 5",
                modifier = Modifier
                    .width(150.dp)
                    .height(150.dp)
                    .background(color = Color.Red)
                    .wrapContentHeight(Alignment.CenterVertically)
                ,
                textAlign = TextAlign.Center,
                color = Color.Black,
                fontSize = 16.sp,
            )
        }
    }


}