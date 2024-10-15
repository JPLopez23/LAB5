package com.example.lab5

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.rememberScrollState
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import coil.compose.AsyncImage
import com.example.lab5.ui.theme.Lab5Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ConcertsScreen()
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ConcertsScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("TodoEventos", color = Color.White) },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = Color(0xFF6200EE)
                )
            )
        }
    ) { innerPadding ->
        // Scrollable content
        Column(
            modifier = Modifier
                .padding(innerPadding) 
                .padding(16.dp)
                .verticalScroll(rememberScrollState())
        ) {
            Text(
                text = "Your favorites",
                style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold),
                modifier = Modifier.padding(vertical = 8.dp)
            )

            // Cards for "Your favorites"
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                ConcertCard(
                    imageUrl = "https://cdn.prod.website-files.com/655e0fa544c67c1ee5ce01c7/655e0fa544c67c1ee5ce0eb8_how-to-get-gigs-for-musicians-and-bands-hdr.webp",
                    title = "Title",
                    description = "Supporting text"
                )
                ConcertCard(
                    imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS52iJGzdh1TbL068gAk8Js3O3-EWxX9FaEgQ&s",
                    title = "Title",
                    description = "Supporting text"
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                ConcertCard(
                    imageUrl = "https://musicodiy.cdbaby.com/wp-content/uploads/2018/12/concert-crowd-at-live-music-festival-m-1132x670-1.jpg",
                    title = "Title",
                    description = "Supporting text"
                )
                ConcertCard(
                    imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQchFBLk3IVCG-NnnuZk2CG9OD5c3_n3PvjMg&s",
                    title = "Title",
                    description = "Supporting text"
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "All Concerts",
                style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold),
                modifier = Modifier.padding(vertical = 8.dp)
            )

            // List of all concerts
            Column {
                repeat(5) { index ->
                    Text(
                        text = "Concierto ${index + 1}",
                        style = MaterialTheme.typography.bodyLarge,
                        modifier = Modifier.padding(vertical = 4.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun ConcertCard(imageUrl: String, title: String, description: String) {
    Column(
        modifier = Modifier
            .width(150.dp)
            .padding(8.dp)
            .clip(RoundedCornerShape(10.dp))
    ) {
        // Load image from the URL
        AsyncImage(
            model = imageUrl,
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .clip(RoundedCornerShape(10.dp)),
            contentScale = ContentScale.Crop
        )
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            modifier = Modifier.padding(vertical = 4.dp)
        )
        Text(
            text = description,
            fontSize = 12.sp,
            color = Color.Gray
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ConcertsScreenPreview() {
    Lab5Theme {
        ConcertsScreen()
    }
}
