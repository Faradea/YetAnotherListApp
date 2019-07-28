package com.macgavrina.yetanotherlistapp.support.di

import com.macgavrina.yetanotherlistapp.data.repository.ListItemsRepositoryImpl
import com.macgavrina.yetanotherlistapp.domain.repositoryinterfaces.ListItemsRepositoryInterface
import com.macgavrina.yetanotherlistapp.domain.usecaseinterfaces.ListItemUseCasesInterface
import com.macgavrina.yetanotherlistapp.domain.usecases.ListItemUseCaseImpl
import com.macgavrina.yetanotherlistapp.presentation.viewmodel.ListItemsViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    //single<HelloRepository> { HelloRepositoryImpl() }
    single<ListItemsRepositoryInterface> { ListItemsRepositoryImpl() }
    single<ListItemUseCasesInterface> { ListItemUseCaseImpl() }


    // produce a new instance on each demand
    //factory { ListItemsViewModel() }

    viewModel { ListItemsViewModel() }
}

