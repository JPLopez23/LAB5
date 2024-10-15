package com.example.lab5

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.background
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

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProfileScreen()
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Mi Perfil") },
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = Color.Transparent
                )
            )
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.LightGray)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Fondo con imagen de fondo
            Image(
                painter = rememberAsyncImagePainter("data:image/jpeg;base64,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"),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp),
                contentScale = ContentScale.Crop
            )

            // Imagen de perfil
            Box(
                modifier = Modifier
                    .offset(y = (-50).dp)
                    .clip(CircleShape)
                    .background(Color.White)
                    .size(100.dp),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = rememberAsyncImagePainter("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcToo7L7NaFHhjUrAsGpVvq0zGCVd8dOOJEEcA&s"),
                    contentDescription = "Profile",
                    modifier = Modifier
                        .size(80.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )
            }

            // Nombre del usuario
            Text(
                text = "Cecilia Castillo",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.offset(y = (-40).dp)
            )

            Spacer(modifier = Modifier.height(32.dp))

            // Opciones de perfil
            ProfileOption(iconUrl = "https://www.example.com/icon-edit.png", text = "Edit Profile")
            ProfileOption(iconUrl = "https://www.example.com/icon-password.png", text = "Reset Password")
            ProfileOption(iconUrl = "https://www.example.com/icon-notifications.png", text = "Notifications", hasToggle = true)
            ProfileOption(iconUrl = "https://www.example.com/icon-favorites.png", text = "Favorites")
        }
    }
}

