import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.android1.ui.theme.Android1Theme
import com.example.android1.ui.theme.login.loginScreen

class MainActivity : ComponentActivity() {
    val customColor = Color(red = 47, green = 44, blue = 68)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Android1Theme {
                // Use Surface or Box with background color here
                Surface(
                    modifier = Modifier.background(customColor),
                    color = customColor // Set the background color of the screen
                ) {
                    loginScreen()
                }
            }
        }
    }
}
