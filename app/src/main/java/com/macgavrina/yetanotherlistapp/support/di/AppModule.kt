package com.macgavrina.yetanotherlistapp.support.di

import com.macgavrina.yetanotherlistapp.data.repository.ListItemsRepositoryImpl
import com.macgavrina.yetanotherlistapp.domain.mappers.ListItemMapper
import com.macgavrina.yetanotherlistapp.domain.repositoryinterface.ListItemsRepositoryInterface
import com.macgavrina.yetanotherlistapp.domain.usecaseinterface.ListItemUseCasesInterface
import com.macgavrina.yetanotherlistapp.domain.usecase.ListItemUseCaseImpl
import com.macgavrina.yetanotherlistapp.presentation.viewmodel.ListItemsViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    //single<HelloRepository> { HelloRepositoryImpl() }
    single<ListItemsRepositoryInterface> { ListItemsRepositoryImpl() }
    single<ListItemUseCasesInterface> { ListItemUseCaseImpl() }
    single {ListItemMapper()}


    // produce a new instance on each demand
    //factory { ListItemsViewModel() }

    viewModel { ListItemsViewModel() }
}

