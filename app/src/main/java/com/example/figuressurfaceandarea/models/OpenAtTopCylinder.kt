package com.example.figuressurfaceandarea.models

import kotlin.math.PI
import kotlin.math.pow

class OpenAtTopCylinder(radius : Double,
                        height : Double)
    : RightCircularCylinder(radius = radius,
                            height = height) {
    override fun planeArea(): Double {
        return PI*radius.pow(2)
    }

    override fun totalArea(): Double {
        return PI*radius*(2*height+radius)
    }
}