package com.sd.composedemoapp.ui.theme.screen

import android.widget.EditText
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.magnifier
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Shapes

import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TextFieldDefaults.textFieldColors
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Login() {
    Surface(color = Color.Black, modifier = Modifier.fillMaxSize()) {
        Column {
            header()
        }

    }


}

@Composable
fun header() {
    Column {
        Box(modifier = Modifier.padding(start = 30.dp, top = 50.dp)) {
            Text(
                fontSize = 28.sp,
                color = Color.White,
                text = "Hi there",
                fontWeight = FontWeight.Black
            )
        }
        Box(modifier = Modifier.padding(start = 30.dp, top = 10.dp)) {
            Text(
                fontSize = 24.sp,
                color = Color.White,
                text = "Welcome To Login",
                fontWeight = FontWeight.Black
            )
        }
        textInputFeild()
        Card(
            shape = CircleShape,
            colors = CardDefaults.cardColors(
                containerColor = Color.DarkGray, //Card background color
                contentColor = Color.White  //Card content color,e.g.text
            ),
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
                .padding(top = 20.dp)
        ) {
            Text(
                fontSize = 15.sp,
                modifier = Modifier.padding(
                    start = 45.dp,
                    end = 45.dp,
                    top = 15.dp,
                    bottom = 15.dp
                ),
                text = "Login"
            )

        }
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun textInputFeild() {
    var email by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }
    Column {
        OutlinedTextField(
            value = email,
            onValueChange = {
                email = it

            },
            shape = RoundedCornerShape(20.dp),

            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp, top = 50.dp),
            placeholder = { Text(text = "Email") },
            colors = textFieldColors(
                textColor = Color.White,
                containerColor = Color.Black,
                cursorColor = Color.White,
                focusedIndicatorColor = Color.Gray,
                unfocusedIndicatorColor = Color.DarkGray

            ),

            )
        OutlinedTextField(
            value = password,
            onValueChange = {
                password = it

            },
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp, top = 10.dp),
            placeholder = { Text(text = "Password") },
            colors = textFieldColors(
                textColor = Color.White,
                containerColor = Color.Black,
                cursorColor = Color.White,
                focusedIndicatorColor = Color.Gray,
                unfocusedIndicatorColor = Color.DarkGray

            ),
            visualTransformation = PasswordVisualTransformation(),

            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)

        )
    }


}

@Preview
@Composable
fun showUi() {
    Login()
}