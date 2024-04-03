package com.example.android1.ui.theme.components

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun LoginTextfield(
    modifier: Modifier = Modifier,
    value: String,
    onValueChange: (String) -> Unit,
    labelText: String,
    leadingIcon: ImageVector? = null,
    keyboardType: KeyboardType = KeyboardType.Text,
    isPasswordVisible: Boolean = false // Added parameter to determine password visibility
) {
    OutlinedTextField(
        modifier = modifier,
        value = value,
        onValueChange = onValueChange,
        label = { Text(labelText) },
        leadingIcon = { if (leadingIcon != null) Icon(imageVector = leadingIcon, contentDescription = null) },
        keyboardOptions = KeyboardOptions(keyboardType = keyboardType),
        visualTransformation = if (keyboardType == KeyboardType.Password && !isPasswordVisible) PasswordVisualTransformation() else VisualTransformation.None,
        shape = RoundedCornerShape(30)
    )
}

@Preview(showBackground = true)
@Composable

fun PrevTextfield(){
    LoginTextfield(value = "", onValueChange = {}, labelText = "Password")
}