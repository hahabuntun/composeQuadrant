package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
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
        enableEdgeToEdge()
        setContent {
            ComposeQuadrantTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    ComposeQuadrant()
                }
            }
        }
    }
}

@Composable
fun ComposeQuadrant( modifier: Modifier = Modifier) {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            SquareCard(
                heading = stringResource(R.string.heading1),
                text = stringResource(R.string.text1),
                color = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            SquareCard(
                heading = stringResource(R.string.heading2),
                text = stringResource(R.string.text2),
                color = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {
            SquareCard(
                heading = stringResource(R.string.heading3),
                text = stringResource(R.string.text3),
                color = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            SquareCard(
                heading = stringResource(R.string.heading4),
                text = stringResource(R.string.text4),
                color = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}



@Composable
fun SquareCard(heading: String, text: String, color: Color, modifier: Modifier = Modifier){
    Column(modifier = modifier
        .fillMaxSize()
        .background(color)
        .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = heading,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = text,
            textAlign = TextAlign.Justify
        )
    }
}

    @Preview(showBackground = true)
    @Composable
    fun ComposeQuadrantAppPreview() {
        ComposeQuadrantTheme {
            ComposeQuadrant()
        }
    }