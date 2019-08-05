package com.shrikanthravi.collapsiblecalendarview.view

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import android.support.v7.widget.AppCompatTextView

class KutirBoldTextView : AppCompatTextView {

    constructor(context: Context): super(context) {
        setFont()
    }

    constructor(context: Context, attrs: AttributeSet): super(context, attrs) {
        setFont()
    }

    constructor(context: Context, attrs: AttributeSet, defStyle: Int): super(context, attrs, defStyle) {
        setFont()
    }

    private fun setFont() {
        val font = Typeface.createFromAsset(context.assets, "fonts/kutir_medium.ttf")
        setTypeface(font, Typeface.NORMAL)
    }
}
