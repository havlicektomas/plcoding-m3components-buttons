package com.example.m3buttons

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.FilledTonalIconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedIconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.m3buttons.ui.theme.M3ButtonsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            M3ButtonsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Buttons()
                }
            }
        }
    }
}

@Composable
fun Buttons(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Subscribe")
        }
        ElevatedButton(onClick = { /*TODO*/ }) {
            Icon(
                imageVector = Icons.Outlined.Add,
                contentDescription = "Add to cart",
                modifier = Modifier.size(18.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "Add to cart")
        }
        FilledTonalButton(onClick = { /*TODO*/ }) {
            Icon(
                imageVector = Icons.Outlined.ShoppingCart,
                contentDescription = "Add to cart",
                modifier = Modifier.size(18.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "Go to cart")
        }
        FilledTonalIconButton(onClick = { /*TODO*/ }) {
            Icon(
                imageVector = Icons.Outlined.ShoppingCart,
                contentDescription = "Add to cart",
                modifier = Modifier.size(18.dp)
            )
        }
        OutlinedButton(onClick = { /*TODO*/ }) {
            Icon(
                imageVector = Icons.Outlined.ShoppingCart,
                contentDescription = "Add to cart",
                modifier = Modifier.size(18.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "Go to cart")
        }
        OutlinedIconButton(onClick = { /*TODO*/ }) {
            Icon(
                imageVector = Icons.Outlined.ShoppingCart,
                contentDescription = "Add to cart",
                modifier = Modifier.size(18.dp)
            )
        }
        TextButton(onClick = { /*TODO*/ }) {
            Text(text = "Click me")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    M3ButtonsTheme {
        Buttons(modifier = Modifier.fillMaxSize())
    }
}