package com.ars.ars_ims

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ars.ars_ims.ui.theme.SimpleTextComposeApplicationTheme

val nameList : List<String> = listOf("Vignesh","Ramesh","Vedhaath","Harini","Kala")

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingList(nameList)
//        SimpleTextComposeApplicationTheme{
//            Surface(color= MaterialTheme.colorScheme.background){
//                Greeting("World")
//            }
//        }
//            MainScreen()
        }
    }
}

@Composable
fun GreetingList(names:List<String>){
    Column {
        for (name in names) {
            Greeting(name)
        }
    }
}

@Composable
fun MainScreen(){
    Surface(color= Color.DarkGray,
        modifier = Modifier.fillMaxSize()){
        Column (modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally){


            Row(modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically){
                ColouredSquare(Color.Blue)
                ColouredSquare(Color.Cyan)

            }

            ColouredSquare(Color.White)
            ColouredSquare(Color.Magenta)
            ColouredSquare(Color.Yellow)
        }

    }
}


@Composable
fun HorizontalColouredBar(color: Color){
    Surface(color= color,
        modifier = Modifier.height(60.dp).width(600.dp)){}
}

@Composable
fun ColouredSquare(color: Color){
    Surface(color= color,
        modifier = Modifier.height(60.dp).width(60.dp)){}
}


@Composable
fun Greeting(name: String) {
    Text(
        text = " Hello $name!",
        modifier= Modifier
            .height(240.dp)
            .width(120.dp)
            .padding(24.dp)
            .clickable(onClick = {}),

        style= MaterialTheme.typography.labelLarge,
        fontWeight=FontWeight.Normal

            )

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
//    SimpleTextComposeApplicationTheme {
//        Greeting("World")
//    }
//    MainScreen()
    GreetingList(nameList)
}