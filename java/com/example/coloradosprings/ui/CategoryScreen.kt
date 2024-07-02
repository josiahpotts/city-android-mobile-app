package com.example.coloradosprings.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.material3.Button
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.coloradosprings.MainScreen
import com.example.coloradosprings.model.Item

@Composable
fun CategoryScreen(
    category: String?,
    navController: NavHostController,
    items: List<Item>?
) {
    Column()
    {
        Text(
            text = category ?: "Category",
            style = typography.titleLarge.copy(fontWeight = FontWeight.Bold),
            modifier = Modifier.padding(16.dp),
            fontSize = 32.sp
        )
        items?.let { itemList ->
            Column(
                modifier = Modifier.padding(vertical = 16.dp)
            ) {
                itemList.forEach { item ->
                    Button(
                        colors = ButtonDefaults.buttonColors(Color.White, contentColor = Color.Black),
                        modifier = Modifier.fillMaxWidth()
                            .padding(vertical = 8.dp)
                            .height(48.dp)
                            .border(BorderStroke(1.dp, Color.Black)),
                        onClick = {
                            navController.navigate("${MainScreen.Recommendation.name}/${item.name}")
                        }
                    ) {
                        Text(
                            text = item.name,
                            fontSize = 24.sp,
                            modifier = Modifier.fillMaxWidth()
                        )
                    }
                }
            }
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    name = "UI"
)
@Composable
fun CategoryScreenPreview() {
    //CategoryScreen()
}