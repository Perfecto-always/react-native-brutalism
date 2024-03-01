package com.rnbrutalism

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.view.View;
import android.graphics.drawable.Drawable
import android.graphics.Paint
import android.graphics.Rect
import android.graphics.Canvas
import android.graphics.drawable.GradientDrawable

class BrutalismView(context: Context) : View(context) {

    companion object {
        private val DEFAULT_COLOR = Color.parseColor("#3F51B5")
    }
    private var offsetX: Int = 0;
    private var offsetY: Int = 0;
    private var shadowColor: Int = Color.parseColor("#ffffff");
    private var roundness: Int = 0;

    private val paint = Paint().apply {
        color = DEFAULT_COLOR
        style = Paint.Style.FILL
    }

    private val shadow = Paint().apply {
        color = Color.BLACK
        style = Paint.Style.FILL

    }

    fun setOffsetX(offsetX: Int) {
        this.offsetX = offsetX
        invalidate() // Trigger redraw with updated offsets
    }

    fun setOffsetY(offsetY: Int) {
        this.offsetY = offsetY
        invalidate()
    }

    fun setRoundness(roundness: Int){
        this.roundness = roundness
        invalidate()
    }
    
    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        // canvas.translate(offsetX.toFloat(), offsetY.toFloat()) // Apply offset
        canvas.drawRect(
            offsetX.toFloat(), offsetY.toFloat(), width.toFloat() + offsetX, height.toFloat() + offsetY, shadow
        )
        canvas.drawRect(
            0f, 0f, width.toFloat(), height.toFloat(), paint
        )
}
}