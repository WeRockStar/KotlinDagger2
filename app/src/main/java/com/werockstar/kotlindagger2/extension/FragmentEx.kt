package com.werockstar.kotlindagger2.extension

import androidx.fragment.app.Fragment

fun Fragment.toClassName() = this::class.java.simpleName