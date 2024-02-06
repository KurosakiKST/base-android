package com.example.base.domain.usecase

import com.example.base.domain.repository.SampleRepository
import javax.inject.Inject

class SampleUseCase @Inject constructor(
    private val loginRepository: SampleRepository
) {

}