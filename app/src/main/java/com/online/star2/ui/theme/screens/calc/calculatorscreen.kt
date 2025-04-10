package com.online.star2.ui.theme.screens.calc

import android.R
import android.text.InputType
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun Calc_Screen(navController: NavHostController) {
    var firstnum by remember { mutableStateOf(TextFieldValue("")) }
    var secondnum by remember { mutableStateOf(TextFieldValue("")) }
    var answer by remember { mutableStateOf("") }
    Column (
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)){
        Text(text = "Answer here!!!",
            color = Color.Red,
            fontSize = 30.sp,
            fontFamily = FontFamily.Default
        )
        OutlinedTextField(value = firstnum,
            onValueChange = {firstnum=it},
            label ={Text(text = "Enter First No.",
                fontSize = 30.sp,
                color = Color.Black,
                fontFamily = FontFamily.Serif)},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            textStyle = TextStyle(Color.Black)

        )
        OutlinedTextField(value = secondnum,
            onValueChange = {secondnum=it},
            label ={Text(text = "Enter Second No.",
                fontSize = 30.sp,
                color = Color.Black,
                fontFamily = FontFamily.Serif)},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        OutlinedButton(onClick ={
            val myfirstnum=firstnum.text.trim()
            val mysecondnum=secondnum.text.trim()
            if (myfirstnum.isEmpty()|| mysecondnum.isEmpty()){
                answer="Please fill in all details."
            }else{
                val my_answer=myfirstnum.toDouble() + mysecondnum.toDouble()
                answer=my_answer.toString()
            }

        },
           colors = ButtonDefaults.buttonColors(Color.Red),
            modifier = Modifier.width(300.dp)) {
            Text(text = "+",
                fontSize = 35.sp,
                fontFamily = FontFamily.Serif)

        }
        OutlinedButton(onClick ={
            val myfirstnum=firstnum.text.trim()
            val mysecondnum=secondnum.text.trim()
            if (myfirstnum.isEmpty()|| mysecondnum.isEmpty()){
                answer="Please fill in all details."
            }else{
                val my_answer=myfirstnum.toDouble() - mysecondnum.toDouble()
                answer=my_answer.toString()
            }

        },
            colors = ButtonDefaults.buttonColors(Color.Red),
            modifier = Modifier.width(300.dp)) {
            Text(text = "-",
                fontSize = 35.sp,
                fontFamily = FontFamily.Serif)

        }
        OutlinedButton(onClick ={
            val myfirstnum=firstnum.text.trim()
            val mysecondnum=secondnum.text.trim()
            if (myfirstnum.isEmpty()|| mysecondnum.isEmpty()){
                answer="Please fill in all details."
            }else{
                val my_answer=myfirstnum.toDouble() * mysecondnum.toDouble()
                answer=my_answer.toString()
            }
        },
            colors = ButtonDefaults.buttonColors(Color.Red),
            modifier = Modifier.width(300.dp)) {
            Text(text = "*",
                fontSize = 35.sp,
                fontFamily = FontFamily.Serif)

        }
        OutlinedButton(onClick ={
            val myfirstnum=firstnum.text.trim()
            val mysecondnum=secondnum.text.trim()
            if (myfirstnum.isEmpty()|| mysecondnum.isEmpty()){
                answer="Please fill in all details."
            }else{
                val my_answer=myfirstnum.toDouble() / mysecondnum.toDouble()
                answer=my_answer.toString()
            }
        },
            colors = ButtonDefaults.buttonColors(Color.Red),
            modifier = Modifier.width(300.dp)) {
            Text(text = "/",
                fontSize = 35.sp,
                fontFamily = FontFamily.Serif)

        }

    }

}


@Preview
@Composable
private fun Calc_Prev() {
    Calc_Screen(rememberNavController())

}