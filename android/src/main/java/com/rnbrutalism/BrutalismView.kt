package com.rnbrutalism

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.view.View;
import android.graphics.drawable.Drawable
import android.graphics.Paint
import android.graphics.Rect
import android.graphics.Canvas

class BrutalismView: View {
    // constructor(context: Context?): super(context) 
    // constructor(context: Context?, attrs: AttributeSet?): super(context, attrs) 
    // constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int): super(context, attrs, defStyleAttr) 
    // var draw = BrutalistBackgroundDrawable(context)

    // public fun setX(x: Int) {
    //     draw.setPositionX(x)
    //     setBackground(draw)
    // }

    // public fun setY(y: Int) {
    //     draw.setPositionX(x)
    //     setBackground(draw)
    // }
    private var draw: BrutalistBackgroundDrawable

    constructor(context: Context?): super(context) {
        draw = BrutalistBackgroundDrawable(context)
    }

    constructor(context: Context?, attrs: AttributeSet?): super(context, attrs) {
        draw = BrutalistBackgroundDrawable(context)
    }

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int): super(context, attrs, defStyleAttr) {
        draw = BrutalistBackgroundDrawable(context)
    }

    public fun setX(x: Int) {
        draw.setPositionX(x)
        setBackground(draw)
    }

    public fun setY(y: Int) {
        draw.setPositionY(y)
        setBackground(draw)
    }
}

class BrutalistBackgroundDrawable(context: Context) : Drawable() {

    private val paint = Paint()

    private var positionX = 0
    private var positionY = 0

    // init {
    //     // Customize the paint as needed for your brutalist style
    //     paint.color = Color.parseColor("#3F51B5") // Change the color as desired
    //     paint.style = Paint.Style.FILL
    // }

    
    fun setPositionX(x: Int) {
        positionX = x
        invalidateSelf()
    }

    fun setPositionY(y: Int) {
        positionY = y
        invalidateSelf() 
    }

    override fun draw(canvas: Canvas) {
        val rect = Rect(positionX, positionY, bounds.right, bounds.bottom)
        // Draw a rectangle to fill the canvas
        canvas.drawRect(rect, paint)
    }

    override fun setAlpha(alpha: Int) {
        // This method is required, but you can leave it empty
    }

    override fun setColorFilter(colorFilter: android.graphics.ColorFilter?) {
        // This method is required, but you can leave it empty
    }

    override fun getOpacity(): Int {
        // Return the appropriate opacity
        return android.graphics.PixelFormat.OPAQUE
    }
}