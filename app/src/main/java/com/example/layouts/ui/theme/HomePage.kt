package com.example.layouts.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.layouts.R

@Composable
fun HomePage(){
    Box(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize()
    )
    {
        Column {
            GreetingSection()
            CurrentMeditation()
            DetailedInfo()
//            ChipSection()
//            NewFun()
            ContactBox()
        }
    }
}

@Composable
fun SomethingNew()
{
    Row ( modifier = Modifier
        .padding(15.dp)
        .clip(RoundedCornerShape(10.dp))
        .background(Color(0xFFFF0000))
        .padding(horizontal = 15.dp, vertical = 200.dp)
        .fillMaxWidth())
    {
//        SomethingNewOne()
//        Spacer(modifier = Modifier.width(40.dp))
//        SomethingNewTwo()
    }
}

@Composable
fun SomethingNewOne(

){

    Row(  modifier = Modifier
        .padding(15.dp)
        .clip(RoundedCornerShape(10.dp))
        .background(Color.Red)
        .padding(horizontal = 15.dp, vertical = 20.dp)
        .width(70.dp)
    ) {
        Text(text = "Box 1",
            color = Color.White,
            style = MaterialTheme.typography.headlineMedium
            )
    }
}
@Composable
fun SomethingNewTwo(

){

    Row(  modifier = Modifier
        .padding(15.dp)
        .clip(RoundedCornerShape(10.dp))
        .background(Color.Red)
        .padding(horizontal = 15.dp, vertical = 20.dp)
        .width(70.dp)
        
    ) {
        Text(text = "Box 2",
            color = Color.White,
            style = MaterialTheme.typography.headlineMedium
        )
    }
}

@Composable
fun GreetingSection (
    name: String = "Adi Jain"

){
    Row (
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(58.dp)
    ){
        Column (
            verticalArrangement = Arrangement.Center
        ){
            Text(text = "$name",
                color = Color.Black,
                style = MaterialTheme.typography.headlineMedium
            )
            Text(text = "IIIT Dharwad",
                color = Color.Black,
                style = MaterialTheme.typography.bodyMedium
            )
        }
        Image(painter = painterResource(id = R.drawable.adi_dp), contentDescription = "Profile Image",
            modifier = Modifier
                .size(130.dp)
                .clip(CircleShape)
                .fillMaxSize()

        )
//        Icon(
//            painter = painterResource(id = R.drawable.ic_profile),
//            contentDescription = "Person Image",
//            tint = Color.Blue,
//            modifier = Modifier.size(24.dp)
//        )
    }
}


@Composable
fun NewFun(

) {
    Row(

        modifier = Modifier
            .padding(15.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(Color(0xFF0000FF).copy(0.8f))
            .padding(horizontal = 15.dp, vertical = 40.dp)
            .fillMaxWidth()
    ) {
        Column {
            Text(
                text = "Just Checking",
                style = MaterialTheme.typography.headlineMedium,
                color = Color.White
            )

        }

    }
}


@Composable
fun CurrentMeditation(

) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .padding(15.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(Color(0xFF0000FF).copy(0.8f))
            .padding(horizontal = 15.dp, vertical = 20.dp)
            .fillMaxWidth()
    ) {
        Column {
            Text(
                text = "CSE 3rd Year",
                style = MaterialTheme.typography.headlineMedium,
                color = Color.White
            )
            Text(
                text = "21BCS003",
                style = MaterialTheme.typography.titleMedium,
                color = Color.White,
                modifier = Modifier.padding(start = 3.dp)
            )
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .background(Color.Cyan)
//                .padding(2.dp)
        ) {
            Icon(
                Icons.Default.Info,
                contentDescription = "Play",
                tint = Color.White,
                modifier = Modifier.size(30.dp)
            )
        }
    }
}

@Composable
fun ContactBox (){
    Row(

        modifier = Modifier
            .padding(15.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(Color.Blue.copy(0.8f))
            .padding(horizontal = 15.dp, vertical = 20.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .background(Color.Blue)

        )
        {
            Icon(
                Icons.Default.Call, contentDescription = "Call",
                tint = Color.White
            )
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .background(Color.Blue)
        )
        {
            Icon(
                Icons.Default.Email, contentDescription = "Call",
                tint = Color.White
            )
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .background(Color.Blue)
        )
        {
            Icon(
                Icons.Default.LocationOn, contentDescription = "Call",
                tint = Color.White
            )
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .background(Color.Blue)
        )
        {
            Icon(
                Icons.Default.Share, contentDescription = "Call",
                tint = Color.White
            )
        }

    }
}