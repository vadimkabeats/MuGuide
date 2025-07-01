package com.example.myguide.data.entities

import androidx.room.Entity

@Entity(
    tableName = "route_place_cross_ref",
    primaryKeys = ["routeId", "placeId"]
)
data class RoutePlaceCrossRef(
    val routeId: Long,
    val placeId: Long
)