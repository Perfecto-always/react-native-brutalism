package com.rnbrutalism

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import android.view.View
import com.facebook.react.views.view.ReactViewGroup

class BrutalismView(context: Context) : ReactViewGroup(context) {
    private val brutalismView: BrutalismViewViewHelper

    fun setOffsetX(offsetX: Int) {
        brutalismView.setOffsetX(offsetX)
    }

    fun setOffsetY(offsetY: Int) {
        brutalismView.setOffsetY(offsetY)
    }

    fun setRoundness(roundness: Int) {
        brutalismView.setRoundness(roundness)
    }

    fun setBgColor(bgColor: String?) {
        brutalismView.setBgColor(bgColor)
    }

    fun setBorderWidth(borderWidth: Int) {
        brutalismView.setBorderWidth(borderWidth)
    }

    init {
        brutalismView = BrutalismViewViewHelper(context)
        // Required so that the other components get rendered on the top
        brutalismView.setZ(-1f)
        addView(brutalismView)
    }
}

class BrutalismViewViewHelper(context: Context) : View(context) {
    private var offsetX: Int = 10
    private var offsetY: Int = 10
    private var roundness: Int = 0

    private val borderPaint = 
            Paint().apply {
                style = Paint.Style.STROKE
                strokeWidth = 3f
                color = Color.BLACK
                isAntiAlias = true // Optional, improves the quality of drawing
            }

    private var paint =
            Paint().apply {
                color = Color.WHITE
                style = Paint.Style.FILL
            }

    private val shadow =
            Paint().apply {
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

    fun setRoundness(roundness: Int) {
        this.roundness = roundness
        invalidate()
    }

    fun setBgColor(bgColor: String?) {
        paint.color = Color.parseColor(bgColor)
        invalidate()
    }

    fun setBorderWidth(borderWidth: Int) {
        borderPaint.strokeWidth = borderWidth.toFloat()
        invalidate()
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        // Get the width of the parent view (BrutalismView)
        val parentWidth = (parent as? View)?.width ?: 0
        val parentHeight = (parent as? View)?.height ?: 0

        if (roundness == 0) {
            canvas.drawRect(
                    offsetX.toFloat(),
                    offsetY.toFloat(),
                    parentWidth.toFloat() + offsetX,
                    parentHeight.toFloat() + offsetY,
                    shadow
            )
            canvas.drawRect(0f, 0f, parentWidth.toFloat(), parentHeight.toFloat(), paint)
            canvas.drawRect(0f, 0f, parentWidth.toFloat(), parentHeight.toFloat(), borderPaint)
        } 
        else {
            val rect = RectF(0f, 0f, parentWidth.toFloat(), parentHeight.toFloat())
            val rectShadow =
                    RectF(
                            offsetX.toFloat(),
                            offsetY.toFloat(),
                            parentWidth.toFloat() + offsetX,
                            parentHeight.toFloat() + offsetY
                    )
            // Painting the shadow to the canvas
            canvas.drawRoundRect(rectShadow, roundness.toFloat(), roundness.toFloat(), shadow)
            // Painting the view to the canvas
            canvas.drawRoundRect(rect, roundness.toFloat(), roundness.toFloat(), paint)
            // Draw the border
            val rectBorder = RectF(
                parentWidth.toFloat(),
                parentHeight.toFloat(),
                0f,
                0f
            )
            canvas.drawRoundRect(rectBorder, roundness.toFloat(), roundness.toFloat(), borderPaint)
        }
    }
}
