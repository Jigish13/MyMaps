package com.jigxi.myapplication.models

import java.io.Serializable

// it will hold map title and all markers(i.e. places) on it
data class UserMap(val title:String, val places:List<Place>) : Serializable