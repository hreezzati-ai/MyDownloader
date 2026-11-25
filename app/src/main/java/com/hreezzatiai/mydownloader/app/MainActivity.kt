package com.hreezzatiai.mydownloader.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.rememberNavController
import com.hreezzatiai.mydownloader.app.navigation.NavigationRoot
import com.hreezzatiai.mydownloader.core.presentation.designsystem.theme.ComposeAndroidTemplateTheme

/**
 * Root activity class for the application - acts as the primary entry point of the app.
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        enableEdgeToEdge()
        setContent {
            ComposeAndroidTemplateTheme {
                NavigationRoot(
                    navController = rememberNavController()
                )
            }
        }
    }
}