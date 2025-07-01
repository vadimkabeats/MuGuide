// ComposeScreens.kt
// Все экраны приложения реализованы на Jetpack Compose

package com.example.myguide.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.myguide.data.entities.Country
import com.example.myguide.data.entities.City
import com.example.myguide.data.entities.Place

// 1. Список стран
@Composable
fun CountryListScreen(
    countries: List<Country>,
    onCountryClick: (Country) -> Unit
) {
    LazyColumn(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        items(countries) { country ->
            Text(
                text = country.name,
                style = MaterialTheme.typography.h6,
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { onCountryClick(country) }
                    .padding(vertical = 8.dp)
            )
        }
    }
}

// 2. Список городов
@Composable
fun CityListScreen(
    cities: List<City>,
    onCityClick: (City) -> Unit
) {
    LazyColumn(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        items(cities) { city ->
            Text(
                text = city.name,
                style = MaterialTheme.typography.subtitle1,
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { onCityClick(city) }
                    .padding(vertical = 8.dp)
            )
        }
    }
}

// 3. Список достопримечательностей
@Composable
fun PlaceListScreen(
    places: List<Place>,
    onPlaceClick: (Place) -> Unit
) {
    LazyColumn(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        items(places) { place ->
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { onPlaceClick(place) }
                    .padding(vertical = 8.dp)
            ) {
                Text(text = place.name, style = MaterialTheme.typography.h6)
                Text(text = place.description ?: "", style = MaterialTheme.typography.body2)
            }
        }
    }
}

// 4. Детали достопримечательности
@Composable
fun PlaceDetailScreen(
    place: Place,
    onOpenMap: (Double, Double) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        // Пример с локальным ресурсом; в реале используйте Coil/Glide + rememberImagePainter
        place.photoPath?.let {
            Image(
                painter = painterResource(id = /* TODO: resource from uri */ 0),
                contentDescription = place.name,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = place.name, style = MaterialTheme.typography.h5)
        Spacer(modifier = Modifier.height(4.dp))
        Text(text = place.description ?: "", style = MaterialTheme.typography.body1)
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { onOpenMap(place.lat, place.lon) }) {
            Text(text = "Открыть на карте")
        }
    }
}

// 5. Экран справки
@Composable
fun HelpScreen(
) {
    Surface(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Column(modifier = Modifier.fillMaxSize()) {
            Text(
                text = "Справка:\n\nАвтор: Вадим Ли",
                style = MaterialTheme.typography.body1
            )
        }
    }
}
