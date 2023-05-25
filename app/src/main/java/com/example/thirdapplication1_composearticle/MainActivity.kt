package com.example.thirdapplication1_composearticle


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.thirdapplication1_composearticle.ui.theme.ThirdApplication1ComposeArticleTheme
import androidx.compose.foundation.Image

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ThirdApplication1ComposeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TutorialImage()
                }
            }
        }
    }
}

@Composable
fun TutorialText(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(
            text = stringResource(R.string.jetpack_compose_first_text),
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = stringResource(R.string.jetpack_compose_second_text),
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = stringResource(R.string.jetpack_compose_third_text),
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }
}
@Composable
fun TutorialImage() {
    Column {
        Image(
            painter = painterResource(R.drawable.bg_compose_background),
            contentDescription = null
        )
        TutorialText()
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ThirdApplication1ComposeArticleTheme {
        TutorialImage()
    }
}
