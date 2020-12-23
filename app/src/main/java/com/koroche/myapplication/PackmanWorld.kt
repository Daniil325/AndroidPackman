package com.koroche.myapplication

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
import java.util.jar.Attributes

class PackmanWorld(context: Context, attributeSet: AttributeSet): View(context, attributeSet)
{
    override fun onDraw(canvas: Canvas)
    {
        super.onDraw(canvas)
        canvas.drawColor(Color.MAGENTA)
        canvas.drawArc(400f,
                        200f,
                        600f,
                        400f,
                        -270f,
                        -90f,
                        true, Paint()
        )
    }/**прикольный проект :)*/
}