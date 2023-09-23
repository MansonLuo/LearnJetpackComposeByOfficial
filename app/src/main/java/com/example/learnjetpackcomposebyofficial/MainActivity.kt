package com.example.learnjetpackcomposebyofficial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
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
import com.example.learnjetpackcomposebyofficial.ui.theme.LearnJetpackComposeByOfficialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnJetpackComposeByOfficialTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeQuadrant()
                }
            }
        }
    }
}

@Composable
fun FunctionCard(name: String, description: String, color: Color, modifier: Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color = color)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = name,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp),
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun ComposeQuadrant() {
    Column {
        Row(modifier = Modifier.weight(1f)) {
            FunctionCard(
                name = stringResource(id = R.string.name1),
                description = stringResource(id = R.string.description1),
                color = Color(color = 0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            FunctionCard(
                name = stringResource(id = R.string.name2),
                description = stringResource(id = R.string.description2),
                color = Color(color = 0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }

        Row(modifier = Modifier.weight(1f)) {
            FunctionCard(
                name = stringResource(id = R.string.name3),
                description = stringResource(id = R.string.description3),
                color = Color(color = 0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            FunctionCard(
                name = stringResource(id = R.string.name4),
                description = stringResource(id = R.string.description4),
                color = Color(color = 0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

/*
@Preview(showBackground = true)
@Composable
fun FunctionCardPreview() {
    FunctionCard(
        name = stringResource(id = R.string.name1),
        description = stringResource(id = R.string.description1),
        color = Color(color = 0xFFEADDFF),
    )
}
 */

@Preview(showBackground = true)
@Composable
fun ComposeQuadrantPreview() {
    ComposeQuadrant()
}