@Composable
fun ProfileOption(iconUrl: String, text: String, hasToggle: Boolean = false) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
            .background(Color.White, RoundedCornerShape(8.dp))
            .padding(horizontal = 16.dp, vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = rememberAsyncImagePainter(iconUrl), // Cargar ícono desde URL
            contentDescription = text,
            modifier = Modifier.size(24.dp)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Text(text = text, modifier = Modifier.weight(1f))

        if (hasToggle) {
            Switch(checked = false, onCheckedChange = {})
        } else {
            Image(
                painter = rememberAsyncImagePainter("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAANkAAADoCAMAAABVRrFMAAAAwFBMVEX///8AAAAnLjj9/f34+PgSHCmqq623t7e+vr76+vooLTgVFRX29vYICAgmLzcSEhLp6enw8PDPz88kKDPj4+PZ2dk4ODhiYmKpqq4NDQ1ZWVnIyMiHh4caGhqurq5ubm4qKiqVlZV5eXkgICCjo6M1NTVxcXFERERaWlpLS0tmZmaDg4NBQUGamppgZGokJCQQGCg7P0d0eIBPU1sAABYPFydCRUwwND8ACx5SVF+FhYtNUVaMkJZtcXcHEh4WHSUHQ6NnAAANw0lEQVR4nN1diWLaOBDFKCQxDtBCsg1laZuE7tE0bIEt2U3D9v//am1ZMj50zMgj28nrRagsaSzpWRq9kXs9Kxizp8njJEEITs7i/BmmEHYSxgUgK6UtHJMaZ1lqFqYAxgtoybIQaFlsUpj+wdSG0DIcQnCbifZCdneG7O5tILUKO45fApj49erwWhvMaYy1A8SYThvrRbQYwz0auE2hzwYjyxnZrdIR5rPFyPLGVVN2Ro8gNAwxRUqM8vygpeoPDDvMfHMiYV/ETmq9GkbS15mDWT1C5lJm7lAhVS58iIWdeS6RTUXFzK8zhpFVSFABMKO307d1C7RBVogkH/BgvQ2C4Le6RVoq1FNVCL+ewxl2HyS4hWfPV7An2Aop2OMEn1EP0e6XQTCaj4LgEp493pOjHmHYW8SntPCx+j62LDYs+BNeANLfoXWCYdqMZV0RigXvi8E8CM7BNeWuIlgRzLSORbicdB3agLvUsLjVJtBLGOZWm1YPIQcwG6yTcBUc8QC8huErVH9KheyKvYsgD/KnGr5CuowY1uV0W7CM/KEWoiukBv7+XAZFXNWuQ7FCROtzB5fTn8KikfgXzvzACqlJETPtEJkgb9BCttUb+QHM/IAKadket2J0Gqp3wp5V71R8AjN/nQohl8IOqzrJ+Hfx509I5gfUiGSZyR/1WA7KGH/Ry3VMGuZnxgrhfE74GyQZ/z3/6Q9K5k/6kJ4msD4nbOkZ46eT/IxESJjfOOhxqwR8j5aMLxdmv4qfv6JzUleIyFGBz+ZcttGF+OJEfnHWToXIsMwYX+KD+GbeHbcQDuny40GYscz9j2T+m3YqVheML/UKjC8xpWX+hhGvYZNGKzK+xDvx7Ue3vIlWLD0nQowNS5rsqsj4EmXmRxZwcnJBJJpAWxbGhvFrfhcW3JcSSOb/xakAOjkIdj4VG5YWnDF+2ZlRYn5kAYRCF2SvjnsiT88k459WkmTMH4oCMPknNw7nGKUBC6WKSjL+J0Wqz0Xmx1qGdPlSgCVdMa3nW9nlpop0dZif37vGH/NHw3q/ibr/oUz4RfzvlwYrVw9ZN8kY/40y3RtTi3YbX0XNf9X8f4n5Xw7OZJvo6JnJBB/AeXZiCs0m1npbba/k2Qmx5o2o9WdDGlt/LYBii5YCRsaXsHBMEV3Z5pec/o4gVQqsTMgTprDWgDM/RsHgFdARJEejlflp/KX1Iee7gTWlnfkz+VMH7MI8qezMn8mfumAZZnYh16bafst6CMmJZ6C8wDbmF92wEy2W+W9gs/iPIrV6RcBIvDl8Jx/j5FcLUfSMn6zxK1oB4zM9nk9RkCLWvaCx7BdR06qf9CRzkOQhmV81D8NOPDSpucoJZZlKFpUxvkYkVC1Azp0r3hK0BlOX1qXNKuKhjPEV+xEakZCO+ZmDQFy9X41QOXEoHS2mPSTdrZP7UDmvJMsAr096nepLbCRe4gcuE4KJ8bUFVD3JeMGaDbWzknu1OI+99AVJ779RHtYOHH1tGfOLHRvzvnorKPlHwSj5XGmez5SQjB+hrzxqYY6DjL5+zggNjG9Bfje7I0uxPO5F7X53uDbH/DQhEpTIhB8uSo8C83etzd6Lurmpc9J934gzf7fsOiqqLuxpFeB79aPJqLBX3w38JQxzVcFxRV00CT4R1okEUuq3dO5KnPlHUU4T0wlkwg93tSnvzomg3607+0Idxpcoa886gVqML6FRj7SL9yS3Wyp+aKXhtVCT8SXgg5XqWW7NpST1Qxcr00uCNUvD6VQT1ormxd09hxt6TA96KJKqk4xVVSwccaYdXTkgaTiX8DSiTqoOfPdGg1BRYwcMlcTdCdyHN+TxAT+bqSZoH7D3lQ5QATwEsB4q4u56yASCZEFBzqiKu+tBBgXhnSnEkG6nv8hypA4KqgJEA2XGJwBxUFAJYI2CWtxdDyRBQfr4JliToWQ4UJAEBWkbBujK1Im764FisaepPjQ2UCvurgeCoCBtgCRsP59RM75EbeY39EXQhJ2e8SXqBQUp2wUjBvLA+BK1goKYOOCj9C0i/Dbd0JtrpBz14BwUlDaKYuGFOHpIMP6ElPEl3Jlf0+OYNBmAVOo3goll0XCWhgs5k+Jb6Fo/FTtMJssLLwsKx804zXZpIgYCL4ejZIhFS4QoHeeZkRuoqIMANOIYhnHO3CQ98S6KTOLuEpA+p8+xVRGS+ZWDjGnsVSNh/PndPMIEfyAtmybbaSME8ystkGd+gB0YX+IWW84nINm2BPZArUQanjQaRE6o08YwrFY3ZvzJXYSc42N9TpexYfysFEC/UKuZGP7koa+TSZSUimL8ECnGgzN/ZkH5e7TI6SxYRly859eDBJZayz5X+R578lA4CqIIUmJdZAJBc+V0M0L8qaI3rvMDNGAhDZouh5fMNBjuB/FGaMkPL5nBibvrwRIUJFV1asUmtsmA4Tw0sPWPpPahZgqP3u3Si7t9QI5p9SwuXZnoLEAaBg/noYGJ+c0zQqRhNaR+bjAFBWFl70bQHhAEgSkoiFDhSXuoEwhGmQidZW7i7nowBgVRGebzCB1tHUGBvnXhKu6GQL9BKz22iPU7FpLxRx7yZoYFztzA/DVw3PD2yfjG0JVsZ4R21RTyaKzkk2R86+4PdliHTBFzl0dpN4uIEDPHDFjq53LYkjnWqMj8VEyfWQYWd2MnBif2MMxCUBBVsK48qgixM457fkJ0K6V9H5pWk22GUTNgCoZ56opBQaSBaZ4UKHGHuADV09f+qjfVENi36mlPnGa/XwUGrqgfHQONuLsePEnDIYzvW5jnQy9kF3ezZCJBWaICygM868KqXPYdMsYfziUlNgXsWXqP8+O3Tt5gMua3RgggpBZuELoAYv0rIKrD/8lGYk+FOChIIe4ul+s7nlYWYK8KCiYNfdpYob/452MB/EdS5jd2boyayQlZAWkJBBF8Rxinot7f7BaWCsiiLutnbTrHVW5ReSXFUgFk0nDjg58htRZoFHpiCjJpuGnIYvRnTlDeOT2haWUZKh4wO9V7SLMcYpyqldIzv8Gyaj0VZ+RkyXFvduuhDUt3M6sXaYOCDKc/VXLRMX4mBnIONLMl1CoGDMxvEAlVMtIxvuNTDH6FWm0koGN+hPxJw/g6MRAZxCxRW4CG+eGW6cTdZC9S08FWQG3m15zcLcRMPsne1iVqBgXpBDTez6KyT9hgm8raLNSiJ4bXaeEAklpChADaM6czucLRIyiEJf5mwJnayJYQEhSkzSQS1+ZPH2QOr+LDQDxLAAVkznh9Ut3/3CgYvxl/B6xLAIKC1DVVbegztMYTCSa7OwAA5ldnJEUY7wopmV9/KeoxaQ0KUuekZny/pMhLgBfgKCeSUr+S2MmzuxRXgFNQEPp9BVRA7QIDmL9yjSdpCTEc3hEnGd+jHIgEaLFUIxIuCqAFbsX37/BDrTE+gYaO70iAfFNQUdztcJov9mgj/NpcfkCGDpTE3fizpVWnZhuvcPemoJi/HIxCdNK56QqkbbkJA4b5K2nRRxVpzvc2VtW51RBP3pty+6LHTQOnNuVuBDgwgkDc7X0KVgD4iJImw3loAHxTUKPhPDQAMr9PcbcvVJhBhVrhPM2OrxxkpQ3z9xri7jaPtAYwP1jcXYHXDUIrrOGgdaR+/h0JBliZ3z2cx7e3zgbzm4JqhPP4VydZYFlRujK+LgK9SUjmV3oBnMTd0s/f9gs1mPTcVN+rfGR8lO7HuzoJCkNQEOAYTwW8q5PA0ErD3RjfuzoJDq1yxeldDd43rDHQMH+2s+HxXd0M+R5Enh5+QbZZWNQLJLtR8yhe5JyfecOHsyTzczDOcOkXX/h7B0oaj/QlEsFLxyj9Z1VtyGgEzyIKJvMR9mZEc3uaPCYTe5oC0vyPWiqxDJiDKzqZTObL5B0oyHKRFR1hDRulNTordkY4JqPJchRMImy5jeHYHaf2xHmMlvNgOcI2WIPIzYvf2VPnMEp6FborNoeCF+vhzn5Bhnkg+LWTiF6Sd6oBsDTOzHMMTBuzNT5RDL3qyVoyzP9irK0JtufAg6Mar2l4X7MoYioaQgPhnC25HnyrbFsbZh4hXEW4temLAFiM+tIgGusVGgYW2bYJvDqJhS2RPbJEJ3USziyqe4CcdRxPkQJmj56ytdZt29+/SHFqx/U1IFEudQJg2uQXPHmuCHui3uC1otd/rZCWjcf9QfzXuP+zPxuPh8P405B/6A8HwxitVlKBpH5F9OU3IoW0bPbt77O/Z4PZz5vx07fvg9lg8H2//fZtOPv+ePrPbNY5y2YphuJP+lf6QaQQlg03i9XV4svq34eL6duP0+fD2WqxenM7HdxePZ0/H9YzbREt4Wm73h5+PA+3h3X/3916vVkf1vHvH4e9rKuwbHaY7qaz8+l6tdivrleXi/8u79cP17vH6c/12w//dM6w/vP6abt9ehput+v+YRfbdIh/b3fr7WYv+pfsjfvt5XR4fvX0cLWenn54XszixpoOdpeLw/N0+ti5zljpjfEXY/47G2iyzXbX623/cFjt1+un/Wp96K+efz6PD4f99Y/4lnSvzeIBJDgjtiWuXvJxNsxTSMYgA273gN+J5PNgMOR3g3/TWvUNGD4+bh43/c3ucbPbbPb7zeMu/maz35QsG2dXjJPP43H+p05i+PjEB1f81yH9d53gsCsyyAvEMCP6Ekpt9vKQfzbzKYXmSf368Hot+x+hUNFRzxeWKgAAAABJRU5ErkJggg=="),
                contentDescription = "Arrow",
                modifier = Modifier.size(24.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview() {
    ProfileScreen()
}
