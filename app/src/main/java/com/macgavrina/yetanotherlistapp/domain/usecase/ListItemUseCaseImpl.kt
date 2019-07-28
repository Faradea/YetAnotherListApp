package com.macgavrina.yetanotherlistapp.domain.usecase

import com.macgavrina.yetanotherlistapp.domain.mappers.ListItemMapper
import com.macgavrina.yetanotherlistapp.presentation.model.ListItem
import com.macgavrina.yetanotherlistapp.domain.repositoryinterface.ListItemsRepositoryInterface
import com.macgavrina.yetanotherlistapp.domain.usecaseinterface.ListItemUseCasesInterface
import io.reactivex.Completable
import org.koin.core.KoinComponent
import org.koin.core.inject


class ListItemUseCaseImpl: ListItemUseCasesInterface, KoinComponent {

    private val listItemsRepository: ListItemsRepositoryInterface by inject()
    private val listItemMapper: ListItemMapper by inject()

    //private var listItemsRepositoryImpl: ListItemsRepositoryImpl = ListItemsRepositoryImpl()

//    fun ListItemUseCaseImpl(listItemsRepositoryImpl: ListItemsRepositoryImpl) {
//        this.listItemsRepositoryImpl = listItemsRepositoryImpl
//    }

    override fun addListItem(listItem: ListItem): Completable {
        return listItemsRepository.addItem(listItemMapper.fromModelToEntity(listItem))
    }
}