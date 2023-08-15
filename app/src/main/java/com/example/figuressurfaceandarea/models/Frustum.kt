package com.example.figuressurfaceandarea.models

import kotlin.math.PI
import kotlin.math.pow
import kotlin.math.sqrt

class Frustum(val radiusofBase : Double, height:Double, val radiusOfTop : Double)
    : Cone(radius = radiusofBase, height = height){
    private val slantHeight = sqrt(height.pow(2)-radiusofBase.pow(2))
    override fun totalArea(): Double {
        return PI*radiusofBase.pow(2)+ PI*radiusOfTop.pow(2) + PI*slantHeight*(radiusofBase+radiusOfTop)
    }

    override fun volume(): Double {
       return 1/3*PI*height*(radiusofBase.pow(2)+ PI*radiusOfTop.pow(2)+radiusofBase*radiusOfTop)
    }

    override fun curvedSurfaceArea(): Double {
        return PI*slantHeight*(radiusofBase+radiusOfTop)
    }
}