package com.example.figuressurfaceandarea.models


open class Cuboid (val length : Double, val breadth : Double, val height : Double): Figure() {

     override fun planeArea(): Double {
        val planeArea = 2*length*breadth
         return planeArea
    }

    override fun totalArea(): Double {
        val totalArea = 2*(length*breadth + breadth*height+height*length)
        return totalArea
    }

    override fun volume(): Double {
        return length*breadth*height
    }

    override fun curvedSurfaceArea(): Double {
        return 2*(length*height + breadth*height)
    }

}