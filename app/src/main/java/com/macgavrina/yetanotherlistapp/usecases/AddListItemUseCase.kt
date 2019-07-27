package com.macgavrina.yetanotherlistapp.usecases

import com.macgavrina.yetanotherlistapp.model.ListItem
import com.macgavrina.yetanotherlistapp.repository.ListItemsRepository
import io.reactivex.Completable
import org.koin.core.KoinComponent
import org.koin.core.inject


class AddListItemUseCase: KoinComponent {

    private val listItemsRepository: ListItemsRepository by inject()

    //private var listItemsRepository: ListItemsRepository = ListItemsRepository()

//    fun AddListItemUseCase(listItemsRepository: ListItemsRepository) {
//        this.listItemsRepository = listItemsRepository
//    }

    fun execute(item: ListItem): Completable {
        return listItemsRepository.addItem(item)
    }
}