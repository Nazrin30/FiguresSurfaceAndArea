package com.example.figuressurfaceandarea.models

import kotlin.math.PI
import kotlin.math.pow

class CloseAtTopCylinder(radius : Double, height : Double)
    : RightCircularCylinder(radius = radius,
                            height = height
) {
    override fun planeArea(): Double {
        return 2 * PI* radius.pow(2)
    }

    override fun totalArea(): Double {
        return 2*PI*radius*(radius+height)
    }


}