package com.ndridm.mycamera.data.di

import com.ndridm.mycamera.data.UploadRepository
import com.ndridm.mycamera.data.api.ApiConfig

object Injection {
    fun provideRepository(): UploadRepository {
        val apiService = ApiConfig.getApiService()
        return UploadRepository.getInstance(apiService)
    }
}