package com.metrica

import android.util.Log
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReadableMap

class MetricaModule(reactContext: ReactApplicationContext) :
  ReactContextBaseJavaModule(reactContext) {

  override fun getName(): String {
    return NAME
  }

  // Example method
  // See https://reactnative.dev/docs/native-modules-android
  @ReactMethod
  fun activate(apiKey: String) {

   Log.d("DD",apiKey)
  }

  @ReactMethod
  fun reportEvent(eventName: String, params: ReadableMap?) {
    Log.d("EE",eventName)
  }

  companion object {
    const val NAME = "Metrica"
  }
}
