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
    private val delegate: RNBrutalismViewManagerDelegate<BrutalismView, BrutalismViewManager> = RNBrutalismViewManagerDelegate(this)

    override fun getDelegate(): ViewManagerDelegate<BrutalismView> = delegate

    override fun getName(): String {
        return NAME
    }

    override fun createViewInstance(context: ThemedReactContext): BrutalismView = BrutalismView(context)

    @ReactProp(name = "x", defaultInt = 5) 
    override fun setX (view: BrutalismView, x: Int) {
            view.setOffsetX(x)
    }

    @ReactProp(name = "y", defaultInt = 5) 
    override fun setY (view: BrutalismView, y: Int) {
            view.setOffsetY(y)
    }

    @ReactProp(name = "roundness", defaultInt = 0) 
    override fun setRoundness (view: BrutalismView, roundness: Int) {
        view.setRoundness(roundness)
    }

    companion object {
        const val NAME = "RNBrutalismView"
      }
}