package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) { ComposeQuadrant()
                }
            }
        }
    }
}

@Composable
fun ComposeQuadrant() {
    Column (
        Modifier.fillMaxSize()
    ) {
        Row (
            Modifier.weight(1f)
        ){
            Quadrant(
                title = stringResource(id = R.string.text_composable),
                description = stringResource(id = R.string.text_composable_desc) ,
                background = Color(0xFFEADDFF),
                modifier = Modifier
                    .weight(1f)
            )
            Quadrant(
                title = stringResource(id = R.string.image_composable),
                description = stringResource(id = R.string.image_composable_desc) ,
                background = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }
        Row (
            Modifier.weight(1f)
        ) {
            Quadrant(
                title = stringResource(id = R.string.row_composable),
                description = stringResource(id = R.string.row_composable_desc),
                background = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            Quadrant(
                title = stringResource(id = R.string.column_composable),
                description = stringResource(id = R.string.column_composable_desc),
                background = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}


@Composable
fun Quadrant(
    title: String,
    description: String,
    background: Color,
    modifier: Modifier = Modifier

){
    Column (

        modifier = modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(background)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        


    ){
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(bottom = 16.dp)



        )
        Text(
            text = description,
            textAlign = TextAlign.Justify,
            modifier = Modifier


        )
    }
}

@Preview(
    showSystemUi = true,
    showBackground = true,
)
@Composable
fun GreetingPreview() {
    ComposeQuadrantTheme {
        ComposeQuadrant()

    }
}