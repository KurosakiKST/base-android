package com.example.base.di

import com.example.base.data.dataSource.SampleDataSource
import com.example.base.data.remoteDataSource.SampleRemoteDataSource
import com.example.base.data.repoImpl.SampleRepoImpl
import com.example.base.domain.repository.SampleRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class AbstractModule {

    /**-------DataSources--------*/
    @Binds
    abstract fun provideSampleDataSource(loginDataSource: SampleRemoteDataSource): SampleDataSource

    /**-------Repositories-------*/
    @Binds
    abstract fun provideSampleRepo(loginRepoImpl: SampleRepoImpl): SampleRepository

}