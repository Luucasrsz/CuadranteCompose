package com.example.cuadrantecompose

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

import com.example.cuadrantecompose.ui.theme.CuadranteComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CuadranteComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Cuadrante(
                        texto1 = stringResource(R.string.texto1),
                        texto2 = stringResource(R.string.texto2),
                        texto3 = stringResource(R.string.texto3),
                        texto4 = stringResource(R.string.texto4),
                        texto5 = stringResource(R.string.texto5),
                        texto6 = stringResource(R.string.texto6),
                        texto7 = stringResource(R.string.texto7),
                        texto8 = stringResource(R.string.texto8)
                    )
                }
            }
        }
    }
}

@Composable
fun Cuadrante(
    texto1: String,
    texto2: String,
    texto3: String,
    texto4: String,
    texto5: String,
    texto6: String,
    texto7: String,
    texto8: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Row(
            modifier = modifier.weight(1f),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            ColumnaCuadrante(
                texto1 = texto1,
                texto2 = texto2,
                Modifier
                    .weight(1f)
                    .fillMaxSize()
                    .background(color = Color(0xFFEADDFF))
            )
            ColumnaCuadrante(
                texto1 = texto3,
                texto2 = texto4,
                Modifier
                    .weight(1f)
                    .fillMaxSize()
                    .background(color = Color(0xFFD0BCFF))
            )

        }

        Row(
            modifier = modifier.weight(1f),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically

        ) {
            ColumnaCuadrante(
                texto1 = texto5,
                texto2 = texto6,
                Modifier
                    .weight(1f)
                    .fillMaxSize()
                    .background(color = Color(0xFFB69DF8))
            )
            ColumnaCuadrante(
                texto1 = texto7,
                texto2 = texto8,
                Modifier
                    .weight(1f)
                    .fillMaxSize()
                    .background(
                        color = Color((0xFFF6EDFF))
                    )
            )
        }
    }
}


@Composable
private fun ColumnaCuadrante(texto1: String, texto2: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,


        ) {
        Text(
            text = texto1,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Text(
            text = texto2,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CuadranteComposeTheme {
        Cuadrante(
            texto1 = stringResource(R.string.texto1),
            texto2 = stringResource(R.string.texto2),
            texto3 = stringResource(R.string.texto3),
            texto4 = stringResource(R.string.texto4),
            texto5 = stringResource(R.string.texto5),
            texto6 = stringResource(R.string.texto6),
            texto7 = stringResource(R.string.texto7),
            texto8 = stringResource(R.string.texto8)
        )
    }
}