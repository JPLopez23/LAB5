package com.example.lab5

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Event
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import com.example.lab5.ui.theme.Lab5Theme

class MainActivity3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab5Theme {
                EventDetailScreen()
            }
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EventDetailScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Detalles del Evento", color = Color.White) },
                colors = TopAppBarDefaults.mediumTopAppBarColors(containerColor = Color(0xFF6200EE)) // Color morado
            )
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            // Imagen destacada usando URL
            Image(
                painter = rememberAsyncImagePainter("https://unamglobal.unam.mx/wp-content/uploads/2022/04/conciertos-1-1.jpg"),
                contentDescription = "Imagen del Evento",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .clip(RoundedCornerShape(16.dp)),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Nombre y detalles del evento
            Text(text = "Title", style = MaterialTheme.typography.headlineLarge.copy(fontSize = 24.sp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = Icons.Default.Event,
                        contentDescription = "Fecha",
                        modifier = Modifier.size(24.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(text = "Fecha", style = MaterialTheme.typography.bodyMedium)
                }
                Text(text = "Hora", style = MaterialTheme.typography.bodyMedium)
            }

            Spacer(modifier = Modifier.height(8.dp))

            // Sección de descripción (About)
            Text(text = "About", style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold))
            Text(
                text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam sit amet pellentesque lorem. Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.padding(vertical = 8.dp)
            )

            Spacer(modifier = Modifier.weight(1f))

            // Botones para "Favorite" y "Buy"
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Button(
                    onClick = { /* Acción de favorito */ },
                    modifier = Modifier.weight(1f).padding(8.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFBB86FC))
                ) {
                    Text("Favorite", color = Color.White)
                }
                Button(
                    onClick = { /* Acción de compra */ },
                    modifier = Modifier.weight(1f).padding(8.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFBB86FC))
                ) {
                    Text("Buy", color = Color.White)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun EventDetailScreenPreview() {
    Lab5Theme {
        EventDetailScreen()
    }
}
