package com.werockstar.kotlindagger2.extension

import androidx.fragment.app.Fragment
import org.junit.Assert.assertEquals
import org.junit.Test

class FragmentExTest {

    @Test
    fun convert_class_to_string_class_simple_name() {
        assertEquals("Fragment", Fragment().toClassName())
    }
}