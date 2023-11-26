package com.example.layouts.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun ChipSection(

) {
    Column {
        Text(text = "Languages",
            color = Color.White,
            textAlign = TextAlign.Left,
            modifier = Modifier.padding(start = 25.dp)

        )
        Spacer(modifier = Modifier.height(2.dp))
        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 25.dp, top = 15.dp, bottom = 15.dp)
        ) {
            val programmingLanguages =
                listOf("C and C++ n", "Python n", "Java n", "Kotlin n", "Flutter n")
            for (language in programmingLanguages) {
                item {
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .clip(RoundedCornerShape(10.dp))
                            .background(Color(0xFF0000FF).copy(0.8f))
                            .padding(15.dp)
                    ) {
                        Text(text = language, color = Color.White)
                    }
                }

                item {
                    Spacer(modifier = Modifier.width(20.dp))
                }
            }
            item {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .clip(RoundedCornerShape(10.dp))
                        .background(Color.Cyan)
                        .padding(15.dp)
                ) {
                    Text(text = "C and C++", color = Color.White)
                }
            }

            item {
                Spacer(modifier = Modifier.width(20.dp))
            }

            item {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .clip(RoundedCornerShape(10.dp))
                        .background(Color.Cyan)
                        .padding(15.dp)
                ) {
                    Text(text = "Python", color = Color.White)
                }
            }
            item {
                Spacer(modifier = Modifier.width(20.dp))
            }
            item {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .clip(RoundedCornerShape(10.dp))
                        .background(Color.Cyan)
                        .padding(15.dp)
                ) {
                    Text(text = "Java", color = Color.White)
                }
            }
            item {
                Spacer(modifier = Modifier.width(20.dp))
            }

            item {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .clip(RoundedCornerShape(10.dp))
                        .background(Color.Cyan)
                        .padding(15.dp)
                ) {
                    Text(text = "Kotlin", color = Color.White)
                }
            }
            item {
                Spacer(modifier = Modifier.width(20.dp))
            }

            item {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .clip(RoundedCornerShape(10.dp))
                        .background(Color.Cyan)
                        .padding(15.dp)
                ) {
                    Text(text = "Flutter", color = Color.White)
                }
            }
            item {
                Spacer(modifier = Modifier.width(20.dp))
            }
        }
    }

}