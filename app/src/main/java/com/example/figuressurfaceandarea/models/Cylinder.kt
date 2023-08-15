package com.example.figuressurfaceandarea.models

import kotlin.math.PI

abstract class Cylinder (val height : Double, val radius : Double): Figure() {


    override fun volume(): Double {
        return PI*radius*radius*height
    }

    override fun curvedSurfaceArea(): Double {
        return 2* PI*radius*height
    }


}