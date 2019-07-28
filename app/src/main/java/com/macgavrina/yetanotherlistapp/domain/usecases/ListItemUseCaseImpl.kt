package com.macgavrina.yetanotherlistapp.domain.usecases

import com.macgavrina.yetanotherlistapp.presentation.model.ListItem
import com.macgavrina.yetanotherlistapp.data.repository.ListItemsRepositoryImpl
import com.macgavrina.yetanotherlistapp.domain.repositoryinterfaces.ListItemsRepositoryInterface
import com.macgavrina.yetanotherlistapp.domain.usecaseinterfaces.ListItemUseCasesInterface
import io.reactivex.Completable
import org.koin.core.KoinComponent
import org.koin.core.inject


class ListItemUseCaseImpl: ListItemUseCasesInterface, KoinComponent {

    private val listItemsRepository: ListItemsRepositoryInterface by inject()

    //private var listItemsRepositoryImpl: ListItemsRepositoryImpl = ListItemsRepositoryImpl()

//    fun ListItemUseCaseImpl(listItemsRepositoryImpl: ListItemsRepositoryImpl) {
//        this.listItemsRepositoryImpl = listItemsRepositoryImpl
//    }

    override fun addListItem(listItem: ListItem): Completable {
        return listItemsRepository.addItem(listItem)
    }
}