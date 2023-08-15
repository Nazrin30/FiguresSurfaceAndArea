package com.example.figuressurfaceandarea

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.figuressurfaceandarea.models.CloseAtTopCylinder
import com.example.figuressurfaceandarea.models.Cone
import com.example.figuressurfaceandarea.models.Cube
import com.example.figuressurfaceandarea.models.Cuboid
import com.example.figuressurfaceandarea.models.Figure
import com.example.figuressurfaceandarea.models.Frustum
import com.example.figuressurfaceandarea.models.HollowCyclinder
import com.example.figuressurfaceandarea.models.OpenAtTopCylinder
import com.example.figuressurfaceandarea.repository.FiguresRepository

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val cube = Cube(sideOfCube = 5.0)
        val cuboid = Cuboid(height = 2.0, length = 3.0, breadth = 4.0)
        val openAtTopCylinder = OpenAtTopCylinder(radius = 2.0, height = 5.0)
        val closeAtTopCylinder = CloseAtTopCylinder(radius = 3.0, height = 4.0)
        val hollowCyclinder = HollowCyclinder(innerRadius = 2.0, outerRadius = 5.0, height = 7.0 )
        val cone = Cone(height = 3.0, radius = 2.0)
        val frustum = Frustum(height = 14.0, radiusOfTop = 2.0, radiusofBase = 10.0)

        val listOfFigures = arrayListOf<Figure>(cube,
            cuboid,
            openAtTopCylinder,
            closeAtTopCylinder,
            hollowCyclinder,
            cone,
            frustum)

        val figuresTotalArea = FiguresRepository.figuresTotalArea(listOfFigures)
        Log.e("figuresTotalArea", "${figuresTotalArea}")

    }

}