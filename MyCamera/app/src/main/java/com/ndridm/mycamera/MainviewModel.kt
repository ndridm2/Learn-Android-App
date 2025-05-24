package com.ndridm.mycamera

import androidx.lifecycle.ViewModel
import com.ndridm.mycamera.data.UploadRepository
import java.io.File

class MainViewModel(private val repository: UploadRepository) : ViewModel() {
    fun uploadImage(file: File, description: String) = repository.uploadImage(file, description)
}