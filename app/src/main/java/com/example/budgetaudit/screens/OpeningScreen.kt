package com.example.budgetaudit.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.budgetaudit.R
import com.example.budgetaudit.components.buttons.MyButton
import com.example.budgetaudit.components.imageslider.ImageSlider


@Composable
fun OpeningScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize(0.9f),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        //Logo
        Row(
            modifier = Modifier
                .fillMaxWidth(1f),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Logo", fontFamily = FontFamily(Font(R.font.poppinsbold)), fontSize = 35.sp)
        }

        Spacer(modifier = Modifier.height(15.dp))
        //Slider
        Row(
            modifier = Modifier
                .fillMaxWidth(1f),
            verticalAlignment = Alignment.CenterVertically
        ) {
            ImageSlider()
        }

        Spacer(modifier = Modifier.height(35.dp))

        //Buttons

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Column(modifier = Modifier.fillMaxWidth() , horizontalAlignment = Alignment.CenterHorizontally) {
                //Create account button
                MyButton(btnColor = Color(40, 74, 193), rippleColor = Color.White, textView = {
                    Text(
                        modifier = Modifier.padding(10.dp),
                        text = "Create account",
                        fontFamily = FontFamily(Font(R.font.poppinsmedium)),
                        fontSize = 16.sp,
                        color = Color(225, 225, 225)
                    )
                })
                
                Spacer(modifier = Modifier.height(20.dp))
                
                //Continue with Google
                MyButton(btnColor = Color.White, rippleColor = Color.LightGray, textView = {
                    Text(
                        modifier = Modifier.padding(10.dp),
                        text = "Continue with Google",
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

                Spacer(modifier = Modifier.height(12.dp))
                
                //Sign in 
                TextButton(onClick = { /*TODO*/ }) {
                    Text(
                        text = "Sign in",
                        fontFamily = FontFamily(Font(R.font.poppinsmedium)),
                        fontSize = 16.sp,
                        color = Color(40,74,193)
                    )
                }
            }
        }

    }
}