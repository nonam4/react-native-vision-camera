package com.mrousavy.camera.extensions

import androidx.camera.core.CameraSelector

fun CameraSelector.Builder.byId(id: String): CameraSelector.Builder {
  return addCameraFilter { cameraInfos -> cameraInfos.filter { it.id == id }.toMutableList() }
}
