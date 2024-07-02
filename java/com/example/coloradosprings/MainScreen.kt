package com.example.coloradosprings

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import com.example.coloradosprings.ui.CategoryViewModel
import androidx.navigation.compose.NavHost
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.coloradosprings.data.DataSource
import com.example.coloradosprings.ui.CategoryScreen
import com.example.coloradosprings.ui.HomeScreen
import com.example.coloradosprings.ui.RecommendationScreen

enum class MainScreen() {
    Home,
    Category,
    Recommendation
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ColoradoSpringsAppBar(
    canNavigateBack: Boolean,
    navigateUp: () -> Unit,
    navController: NavController,
    modifier: Modifier = Modifier
) {
    TopAppBar(
        title = { Text("City Recommendation App") },
        colors = TopAppBarDefaults.mediumTopAppBarColors(
            containerColor = Color.White
        ),
        modifier = modifier,
        navigationIcon = {
            if (canNavigateBack) {
                IconButton(
                    onClick = { navController.popBackStack() },
                    modifier = Modifier.padding(start = 8.dp)
                ) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = "Back button",
                        tint = Color.Black
                    )
                }
            }
        }
    )
}

@Composable
fun ColoradoSpringsApp(
    viewModel: CategoryViewModel = viewModel()
) {
    val navController = rememberNavController()

    Scaffold(
        topBar = {
            ColoradoSpringsAppBar(
                canNavigateBack = true,
                navigateUp = { /* TODO: implement back navigation */ },
                navController = navController
            )
        },
        content = { innerPadding ->
            NavHost(
                navController,
                startDestination = MainScreen.Home.name,
                modifier = Modifier.padding(innerPadding)
            ) {
                composable(route = MainScreen.Home.name) {
                    HomeScreen(
                        allCategories = DataSource.allCategories,
                        navController = navController,
                        modifier = Modifier.fillMaxSize().padding(16.dp)
                    )
                }
                composable(route = "${MainScreen.Category.name}/{category}") { backStackEntry ->
                    val category = backStackEntry.arguments?.getString("category")
                    val items = DataSource.allCategories.find { it.category == category }?.items
                    CategoryScreen(
                        category = category,
                        navController = navController,
                        items = items
                    )
                }
                composable(route = "${MainScreen.Recommendation.name}/{itemName}") {backStackEntry ->
                    val itemName = backStackEntry.arguments?.getString("itemName")
                    val item = DataSource.allCategories.flatMap { it.items }.find { it.name == itemName }
                    item?.let { RecommendationScreen(item = it) }
                }
            }
        }
    )
}
