package com.example.lab5

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity4 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PlacesScreen()
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PlacesScreen() {
    val concerts = listOf(
        ConcertItem("Guns And Roses LA", "LA Hall"),
        ConcertItem("Guns and Roses Denver", "Denver Hall"),
        ConcertItem("Guns and Roses New York", "Maddison Square Garden")
    )
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Lugares de Conciertos") })
        }
    ) {
        Column(modifier = Modifier.padding(8.dp)) {
            concerts.forEach { concert ->
                ConcertListItem(concert)
                Divider()
            }
        }
    }
}

@Composable
fun ConcertListItem(concert: ConcertItem) {
    ListItem(
        headlineContent = { Text(concert.title) },
        supportingContent = { Text(concert.location) },
        leadingContent = {
            Icon(
                imageVector = Icons.Default.AccountCircle,
                contentDescription = null,
                modifier = Modifier.size(40.dp)
            )
        },
        trailingContent = {
            Icon(
                imageVector = Icons.Default.ArrowForward,
                contentDescription = null
            )
        }
    )
}

data class ConcertItem(val title: String, val location: String)

@Preview(showBackground = true)
@Composable
fun PlacesScreenPreview() {
    PlacesScreen()
}
