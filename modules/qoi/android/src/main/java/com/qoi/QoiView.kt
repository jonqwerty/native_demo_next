package com.qoi

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.LinearLayout

class QoiView(context: Context) : LinearLayout(context) {
  init {
    inflate(context, R.layout.image, this)
  }
}
