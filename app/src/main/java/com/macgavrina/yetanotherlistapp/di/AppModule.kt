package com.macgavrina.yetanotherlistapp.di

import com.macgavrina.yetanotherlistapp.repository.ListItemsRepository
import com.macgavrina.yetanotherlistapp.usecases.AddListItemUseCase
import com.macgavrina.yetanotherlistapp.viewmodel.ListItemsViewModel
import io.reactivex.schedulers.Schedulers.single
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    //single<HelloRepository> { HelloRepositoryImpl() }
    single<ListItemsRepository> { ListItemsRepository() }
    single<AddListItemUseCase> { AddListItemUseCase() }


    // produce a new instance on each demand
    //factory { ListItemsViewModel() }

    viewModel { ListItemsViewModel() }
}

