package com.example.jetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpack.ui.theme.JetpackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    //                    MyBox("LLH")
//                    MyColumn()
//                    MyRow()
                    MyComplexLayout()

                }
            }
        }
    }
}


@Composable
fun MyColumn() {
    Column(
        Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "Ejemplo1",
            modifier = Modifier
                .background(Color.Red)
                .fillMaxWidth()
                .height(100.dp)
        )
        Text(
            "Ejemplo2", modifier = Modifier
                .background(Color.Black)
                .fillMaxWidth()
                .height(100.dp)
        )
        Text(
            "Ejemplo3", modifier = Modifier
                .background(Color.Cyan)
                .fillMaxWidth()
                .height(100.dp)
        )
        Text(
            "Ejemplo4", modifier = Modifier
                .background(Color.Blue)
                .fillMaxWidth()
                .height(100.dp)
        )
        Text(
            "Ejemplo5", modifier = Modifier
                .background(Color.Gray)
                .fillMaxWidth()
                .height(100.dp)
        )
        Text(
            "Ejemplo6", modifier = Modifier
                .background(Color.DarkGray)
                .fillMaxWidth()
                .height(100.dp)
        )
        Text(
            "Ejemplo7", modifier = Modifier
                .background(Color.White)
                .fillMaxWidth()
                .height(100.dp)
        )
        Text(
            "Ejemplo8", modifier = Modifier
                .background(Color.Magenta)
                .fillMaxWidth()
                .height(100.dp)
        )
        Text(
            "Ejemplo9", modifier = Modifier
                .background(Color.Blue)
                .fillMaxWidth()
                .height(100.dp)
        )

    }

}

@Composable
fun MyRow() {
//    Row(Modifier.fillMaxSize(), horizontalArrangement = Arrangement.SpaceBetween) {
//        Text(text = "Ejemplo1")
//        Text(text = "Ejemplo2")
//        Text(text = "Ejemplo3")
//    }

    Row(
        Modifier
            .fillMaxSize()
            .horizontalScroll(rememberScrollState())
    ) {
        Text(
            text = "Ejemplo1", modifier = Modifier
                .width(110.dp)
                .background(Color.Red)
        )
        Text(text = "Ejemplo2", modifier = Modifier.width(110.dp))
        Text(text = "Ejemplo3", modifier = Modifier.width(110.dp))
        Text(text = "Ejemplo4", modifier = Modifier.width(110.dp))
        Text(text = "Ejemplo5", modifier = Modifier.width(110.dp))
        Text(text = "Ejemplo5", modifier = Modifier.width(110.dp))
        Text(text = "Ejemplo5", modifier = Modifier.width(110.dp))
        Text(text = "Ejemplo5", modifier = Modifier.width(110.dp))
        Text(text = "Ejemplo5", modifier = Modifier.width(110.dp))
        Text(text = "Ejemplo5", modifier = Modifier.width(110.dp))
        Text(text = "Ejemplo5", modifier = Modifier.width(110.dp))
        Text(text = "Ejemplo5", modifier = Modifier.width(110.dp))
        Text(text = "Ejemplo5", modifier = Modifier.width(110.dp))
        Text(text = "Ejemplo5", modifier = Modifier.width(110.dp))
        Text(text = "Ejemplo5", modifier = Modifier.width(110.dp))
        Text(text = "Ejemplo6", modifier = Modifier.width(110.dp))
        Text(text = "Ejemplo7", modifier = Modifier.width(110.dp))


//        Text(text = "Ejemplosssssssssss6", modifier = Modifier.weight(1f))

    }
}

@Composable
fun MyComplexLayout() {

    Column(Modifier.fillMaxSize()) {
        Box(
            Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Cyan), contentAlignment = Alignment.Center
        ) {
            Text(text = "Ejemplo 1")
        }
        //Spacer(modifier = Modifier.width(0.dp).height(30.dp))
        Myspacer(size = 30)
        Row(
            Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Red), contentAlignment = Alignment.Center
            ) {
                Text(text = "Ejemplo 2")
            }
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Green), contentAlignment = Alignment.Center
            ) {
                Text(text = "Ejemplo 3")
            }
        }
        Box(
            Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Magenta), contentAlignment = Alignment.BottomCenter
        ) {
            Text(text = "Ejemplo 4")
        }

    }
}


@Composable
fun Myspacer(size:Int){
    Spacer(modifier = Modifier.height(size.dp))
}

@Composable
fun MyBox(name: String, modifier: Modifier = Modifier) {
//    Text(text = "Hello $name!", modifier = modifier )
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Box(
            modifier = Modifier
                .width(200.dp)
                .height(200.dp)
                .background(Color.Cyan)
                .verticalScroll(
                    rememberScrollState()
                ), contentAlignment = Alignment.BottomCenter
        ) {
            Text("Esto es un ejemplp", modifier = Modifier.background(Color.Black))
        }

    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackTheme {
//        MyBox("Android")
//        MyColumn()
//        MyRow()
        MyComplexLayout()
    }

}