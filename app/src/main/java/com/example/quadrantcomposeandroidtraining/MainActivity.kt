package com.example.quadrantcomposeandroidtraining

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
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
import com.example.quadrantcomposeandroidtraining.ui.theme.QuadrantComposeAndroidTrainingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuadrantComposeAndroidTrainingTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                ) {
                    QuadrantGroup()
                }
            }
        }
    }
}

@Composable
fun QuadrantGroup() {
    Column(modifier = Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            Quadrant(
                title = stringResource(R.string.first_title),
                content = stringResource(R.string.first_content),
                backgroundColor = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            Quadrant(
                title = stringResource(R.string.second_title),
                content = stringResource(R.string.second_content),
                backgroundColor = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {
            Quadrant(
                title = stringResource(R.string.third_title),
                content = stringResource(R.string.third_content),
                backgroundColor = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            Quadrant(
                title = stringResource(R.string.fourth_title),
                content = stringResource(R.string.fourth_content),
                backgroundColor = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
fun Quadrant(
    title: String,
    content: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp)
        ,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(bottom = 16.dp),
        )
        Text(
            text = content,
            textAlign = TextAlign.Justify,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun QuadrantGroupPreview() {
    QuadrantComposeAndroidTrainingTheme {
        QuadrantGroup()
    }
}