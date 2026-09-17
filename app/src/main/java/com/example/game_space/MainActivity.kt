package com.example.game_space

import android.R.attr.contentDescription
import android.R.id.bold
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.game_space.ui.theme.GamespaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GamespaceTheme {

                    TelaStart(modifier = Modifier)
                }
            }
        }
    }


@Composable
fun TelaStart(modifier: Modifier = Modifier) {

    // Box principal
    Box(modifier = modifier.fillMaxSize()) {

        // Imagem de Fundo do Espaço
        Image(
            painter = painterResource(id = R.drawable.fundo_espaco),
            contentDescription = "Imagem de fundo espacial",
            contentScale = ContentScale.Crop, // Preenche todo o espaço disponível do seu container
            modifier = Modifier.fillMaxSize()
        )

        // Coluna dos elementos
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),

            verticalArrangement = Arrangement.SpaceEvenly, // Centraliza os itens na vertical

        ) {

            // Caixa dos elemento - Play
            Box(
                modifier = Modifier
                    .background(color = Color(0xFF7E3DF6), RoundedCornerShape(10.dp))
                    .border(width = 2.dp, shape = RoundedCornerShape(10.dp), color = Color.Black)
                    .padding(8.dp)
                    .size(width = 150.dp, height = 30.dp),

                contentAlignment = Alignment.Center
            ) {

                Text(
                    text = "PLAY",
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFFFC107),
                    fontSize = 22.sp,
                    textAlign = TextAlign.Center
                )
            }

            // Caixa dos elemento - Continue
            Box(
                modifier = Modifier
                    .background(color = Color(0xFF7E3DF6),RoundedCornerShape(10.dp) )
                    .border(width = 2.dp, shape = RoundedCornerShape(10.dp), color = Color.Black,)
                    .padding(8.dp)
                    .size(width = 150.dp, height = 30.dp),

                contentAlignment = Alignment.Center


            ) {

                Text(
                    text = "CONTINUE",
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFFFC107),
                    fontSize = 22.sp,
                    textAlign = TextAlign.Center
                )
            }

            // Caixa dos elemento - Options
            Box(
                modifier = Modifier
                    .background(color = Color(0xFF7E3DF6), RoundedCornerShape(10.dp))
                    .border(width = 2.dp, shape = RoundedCornerShape(10.dp), color = Color.Black)
                    .padding(8.dp)
                    .size(width = 150.dp, height = 30.dp),

                contentAlignment = Alignment.Center

            ) {

                Text(
                    text = "OPTIONS",
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFFFC107),
                    fontSize = 22.sp,
                    textAlign = TextAlign.Center
                )
            }

            // Caixa dos elemento - Credits
            Box(
                modifier = Modifier
                    .background(color = Color(0xFF7E3DF6),RoundedCornerShape(10.dp))
                    .border(width = 2.dp, shape = RoundedCornerShape(10.dp), color = Color.Black)
                    .padding(8.dp)
                    .size(width = 150.dp, height = 30.dp),

                contentAlignment = Alignment.Center

            ) {

                Text(
                    text = "CREDITS",
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFFFC107),
                    fontSize = 22.sp,
                    textAlign = TextAlign.Center
                )
            }

            // Caixa dos elemento - Exit
            Box(
                modifier = Modifier
                    .background(color = Color(0xFF7E3DF6), RoundedCornerShape(10.dp))
                    .border(width = 2.dp, shape = RoundedCornerShape(10.dp), color = Color.Black)
                    .padding(8.dp)
                    .size(width = 150.dp, height = 30.dp),

                contentAlignment = Alignment.Center
            ) {

                Text(
                    text = "EXIT",
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFFFC107),
                    fontSize = 22.sp,
                    textAlign = TextAlign.Center
                )
            }




        }
    }
}