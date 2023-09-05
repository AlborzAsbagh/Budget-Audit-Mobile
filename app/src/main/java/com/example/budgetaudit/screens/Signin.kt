package com.example.budgetaudit.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.budgetaudit.R
import com.example.budgetaudit.components.buttons.MyButton
import com.example.budgetaudit.components.shadow.shadow


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Signin() {

    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize(0.9f)
    ) {

        //Logo
        Row(
            modifier = Modifier
                .padding(bottom = 90.dp)
                .fillMaxWidth(1f),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text(text = "Logo", fontFamily = FontFamily(Font(R.font.poppinsbold)), fontSize = 35.sp)
            Spacer(modifier = Modifier.weight(1f))
            IconButton(onClick = { /*TODO*/ }) {
                Icon(Icons.Filled.Close, contentDescription = "Close")
            }
        }


        //Signin body content

        Column(
            modifier = Modifier
                .fillMaxWidth(1f)
        ) {

            Text(
                text = "Sign in",
                fontFamily = FontFamily(Font(R.font.poppinsbold)),
                fontSize = 25.sp
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .padding(top = 5.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "or",
                    fontFamily = FontFamily(Font(R.font.poppinslight)),
                    color = Color(121, 121, 121)
                )
                Spacer(modifier = Modifier.width(5.dp))
                Text(
                    text = "Create Account",
                    fontFamily = FontFamily(Font(R.font.poppinslight)),
                    color = Color(40, 74, 193)
                )


            }
        }
        Spacer(modifier = Modifier.height(25.dp))

        Column(modifier = Modifier.fillMaxWidth(1f)) {


            OutlinedTextField(
                value = email, onValueChange = {
                    email = it
                }, modifier = Modifier
                    .fillMaxWidth(1f)
                    .shadow(Color.LightGray)
                    .background(Color.White, RoundedCornerShape(6.dp))
                    .padding(horizontal = 5.dp),
                keyboardOptions = KeyboardOptions(
                    imeAction = ImeAction.Next,
                    keyboardType = KeyboardType.Email
                ),
                textStyle = TextStyle(
                    color = Color.Black,
                    fontFamily = FontFamily(Font(R.font.poppinsmedium))
                ),
                placeholder = {
                              Text(text = "Email", fontFamily = FontFamily(Font(R.font.poppinslight)))
                },
                maxLines = 1 ,
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Color.White,
                    unfocusedBorderColor = Color.White
                )
            )
            Spacer(modifier = Modifier.height(15.dp))


            OutlinedTextField(
                value = password, onValueChange = {
                    password = it
                }, modifier = Modifier
                    .fillMaxWidth(1f)
                    .background(Color.White, RoundedCornerShape(6.dp))
                    .padding(horizontal = 5.dp),
                keyboardOptions = KeyboardOptions(
                    imeAction = ImeAction.Next,
                    keyboardType = KeyboardType.Password
                ),
                textStyle = TextStyle(
                    color = Color.Black,
                    fontFamily = FontFamily(Font(R.font.poppinsmedium))
                ),
                label = {
                    Text(text = "Password", fontFamily = FontFamily(Font(R.font.poppinslight)) , color = Color.LightGray)
                },
                maxLines = 1 ,
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Color(225,225,225),
                    unfocusedBorderColor = Color(225,225,225)
                )
            )

            Spacer(modifier = Modifier.height(10.dp))
            TextButton(onClick = { /*TODO*/ }) {
                Text(
                    text = "Forgot password?",
                    fontFamily = FontFamily(Font(R.font.poppinslight)),
                    fontSize = 14.sp,
                    color = Color(47, 74, 193)
                )
            }
        }

        Spacer(modifier = Modifier.height(10.dp))

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                //Create account button
                MyButton(btnColor = Color(40, 74, 193), rippleColor = Color.White, textView = {
                    Text(
                        modifier = Modifier.padding(10.dp),
                        text = "Login",
                        fontFamily = FontFamily(Font(R.font.poppinsmedium)),
                        fontSize = 16.sp,
                        color = Color(225, 225, 225)
                    )
                })
                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = "or",
                    fontFamily = FontFamily(Font(R.font.poppinslight)),
                    fontSize = 14.sp,
                    color = Color(121, 121, 121)
                )
                Spacer(modifier = Modifier.height(10.dp))

                //Continue with Google
                MyButton(btnColor = Color.White, rippleColor = Color.LightGray, textView = {
                    Text(
                        modifier = Modifier.padding(10.dp),
                        text = "Sign in with Google",
                        fontFamily = FontFamily(Font(R.font.poppinslight)),
                        fontSize = 14.sp,
                        color = Color(140, 140, 140)
                    )
                }, imageView = {
                    Image(
                        painter = painterResource(id = R.drawable.google),
                        contentDescription = "Google Icon",
                        modifier = Modifier
                            .width(20.dp)
                            .height(20.dp)
                    )
                })
            }
        }


    }
}