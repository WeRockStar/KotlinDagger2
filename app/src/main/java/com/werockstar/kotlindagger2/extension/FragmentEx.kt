package com.werockstar.kotlindagger2.extension

import android.support.v4.app.Fragment

fun Fragment.toClassName() = this::class.java.simpleName