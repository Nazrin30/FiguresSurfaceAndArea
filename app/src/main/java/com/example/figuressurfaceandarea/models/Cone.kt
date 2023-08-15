package com.example.figuressurfaceandarea.models

import kotlin.math.PI
import kotlin.math.pow
import kotlin.math.sqrt

 open class Cone (val height : Double, val radius  : Double): Figure(){
    private val slantHeight = sqrt(height.pow(2)-radius.pow(2))
    override fun planeArea(): Double {
        return PI*radius.pow(2)
    }

    override fun curvedSurfaceArea(): Double {
        return PI*radius*slantHeight
    }

    override fun totalArea(): Double {
        return PI*radius*(radius+slantHeight)
    }

    override fun volume(): Double {
        return 1/3*(PI*radius.pow(2)*height)
    }
}