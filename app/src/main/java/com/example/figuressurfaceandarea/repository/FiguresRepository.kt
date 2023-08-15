package com.example.figuressurfaceandarea.repository

import com.example.figuressurfaceandarea.models.Figure


class FiguresRepository (){

    companion object{
        fun figuresTotalArea(listOfFigures:ArrayList<Figure>) : Double{
            var totalArea  = 0.0

            listOfFigures.forEach{figure->
                totalArea += figure.totalArea()

            }
            return totalArea

        }
    }


}