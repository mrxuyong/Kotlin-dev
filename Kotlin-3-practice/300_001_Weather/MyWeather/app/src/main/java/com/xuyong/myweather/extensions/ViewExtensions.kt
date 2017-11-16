package com.xuyong.myweather.extensions

import android.content.Context
import android.view.View
import android.widget.TextView

/**
 * @name ViewExtensions.kt
 * @desc
 * @author: Created by XuYong of1615 on 2017/11/13
 */

val View.ctx: Context
    get() = context

var TextView.textColor: Int
    get() = currentTextColor
    set(v) = setTextColor(v)

fun View.slideExit() {
    if (translationY == 0f) animate().translationY(-height.toFloat())
}

fun View.slideEnter() {
    if (translationY < 0f) animate().translationY(0f)
}