package com.rnbrutalism

import android.graphics.drawable.Drawable
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewManagerDelegate
import com.facebook.react.uimanager.annotations.ReactProp
import com.facebook.react.viewmanagers.RNBrutalismViewManagerInterface
import com.facebook.react.viewmanagers.RNBrutalismViewManagerDelegate

@ReactModule(name=BrutalismViewManager.NAME)
class BrutalismViewManager(context: ReactApplicationContext): SimpleViewManager<BrutalismView>(), RNBrutalismViewManagerInterface<BrutalismView> {
    private val delegate: RNBrutalismViewManagerDelegate<BrutalismView> = RNBrutalismViewManagerDelegate(this)

    override fun getDelegate(): ViewManagerDelegate<BrutalismView> = delegate

    override fun getName(): String = NAME

    override fun createViewInstance(context: ThemedReactContext): BrutalismView = BrutalismView(context)

    @ReactProp(name = "x", defaultInt = 4) 
    override fun setX (view: BrutalismView, x: Int) {
        if(view != null) {
            view.setX(x)
        }
        // view.background = BrutalistBackgroundDrawable(context).setPositionX(x)
    }

    @ReactProp(name = "y", defaultInt = 4) 
    override fun setY (view: BrutalismView, y: Int) {
        if(view != null) {
            view.setY(y)
        }
        // view.background = BrutalistBackgroundDrawable(context).setPositionY(y)
    }

    companion object {
        const val NAME = "RNBrutalismView"
      }
}

// class BrutalistBackgroundDrawable(context: Context) : Drawable() {

//     private val paint = Paint()

//     private var positionX = 0
//     private var positionY = 0

//     // init {
//     //     // Customize the paint as needed for your brutalist style
//     //     paint.color = Color.parseColor("#3F51B5") // Change the color as desired
//     //     paint.style = Paint.Style.FILL
//     // }

    
//     fun setPositionX(x: Int) {
//         positionX = x
//         invalidateSelf()
//     }

//     fun setPositionY(y: Int) {
//         positionY = y
//         invalidateSelf()
//     }

//     override fun draw(canvas: Canvas) {
//         val rect = Rect(positionX, positionY, bounds.right, bounds.bottom)
//         // Draw a rectangle to fill the canvas
//         canvas.drawRect(rect, paint)
//     }

//     override fun setAlpha(alpha: Int) {
//         // This method is required, but you can leave it empty
//     }

//     override fun setColorFilter(colorFilter: android.graphics.ColorFilter?) {
//         // This method is required, but you can leave it empty
//     }

//     override fun getOpacity(): Int {
//         // Return the appropriate opacity
//         return android.graphics.PixelFormat.OPAQUE
//     }
// }