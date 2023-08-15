package com.example.figuressurfaceandarea.models

import kotlin.math.PI
import kotlin.math.pow

class HollowCyclinder(height : Double,
                      val outerRadius : Double,
                      val innerRadius : Double )
    : Cylinder(height, outerRadius){

    override fun planeArea(): Double {
        return PI*(outerRadius.pow(2)-innerRadius.pow(2))
    }

    override fun totalArea(): Double {
        return 2* PI*((outerRadius*height+innerRadius*height+(outerRadius.pow(2)-innerRadius.pow(2))))
    }
}