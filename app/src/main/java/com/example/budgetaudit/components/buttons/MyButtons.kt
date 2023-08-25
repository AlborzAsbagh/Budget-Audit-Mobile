package com.example.budgetaudit.components.buttons

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.budgetaudit.components.shadow.shadow


@Composable
fun MyButton(
    btnColor: Color,
    rippleColor: Color,
    shadowColor: Color = Color.LightGray,
    textView: @Composable (() -> Unit)? = null,
    imageView: @Composable (() -> Unit)? = null,
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .shadow(shadowColor)
            .background(btnColor, RoundedCornerShape(6.dp))
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = rememberRipple(
                    bounded = true,
                    color = rippleColor
                ),
                onClick = {}
            ),
    ) {
        Row(
            modifier = Modifier.fillMaxWidth().background(btnColor,RoundedCornerShape(6.dp)),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            imageView?.let { it() }
            textView?.let { it() }
        }
    }
}