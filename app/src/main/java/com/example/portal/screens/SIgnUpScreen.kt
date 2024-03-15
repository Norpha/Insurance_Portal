package com.example.portal.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.portal.R
import com.example.portal.components.NormalTextComponent


@Composable
fun SIgnUpScreen () {

    Surface (
        color = Color.White,
        modifier = Modifier.fillMaxSize()
    ){
        NormalTextComponent(value = stringResource(id = R.string.hello))
    }

}

@Preview
@Composable
fun DefaultPreviewOfSignupScreen(){

    SIgnUpScreen ()
}