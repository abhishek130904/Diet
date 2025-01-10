import android.graphics.Color.rgb
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.diet.R


@Composable
fun SignInScreen() {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()

            .background(Color(red = 58, green = 58, blue = 58)
            )
    ) {

        Image(
            painter = painterResource(id = R.drawable.food), // Replace with your image resource
            contentDescription = null,
            contentScale = ContentScale.Inside,
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .graphicsLayer(
                    alpha = 0.8f
                )
        )

        Image(
            painter = painterResource(id = R.drawable.food), // Replace with your image resource
            contentDescription = null,
            contentScale = ContentScale.Inside,
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.TopEnd)
                .graphicsLayer(
                    rotationZ = 180f,
                    alpha = 0.8f
                )
        )


        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 116.dp, start = 30.dp, end = 30.dp),

            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = "Sign In",
                color = Color.White,
                fontSize = 32.sp,
                modifier = Modifier.padding(vertical = 32.dp)
            )


            OutlinedTextField(
                value = email,
                onValueChange = { email = it },
                label = { Text("Email") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedTextColor = Color.White,
                    unfocusedTextColor = Color.White,
                    focusedBorderColor = Color.White,
                    unfocusedBorderColor = Color.Gray,
                    focusedLabelColor = Color.White,
                    unfocusedLabelColor = Color.Gray
                )
            )

            // Password field
            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                label = { Text("Password") },
                visualTransformation = PasswordVisualTransformation(),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedTextColor = Color.White,
                    unfocusedTextColor = Color.White,
                    focusedBorderColor = Color.White,
                    unfocusedBorderColor = Color.Gray,
                    focusedLabelColor = Color.White,
                    unfocusedLabelColor = Color.Gray
                )
            )

            // Forgot Password
            TextButton(
                onClick = { /* Handle forgot password */ },
                modifier = Modifier.align(Alignment.End)
            ) {
                Text(
                    "Forgot Password?",
                    color = Color.White
                )
            }

            // Login Button
            Button(
                onClick = { /* Handle login */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 16.dp)
                    .height(48.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White
                ),
                shape = RoundedCornerShape(4.dp)
            ) {
                Text("Login", color = Color.Black)
            }

            // Divider with text
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Divider(
                    modifier = Modifier
                        .weight(1f)
                        .padding(end = 8.dp),
                    color = Color.Gray
                )
                Text("-OR-", color = Color.White)
                Divider(
                    modifier = Modifier
                        .weight(1f)
                        .padding(start = 8.dp),
                    color = Color.Gray
                )
            }

            Text(
                "Sign in with",
                color = Color.White,
                modifier = Modifier.padding(vertical = 8.dp)
            )

            // Social Login Buttons
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(
                    onClick = { /* Handle Facebook login */ }
                ) {
                    // Replace with actual Facebook icon
                    Icon(
                        painter = painterResource(id = R.drawable.fb),
                        contentDescription = "Facebook Login",
                        modifier = Modifier.size(35.dp),
                        tint = Color.Unspecified
                    )
                }

                Spacer(modifier = Modifier.width(24.dp))

                IconButton(
                    onClick = { /* Handle Google login */ }
                ) {
                    // Replace with actual Google icon
                    Icon(
                        painter = painterResource(id = R.drawable.gg),
                        contentDescription = "Facebook Login",
                        modifier = Modifier.size(35.dp),
                        tint = Color.Unspecified
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SignInScreenPreview() {
    MaterialTheme {
        SignInScreen()
    }
}

