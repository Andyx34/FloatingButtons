package com.example.floatingbutton

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.LargeFloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun FloatingButtons (oneClick: () -> Unit){
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Boton flotante
        Text(text = "Boton Flotante")
        FloatingActionButton(onClick = { oneClick() },
            ) {
            Icon(Icons.Filled.Add, "Floating action button" )
        }

        Spacer(modifier = Modifier.height(16.dp))

        //Boton flotante pequeño
        Text(text = "Boton flotante pequeño")
            SmallFloatingActionButton(onClick = {oneClick()},
            containerColor = MaterialTheme.colorScheme.secondaryContainer,
                contentColor = MaterialTheme.colorScheme.secondary
            ) {
            Icon(Icons.Filled.Add, "Small floating action button" )
        }

        Spacer(modifier = Modifier.height(16.dp))

        //Boton flotante grande
        Text(text = "Boton flotante grande")
        LargeFloatingActionButton(onClick = { oneClick() },
            shape = CircleShape,
            ) {
            Icon(Icons.Filled.Add, "Large floating action button")
        }

        Spacer(modifier = Modifier.height(16.dp))

        //Boton flotante extendido
        Text(text = "Boton flotante Extendido")
        ExtendedFloatingActionButton(onClick = { oneClick() },
            icon = { Icon(Icons.Filled.Edit, "Extended floating action button" )},
            text = { Text(text = "Extended FAB")}
            )
    }
}