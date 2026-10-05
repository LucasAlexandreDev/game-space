package com.example.game_space

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.game_space.ui.theme.GamespaceTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            GamespaceTheme() {

                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    TelaPrincipal(
                        modifier = Modifier.padding(innerPadding)
                    )

//                    TelaGameOver(
//                        modifier = Modifier.padding(innerPadding)
//                    )

                }
            }
        }
    }
}

@Composable
fun TelaPrincipal(modifier: Modifier = Modifier) {

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {

        // Informações do jogador
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text(
                text = "SCORE: 0050",
                color = Color.White
            )

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {

                Text(
                    text = "LIVES:",
                    color = Color.White
                )

                InimigoEspacial(
                    modifier = Modifier.size(50.dp),
                    cor = Color.Green
                )

                InimigoEspacial(
                    modifier = Modifier.size(50.dp),
                    cor = Color.Green
                )

                InimigoEspacial(
                    modifier = Modifier.size(50.dp),
                    cor = Color.Green
                )
            }
        }

        // Inimigos na parte superior da tela
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {

            InimigoEspacial(
                modifier = Modifier.size(70.dp),
                cor = Color.Green
            )

            InimigoEspacial(
                modifier = Modifier.size(70.dp),
                cor = Color.Red
            )

            InimigoEspacial(
                modifier = Modifier.size(70.dp),
                cor = Color.Blue
            )

            InimigoEspacial(
                modifier = Modifier.size(70.dp),
                cor = Color.Yellow
            )

            InimigoEspacial(
                modifier = Modifier.size(70.dp),
                cor = Color.Green
            )
        }

        // Nave e botão de início
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.BottomCenter
        ) {

            NaveEspacial(
                modifier = Modifier
                    .padding(bottom = 60.dp)
                    .size(100.dp)
            )

            Text(
                text = "PRESS START",
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.DarkGray)
                    .padding(10.dp),
                color = Color.White,
                textAlign = TextAlign.Center
            )
        }
    }
}

@Composable
fun TelaGameOver(modifier: Modifier = Modifier) {

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {

        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {

                InimigoEspacial(
                    modifier = Modifier.size(80.dp),
                    cor = Color.Green
                )

                InimigoEspacial(
                    modifier = Modifier.size(80.dp),
                    cor = Color.Red
                )

                InimigoEspacial(
                    modifier = Modifier.size(80.dp),
                    cor = Color.Blue
                )

                InimigoEspacial(
                    modifier = Modifier.size(80.dp),
                    cor = Color.Yellow
                )

                InimigoEspacial(
                    modifier = Modifier.size(80.dp),
                    cor = Color.Green
                )
            }

            Text(
                text = "GAME OVER",
                color = Color.White,
                fontSize = 67.sp
            )
        }
    }
}

@Composable
fun InimigoEspacial(
    modifier: Modifier = Modifier,
    cor: Color
) {

    Image(
        modifier = modifier,
        painter = painterResource(
            id = R.drawable.ic_launcher_foreground
        ),
        colorFilter = ColorFilter.tint(cor),
        contentDescription = "Inimigo espacial"
    )
}

@Composable
fun NaveEspacial(modifier: Modifier = Modifier) {

    Image(
        modifier = modifier,
        painter = painterResource(
            id = R.drawable.ic_launcher_foreground
        ),
        contentDescription = "Nave espacial"
    )
}
