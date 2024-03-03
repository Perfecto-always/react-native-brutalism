package com.rnbrutalism

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewGroupManager
import com.facebook.react.uimanager.ViewManagerDelegate
import com.facebook.react.uimanager.annotations.ReactProp
import com.facebook.react.viewmanagers.RNBrutalismViewManagerDelegate
import com.facebook.react.viewmanagers.RNBrutalismViewManagerInterface

@ReactModule(name = BrutalismViewManager.NAME)
class BrutalismViewManager(context: ReactApplicationContext) :
        ViewGroupManager<BrutalismView>(), RNBrutalismViewManagerInterface<BrutalismView> {
    private val delegate: RNBrutalismViewManagerDelegate<BrutalismView, BrutalismViewManager> =
            RNBrutalismViewManagerDelegate(this)

    override fun getDelegate(): ViewManagerDelegate<BrutalismView> = delegate

    override fun getName(): String {
        return NAME
    }

    override fun createViewInstance(context: ThemedReactContext): BrutalismView =
            BrutalismView(context)

    @ReactProp(name = "x")
    override fun setX(view: BrutalismView, x: Int) {
        view.setOffsetX(x)
    }

    @ReactProp(name = "y")
    override fun setY(view: BrutalismView, y: Int) {
        view.setOffsetY(y)
    }

    @ReactProp(name = "roundness")
    override fun setRoundness(view: BrutalismView, roundness: Int) {
        view.setRoundness(roundness)
    }

    @ReactProp(name = "bgColor")
    override fun setBgColor(view: BrutalismView, bgColor: String?) {
        view.setBgColor(bgColor)
    }

    @ReactProp(name = "viewBorderWidth")
    override fun setViewBorderWidth(view: BrutalismView, borderWidth: Int) {
        view.setBorderWidth(borderWidth)
    }

    companion object {
        const val NAME = "RNBrutalismView"
    }
}
