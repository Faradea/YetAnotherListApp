package com.macgavrina.yetanotherlistapp.usecases

import com.macgavrina.yetanotherlistapp.model.ListItem
import com.macgavrina.yetanotherlistapp.repository.ListItemsRepository
import io.reactivex.Completable
import io.reactivex.Single
import javax.inject.Inject


class AddListItemUseCase {

    private var listItemsRepository: ListItemsRepository = ListItemsRepository()

    @Inject
    fun AddListItemUseCase(listItemsRepository: ListItemsRepository) {
        this.listItemsRepository = listItemsRepository
    }

    fun execute(item: ListItem): Completable {
        return listItemsRepository.addItem(item)
    }
}