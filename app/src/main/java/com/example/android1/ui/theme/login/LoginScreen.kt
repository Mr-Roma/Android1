package com.example.android1.ui.theme.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.android1.ui.theme.components.HeaderText
import com.example.android1.ui.theme.components.LoginTextfield

val defaultPadding = 16.dp
val itemSpacing = 8.dp


@Composable

fun loginScreen(){
    var namaLengkap by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var username by remember { mutableStateOf("") }
    var  noHp by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }

    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(defaultPadding),
        horizontalAlignment = Alignment.CenterHorizontally,
    ){
        HeaderText(
            text =  "Login",
            modifier =  Modifier.padding(vertical = defaultPadding, )
        )
        LoginTextfield(value = namaLengkap, onValueChange = {namaLengkap=it}, labelText = "Nama Lengkap", leadingIcon = Icons.Default.Person, modifier = Modifier.padding(bottom = 8.dp, top = 30.dp))
        LoginTextfield(value = email, onValueChange = {email = it}, labelText = "Email", leadingIcon = Icons.Default.Email, modifier = Modifier.padding(bottom = 8.dp))
        LoginTextfield(value = username, onValueChange = {username = it}, labelText = "Username", leadingIcon = Icons.Default.AccountBox, modifier = Modifier.padding(bottom = 8.dp))
        LoginTextfield(value = noHp, onValueChange = {noHp = it}, labelText = "No Hp", leadingIcon = Icons.Default.Phone, modifier = Modifier.padding(bottom = 8.dp), keyboardType = KeyboardType.Number)
        LoginTextfield(value = password, onValueChange = {password = it}, labelText = "Password", leadingIcon = Icons.Default.Lock, modifier = Modifier.padding(bottom = 8.dp), keyboardType = KeyboardType.Password)
        LoginTextfield(value = confirmPassword, onValueChange = {confirmPassword = it}, labelText = "Confirm Password", leadingIcon = Icons.Default.Lock, modifier = Modifier.padding(bottom = 50.dp), keyboardType = KeyboardType.Password)

        Row {
            Row (horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically){
                TextButton(onClick = {}) {
                    Text(text = "Lupa Password?")
                }
            }
        }
        MyButton { }

    }
}

@Preview(showBackground = true)
@Composable

fun PrevLoginScreen(){
    loginScreen()
}

@Composable
fun MyButton(onClick: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = onClick, modifier = Modifier.width(350.dp)) {
            // Button text
            Text(text = "Daftar")
        }
    }
}
